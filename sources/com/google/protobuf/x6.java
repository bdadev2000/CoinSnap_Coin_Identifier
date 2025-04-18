package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class x6 extends InputStream {
    private d0 currentPiece;
    private int currentPieceIndex;
    private int currentPieceOffsetInRope;
    private int currentPieceSize;
    private int mark;
    private w6 pieceIterator;
    final /* synthetic */ y6 this$0;

    public x6(y6 y6Var) {
        this.this$0 = y6Var;
        initialize();
    }

    private void advanceIfCurrentPieceFullyRead() {
        if (this.currentPiece != null) {
            int i10 = this.currentPieceIndex;
            int i11 = this.currentPieceSize;
            if (i10 == i11) {
                this.currentPieceOffsetInRope += i11;
                this.currentPieceIndex = 0;
                if (this.pieceIterator.hasNext()) {
                    d0 next = this.pieceIterator.next();
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
        w6 w6Var = new w6(this.this$0, null);
        this.pieceIterator = w6Var;
        d0 next = w6Var.next();
        this.currentPiece = next;
        this.currentPieceSize = next.size();
        this.currentPieceIndex = 0;
        this.currentPieceOffsetInRope = 0;
    }

    private int readSkipInternal(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        while (i12 > 0) {
            advanceIfCurrentPieceFullyRead();
            if (this.currentPiece == null) {
                break;
            }
            int min = Math.min(this.currentPieceSize - this.currentPieceIndex, i12);
            if (bArr != null) {
                this.currentPiece.copyTo(bArr, this.currentPieceIndex, i10, min);
                i10 += min;
            }
            this.currentPieceIndex += min;
            i12 -= min;
        }
        return i11 - i12;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return availableInternal();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 >= 0 && i11 >= 0 && i11 <= bArr.length - i10) {
            int readSkipInternal = readSkipInternal(bArr, i10, i11);
            if (readSkipInternal != 0) {
                return readSkipInternal;
            }
            if (i11 > 0 || availableInternal() == 0) {
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
    public long skip(long j3) {
        if (j3 >= 0) {
            if (j3 > 2147483647L) {
                j3 = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j3);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        advanceIfCurrentPieceFullyRead();
        d0 d0Var = this.currentPiece;
        if (d0Var == null) {
            return -1;
        }
        int i10 = this.currentPieceIndex;
        this.currentPieceIndex = i10 + 1;
        return d0Var.byteAt(i10) & UByte.MAX_VALUE;
    }
}
