package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import java.nio.ByteBuffer;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class DecoderInputBuffer extends Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final CryptoInfo cryptoInfo = new CryptoInfo();
    public ByteBuffer data;
    public long timeUs;

    /* loaded from: classes3.dex */
    public @interface BufferReplacementMode {
    }

    public DecoderInputBuffer(int i9) {
        this.bufferReplacementMode = i9;
    }

    private ByteBuffer createReplacementByteBuffer(int i9) {
        int capacity;
        int i10 = this.bufferReplacementMode;
        if (i10 == 1) {
            return ByteBuffer.allocate(i9);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException(AbstractC2914a.c(capacity, i9, "Buffer too small (", " < ", ")"));
    }

    public static DecoderInputBuffer newFlagsOnlyInstance() {
        return new DecoderInputBuffer(0);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public void ensureSpaceForWrite(int i9) throws IllegalStateException {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i9);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.data.position();
        int i10 = i9 + position;
        if (capacity >= i10) {
            return;
        }
        ByteBuffer createReplacementByteBuffer = createReplacementByteBuffer(i10);
        if (position > 0) {
            this.data.position(0);
            this.data.limit(position);
            createReplacementByteBuffer.put(this.data);
        }
        this.data = createReplacementByteBuffer;
    }

    public final void flip() {
        this.data.flip();
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    public final boolean isFlagsOnly() {
        if (this.data == null && this.bufferReplacementMode == 0) {
            return true;
        }
        return false;
    }
}
