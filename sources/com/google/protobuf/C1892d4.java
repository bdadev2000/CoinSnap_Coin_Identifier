package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1892d4 extends D {
    private final ByteBuffer buffer;

    public C1892d4(ByteBuffer byteBuffer) {
        C1898e3.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i9, int i10) {
        if (i9 >= this.buffer.position() && i10 <= this.buffer.limit() && i9 <= i10) {
            ByteBuffer slice = this.buffer.slice();
            slice.position(i9 - this.buffer.position());
            slice.limit(i10 - this.buffer.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    private Object writeReplace() {
        return H.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.H
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.H
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.H
    public byte byteAt(int i9) {
        try {
            return this.buffer.get(i9);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e9) {
            throw new ArrayIndexOutOfBoundsException(e9.getMessage());
        }
    }

    @Override // com.google.protobuf.H
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.H
    public void copyToInternal(byte[] bArr, int i9, int i10, int i11) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i9);
        slice.get(bArr, i10, i11);
    }

    @Override // com.google.protobuf.H
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h6 = (H) obj;
        if (size() != h6.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C1892d4) {
            return this.buffer.equals(((C1892d4) obj).buffer);
        }
        if (obj instanceof C2031x4) {
            return obj.equals(this);
        }
        return this.buffer.equals(h6.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.D
    public boolean equalsRange(H h6, int i9, int i10) {
        return substring(0, i10).equals(h6.substring(i9, i10 + i9));
    }

    @Override // com.google.protobuf.H
    public byte internalByteAt(int i9) {
        return byteAt(i9);
    }

    @Override // com.google.protobuf.H
    public boolean isValidUtf8() {
        return I5.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.H
    public S newCodedInput() {
        return S.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.H
    public InputStream newInput() {
        return new C1885c4(this);
    }

    @Override // com.google.protobuf.H
    public int partialHash(int i9, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i9 = (i9 * 31) + this.buffer.get(i12);
        }
        return i9;
    }

    @Override // com.google.protobuf.H
    public int partialIsValidUtf8(int i9, int i10, int i11) {
        return I5.partialIsValidUtf8(i9, this.buffer, i10, i11 + i10);
    }

    @Override // com.google.protobuf.H
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.H
    public H substring(int i9, int i10) {
        try {
            return new C1892d4(slice(i9, i10));
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e9) {
            throw new ArrayIndexOutOfBoundsException(e9.getMessage());
        }
    }

    @Override // com.google.protobuf.H
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int i9;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            i9 = this.buffer.position() + this.buffer.arrayOffset();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i9 = 0;
        }
        return new String(byteArray, i9, length, charset);
    }

    @Override // com.google.protobuf.H
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.H
    public void writeToInternal(OutputStream outputStream, int i9, int i10) throws IOException {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset() + i9, i10);
            return;
        }
        C1998t.write(slice(i9, i10 + i9), outputStream);
    }

    @Override // com.google.protobuf.H
    public void writeTo(AbstractC2005u abstractC2005u) throws IOException {
        abstractC2005u.writeLazy(this.buffer.slice());
    }
}
