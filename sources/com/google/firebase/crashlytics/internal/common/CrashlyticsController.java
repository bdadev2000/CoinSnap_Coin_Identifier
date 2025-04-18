package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class CrashlyticsController {
    static final FilenameFilter APP_EXCEPTION_MARKER_FILTER = new a(1);
    static final String APP_EXCEPTION_MARKER_PREFIX = ".ae";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final String META_INF_FOLDER = "META-INF/";
    private static final String VERSION_CONTROL_INFO_FILE = "version-control-info.textproto";
    private static final String VERSION_CONTROL_INFO_KEY = "com.crashlytics.version-control-info";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final AppData appData;
    private final Context context;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsFileMarker crashMarker;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FileStore fileStore;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final CrashlyticsNativeComponent nativeComponent;
    private final SessionReportingCoordinator reportingCoordinator;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final UserMetadata userMetadata;
    private SettingsProvider settingsProvider = null;
    final TaskCompletionSource<Boolean> unsentReportsAvailable = new TaskCompletionSource<>();
    final TaskCompletionSource<Boolean> reportActionProvided = new TaskCompletionSource<>();
    final TaskCompletionSource<Void> unsentReportsHandled = new TaskCompletionSource<>();
    final AtomicBoolean checkForUnsentReportsCalled = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements CrashlyticsUncaughtExceptionHandler.CrashListener {
        public AnonymousClass1() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
        public void onUncaughtException(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th) {
            CrashlyticsController.this.handleUncaughtException(settingsProvider, thread, th);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Callable<Task<Void>> {
        final /* synthetic */ Throwable val$ex;
        final /* synthetic */ boolean val$isOnDemand;
        final /* synthetic */ SettingsProvider val$settingsProvider;
        final /* synthetic */ Thread val$thread;
        final /* synthetic */ long val$timestampMillis;

        /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$2$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements SuccessContinuation<Settings, Void> {
            final /* synthetic */ String val$currentSessionId;

            public AnonymousClass1(String str) {
                r2 = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            public Task<Void> then(@Nullable Settings settings) throws Exception {
                if (settings == null) {
                    Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                    return Tasks.forResult(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                taskArr[1] = CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common, r7 ? r2 : null);
                return Tasks.whenAll((Task<?>[]) taskArr);
            }
        }

        public AnonymousClass2(long j2, Throwable th, Thread thread, SettingsProvider settingsProvider, boolean z2) {
            r2 = j2;
            r4 = th;
            r5 = thread;
            r6 = settingsProvider;
            r7 = z2;
        }

        @Override // java.util.concurrent.Callable
        public Task<Void> call() throws Exception {
            long timestampSeconds = CrashlyticsController.getTimestampSeconds(r2);
            String currentSessionId = CrashlyticsController.this.getCurrentSessionId();
            if (currentSessionId == null) {
                Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            CrashlyticsController.this.crashMarker.create();
            CrashlyticsController.this.reportingCoordinator.persistFatalEvent(r4, r5, currentSessionId, timestampSeconds);
            CrashlyticsController.this.doWriteAppExceptionMarker(r2);
            CrashlyticsController.this.doCloseSessions(r6);
            CrashlyticsController.this.doOpenSession(new CLSUUID().getSessionId(), Boolean.valueOf(r7));
            if (!CrashlyticsController.this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                return Tasks.forResult(null);
            }
            return r6.getSettingsAsync().onSuccessTask(CrashlyticsController.this.crashlyticsWorkers.common, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                final /* synthetic */ String val$currentSessionId;

                public AnonymousClass1(String currentSessionId2) {
                    r2 = currentSessionId2;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                @NonNull
                public Task<Void> then(@Nullable Settings settings) throws Exception {
                    if (settings == null) {
                        Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                        return Tasks.forResult(null);
                    }
                    Task[] taskArr = new Task[2];
                    taskArr[0] = CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                    taskArr[1] = CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common, r7 ? r2 : null);
                    return Tasks.whenAll((Task<?>[]) taskArr);
                }
            });
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements SuccessContinuation<Void, Boolean> {
        public AnonymousClass3() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public Task<Boolean> then(@Nullable Void r1) throws Exception {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements SuccessContinuation<Boolean, Void> {
        final /* synthetic */ Task val$settingsDataTask;

        /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements SuccessContinuation<Settings, Void> {
            public AnonymousClass1() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            public Task<Void> then(@Nullable Settings settings) throws Exception {
                if (settings == null) {
                    Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common);
                CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        public AnonymousClass4(Task task) {
            r2 = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public Task<Void> then(@Nullable Boolean bool) throws Exception {
            if (!bool.booleanValue()) {
                Logger.getLogger().v("Deleting cached crash reports...");
                CrashlyticsController.deleteFiles(CrashlyticsController.this.listAppExceptionMarkerFiles());
                CrashlyticsController.this.reportingCoordinator.removeAllReports();
                CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                return Tasks.forResult(null);
            }
            Logger.getLogger().d("Sending cached crash reports...");
            CrashlyticsController.this.dataCollectionArbiter.grantDataCollectionPermission(bool.booleanValue());
            return r2.onSuccessTask(CrashlyticsController.this.crashlyticsWorkers.common, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                public AnonymousClass1() {
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                @NonNull
                public Task<Void> then(@Nullable Settings settings) throws Exception {
                    if (settings == null) {
                        Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                        return Tasks.forResult(null);
                    }
                    CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                    CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common);
                    CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                    return Tasks.forResult(null);
                }
            });
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Callable<Void> {
        final /* synthetic */ long val$timestamp;

        public AnonymousClass5(long j2) {
            r2 = j2;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt(CrashlyticsController.FIREBASE_CRASH_TYPE, 1);
            bundle.putLong("timestamp", r2);
            CrashlyticsController.this.analyticsEventLogger.logEvent(CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION, bundle);
            return null;
        }
    }

    public CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        this.context = context;
        this.idManager = idManager;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.fileStore = fileStore;
        this.crashMarker = crashlyticsFileMarker;
        this.appData = appData;
        this.userMetadata = userMetadata;
        this.logFileManager = logFileManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.analyticsEventLogger = analyticsEventLogger;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.reportingCoordinator = sessionReportingCoordinator;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    private static StaticSessionData.AppData createAppData(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getInstallIds().getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
    }

    private static StaticSessionData.DeviceData createDeviceData(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.calculateTotalRamInBytes(context), statFs.getBlockCount() * statFs.getBlockSize(), CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static StaticSessionData.OsData createOsData() {
        return StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
    }

    public static void deleteFiles(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void doOpenSession(String str, Boolean bool) {
        long currentTimestampSeconds = getCurrentTimestampSeconds();
        Logger.getLogger().d("Opening a new session with ID " + str);
        this.nativeComponent.prepareNativeSession(str, String.format(Locale.US, GENERATOR_FORMAT, CrashlyticsCore.getVersion()), currentTimestampSeconds, StaticSessionData.create(createAppData(this.idManager, this.appData), createOsData(), createDeviceData(this.context)));
        if (bool.booleanValue() && str != null) {
            this.userMetadata.setNewSession(str);
        }
        this.logFileManager.setCurrentSession(str);
        this.sessionsSubscriber.setSessionId(str);
        this.reportingCoordinator.onBeginSession(str, currentTimestampSeconds);
    }

    public void doWriteAppExceptionMarker(long j2) {
        try {
            if (this.fileStore.getCommonFile(APP_EXCEPTION_MARKER_PREFIX + j2).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Logger.getLogger().w("Could not create app exception marker file.", e);
        }
    }

    private void finalizePreviousNativeSession(String str) {
        Logger.getLogger().v("Finalizing native report for session " + str);
        NativeSessionFileProvider sessionFileProvider = this.nativeComponent.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        CrashlyticsReport.ApplicationExitInfo applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (nativeCoreAbsent(str, minidumpFile, applicationExitInto)) {
            Logger.getLogger().w("No native core present");
            return;
        }
        long lastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.fileStore, str);
        File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        doWriteAppExceptionMarker(lastModified);
        List<NativeSessionFile> nativeSessionFiles = getNativeSessionFiles(sessionFileProvider, str, this.fileStore, logFileManager.getBytesForLog());
        NativeSessionFileGzipper.processNativeSessions(nativeSessionDir, nativeSessionFiles);
        Logger.getLogger().d("CrashlyticsController#finalizePreviousNativeSession");
        this.reportingCoordinator.finalizeSessionWithNativeEvent(str, nativeSessionFiles, applicationExitInto);
        logFileManager.clearLog();
    }

    private static boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Nullable
    public String getCurrentSessionId() {
        SortedSet<String> listSortedOpenSessionIds = this.reportingCoordinator.listSortedOpenSessionIds();
        if (listSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return listSortedOpenSessionIds.first();
    }

    private static long getCurrentTimestampSeconds() {
        return getTimestampSeconds(System.currentTimeMillis());
    }

    @NonNull
    public static List<NativeSessionFile> getNativeSessionFiles(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File sessionFile = fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        File sessionFile2 = fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
        File sessionFile3 = fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", DeviceRequestsHelper.DEVICE_INFO_DEVICE, nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(nativeCoreFile(nativeSessionFileProvider));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", sessionFile));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", UserMetadata.KEYDATA_FILENAME, sessionFile2));
        arrayList.add(new FileBackedNativeSessionFile("rollouts_file", "rollouts", sessionFile3));
        return arrayList;
    }

    private InputStream getResourceAsStream(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Logger.getLogger().w("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        Logger.getLogger().i("No version control information found");
        return null;
    }

    public static long getTimestampSeconds(long j2) {
        return j2 / 1000;
    }

    public /* synthetic */ void lambda$openSession$1(String str) {
        doOpenSession(str, Boolean.FALSE);
    }

    public static /* synthetic */ boolean lambda$static$0(File file, String str) {
        return str.startsWith(APP_EXCEPTION_MARKER_PREFIX);
    }

    private Task<Void> logAnalyticsAppExceptionEvent(long j2) {
        if (firebaseCrashExists()) {
            Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        Logger.getLogger().d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
            final /* synthetic */ long val$timestamp;

            public AnonymousClass5(long j22) {
                r2 = j22;
            }

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt(CrashlyticsController.FIREBASE_CRASH_TYPE, 1);
                bundle.putLong("timestamp", r2);
                CrashlyticsController.this.analyticsEventLogger.logEvent(CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION, bundle);
                return null;
            }
        });
    }

    public Task<Void> logAnalyticsAppExceptionEvents() {
        ArrayList arrayList = new ArrayList();
        for (File file : listAppExceptionMarkerFiles()) {
            try {
                arrayList.add(logAnalyticsAppExceptionEvent(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger.getLogger().w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean nativeCoreAbsent(String str, File file, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        if (file == null || !file.exists()) {
            Logger.getLogger().w("No minidump data found for session " + str);
        }
        if (applicationExitInfo == null) {
            Logger.getLogger().i("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && applicationExitInfo == null;
    }

    private static NativeSessionFile nativeCoreFile(NativeSessionFileProvider nativeSessionFileProvider) {
        File minidumpFile = nativeSessionFileProvider.getMinidumpFile();
        return (minidumpFile == null || !minidumpFile.exists()) ? new BytesBackedNativeSessionFile("minidump_file", "minidump", new byte[]{0}) : new FileBackedNativeSessionFile("minidump_file", "minidump", minidumpFile);
    }

    private static byte[] readResource(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private Task<Boolean> waitForReportAction() {
        if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            this.unsentReportsAvailable.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        Logger.getLogger().d("Automatic data collection is disabled.");
        Logger.getLogger().v("Notifying that unsent reports are available.");
        this.unsentReportsAvailable.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.dataCollectionArbiter.waitForAutomaticDataCollectionEnabled().onSuccessTask(new SuccessContinuation<Void, Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
            public AnonymousClass3() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            public Task<Boolean> then(@Nullable Void r1) throws Exception {
                return Tasks.forResult(Boolean.TRUE);
            }
        });
        Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
        return CrashlyticsTasks.race(onSuccessTask, this.reportActionProvided.getTask());
    }

    private void writeApplicationExitInfoEventIfRelevant(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            Logger.getLogger().v("ANR feature enabled, but device is API " + i2);
            return;
        }
        historicalProcessExitReasons = ((ActivityManager) this.context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.reportingCoordinator.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, new LogFileManager(this.fileStore, str), UserMetadata.loadFromExistingSession(str, this.fileStore, this.crashlyticsWorkers));
        } else {
            Logger.getLogger().v("No ApplicationExitInfo available. Session: " + str);
        }
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        if (this.checkForUnsentReportsCalled.compareAndSet(false, true)) {
            return this.unsentReportsAvailable.getTask();
        }
        Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    public Task<Void> deleteUnsentReports() {
        this.reportActionProvided.trySetResult(Boolean.FALSE);
        return this.unsentReportsHandled.getTask();
    }

    public boolean didCrashOnPreviousExecution() {
        CrashlyticsWorkers.checkBackgroundThread();
        if (!this.crashMarker.isPresent()) {
            String currentSessionId = getCurrentSessionId();
            return currentSessionId != null && this.nativeComponent.hasCrashDataForSession(currentSessionId);
        }
        Logger.getLogger().v("Found previous crash marker.");
        this.crashMarker.remove();
        return true;
    }

    public void doCloseSessions(SettingsProvider settingsProvider) {
        doCloseSessions(false, settingsProvider, false);
    }

    public void enableExceptionHandling(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.settingsProvider = settingsProvider;
        openSession(str);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.1
            public AnonymousClass1() {
            }

            @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(@NonNull SettingsProvider settingsProvider2, @NonNull Thread thread, @NonNull Throwable th) {
                CrashlyticsController.this.handleUncaughtException(settingsProvider2, thread, th);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.nativeComponent);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    public boolean finalizeSessions(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        if (isHandlingException()) {
            Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().v("Finalizing previously open sessions.");
        try {
            doCloseSessions(true, settingsProvider, true);
            Logger.getLogger().v("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Logger.getLogger().e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public UserMetadata getUserMetadata() {
        return this.userMetadata;
    }

    public String getVersionControlInfo() throws IOException {
        InputStream resourceAsStream = getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            return null;
        }
        Logger.getLogger().d("Read version control info");
        return Base64.encodeToString(readResource(resourceAsStream), 0);
    }

    public void handleUncaughtException(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th) {
        handleUncaughtException(settingsProvider, thread, th, false);
    }

    public boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    public List<File> listAppExceptionMarkerFiles() {
        return this.fileStore.getCommonFiles(APP_EXCEPTION_MARKER_FILTER);
    }

    public void logFatalException(Thread thread, Throwable th) {
        SettingsProvider settingsProvider = this.settingsProvider;
        if (settingsProvider == null) {
            Logger.getLogger().w("settingsProvider not set");
        } else {
            handleUncaughtException(settingsProvider, thread, th, true);
        }
    }

    public void openSession(String str) {
        this.crashlyticsWorkers.common.submit(new c(0, this, str));
    }

    public void saveVersionControlInfo() {
        try {
            String versionControlInfo = getVersionControlInfo();
            if (versionControlInfo != null) {
                setInternalKey(VERSION_CONTROL_INFO_KEY, versionControlInfo);
                Logger.getLogger().i("Saved version control info");
            }
        } catch (IOException e) {
            Logger.getLogger().w("Unable to save version control info", e);
        }
    }

    public Task<Void> sendUnsentReports() {
        this.reportActionProvided.trySetResult(Boolean.TRUE);
        return this.unsentReportsHandled.getTask();
    }

    public void setCustomKey(String str, String str2) {
        try {
            this.userMetadata.setCustomKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void setCustomKeys(Map<String, String> map) {
        this.userMetadata.setCustomKeys(map);
    }

    public void setInternalKey(String str, String str2) {
        try {
            this.userMetadata.setInternalKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void setUserId(String str) {
        this.userMetadata.setUserId(str);
    }

    public void submitAllReports(Task<Settings> task) {
        if (this.reportingCoordinator.hasReportsToSend()) {
            Logger.getLogger().v("Crash reports are available to be sent.");
            waitForReportAction().onSuccessTask(this.crashlyticsWorkers.common, new SuccessContinuation<Boolean, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4
                final /* synthetic */ Task val$settingsDataTask;

                /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4$1 */
                /* loaded from: classes.dex */
                public class AnonymousClass1 implements SuccessContinuation<Settings, Void> {
                    public AnonymousClass1() {
                    }

                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    @NonNull
                    public Task<Void> then(@Nullable Settings settings) throws Exception {
                        if (settings == null) {
                            Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                            return Tasks.forResult(null);
                        }
                        CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                        CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common);
                        CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                        return Tasks.forResult(null);
                    }
                }

                public AnonymousClass4(Task task2) {
                    r2 = task2;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                @NonNull
                public Task<Void> then(@Nullable Boolean bool) throws Exception {
                    if (!bool.booleanValue()) {
                        Logger.getLogger().v("Deleting cached crash reports...");
                        CrashlyticsController.deleteFiles(CrashlyticsController.this.listAppExceptionMarkerFiles());
                        CrashlyticsController.this.reportingCoordinator.removeAllReports();
                        CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                        return Tasks.forResult(null);
                    }
                    Logger.getLogger().d("Sending cached crash reports...");
                    CrashlyticsController.this.dataCollectionArbiter.grantDataCollectionPermission(bool.booleanValue());
                    return r2.onSuccessTask(CrashlyticsController.this.crashlyticsWorkers.common, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                        public AnonymousClass1() {
                        }

                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        @NonNull
                        public Task<Void> then(@Nullable Settings settings) throws Exception {
                            if (settings == null) {
                                Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                                return Tasks.forResult(null);
                            }
                            CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                            CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common);
                            CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                            return Tasks.forResult(null);
                        }
                    });
                }
            });
        } else {
            Logger.getLogger().v("No crash reports are available to be sent.");
            this.unsentReportsAvailable.trySetResult(Boolean.FALSE);
        }
    }

    public void writeNonFatalException(@NonNull Thread thread, @NonNull Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        if (isHandlingException()) {
            return;
        }
        long timestampSeconds = getTimestampSeconds(currentTimeMillis);
        String currentSessionId = getCurrentSessionId();
        if (currentSessionId == null) {
            Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.reportingCoordinator.persistNonFatalEvent(th, thread, currentSessionId, timestampSeconds);
        }
    }

    public void writeToLog(long j2, String str) {
        if (isHandlingException()) {
            return;
        }
        this.logFileManager.writeToLog(j2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doCloseSessions(boolean z2, SettingsProvider settingsProvider, boolean z3) {
        String str;
        CrashlyticsWorkers.checkBackgroundThread();
        ArrayList arrayList = new ArrayList(this.reportingCoordinator.listSortedOpenSessionIds());
        if (arrayList.size() <= z2) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z2 ? 1 : 0);
        if (z3 && settingsProvider.getSettingsSync().featureFlagData.collectAnrs) {
            writeApplicationExitInfoEventIfRelevant(str2);
        } else {
            Logger.getLogger().v("ANR feature disabled.");
        }
        if (z3 && this.nativeComponent.hasCrashDataForSession(str2)) {
            finalizePreviousNativeSession(str2);
        }
        if (z2 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.sessionsSubscriber.setSessionId(null);
            str = null;
        }
        this.reportingCoordinator.finalizeSessions(getCurrentTimestampSeconds(), str);
    }

    public synchronized void handleUncaughtException(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th, boolean z2) {
        Logger.getLogger().d("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        Task submitTask = this.crashlyticsWorkers.common.submitTask(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
            final /* synthetic */ Throwable val$ex;
            final /* synthetic */ boolean val$isOnDemand;
            final /* synthetic */ SettingsProvider val$settingsProvider;
            final /* synthetic */ Thread val$thread;
            final /* synthetic */ long val$timestampMillis;

            /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$2$1 */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements SuccessContinuation<Settings, Void> {
                final /* synthetic */ String val$currentSessionId;

                public AnonymousClass1(String currentSessionId2) {
                    r2 = currentSessionId2;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                @NonNull
                public Task<Void> then(@Nullable Settings settings) throws Exception {
                    if (settings == null) {
                        Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                        return Tasks.forResult(null);
                    }
                    Task[] taskArr = new Task[2];
                    taskArr[0] = CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                    taskArr[1] = CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common, r7 ? r2 : null);
                    return Tasks.whenAll((Task<?>[]) taskArr);
                }
            }

            public AnonymousClass2(long j2, Throwable th2, Thread thread2, SettingsProvider settingsProvider2, boolean z22) {
                r2 = j2;
                r4 = th2;
                r5 = thread2;
                r6 = settingsProvider2;
                r7 = z22;
            }

            @Override // java.util.concurrent.Callable
            public Task<Void> call() throws Exception {
                long timestampSeconds = CrashlyticsController.getTimestampSeconds(r2);
                String currentSessionId2 = CrashlyticsController.this.getCurrentSessionId();
                if (currentSessionId2 == null) {
                    Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
                    return Tasks.forResult(null);
                }
                CrashlyticsController.this.crashMarker.create();
                CrashlyticsController.this.reportingCoordinator.persistFatalEvent(r4, r5, currentSessionId2, timestampSeconds);
                CrashlyticsController.this.doWriteAppExceptionMarker(r2);
                CrashlyticsController.this.doCloseSessions(r6);
                CrashlyticsController.this.doOpenSession(new CLSUUID().getSessionId(), Boolean.valueOf(r7));
                if (!CrashlyticsController.this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                    return Tasks.forResult(null);
                }
                return r6.getSettingsAsync().onSuccessTask(CrashlyticsController.this.crashlyticsWorkers.common, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                    final /* synthetic */ String val$currentSessionId;

                    public AnonymousClass1(String currentSessionId22) {
                        r2 = currentSessionId22;
                    }

                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    @NonNull
                    public Task<Void> then(@Nullable Settings settings) throws Exception {
                        if (settings == null) {
                            Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                            return Tasks.forResult(null);
                        }
                        Task[] taskArr = new Task[2];
                        taskArr[0] = CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                        taskArr[1] = CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common, r7 ? r2 : null);
                        return Tasks.whenAll((Task<?>[]) taskArr);
                    }
                });
            }
        });
        if (!z22) {
            try {
                Utils.awaitEvenIfOnMainThread(submitTask);
            } catch (TimeoutException unused) {
                Logger.getLogger().e("Cannot send reports. Timed out while fetching settings.");
            } catch (Exception e) {
                Logger.getLogger().e("Error handling uncaught exception", e);
            }
        }
    }
}
