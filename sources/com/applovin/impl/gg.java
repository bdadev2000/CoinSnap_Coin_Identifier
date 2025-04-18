package com.applovin.impl;

/* loaded from: classes2.dex */
public abstract class gg {
    public static Object a(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(android.support.v4.media.d.i("at index ", i2));
    }

    public static Object[] b(Object[] objArr, int i2) {
        return mh.a(objArr, i2);
    }

    public static Object[] a(Object... objArr) {
        return a(objArr, objArr.length);
    }

    public static Object[] a(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            a(objArr[i3], i3);
        }
        return objArr;
    }
}
