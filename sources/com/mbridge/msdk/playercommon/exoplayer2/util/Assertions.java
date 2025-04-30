package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class Assertions {
    private Assertions() {
    }

    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkIndex(int i9, int i10, int i11) {
        if (i9 >= i10 && i9 < i11) {
            return i9;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void checkMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T checkNotNull(T t9) {
        t9.getClass();
        return t9;
    }

    public static void checkState(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T> T checkNotNull(T t9, Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String checkNotEmpty(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }
}
