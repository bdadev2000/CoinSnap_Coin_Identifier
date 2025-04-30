package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.protobuf.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2024w4 extends InputStream {
    private D currentPiece;
    private int currentPieceIndex;
    private int currentPieceOffsetInRope;
    private int currentPieceSize;
    private int mark;
    private C2017v4 pieceIterator;
    final /* synthetic */ C2031x4 this$0;

    public C2024w4(C2031x4 c2031x4) {
        this.this$0 = c2031x4;
        initialize();
    }

    private void advanceIfCurrentPieceFullyRead() {
        if (this.currentPiece != null) {
            int i9 = this.currentPieceIndex;
            int i10 = this.currentPieceSize;
            if (i9 == i10) {
                this.currentPieceOffsetInRope += i10;
                this.currentPieceIndex = 0;
                if (this.pieceIterator.hasNext()) {
                    D next = this.pieceIterator.next();
                    this.currentPiece = next;
                    this.currentPieceSize = next.size();
                } else {
                    this.currentPiece = null;
                    this.currentPieceSize = 0;
                }
            }
        }
    }

    private int availableInternal() {
        return this.this$0.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
    }

    private void initialize() {
        C2017v4 c2017v4 = new C2017v4(this.this$0, null);
        this.pieceIterator = c2017v4;
        D next = c2017v4.next();
        this.currentPiece = next;
        this.currentPieceSize = next.size();
        this.currentPieceIndex = 0;
        this.currentPieceOffsetInRope = 0;
    }

    private int readSkipInternal(byte[] bArr, int i9, int i10) {
        int i11 = i10;
        while (i11 > 0) {
            advanceIfCurrentPieceFullyRead();
            if (this.currentPiece == null) {
                break;
            }
            int min = Math.min(this.currentPieceSize - this.currentPieceIndex, i11);
            if (bArr != null) {
                this.currentPiece.copyTo(bArr, this.currentPieceIndex, i9, min);
                i9 += min;
            }
            this.currentPieceIndex += min;
            i11 -= min;
        }
        return i10 - i11;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return availableInternal();
    }

    @Override // java.io.InputStream
    public void mark(int i9) {
        this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) {
        bArr.getClass();
        if (i9 >= 0 && i10 >= 0 && i10 <= bArr.length - i9) {
            int readSkipInternal = readSkipInternal(bArr, i9, i10);
            if (readSkipInternal != 0) {
                return readSkipInternal;
            }
            if (i10 > 0 || availableInternal() == 0) {
                return -1;
            }
            return readSkipInternal;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        initialize();
        readSkipInternal(null, 0, this.mark);
    }

    @Override // java.io.InputStream
    public long skip(long j7) {
        if (j7 >= 0) {
            if (j7 > 2147483647L) {
                j7 = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j7);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        advanceIfCurrentPieceFullyRead();
        D d2 = this.currentPiece;
        if (d2 == null) {
            return -1;
        }
        int i9 = this.currentPieceIndex;
        this.currentPieceIndex = i9 + 1;
        return d2.byteAt(i9) & 255;
    }
}
