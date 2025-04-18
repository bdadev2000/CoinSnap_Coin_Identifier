package com.mbridge.msdk.playercommon.exoplayer2.text;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {
    private final String name;

    public SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.name = str;
        setInitialInputBufferSize(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    }

    public abstract Subtitle decode(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final String getName() {
        return this.name;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j3) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder
    public final SubtitleInputBuffer createInputBuffer() {
        return new SubtitleInputBuffer();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder
    public final SubtitleOutputBuffer createOutputBuffer() {
        return new SimpleSubtitleOutputBuffer(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder
    public final SubtitleDecoderException createUnexpectedDecodeException(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder
    public final SubtitleDecoderException decode(SubtitleInputBuffer subtitleInputBuffer, SubtitleOutputBuffer subtitleOutputBuffer, boolean z10) {
        try {
            ByteBuffer byteBuffer = subtitleInputBuffer.data;
            subtitleOutputBuffer.setContent(subtitleInputBuffer.timeUs, decode(byteBuffer.array(), byteBuffer.limit(), z10), subtitleInputBuffer.subsampleOffsetUs);
            subtitleOutputBuffer.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e2) {
            return e2;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder
    public final void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
        super.releaseOutputBuffer((SimpleSubtitleDecoder) subtitleOutputBuffer);
    }
}
