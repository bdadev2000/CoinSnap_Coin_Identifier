package com.google.protobuf;

/* loaded from: classes4.dex */
public abstract class x implements b0 {
    @Override // com.google.protobuf.b0
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
