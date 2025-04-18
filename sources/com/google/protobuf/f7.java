package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class f7 implements Iterator {
    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
