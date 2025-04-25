package com.glority.utils.stability;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import com.glority.utils.data.StringUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class CrashHelper {
    private static String defaultDir;
    private static Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
    private static String dir;
    private static OnCrashListener onCrashListener;
    private static int versionCode;
    private static String versionName;
    private static final String FILE_SEP = System.getProperty("file.separator");
    private static final Format FORMAT = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    private static final Format FILE_NAME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

    /* loaded from: classes9.dex */
    public interface OnCrashListener {
        void onCrash(String str, Throwable th);
    }

    public static void init(Application application) {
        init(application, "");
    }

    public static void init(Application application, File file) {
        init(application, file.getAbsolutePath());
    }

    public static void init(Application application, String str) {
        init(application, str, (OnCrashListener) null);
    }

    public static void init(Application application, File file, OnCrashListener onCrashListener2) {
        init(application, file.getAbsolutePath(), onCrashListener2);
    }

    public static void init(Application application, String str, OnCrashListener onCrashListener2) {
        initCacheDir(application, str);
        initAppInfo(application);
        initExceptionHandler();
        onCrashListener = onCrashListener2;
    }

    public static List<File> listCrashFiles() {
        String str = dir;
        if (str == null) {
            str = defaultDir;
        }
        File file = new File(str);
        if (!file.isDirectory() || !file.exists()) {
            return Collections.emptyList();
        }
        return Arrays.asList(file.listFiles());
    }

    private static void initCacheDir(Application application, String str) {
        if (StringUtils.isSpace(str)) {
            dir = null;
        } else {
            String str2 = FILE_SEP;
            if (!str.endsWith(str2)) {
                str = str + str2;
            }
            dir = str;
        }
        if ("mounted".equals(Environment.getExternalStorageState()) && application.getExternalCacheDir() != null) {
            StringBuilder append = new StringBuilder().append(application.getExternalCacheDir());
            String str3 = FILE_SEP;
            defaultDir = append.append(str3).append(AppMeasurement.CRASH_ORIGIN).append(str3).toString();
        } else {
            StringBuilder append2 = new StringBuilder().append(application.getCacheDir());
            String str4 = FILE_SEP;
            defaultDir = append2.append(str4).append(AppMeasurement.CRASH_ORIGIN).append(str4).toString();
        }
    }

    private static void initAppInfo(Application application) {
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            if (packageInfo != null) {
                versionName = packageInfo.versionName;
                versionCode = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void initExceptionHandler() {
        defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.glority.utils.stability.CrashHelper.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                if (th == null) {
                    if (CrashHelper.defaultUncaughtExceptionHandler != null) {
                        CrashHelper.defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    } else {
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        return;
                    }
                }
                Date date = new Date();
                String format = CrashHelper.FORMAT.format(date);
                StringBuilder sb = new StringBuilder();
                sb.append("************* uncaught exception *************\nTime Of Crash      : " + format + "\nDevice Manufacturer: " + Build.MANUFACTURER + "\nDevice Model       : " + Build.MODEL + "\nAndroid Version    : " + Build.VERSION.RELEASE + "\nAndroid SDK        : " + Build.VERSION.SDK_INT + "\nApp VersionName    : " + CrashHelper.versionName + "\nApp VersionCode    : " + CrashHelper.versionCode + "\n\n");
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                    cause.printStackTrace(printWriter);
                }
                printWriter.flush();
                sb.append(stringWriter.toString()).append("\n\n");
                String sb2 = sb.toString();
                String str = (CrashHelper.dir == null ? CrashHelper.defaultDir : CrashHelper.dir) + "crash_" + CrashHelper.FILE_NAME_FORMAT.format(date) + ".log";
                if (CrashHelper.createOrExistsFile(str)) {
                    CrashHelper.input2File(sb2, str);
                } else {
                    Log.e("CrashHelper", "create " + str + " failed!");
                }
                if (CrashHelper.onCrashListener != null) {
                    CrashHelper.onCrashListener.onCrash(sb2, th);
                }
                if (CrashHelper.defaultUncaughtExceptionHandler != null) {
                    CrashHelper.defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void input2File(final String str, final String str2) {
        try {
            if (((Boolean) Executors.newSingleThreadExecutor().submit(new Callable<Boolean>() { // from class: com.glority.utils.stability.CrashHelper.2
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Boolean call() {
                    /*
                        r6 = this;
                        r0 = 0
                        java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L27
                        java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L27
                        java.lang.String r3 = r1     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L27
                        r4 = 1
                        r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L27
                        r1.<init>(r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L27
                        java.lang.String r0 = r2     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3e
                        r1.write(r0)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3e
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3e
                        r1.close()     // Catch: java.io.IOException -> L1b
                        goto L1f
                    L1b:
                        r1 = move-exception
                        r1.printStackTrace()
                    L1f:
                        return r0
                    L20:
                        r0 = move-exception
                        goto L2b
                    L22:
                        r1 = move-exception
                        r5 = r1
                        r1 = r0
                        r0 = r5
                        goto L3f
                    L27:
                        r1 = move-exception
                        r5 = r1
                        r1 = r0
                        r0 = r5
                    L2b:
                        r0.printStackTrace()     // Catch: java.lang.Throwable -> L3e
                        r0 = 0
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3e
                        if (r1 == 0) goto L3d
                        r1.close()     // Catch: java.io.IOException -> L39
                        goto L3d
                    L39:
                        r1 = move-exception
                        r1.printStackTrace()
                    L3d:
                        return r0
                    L3e:
                        r0 = move-exception
                    L3f:
                        if (r1 == 0) goto L49
                        r1.close()     // Catch: java.io.IOException -> L45
                        goto L49
                    L45:
                        r1 = move-exception
                        r1.printStackTrace()
                    L49:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.stability.CrashHelper.AnonymousClass2.call():java.lang.Boolean");
                }
            }).get()).booleanValue()) {
                return;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
        Log.e("CrashHelper", "write crash info to " + str2 + " failed!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean createOrExistsFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean createOrExistsDir(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    private CrashHelper() {
        throw new UnsupportedOperationException("U can't initialize me!");
    }
}
