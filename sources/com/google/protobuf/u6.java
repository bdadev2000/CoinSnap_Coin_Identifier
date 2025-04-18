package com.google.protobuf;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class u6 extends x {
    b0 current = nextPiece();
    final w6 pieces;
    final /* synthetic */ y6 this$0;

    public u6(y6 y6Var) {
        this.this$0 = y6Var;
        this.pieces = new w6(y6Var, null);
    }

    private b0 nextPiece() {
        if (this.pieces.hasNext()) {
            return this.pieces.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current != null;
    }

    @Override // com.google.protobuf.x, com.google.protobuf.b0
    public byte nextByte() {
        b0 b0Var = this.current;
        if (b0Var != null) {
            byte nextByte = b0Var.nextByte();
            if (!this.current.hasNext()) {
                this.current = nextPiece();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
