package com.glority.analysis.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import com.glority.analysis.R;
import com.glority.analysis.handler.LogEventSelfHandler;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.LogEventSelfRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CrashHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/analysis/utils/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "()V", "context", "Landroid/content/Context;", "defaultHandler", "deviceCrashInfo", "Ljava/util/Properties;", "logDir", "Ljava/io/File;", "getLogDir", "()Ljava/io/File;", "saveCrashLog", "", "collectCrashDeviceInfo", "", "ctx", "getToastMessage", "", "ex", "", "handleException", "handleUncaughtException", "init", "saveCrashInfoToFile", "uncaughtException", "thread", "Ljava/lang/Thread;", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final String CRASH = "crash";
    private static final String CRASH_REPORTER_EXTENSION = ".log";
    private static final int EXIT_CODE = 10;
    private static final int SLEEP_TIME = 2000;
    private static final String STACK_TRACE = "stack_trace";
    public static final String TAG = "CrashHandler";
    private static final String VERSION_CODE = "version_code";
    private static final String VERSION_NAME = "version_name";
    private Context context;
    private Thread.UncaughtExceptionHandler defaultHandler;
    private final Properties deviceCrashInfo = new Properties();
    private final boolean saveCrashLog = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CrashHandler instance = new CrashHandler();

    private CrashHandler() {
    }

    public final void init(Context ctx) {
        this.context = ctx;
        this.defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable ex) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (this.defaultHandler != null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
            String uuid2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "UUID.randomUUID().toString()");
            LogEventSelfHandler.INSTANCE.eventSaveLocal("crash", new LogEventSelfRequest("crash", uuid2, BundleKt.bundleOf(TuplesKt.to("content", String.valueOf(ex)), TuplesKt.to("id", uuid))));
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
            Intrinsics.checkNotNull(uncaughtExceptionHandler);
            uncaughtExceptionHandler.uncaughtException(thread, ex);
            return;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Log.e(TAG, "Error : ", e);
        }
        Context context = this.context;
        Intrinsics.checkNotNull(context);
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        }
        Intent intent = new Intent();
        intent.setClassName("com.glority.ptOther", "com.glority.picturethis.app.kt.view.home.SplashActivity");
        intent.setFlags(268435456);
        intent.putExtra("crash", true);
        ((AlarmManager) systemService).set(1, System.currentTimeMillis() + 500, PendingIntent.getActivity(this.context, 0, intent, 1073741824));
        Process.killProcess(Process.myPid());
        System.exit(10);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    private final boolean handleUncaughtException(Throwable ex) {
        if (ex == null) {
            return true;
        }
        Log.e(TAG, "Error : ", ex);
        if (this.saveCrashLog) {
            collectCrashDeviceInfo(this.context);
            saveCrashInfoToFile(ex);
        }
        final String toastMessage = getToastMessage(ex);
        new Thread() { // from class: com.glority.analysis.utils.CrashHandler$handleUncaughtException$thread$1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Context context;
                Context context2;
                Looper.prepare();
                context = CrashHandler.this.context;
                Intrinsics.checkNotNull(context);
                String string = context.getString(R.string.error_crash_error);
                if (AppContext.INSTANCE.isDebugMode()) {
                    string = toastMessage;
                }
                context2 = CrashHandler.this.context;
                Toast makeText = Toast.makeText(context2, string, 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
                Looper.loop();
            }
        }.start();
        return true;
    }

    public final void handleException(Throwable ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (this.saveCrashLog) {
            collectCrashDeviceInfo(this.context);
            saveCrashInfoToFile(ex);
        }
        Log.e(TAG, "Error : ", ex);
        Toast makeText = Toast.makeText(this.context, getToastMessage(ex), 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    private final String getToastMessage(Throwable ex) {
        return Intrinsics.areEqual(BuildConfig.ENV, AppContext.INSTANCE.getConfig("ENV")) ^ true ? INSTANCE.dumpStackTrace(ex) : ex.getMessage();
    }

    private final void collectCrashDeviceInfo(Context ctx) {
        try {
            Intrinsics.checkNotNull(ctx);
            PackageInfo packageInfo = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 1);
            if (packageInfo != null) {
                this.deviceCrashInfo.put(VERSION_NAME, packageInfo.versionName == null ? "not set" : packageInfo.versionName);
                this.deviceCrashInfo.put(VERSION_CODE, String.valueOf(packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Error while collect package info", e);
        }
        for (Field field : Build.class.getDeclaredFields()) {
            try {
                Intrinsics.checkNotNullExpressionValue(field, "field");
                field.setAccessible(true);
                this.deviceCrashInfo.put(field.getName(), field.get(null).toString());
                Log.d(TAG, field.getName() + " : " + field.get(null));
            } catch (Exception e2) {
                Log.e(TAG, "Error while collect crash info", e2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.FileOutputStream] */
    private final String saveCrashInfoToFile(Throwable ex) {
        FileOutputStream fileOutputStream;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        ex.printStackTrace(printWriter);
        for (Throwable cause = ex.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        String writer = stringWriter.toString();
        printWriter.close();
        Properties properties = this.deviceCrashInfo;
        properties.put(STACK_TRACE, writer);
        try {
            try {
                File logDir = getLogDir();
                String str = "crash-" + System.currentTimeMillis() + CRASH_REPORTER_EXTENSION;
                File file = new File(logDir, str);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    properties = 0;
                    if (properties != 0) {
                        try {
                            properties.flush();
                            properties.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
                try {
                    this.deviceCrashInfo.store(fileOutputStream, "");
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        properties = fileOutputStream;
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        return str;
                    }
                } catch (IOException e4) {
                    e = e4;
                    e.printStackTrace();
                    properties = fileOutputStream;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            properties = fileOutputStream;
                        } catch (IOException e5) {
                            e = e5;
                            e.printStackTrace();
                            return str;
                        }
                    }
                    return str;
                }
                return str;
            } catch (Exception e6) {
                Log.e(TAG, "an error occured while writing report file...", e6);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final File getLogDir() {
        File filesDir;
        if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            Context context = this.context;
            Intrinsics.checkNotNull(context);
            filesDir = context.getExternalFilesDir("");
        } else {
            Context context2 = this.context;
            Intrinsics.checkNotNull(context2);
            filesDir = context2.getFilesDir();
        }
        File file = new File(filesDir, "log");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* compiled from: CrashHandler.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/glority/analysis/utils/CrashHandler$Companion;", "", "()V", "CRASH", "", "CRASH_REPORTER_EXTENSION", "EXIT_CODE", "", "SLEEP_TIME", "STACK_TRACE", "TAG", "VERSION_CODE", "VERSION_NAME", "instance", "Lcom/glority/analysis/utils/CrashHandler;", "getInstance", "()Lcom/glority/analysis/utils/CrashHandler;", "dumpStackTrace", "e", "", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CrashHandler getInstance() {
            return CrashHandler.instance;
        }

        public final String dumpStackTrace(Throwable e) {
            String str;
            Intrinsics.checkNotNullParameter(e, "e");
            String str2 = "";
            for (Throwable th = e; th != null; th = th.getCause()) {
                StringBuilder append = new StringBuilder().append(str2);
                StringBuilder sb = new StringBuilder("\n                    ");
                if (th == e) {
                    str = "";
                } else {
                    str = "Cause By:";
                }
                str2 = append.append(StringsKt.trimIndent(sb.append(str).append(th.getClass().getCanonicalName()).append(": ").append(th.getMessage()).append("\n                    \n                    ").toString())).toString();
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    str2 = str2 + StringsKt.trimIndent("\n                        " + stackTraceElement + "\n                        \n                        ");
                }
            }
            return str2;
        }
    }
}
