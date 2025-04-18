package com.safedk.android.utils;

import android.util.Log;

/* loaded from: classes2.dex */
public final class Logger {
    private static boolean debugMode = false;

    private Logger() {
    }

    public static void setDebugMode(boolean debug) {
        debugMode = debug;
    }

    public static boolean getDebugMode() {
        return debugMode;
    }

    public static int v(String tag, String msg) {
        if (debugMode) {
            return Log.v(tag, msg);
        }
        return 0;
    }

    public static int v(String tag, String msg, Throwable tr) {
        if (debugMode) {
            return Log.v(tag, msg, tr);
        }
        return 0;
    }

    public static int d(String tag, String msg) {
        if (debugMode) {
            return Log.d(tag, msg);
        }
        return 0;
    }

    public static int d(String tag, String msg, Throwable tr) {
        if (debugMode) {
            return Log.d(tag, msg, tr);
        }
        return 0;
    }

    public static int d(String tag_msg) {
        if (!debugMode) {
            return 0;
        }
        String[] split = tag_msg.split("\\|");
        if (split.length > 1) {
            return Log.d(split[0], split[1]);
        }
        if (split.length == 1) {
            return Log.d("UnknownClass", split[0]);
        }
        return 0;
    }

    public static int i(String tag, String msg) {
        return Log.i(tag, msg);
    }

    public static int i(String tag, String msg, Throwable tr) {
        return Log.i(tag, msg, tr);
    }

    public static int w(String tag, String msg) {
        return Log.w(tag, msg);
    }

    public static int w(String tag, String msg, Throwable tr) {
        return Log.w(tag, msg, tr);
    }

    public static int w(String tag, Throwable tr) {
        return Log.w(tag, tr);
    }

    public static int e(String tag, String msg) {
        try {
            return Log.e(tag, msg);
        } catch (Throwable th) {
            return 0;
        }
    }

    public static int e(String tag, String msg, Throwable tr) {
        try {
            return Log.e(tag, msg, tr);
        } catch (Throwable th) {
            return 0;
        }
    }

    public static void printStackTrace() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            Log.d("StackTrace", stackTraceElement.toString());
        }
    }

    public static void printStackTrace(String TAG) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            Log.d(TAG, "printStackTrace " + stackTraceElement.toString());
        }
    }
}
