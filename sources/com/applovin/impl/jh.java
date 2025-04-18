package com.applovin.impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
abstract class jh {
    public static Object[] a(Object[] objArr, int i10, int i11, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i10, i11, objArr2.getClass());
    }

    public static Object[] a(Object[] objArr, int i10) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
    }

    public static Map a() {
        return u3.a();
    }
}
