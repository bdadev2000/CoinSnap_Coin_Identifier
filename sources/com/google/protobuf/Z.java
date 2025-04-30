package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Z extends X {
    private final ByteBuffer byteBuffer;
    private int initialPosition;

    public Z(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.byteBuffer = byteBuffer;
        this.initialPosition = byteBuffer.position();
    }

    @Override // com.google.protobuf.X, com.google.protobuf.AbstractC1895e0
    public void flush() {
    }
}
