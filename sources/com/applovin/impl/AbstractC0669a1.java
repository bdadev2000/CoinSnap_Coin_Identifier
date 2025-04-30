package com.applovin.impl;

import android.text.TextUtils;

/* renamed from: com.applovin.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0669a1 {
    public static void a(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int a(int i9, int i10, int i11) {
        if (i9 < i10 || i9 >= i11) {
            throw new IndexOutOfBoundsException();
        }
        return i9;
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
