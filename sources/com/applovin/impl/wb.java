package com.applovin.impl;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class wb {
    private static Object a(List list) {
        return androidx.compose.foundation.text.input.a.g(list, 1);
    }

    public static Object b(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return xb.b(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return a(list);
    }

    public static Object[] c(Iterable iterable) {
        return a(iterable).toArray();
    }

    public static String d(Iterable iterable) {
        return xb.d(iterable.iterator());
    }

    private static Collection a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return ic.a(iterable.iterator());
    }

    public static Object a(Iterable iterable, Object obj) {
        return xb.a(iterable.iterator(), obj);
    }
}
