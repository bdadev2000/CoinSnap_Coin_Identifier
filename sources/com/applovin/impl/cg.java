package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class cg {
    public static Object a(Object obj, int i9) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(com.mbridge.msdk.foundation.entity.o.h(i9, "at index "));
    }

    public static Object[] b(Object[] objArr, int i9) {
        return jh.a(objArr, i9);
    }

    public static Object[] a(Object... objArr) {
        return a(objArr, objArr.length);
    }

    public static Object[] a(Object[] objArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            a(objArr[i10], i10);
        }
        return objArr;
    }
}
