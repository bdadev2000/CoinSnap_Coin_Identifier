package com.google.protobuf;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class v extends x {
    private final int limit;
    private int position = 0;
    final /* synthetic */ h0 this$0;

    public v(h0 h0Var) {
        this.this$0 = h0Var;
        this.limit = h0Var.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.protobuf.x, com.google.protobuf.b0
    public byte nextByte() {
        int i10 = this.position;
        if (i10 < this.limit) {
            this.position = i10 + 1;
            return this.this$0.internalByteAt(i10);
        }
        throw new NoSuchElementException();
    }
}
