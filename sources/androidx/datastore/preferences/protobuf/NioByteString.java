package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
final class NioByteString extends ByteString.LeafByteString {
    public final ByteBuffer d;

    /* renamed from: androidx.datastore.preferences.protobuf.NioByteString$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends InputStream {
        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void mark(int i2) {
            throw null;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw null;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    public NioByteString(ByteBuffer byteBuffer) {
        Charset charset = Internal.f19251a;
        this.d = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        ByteBuffer slice = this.d.slice();
        int remaining = slice.remaining();
        ByteString.d(0, remaining, slice.remaining());
        byte[] bArr = new byte[remaining];
        slice.get(bArr);
        return new ByteString.LiteralByteString(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteBuffer a() {
        return this.d.asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final byte b(int i2) {
        try {
            return this.d.get(i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        return obj instanceof NioByteString ? byteBuffer.equals(((NioByteString) obj).d) : obj instanceof RopeByteString ? obj.equals(this) : byteBuffer.equals(byteString.a());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void f(int i2, int i3, int i4, byte[] bArr) {
        ByteBuffer slice = this.d.slice();
        slice.position(i2);
        slice.get(bArr, i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean j() {
        Utf8.Processor processor = Utf8.f19397a;
        ByteBuffer byteBuffer = this.d;
        return Utf8.f19397a.f(0, byteBuffer.position(), byteBuffer.remaining(), byteBuffer) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int l(int i2, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + this.d.get(i5);
        }
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int m(int i2, int i3, int i4) {
        return Utf8.f19397a.f(i2, i3, i4 + i3, this.d);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteString p(int i2, int i3) {
        try {
            return new NioByteString(x(i2, i3));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final String r(Charset charset) {
        byte[] q2;
        int length;
        int i2;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer.hasArray()) {
            q2 = byteBuffer.array();
            i2 = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            q2 = q();
            length = q2.length;
            i2 = 0;
        }
        return new String(q2, i2, length, charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.d.remaining();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void t(ByteOutput byteOutput) {
        byteOutput.R(this.d.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
    public final boolean w(ByteString byteString, int i2, int i3) {
        return p(0, i3).equals(byteString.p(i2, i3 + i2));
    }

    public final ByteBuffer x(int i2, int i3) {
        ByteBuffer byteBuffer = this.d;
        if (i2 < byteBuffer.position() || i3 > byteBuffer.limit() || i2 > i3) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        ByteBuffer slice = byteBuffer.slice();
        slice.position(i2 - byteBuffer.position());
        slice.limit(i3 - byteBuffer.position());
        return slice;
    }
}
