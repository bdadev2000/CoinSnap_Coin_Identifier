package com.applovin.impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
abstract class mh {
    public static Object[] a(Object[] objArr, int i2, int i3, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i2, i3, objArr2.getClass());
    }

    public static Object[] a(Object[] objArr, int i2) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
    }

    public static Map a() {
        return w3.a();
    }
}
