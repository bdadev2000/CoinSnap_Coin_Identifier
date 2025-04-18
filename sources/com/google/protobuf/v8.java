package com.google.protobuf;

import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class v8 implements ListIterator {
    ListIterator<String> iter;
    final /* synthetic */ x8 this$0;
    final /* synthetic */ int val$index;

    public v8(x8 x8Var, int i10) {
        s4 s4Var;
        this.this$0 = x8Var;
        this.val$index = i10;
        s4Var = x8Var.list;
        this.iter = s4Var.listIterator(i10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.iter.hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.iter.nextIndex();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.iter.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public String next() {
        return this.iter.next();
    }

    @Override // java.util.ListIterator
    public String previous() {
        return this.iter.previous();
    }

    @Override // java.util.ListIterator
    public void set(String str) {
        throw new UnsupportedOperationException();
    }
}
