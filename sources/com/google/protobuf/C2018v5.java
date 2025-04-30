package com.google.protobuf;

import java.util.Iterator;

/* renamed from: com.google.protobuf.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2018v5 implements Iterator {
    Iterator<String> iter;
    final /* synthetic */ C2025w5 this$0;

    public C2018v5(C2025w5 c2025w5) {
        InterfaceC1988r3 interfaceC1988r3;
        this.this$0 = c2025w5;
        interfaceC1988r3 = c2025w5.list;
        this.iter = interfaceC1988r3.iterator();
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
