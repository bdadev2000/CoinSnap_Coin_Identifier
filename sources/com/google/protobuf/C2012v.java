package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2012v extends AbstractC2026x {
    private final int limit;
    private int position = 0;
    final /* synthetic */ H this$0;

    public C2012v(H h6) {
        this.this$0 = h6;
        this.limit = h6.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.position < this.limit) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2026x, com.google.protobuf.B
    public byte nextByte() {
        int i9 = this.position;
        if (i9 < this.limit) {
            this.position = i9 + 1;
            return this.this$0.internalByteAt(i9);
        }
        throw new NoSuchElementException();
    }
}
