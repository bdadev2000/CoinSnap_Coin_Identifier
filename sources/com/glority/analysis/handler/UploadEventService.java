package com.glority.analysis.handler;

import android.app.Application;
import android.os.Environment;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.analysis.bean.TrackingMessageBean;
import com.glority.analysis.definitions.TimingType;
import com.glority.analysis.utils.AnalysisCacheManager;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.network.model.Status;
import com.glority.repository.AnalysisRepository;
import com.glority.utils.UtilsApp;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: UploadEventService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J4\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\"J\u0010\u0010$\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020\u0010H\u0002J\u0006\u0010(\u001a\u00020\u0010J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/glority/analysis/handler/UploadEventService;", "", "()V", "EXPIRE_TIME", "", "FOLDER_NAME", "", "FOLDER_SIZE_MAX", "MAX_LINE", "TAG", "TEMP_FILE_NAME", "rwl", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "thread", "Ljava/lang/Thread;", "checkCache", "", "createNewFile", "Ljava/io/File;", "expireFile", "", "it", "getEarliestFile", "getEventDataDir", "getLatestFile", "isNeedSend", "saveLogEvent", NotificationCompat.CATEGORY_EVENT, "saveSendFailedLogEvent", "sendBatch", "data", "", "Lcom/glority/analysis/bean/TrackingMessageBean;", "sendEventSuccess", "Lkotlin/Function0;", "sendEventFailed", "sendEventOfOnePage", "timingType", "Lcom/glority/analysis/definitions/TimingType;", "sleep", "start", "write", "newFile", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class UploadEventService {
    private static final int EXPIRE_TIME = 604800000;
    private static final String FOLDER_NAME = ".event";
    private static final int FOLDER_SIZE_MAX = 536870912;
    private static final int MAX_LINE = 30;
    private static final String TAG = "UploadEventService";
    private static final String TEMP_FILE_NAME = "temp";
    public static final UploadEventService INSTANCE = new UploadEventService();
    private static final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private static final Thread thread = new Thread(new Runnable() { // from class: com.glority.analysis.handler.UploadEventService$thread$1
        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    UploadEventService.sendEventOfOnePage$default(UploadEventService.INSTANCE, null, 1, null);
                    UploadEventService.INSTANCE.sleep();
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                        return;
                    }
                    return;
                }
            }
        }
    });

    private UploadEventService() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sleep() {
        Thread.sleep(AnalysisCacheManager.INSTANCE.getInterval() * 1000);
    }

    public static /* synthetic */ boolean sendEventOfOnePage$default(UploadEventService uploadEventService, TimingType timingType, int i, Object obj) {
        if ((i & 1) != 0) {
            timingType = TimingType.NORMAL;
        }
        return uploadEventService.sendEventOfOnePage(timingType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0160, code lost:
    
        r14.delete();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean sendEventOfOnePage(com.glority.analysis.definitions.TimingType r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.analysis.handler.UploadEventService.sendEventOfOnePage(com.glority.analysis.definitions.TimingType):boolean");
    }

    public final synchronized void saveLogEvent(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ReentrantReadWriteLock reentrantReadWriteLock = rwl;
        reentrantReadWriteLock.writeLock().lock();
        File latestFile = getLatestFile();
        if (latestFile == null) {
            File createNewFile = createNewFile();
            if (createNewFile != null) {
                INSTANCE.write(createNewFile, event);
            }
            reentrantReadWriteLock.writeLock().unlock();
            return;
        }
        if (FilesKt.readLines$default(latestFile, null, 1, null).size() >= 30) {
            File createNewFile2 = createNewFile();
            if (createNewFile2 != null) {
                INSTANCE.write(createNewFile2, event);
            }
        } else {
            write(latestFile, event);
        }
        reentrantReadWriteLock.writeLock().unlock();
    }

    private final void saveSendFailedLogEvent(String event) {
        ReentrantReadWriteLock reentrantReadWriteLock = rwl;
        reentrantReadWriteLock.writeLock().lock();
        File file = new File(getEventDataDir(), ".temp");
        if (!file.exists()) {
            file.createNewFile();
        }
        write(file, event);
        reentrantReadWriteLock.writeLock().unlock();
    }

    private final void write(File newFile, String event) {
        try {
            FilesKt.appendText(newFile, event + '\n', Charsets.UTF_8);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final synchronized File createNewFile() {
        File file;
        try {
            file = new File(INSTANCE.getEventDataDir(), InstructionFileId.DOT + System.currentTimeMillis());
            file.createNewFile();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
        return file;
    }

    private final File getLatestFile() {
        File[] listFiles = getEventDataDir().listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        if (listFiles.length > 1) {
            ArraysKt.sortWith(listFiles, new Comparator<T>() { // from class: com.glority.analysis.handler.UploadEventService$getLatestFile$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it = (File) t;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    String name = it.getName();
                    File it2 = (File) t2;
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    return ComparisonsKt.compareValues(name, it2.getName());
                }
            });
        }
        return (File) ArraysKt.last(listFiles);
    }

    private final File getEarliestFile() {
        File[] listFiles = getEventDataDir().listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        if (listFiles.length > 1) {
            ArraysKt.sortWith(listFiles, new Comparator<T>() { // from class: com.glority.analysis.handler.UploadEventService$getEarliestFile$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it = (File) t;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    String name = it.getName();
                    File it2 = (File) t2;
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    return ComparisonsKt.compareValues(name, it2.getName());
                }
            });
        }
        return (File) ArraysKt.first(listFiles);
    }

    public final boolean isNeedSend() {
        File[] listFiles = getEventDataDir().listFiles();
        return (listFiles == null || listFiles.length == 0 || listFiles.length <= 2) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendBatch$default(UploadEventService uploadEventService, List list, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.glority.analysis.handler.UploadEventService$sendBatch$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: com.glority.analysis.handler.UploadEventService$sendBatch$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        uploadEventService.sendBatch(list, function0, function02);
    }

    public final synchronized void sendBatch(List<TrackingMessageBean> data, Function0<Unit> sendEventSuccess, Function0<Unit> sendEventFailed) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sendEventSuccess, "sendEventSuccess");
        Intrinsics.checkNotNullParameter(sendEventFailed, "sendEventFailed");
        if (data.isEmpty()) {
            return;
        }
        try {
            String logData = new Gson().toJson(data);
            AnalysisRepository analysisRepository = AnalysisRepository.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(logData, "logData");
            if (analysisRepository.sendTrackingListMessage(logData).getStatus() != Status.SUCCESS) {
                sendEventFailed.invoke();
            } else {
                sendEventSuccess.invoke();
            }
        } catch (Exception e) {
            new SendErrorEventRequest("sendBatch error", e.toString()).post();
            sendEventSuccess.invoke();
        }
    }

    private final File getEventDataDir() {
        if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            File externalFilesDir = UtilsApp.getApp().getExternalFilesDir(FOLDER_NAME);
            if (externalFilesDir == null) {
                Application app = UtilsApp.getApp();
                Intrinsics.checkNotNullExpressionValue(app, "UtilsApp.getApp()");
                externalFilesDir = new File(app.getFilesDir(), FOLDER_NAME);
            }
            Intrinsics.checkNotNullExpressionValue(externalFilesDir, "UtilsApp.getApp().getExt…().filesDir, FOLDER_NAME)");
            return externalFilesDir;
        }
        Application app2 = UtilsApp.getApp();
        Intrinsics.checkNotNullExpressionValue(app2, "UtilsApp.getApp()");
        return new File(app2.getFilesDir(), FOLDER_NAME);
    }

    public final void start() {
        Thread thread2 = thread;
        if (thread2.isAlive()) {
            return;
        }
        checkCache();
        thread2.start();
    }

    private final void checkCache() {
        File[] listFiles;
        File[] listFiles2 = getEventDataDir().listFiles();
        long j = 0;
        if (listFiles2 != null) {
            for (File file : listFiles2) {
                j += file.length();
            }
        }
        if (j <= 536870912 || (listFiles = getEventDataDir().listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File it : listFiles) {
            UploadEventService uploadEventService = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (uploadEventService.expireFile(it)) {
                arrayList.add(it);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    private final boolean expireFile(File it) {
        return it.getName().compareTo(new StringBuilder(InstructionFileId.DOT).append(System.currentTimeMillis() - ((long) EXPIRE_TIME)).toString()) < 0;
    }
}
