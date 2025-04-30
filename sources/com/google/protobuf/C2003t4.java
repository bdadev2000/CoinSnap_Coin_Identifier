package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2003t4 extends AbstractC2026x {
    B current = nextPiece();
    final C2017v4 pieces;
    final /* synthetic */ C2031x4 this$0;

    public C2003t4(C2031x4 c2031x4) {
        this.this$0 = c2031x4;
        this.pieces = new C2017v4(c2031x4, null);
    }

    private B nextPiece() {
        if (this.pieces.hasNext()) {
            return this.pieces.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.current != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2026x, com.google.protobuf.B
    public byte nextByte() {
        B b = this.current;
        if (b != null) {
            byte nextByte = b.nextByte();
            if (!this.current.hasNext()) {
                this.current = nextPiece();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
