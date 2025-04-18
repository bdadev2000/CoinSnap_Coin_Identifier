package com.applovin.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class a1 {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int a(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    public static Object b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.valueOf(obj2));
    }
}
