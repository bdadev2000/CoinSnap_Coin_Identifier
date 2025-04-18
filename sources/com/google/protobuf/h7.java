package com.google.protobuf;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class h7 {
    private static final Iterator<Object> ITERATOR = new f7();
    private static final Iterable<Object> ITERABLE = new g7();

    private h7() {
    }

    public static <T> Iterable<T> iterable() {
        return (Iterable<T>) ITERABLE;
    }
}
