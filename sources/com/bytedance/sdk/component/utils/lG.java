package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public class lG {
    private static String YFl;

    public static String Sg(Context context) {
        if (!TextUtils.isEmpty(YFl)) {
            return YFl;
        }
        String YFl2 = YFl();
        YFl = YFl2;
        if (!TextUtils.isEmpty(YFl2)) {
            return YFl;
        }
        String Sg = Sg();
        YFl = Sg;
        if (!TextUtils.isEmpty(Sg)) {
            return YFl;
        }
        String tN = tN(context);
        YFl = tN;
        return tN;
    }

    public static boolean YFl(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), Sg(context));
    }

    private static String tN(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    private static String YFl() {
        String processName;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            processName = Application.getProcessName();
            return processName;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String Sg() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
