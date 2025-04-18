package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class Assertions {
    private Assertions() {
    }

    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkIndex(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
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

    public static <T> T checkNotNull(T t5) {
        t5.getClass();
        return t5;
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T> T checkNotNull(T t5, Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
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
