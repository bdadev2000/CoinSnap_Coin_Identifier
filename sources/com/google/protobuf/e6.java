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

/* loaded from: classes4.dex */
public final class e6 extends d0 {
    private final ByteBuffer buffer;

    public e6(ByteBuffer byteBuffer) {
        f4.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i10, int i11) {
        if (i10 >= this.buffer.position() && i11 <= this.buffer.limit() && i10 <= i11) {
            ByteBuffer slice = this.buffer.slice();
            slice.position(i10 - this.buffer.position());
            slice.limit(i11 - this.buffer.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private Object writeReplace() {
        return h0.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.h0
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.h0
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.h0
    public byte byteAt(int i10) {
        try {
            return this.buffer.get(i10);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e10) {
            throw new ArrayIndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.protobuf.h0
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.h0
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i10);
        slice.get(bArr, i11, i12);
    }

    @Override // com.google.protobuf.h0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (size() != h0Var.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof e6) {
            return this.buffer.equals(((e6) obj).buffer);
        }
        if (obj instanceof y6) {
            return obj.equals(this);
        }
        return this.buffer.equals(h0Var.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.d0
    public boolean equalsRange(h0 h0Var, int i10, int i11) {
        return substring(0, i11).equals(h0Var.substring(i10, i11 + i10));
    }

    @Override // com.google.protobuf.h0
    public byte internalByteAt(int i10) {
        return byteAt(i10);
    }

    @Override // com.google.protobuf.h0
    public boolean isValidUtf8() {
        return j9.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.h0
    public r0 newCodedInput() {
        return r0.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.h0
    public InputStream newInput() {
        return new d6(this);
    }

    @Override // com.google.protobuf.h0
    public int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.buffer.get(i13);
        }
        return i10;
    }

    @Override // com.google.protobuf.h0
    public int partialIsValidUtf8(int i10, int i11, int i12) {
        return j9.partialIsValidUtf8(i10, this.buffer, i11, i12 + i11);
    }

    @Override // com.google.protobuf.h0
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.h0
    public h0 substring(int i10, int i11) {
        try {
            return new e6(slice(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e10) {
            throw new ArrayIndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.protobuf.h0
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int i10;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            i10 = this.buffer.position() + this.buffer.arrayOffset();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i10 = 0;
        }
        return new String(byteArray, i10, length, charset);
    }

    @Override // com.google.protobuf.h0
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.h0
    public void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset() + i10, i11);
            return;
        }
        t.write(slice(i10, i11 + i10), outputStream);
    }

    @Override // com.google.protobuf.h0
    public void writeTo(u uVar) throws IOException {
        uVar.writeLazy(this.buffer.slice());
    }
}
