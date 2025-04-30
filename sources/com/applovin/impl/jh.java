package com.applovin.impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
abstract class jh {
    public static Object[] a(Object[] objArr, int i9, int i10, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i9, i10, objArr2.getClass());
    }

    public static Object[] a(Object[] objArr, int i9) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
    }

    public static Map a() {
        return u3.a();
    }
}
