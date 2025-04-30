package com.google.protobuf;

/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2026x implements B {
    @Override // com.google.protobuf.B
    public abstract /* synthetic */ byte nextByte();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }
}
