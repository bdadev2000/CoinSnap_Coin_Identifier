package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class y0 extends w0 {
    private final ByteBuffer byteBuffer;
    private int initialPosition;

    public y0(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.byteBuffer = byteBuffer;
        this.initialPosition = byteBuffer.position();
    }

    @Override // com.google.protobuf.w0, com.google.protobuf.d1
    public void flush() {
    }
}
