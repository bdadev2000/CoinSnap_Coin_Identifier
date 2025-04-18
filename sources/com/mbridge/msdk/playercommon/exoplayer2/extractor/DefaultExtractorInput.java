package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataSource dataSource;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    public DefaultExtractorInput(DataSource dataSource, long j3, long j10) {
        this.dataSource = dataSource;
        this.position = j3;
        this.streamLength = j10;
    }

    private void commitBytesRead(int i10) {
        if (i10 != -1) {
            this.position += i10;
        }
    }

    private void ensureSpaceForPeek(int i10) {
        int i11 = this.peekBufferPosition + i10;
        byte[] bArr = this.peekBuffer;
        if (i11 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i11, i11 + PEEK_MAX_FREE_SPACE));
        }
    }

    private int readFromDataSource(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.dataSource.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedException();
    }

    private int readFromPeekBuffer(byte[] bArr, int i10, int i11) {
        int i12 = this.peekBufferLength;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.peekBuffer, 0, bArr, i10, min);
        updatePeekBuffer(min);
        return min;
    }

    private int skipFromPeekBuffer(int i10) {
        int min = Math.min(this.peekBufferLength, i10);
        updatePeekBuffer(min);
        return min;
    }

    private void updatePeekBuffer(int i10) {
        byte[] bArr;
        int i11 = this.peekBufferLength - i10;
        this.peekBufferLength = i11;
        this.peekBufferPosition = 0;
        byte[] bArr2 = this.peekBuffer;
        if (i11 < bArr2.length - PEEK_MAX_FREE_SPACE) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.peekBuffer = bArr;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final boolean advancePeekPosition(int i10, boolean z10) throws IOException, InterruptedException {
        ensureSpaceForPeek(i10);
        int min = Math.min(this.peekBufferLength - this.peekBufferPosition, i10);
        while (min < i10) {
            min = readFromDataSource(this.peekBuffer, this.peekBufferPosition, i10, min, z10);
            if (min == -1) {
                return false;
            }
        }
        int i11 = this.peekBufferPosition + i10;
        this.peekBufferPosition = i11;
        this.peekBufferLength = Math.max(this.peekBufferLength, i11);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final long getLength() {
        return this.streamLength;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final long getPeekPosition() {
        return this.position + this.peekBufferPosition;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final long getPosition() {
        return this.position;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final int read(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int readFromPeekBuffer = readFromPeekBuffer(bArr, i10, i11);
        if (readFromPeekBuffer == 0) {
            readFromPeekBuffer = readFromDataSource(bArr, i10, i11, 0, true);
        }
        commitBytesRead(readFromPeekBuffer);
        return readFromPeekBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        int readFromPeekBuffer = readFromPeekBuffer(bArr, i10, i11);
        while (readFromPeekBuffer < i11 && readFromPeekBuffer != -1) {
            readFromPeekBuffer = readFromDataSource(bArr, i10, i11, readFromPeekBuffer, z10);
        }
        commitBytesRead(readFromPeekBuffer);
        return readFromPeekBuffer != -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final <E extends Throwable> void setRetryPosition(long j3, E e2) throws Throwable {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.position = j3;
        throw e2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final int skip(int i10) throws IOException, InterruptedException {
        int skipFromPeekBuffer = skipFromPeekBuffer(i10);
        if (skipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            skipFromPeekBuffer = readFromDataSource(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        commitBytesRead(skipFromPeekBuffer);
        return skipFromPeekBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final boolean skipFully(int i10, boolean z10) throws IOException, InterruptedException {
        int skipFromPeekBuffer = skipFromPeekBuffer(i10);
        while (skipFromPeekBuffer < i10 && skipFromPeekBuffer != -1) {
            skipFromPeekBuffer = readFromDataSource(this.scratchSpace, -skipFromPeekBuffer, Math.min(i10, this.scratchSpace.length + skipFromPeekBuffer), skipFromPeekBuffer, z10);
        }
        commitBytesRead(skipFromPeekBuffer);
        return skipFromPeekBuffer != -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void peekFully(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        readFully(bArr, i10, i11, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void advancePeekPosition(int i10) throws IOException, InterruptedException {
        advancePeekPosition(i10, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void skipFully(int i10) throws IOException, InterruptedException {
        skipFully(i10, false);
    }
}
