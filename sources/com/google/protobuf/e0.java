package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class e0 extends d0 {
    private static final long serialVersionUID = 1;
    protected final byte[] bytes;

    public e0(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    @Override // com.google.protobuf.h0
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.h0
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.h0
    public byte byteAt(int i10) {
        return this.bytes[i10];
    }

    @Override // com.google.protobuf.h0
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
    }

    @Override // com.google.protobuf.h0
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.bytes, i10, bArr, i11, i12);
    }

    @Override // com.google.protobuf.h0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0) || size() != ((h0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = e0Var.peekCachedHashCode();
            if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
                return false;
            }
            return equalsRange(e0Var, 0, size());
        }
        return obj.equals(this);
    }

    @Override // com.google.protobuf.d0
    public final boolean equalsRange(h0 h0Var, int i10, int i11) {
        if (i11 <= h0Var.size()) {
            int i12 = i10 + i11;
            if (i12 <= h0Var.size()) {
                if (h0Var instanceof e0) {
                    e0 e0Var = (e0) h0Var;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = e0Var.bytes;
                    int offsetIntoBytes = getOffsetIntoBytes() + i11;
                    int offsetIntoBytes2 = getOffsetIntoBytes();
                    int offsetIntoBytes3 = e0Var.getOffsetIntoBytes() + i10;
                    while (offsetIntoBytes2 < offsetIntoBytes) {
                        if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                            return false;
                        }
                        offsetIntoBytes2++;
                        offsetIntoBytes3++;
                    }
                    return true;
                }
                return h0Var.substring(i10, i12).equals(substring(0, i11));
            }
            StringBuilder n10 = a4.j.n("Ran off end of other: ", i10, ", ", i11, ", ");
            n10.append(h0Var.size());
            throw new IllegalArgumentException(n10.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i11 + size());
    }

    public int getOffsetIntoBytes() {
        return 0;
    }

    @Override // com.google.protobuf.h0
    public byte internalByteAt(int i10) {
        return this.bytes[i10];
    }

    @Override // com.google.protobuf.h0
    public final boolean isValidUtf8() {
        int offsetIntoBytes = getOffsetIntoBytes();
        return j9.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
    }

    @Override // com.google.protobuf.h0
    public final r0 newCodedInput() {
        return r0.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
    }

    @Override // com.google.protobuf.h0
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
    }

    @Override // com.google.protobuf.h0
    public final int partialHash(int i10, int i11, int i12) {
        return f4.partialHash(i10, this.bytes, getOffsetIntoBytes() + i11, i12);
    }

    @Override // com.google.protobuf.h0
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        int offsetIntoBytes = getOffsetIntoBytes() + i11;
        return j9.partialIsValidUtf8(i10, this.bytes, offsetIntoBytes, i12 + offsetIntoBytes);
    }

    @Override // com.google.protobuf.h0
    public int size() {
        return this.bytes.length;
    }

    @Override // com.google.protobuf.h0
    public final h0 substring(int i10, int i11) {
        int checkRange = h0.checkRange(i10, i11, size());
        if (checkRange == 0) {
            return h0.EMPTY;
        }
        return new z(this.bytes, getOffsetIntoBytes() + i10, checkRange);
    }

    @Override // com.google.protobuf.h0
    public final String toStringInternal(Charset charset) {
        return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
    }

    @Override // com.google.protobuf.h0
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.h0
    public final void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.bytes, getOffsetIntoBytes() + i10, i11);
    }

    @Override // com.google.protobuf.h0
    public final void writeTo(u uVar) throws IOException {
        uVar.writeLazy(this.bytes, getOffsetIntoBytes(), size());
    }
}
