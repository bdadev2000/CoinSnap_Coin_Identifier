package com.google.protobuf;

import java.util.ListIterator;

/* renamed from: com.google.protobuf.u5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2011u5 implements ListIterator {
    ListIterator<String> iter;
    final /* synthetic */ C2025w5 this$0;
    final /* synthetic */ int val$index;

    public C2011u5(C2025w5 c2025w5, int i9) {
        InterfaceC1988r3 interfaceC1988r3;
        this.this$0 = c2025w5;
        this.val$index = i9;
        interfaceC1988r3 = c2025w5.list;
        this.iter = interfaceC1988r3.listIterator(i9);
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
