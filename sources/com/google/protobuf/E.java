package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class E extends D {
    private static final long serialVersionUID = 1;
    protected final byte[] bytes;

    public E(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    @Override // com.google.protobuf.H
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.H
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.H
    public byte byteAt(int i9) {
        return this.bytes[i9];
    }

    @Override // com.google.protobuf.H
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
    }

    @Override // com.google.protobuf.H
    public void copyToInternal(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.bytes, i9, bArr, i10, i11);
    }

    @Override // com.google.protobuf.H
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H) || size() != ((H) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof E) {
            E e4 = (E) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = e4.peekCachedHashCode();
            if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
                return false;
            }
            return equalsRange(e4, 0, size());
        }
        return obj.equals(this);
    }

    @Override // com.google.protobuf.D
    public final boolean equalsRange(H h6, int i9, int i10) {
        if (i10 <= h6.size()) {
            int i11 = i9 + i10;
            if (i11 <= h6.size()) {
                if (h6 instanceof E) {
                    E e4 = (E) h6;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = e4.bytes;
                    int offsetIntoBytes = getOffsetIntoBytes() + i10;
                    int offsetIntoBytes2 = getOffsetIntoBytes();
                    int offsetIntoBytes3 = e4.getOffsetIntoBytes() + i9;
                    while (offsetIntoBytes2 < offsetIntoBytes) {
                        if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                            return false;
                        }
                        offsetIntoBytes2++;
                        offsetIntoBytes3++;
                    }
                    return true;
                }
                return h6.substring(i9, i11).equals(substring(0, i10));
            }
            StringBuilder o3 = Q7.n0.o(i9, i10, "Ran off end of other: ", ", ", ", ");
            o3.append(h6.size());
            throw new IllegalArgumentException(o3.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i10 + size());
    }

    public int getOffsetIntoBytes() {
        return 0;
    }

    @Override // com.google.protobuf.H
    public byte internalByteAt(int i9) {
        return this.bytes[i9];
    }

    @Override // com.google.protobuf.H
    public final boolean isValidUtf8() {
        int offsetIntoBytes = getOffsetIntoBytes();
        return I5.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
    }

    @Override // com.google.protobuf.H
    public final S newCodedInput() {
        return S.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
    }

    @Override // com.google.protobuf.H
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
    }

    @Override // com.google.protobuf.H
    public final int partialHash(int i9, int i10, int i11) {
        return C1898e3.partialHash(i9, this.bytes, getOffsetIntoBytes() + i10, i11);
    }

    @Override // com.google.protobuf.H
    public final int partialIsValidUtf8(int i9, int i10, int i11) {
        int offsetIntoBytes = getOffsetIntoBytes() + i10;
        return I5.partialIsValidUtf8(i9, this.bytes, offsetIntoBytes, i11 + offsetIntoBytes);
    }

    @Override // com.google.protobuf.H
    public int size() {
        return this.bytes.length;
    }

    @Override // com.google.protobuf.H
    public final H substring(int i9, int i10) {
        int checkRange = H.checkRange(i9, i10, size());
        if (checkRange == 0) {
            return H.EMPTY;
        }
        return new C2040z(this.bytes, getOffsetIntoBytes() + i9, checkRange);
    }

    @Override // com.google.protobuf.H
    public final String toStringInternal(Charset charset) {
        return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
    }

    @Override // com.google.protobuf.H
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.H
    public final void writeToInternal(OutputStream outputStream, int i9, int i10) throws IOException {
        outputStream.write(this.bytes, getOffsetIntoBytes() + i9, i10);
    }

    @Override // com.google.protobuf.H
    public final void writeTo(AbstractC2005u abstractC2005u) throws IOException {
        abstractC2005u.writeLazy(this.bytes, getOffsetIntoBytes(), size());
    }
}
