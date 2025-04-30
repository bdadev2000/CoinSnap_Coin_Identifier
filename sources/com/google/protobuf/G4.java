package com.google.protobuf;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class G4 {
    private static final Iterator<Object> ITERATOR = new E4();
    private static final Iterable<Object> ITERABLE = new F4();

    private G4() {
    }

    public static <T> Iterable<T> iterable() {
        return (Iterable<T>) ITERABLE;
    }
}
