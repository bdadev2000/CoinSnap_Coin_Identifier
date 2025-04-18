package com.google.protobuf;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class w8 implements Iterator {
    Iterator<String> iter;
    final /* synthetic */ x8 this$0;

    public w8(x8 x8Var) {
        s4 s4Var;
        this.this$0 = x8Var;
        s4Var = x8Var.list;
        this.iter = s4Var.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public String next() {
        return this.iter.next();
    }
}
