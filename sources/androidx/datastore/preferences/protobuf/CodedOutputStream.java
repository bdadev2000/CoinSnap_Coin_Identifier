package androidx.datastore.preferences.protobuf;

import androidx.compose.ui.platform.j;
import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f19161b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f19162c = UnsafeUtil.f19392f;

    /* renamed from: a, reason: collision with root package name */
    public CodedOutputStreamWriter f19163a;

    /* loaded from: classes2.dex */
    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        public final byte[] d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public int f19164f;

        public AbstractBufferedEncoder(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i2, 20)];
            this.d = bArr;
            this.e = bArr.length;
        }

        public final void H0(byte b2) {
            int i2 = this.f19164f;
            this.f19164f = i2 + 1;
            this.d[i2] = b2;
        }

        public final void I0(int i2) {
            int i3 = this.f19164f;
            byte[] bArr = this.d;
            bArr[i3] = (byte) (i2 & 255);
            bArr[i3 + 1] = (byte) ((i2 >> 8) & 255);
            bArr[i3 + 2] = (byte) ((i2 >> 16) & 255);
            this.f19164f = i3 + 4;
            bArr[i3 + 3] = (byte) ((i2 >> 24) & 255);
        }

        public final void J0(long j2) {
            int i2 = this.f19164f;
            byte[] bArr = this.d;
            bArr[i2] = (byte) (j2 & 255);
            bArr[i2 + 1] = (byte) ((j2 >> 8) & 255);
            bArr[i2 + 2] = (byte) ((j2 >> 16) & 255);
            bArr[i2 + 3] = (byte) (255 & (j2 >> 24));
            bArr[i2 + 4] = (byte) (((int) (j2 >> 32)) & 255);
            bArr[i2 + 5] = (byte) (((int) (j2 >> 40)) & 255);
            bArr[i2 + 6] = (byte) (((int) (j2 >> 48)) & 255);
            this.f19164f = i2 + 8;
            bArr[i2 + 7] = (byte) (((int) (j2 >> 56)) & 255);
        }

        public final void K0(int i2, int i3) {
            L0((i2 << 3) | i3);
        }

        public final void L0(int i2) {
            boolean z2 = CodedOutputStream.f19162c;
            byte[] bArr = this.d;
            if (z2) {
                while ((i2 & (-128)) != 0) {
                    int i3 = this.f19164f;
                    this.f19164f = i3 + 1;
                    UnsafeUtil.o(bArr, i3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                int i4 = this.f19164f;
                this.f19164f = i4 + 1;
                UnsafeUtil.o(bArr, i4, (byte) i2);
                return;
            }
            while ((i2 & (-128)) != 0) {
                int i5 = this.f19164f;
                this.f19164f = i5 + 1;
                bArr[i5] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            }
            int i6 = this.f19164f;
            this.f19164f = i6 + 1;
            bArr[i6] = (byte) i2;
        }

        public final void M0(long j2) {
            boolean z2 = CodedOutputStream.f19162c;
            byte[] bArr = this.d;
            if (z2) {
                while ((j2 & (-128)) != 0) {
                    int i2 = this.f19164f;
                    this.f19164f = i2 + 1;
                    UnsafeUtil.o(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                int i3 = this.f19164f;
                this.f19164f = i3 + 1;
                UnsafeUtil.o(bArr, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                int i4 = this.f19164f;
                this.f19164f = i4 + 1;
                bArr[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
            int i5 = this.f19164f;
            this.f19164f = i5 + 1;
            bArr[i5] = (byte) j2;
        }
    }

    /* loaded from: classes2.dex */
    public static class ArrayEncoder extends CodedOutputStream {
        public final byte[] d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public int f19165f;

        public ArrayEncoder(byte[] bArr, int i2) {
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.d = bArr;
            this.f19165f = 0;
            this.e = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A0(MessageLite messageLite) {
            F0(messageLite.c());
            messageLite.g(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B0(int i2, MessageLite messageLite) {
            E0(1, 3);
            u(2, i2);
            y0(3, messageLite);
            E0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C0(int i2, ByteString byteString) {
            E0(1, 3);
            u(2, i2);
            k(3, byteString);
            E0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, boolean z2) {
            E0(i2, 0);
            s0(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D0(String str) {
            int i2 = this.f19165f;
            try {
                int m02 = CodedOutputStream.m0(str.length() * 3);
                int m03 = CodedOutputStream.m0(str.length());
                int i3 = this.e;
                byte[] bArr = this.d;
                if (m03 == m02) {
                    int i4 = i2 + m03;
                    this.f19165f = i4;
                    int d = Utf8.f19397a.d(str, bArr, i4, i3 - i4);
                    this.f19165f = i2;
                    F0((d - i2) - m03);
                    this.f19165f = d;
                } else {
                    F0(Utf8.d(str));
                    int i5 = this.f19165f;
                    this.f19165f = Utf8.f19397a.d(str, bArr, i5, i3 - i5);
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f19165f = i2;
                r0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i2, int i3) {
            F0((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F0(int i2) {
            boolean z2 = CodedOutputStream.f19162c;
            int i3 = this.e;
            byte[] bArr = this.d;
            if (z2 && !Android.a()) {
                int i4 = this.f19165f;
                if (i3 - i4 >= 5) {
                    if ((i2 & (-128)) == 0) {
                        this.f19165f = i4 + 1;
                        UnsafeUtil.o(bArr, i4, (byte) i2);
                        return;
                    }
                    this.f19165f = i4 + 1;
                    UnsafeUtil.o(bArr, i4, (byte) (i2 | 128));
                    int i5 = i2 >>> 7;
                    if ((i5 & (-128)) == 0) {
                        int i6 = this.f19165f;
                        this.f19165f = i6 + 1;
                        UnsafeUtil.o(bArr, i6, (byte) i5);
                        return;
                    }
                    int i7 = this.f19165f;
                    this.f19165f = i7 + 1;
                    UnsafeUtil.o(bArr, i7, (byte) (i5 | 128));
                    int i8 = i2 >>> 14;
                    if ((i8 & (-128)) == 0) {
                        int i9 = this.f19165f;
                        this.f19165f = i9 + 1;
                        UnsafeUtil.o(bArr, i9, (byte) i8);
                        return;
                    }
                    int i10 = this.f19165f;
                    this.f19165f = i10 + 1;
                    UnsafeUtil.o(bArr, i10, (byte) (i8 | 128));
                    int i11 = i2 >>> 21;
                    if ((i11 & (-128)) == 0) {
                        int i12 = this.f19165f;
                        this.f19165f = i12 + 1;
                        UnsafeUtil.o(bArr, i12, (byte) i11);
                        return;
                    } else {
                        int i13 = this.f19165f;
                        this.f19165f = i13 + 1;
                        UnsafeUtil.o(bArr, i13, (byte) (i11 | 128));
                        int i14 = this.f19165f;
                        this.f19165f = i14 + 1;
                        UnsafeUtil.o(bArr, i14, (byte) (i2 >>> 28));
                        return;
                    }
                }
            }
            while ((i2 & (-128)) != 0) {
                try {
                    int i15 = this.f19165f;
                    this.f19165f = i15 + 1;
                    bArr[i15] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19165f), Integer.valueOf(i3), 1), e);
                }
            }
            int i16 = this.f19165f;
            this.f19165f = i16 + 1;
            bArr[i16] = (byte) i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G0(long j2) {
            boolean z2 = CodedOutputStream.f19162c;
            int i2 = this.e;
            byte[] bArr = this.d;
            if (z2 && i2 - this.f19165f >= 10) {
                while ((j2 & (-128)) != 0) {
                    int i3 = this.f19165f;
                    this.f19165f = i3 + 1;
                    UnsafeUtil.o(bArr, i3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                int i4 = this.f19165f;
                this.f19165f = i4 + 1;
                UnsafeUtil.o(bArr, i4, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    int i5 = this.f19165f;
                    this.f19165f = i5 + 1;
                    bArr[i5] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19165f), Integer.valueOf(i2), 1), e);
                }
            }
            int i6 = this.f19165f;
            this.f19165f = i6 + 1;
            bArr[i6] = (byte) j2;
        }

        public final void H0(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.d, this.f19165f, i3);
                this.f19165f += i3;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19165f), Integer.valueOf(this.e), Integer.valueOf(i3)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            H0(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.d, this.f19165f, remaining);
                this.f19165f += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19165f), Integer.valueOf(this.e), Integer.valueOf(remaining)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i2, int i3) {
            E0(i2, 5);
            v0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f(int i2, String str) {
            E0(i2, 2);
            D0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g(int i2, long j2) {
            E0(i2, 0);
            G0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i(int i2, int i3) {
            E0(i2, 0);
            x0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k(int i2, ByteString byteString) {
            E0(i2, 2);
            u0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s0(byte b2) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f19165f;
                this.f19165f = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19165f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t0(byte[] bArr, int i2) {
            F0(i2);
            H0(bArr, 0, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i2, int i3) {
            E0(i2, 0);
            F0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(ByteString byteString) {
            F0(byteString.size());
            byteString.t(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i2) {
            try {
                byte[] bArr = this.d;
                int i3 = this.f19165f;
                bArr[i3] = (byte) (i2 & 255);
                bArr[i3 + 1] = (byte) ((i2 >> 8) & 255);
                bArr[i3 + 2] = (byte) ((i2 >> 16) & 255);
                this.f19165f = i3 + 4;
                bArr[i3 + 3] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19165f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(long j2) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f19165f;
                bArr[i2] = (byte) (((int) j2) & 255);
                bArr[i2 + 1] = (byte) (((int) (j2 >> 8)) & 255);
                bArr[i2 + 2] = (byte) (((int) (j2 >> 16)) & 255);
                bArr[i2 + 3] = (byte) (((int) (j2 >> 24)) & 255);
                bArr[i2 + 4] = (byte) (((int) (j2 >> 32)) & 255);
                bArr[i2 + 5] = (byte) (((int) (j2 >> 40)) & 255);
                bArr[i2 + 6] = (byte) (((int) (j2 >> 48)) & 255);
                this.f19165f = i2 + 8;
                bArr[i2 + 7] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19165f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2, long j2) {
            E0(i2, 1);
            w0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x0(int i2) {
            if (i2 >= 0) {
                F0(i2);
            } else {
                G0(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y0(int i2, MessageLite messageLite) {
            E0(i2, 2);
            A0(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z0(int i2, MessageLite messageLite, Schema schema) {
            E0(i2, 2);
            F0(((AbstractMessageLite) messageLite).j(schema));
            schema.h(messageLite, this.f19163a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A0(MessageLite messageLite) {
            F0(messageLite.c());
            messageLite.g(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B0(int i2, MessageLite messageLite) {
            E0(1, 3);
            u(2, i2);
            y0(3, messageLite);
            E0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C0(int i2, ByteString byteString) {
            E0(1, 3);
            u(2, i2);
            k(3, byteString);
            E0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, boolean z2) {
            N0(11);
            K0(i2, 0);
            H0(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D0(String str) {
            int length = str.length() * 3;
            int m02 = CodedOutputStream.m0(length);
            int i2 = m02 + length;
            int i3 = this.e;
            if (i2 > i3) {
                F0(Utf8.f19397a.d(str, new byte[length], 0, length));
                if (this.f19164f > 0) {
                    throw null;
                }
                throw null;
            }
            int i4 = this.f19164f;
            if (i2 > i3 - i4) {
                throw null;
            }
            try {
                int m03 = CodedOutputStream.m0(str.length());
                byte[] bArr = this.d;
                if (m03 == m02) {
                    int i5 = i4 + m03;
                    this.f19164f = i5;
                    int d = Utf8.f19397a.d(str, bArr, i5, i3 - i5);
                    this.f19164f = i4;
                    L0((d - i4) - m03);
                    this.f19164f = d;
                } else {
                    int d2 = Utf8.d(str);
                    L0(d2);
                    this.f19164f = Utf8.f19397a.d(str, bArr, this.f19164f, d2);
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f19164f = i4;
                r0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i2, int i3) {
            F0((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F0(int i2) {
            N0(5);
            L0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G0(long j2) {
            N0(10);
            M0(j2);
        }

        public final void N0(int i2) {
            if (this.e - this.f19164f < i2) {
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            if (this.f19164f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            if (this.f19164f > 0) {
                throw null;
            }
            byteBuffer.remaining();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i2, int i3) {
            N0(14);
            K0(i2, 5);
            I0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f(int i2, String str) {
            E0(i2, 2);
            D0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g(int i2, long j2) {
            N0(20);
            K0(i2, 0);
            M0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i(int i2, int i3) {
            N0(20);
            K0(i2, 0);
            if (i3 >= 0) {
                L0(i3);
            } else {
                M0(i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k(int i2, ByteString byteString) {
            E0(i2, 2);
            u0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s0(byte b2) {
            if (this.f19164f == this.e) {
                throw null;
            }
            H0(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t0(byte[] bArr, int i2) {
            F0(i2);
            if (this.f19164f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i2, int i3) {
            N0(20);
            K0(i2, 0);
            L0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(ByteString byteString) {
            F0(byteString.size());
            byteString.t(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i2) {
            N0(4);
            I0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(long j2) {
            N0(8);
            J0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2, long j2) {
            N0(18);
            K0(i2, 1);
            J0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x0(int i2) {
            if (i2 >= 0) {
                F0(i2);
            } else {
                G0(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y0(int i2, MessageLite messageLite) {
            E0(i2, 2);
            A0(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z0(int i2, MessageLite messageLite, Schema schema) {
            E0(i2, 2);
            F0(((AbstractMessageLite) messageLite).j(schema));
            schema.h(messageLite, this.f19163a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class HeapNioEncoder extends ArrayEncoder {
    }

    /* loaded from: classes2.dex */
    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {

        /* renamed from: g, reason: collision with root package name */
        public final OutputStream f19166g;

        public OutputStreamEncoder(OutputStream outputStream, int i2) {
            super(i2);
            this.f19166g = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A0(MessageLite messageLite) {
            F0(messageLite.c());
            messageLite.g(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B0(int i2, MessageLite messageLite) {
            E0(1, 3);
            u(2, i2);
            y0(3, messageLite);
            E0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C0(int i2, ByteString byteString) {
            E0(1, 3);
            u(2, i2);
            k(3, byteString);
            E0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, boolean z2) {
            O0(11);
            K0(i2, 0);
            H0(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D0(String str) {
            try {
                int length = str.length() * 3;
                int m02 = CodedOutputStream.m0(length);
                int i2 = m02 + length;
                int i3 = this.e;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int d = Utf8.f19397a.d(str, bArr, 0, length);
                    F0(d);
                    P0(bArr, 0, d);
                    return;
                }
                if (i2 > i3 - this.f19164f) {
                    N0();
                }
                int m03 = CodedOutputStream.m0(str.length());
                int i4 = this.f19164f;
                byte[] bArr2 = this.d;
                try {
                    try {
                        if (m03 == m02) {
                            int i5 = i4 + m03;
                            this.f19164f = i5;
                            int d2 = Utf8.f19397a.d(str, bArr2, i5, i3 - i5);
                            this.f19164f = i4;
                            L0((d2 - i4) - m03);
                            this.f19164f = d2;
                        } else {
                            int d3 = Utf8.d(str);
                            L0(d3);
                            this.f19164f = Utf8.f19397a.d(str, bArr2, this.f19164f, d3);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(e);
                    }
                } catch (Utf8.UnpairedSurrogateException e2) {
                    this.f19164f = i4;
                    throw e2;
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                r0(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i2, int i3) {
            F0((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F0(int i2) {
            O0(5);
            L0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G0(long j2) {
            O0(10);
            M0(j2);
        }

        public final void N0() {
            this.f19166g.write(this.d, 0, this.f19164f);
            this.f19164f = 0;
        }

        public final void O0(int i2) {
            if (this.e - this.f19164f < i2) {
                N0();
            }
        }

        public final void P0(byte[] bArr, int i2, int i3) {
            int i4 = this.f19164f;
            int i5 = this.e;
            int i6 = i5 - i4;
            byte[] bArr2 = this.d;
            if (i6 >= i3) {
                System.arraycopy(bArr, i2, bArr2, i4, i3);
                this.f19164f += i3;
                return;
            }
            System.arraycopy(bArr, i2, bArr2, i4, i6);
            int i7 = i2 + i6;
            int i8 = i3 - i6;
            this.f19164f = i5;
            N0();
            if (i8 > i5) {
                this.f19166g.write(bArr, i7, i8);
            } else {
                System.arraycopy(bArr, i7, bArr2, 0, i8);
                this.f19164f = i8;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            P0(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i2 = this.f19164f;
            int i3 = this.e;
            int i4 = i3 - i2;
            byte[] bArr = this.d;
            if (i4 >= remaining) {
                byteBuffer.get(bArr, i2, remaining);
                this.f19164f += remaining;
                return;
            }
            byteBuffer.get(bArr, i2, i4);
            int i5 = remaining - i4;
            this.f19164f = i3;
            N0();
            while (i5 > i3) {
                byteBuffer.get(bArr, 0, i3);
                this.f19166g.write(bArr, 0, i3);
                i5 -= i3;
            }
            byteBuffer.get(bArr, 0, i5);
            this.f19164f = i5;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i2, int i3) {
            O0(14);
            K0(i2, 5);
            I0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f(int i2, String str) {
            E0(i2, 2);
            D0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g(int i2, long j2) {
            O0(20);
            K0(i2, 0);
            M0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i(int i2, int i3) {
            O0(20);
            K0(i2, 0);
            if (i3 >= 0) {
                L0(i3);
            } else {
                M0(i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k(int i2, ByteString byteString) {
            E0(i2, 2);
            u0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s0(byte b2) {
            if (this.f19164f == this.e) {
                N0();
            }
            H0(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t0(byte[] bArr, int i2) {
            F0(i2);
            P0(bArr, 0, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i2, int i3) {
            O0(20);
            K0(i2, 0);
            L0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(ByteString byteString) {
            F0(byteString.size());
            byteString.t(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i2) {
            O0(4);
            I0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(long j2) {
            O0(8);
            J0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2, long j2) {
            O0(18);
            K0(i2, 1);
            J0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x0(int i2) {
            if (i2 >= 0) {
                F0(i2);
            } else {
                G0(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y0(int i2, MessageLite messageLite) {
            E0(i2, 2);
            A0(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z0(int i2, MessageLite messageLite, Schema schema) {
            E0(i2, 2);
            F0(((AbstractMessageLite) messageLite).j(schema));
            schema.h(messageLite, this.f19163a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A0(MessageLite messageLite) {
            F0(messageLite.c());
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B0(int i2, MessageLite messageLite) {
            E0(1, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C0(int i2, ByteString byteString) {
            E0(1, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, boolean z2) {
            E0(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D0(String str) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i2, int i3) {
            F0((i2 << 3) | i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F0(int i2) {
            if ((i2 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G0(long j2) {
            if ((j2 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i2, int i3) {
            E0(i2, 5);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f(int i2, String str) {
            E0(i2, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g(int i2, long j2) {
            E0(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i(int i2, int i3) {
            E0(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k(int i2, ByteString byteString) {
            E0(i2, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s0(byte b2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t0(byte[] bArr, int i2) {
            if ((i2 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i2, int i3) {
            E0(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(ByteString byteString) {
            F0(byteString.size());
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(long j2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2, long j2) {
            E0(i2, 1);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x0(int i2) {
            if (i2 < 0) {
                G0(i2);
                throw null;
            }
            if ((i2 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y0(int i2, MessageLite messageLite) {
            E0(i2, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z0(int i2, MessageLite messageLite, Schema schema) {
            E0(i2, 2);
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        public long d;

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A0(MessageLite messageLite) {
            F0(messageLite.c());
            messageLite.g(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B0(int i2, MessageLite messageLite) {
            E0(1, 3);
            u(2, i2);
            y0(3, messageLite);
            E0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C0(int i2, ByteString byteString) {
            E0(1, 3);
            u(2, i2);
            k(3, byteString);
            E0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i2, boolean z2) {
            E0(i2, 0);
            s0(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D0(String str) {
            long j2 = this.d;
            try {
                if (CodedOutputStream.m0(str.length()) == CodedOutputStream.m0(str.length() * 3)) {
                    throw null;
                }
                F0(Utf8.d(str));
                throw null;
            } catch (Utf8.UnpairedSurrogateException unused) {
                this.d = j2;
                throw null;
            } catch (IllegalArgumentException e) {
                throw new OutOfSpaceException(e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i2, int i3) {
            F0((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F0(int i2) {
            if (this.d <= 0) {
                while ((i2 & (-128)) != 0) {
                    long j2 = this.d;
                    this.d = j2 + 1;
                    UnsafeUtil.n(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j3 = this.d;
                this.d = 1 + j3;
                UnsafeUtil.n(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.d;
                if (j4 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
                }
                if ((i2 & (-128)) == 0) {
                    this.d = 1 + j4;
                    UnsafeUtil.n(j4, (byte) i2);
                    return;
                } else {
                    this.d = j4 + 1;
                    UnsafeUtil.n(j4, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G0(long j2) {
            if (this.d <= 0) {
                while ((j2 & (-128)) != 0) {
                    long j3 = this.d;
                    this.d = j3 + 1;
                    UnsafeUtil.n(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                long j4 = this.d;
                this.d = 1 + j4;
                UnsafeUtil.n(j4, (byte) j2);
                return;
            }
            while (true) {
                long j5 = this.d;
                if (j5 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
                }
                if ((j2 & (-128)) == 0) {
                    this.d = 1 + j5;
                    UnsafeUtil.n(j5, (byte) j2);
                    return;
                } else {
                    this.d = j5 + 1;
                    UnsafeUtil.n(j5, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            }
        }

        public final void H0(byte[] bArr, int i2, int i3) {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = i3;
                long j3 = 0 - j2;
                long j4 = this.d;
                if (j3 >= j4) {
                    UnsafeUtil.d.d(bArr, i2, j4, j2);
                    this.d += j2;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, Integer.valueOf(i3)));
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            H0(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            try {
                byteBuffer.remaining();
                throw null;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i2, int i3) {
            E0(i2, 5);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f(int i2, String str) {
            E0(i2, 2);
            D0(str);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g(int i2, long j2) {
            E0(i2, 0);
            G0(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i(int i2, int i3) {
            E0(i2, 0);
            x0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k(int i2, ByteString byteString) {
            E0(i2, 2);
            u0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s0(byte b2) {
            long j2 = this.d;
            if (j2 >= 0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
            }
            this.d = 1 + j2;
            UnsafeUtil.n(j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t0(byte[] bArr, int i2) {
            F0(i2);
            H0(bArr, 0, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i2, int i3) {
            E0(i2, 0);
            F0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(ByteString byteString) {
            F0(byteString.size());
            byteString.t(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(long j2) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i2, long j2) {
            E0(i2, 1);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x0(int i2) {
            if (i2 >= 0) {
                F0(i2);
            } else {
                G0(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y0(int i2, MessageLite messageLite) {
            E0(i2, 2);
            A0(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z0(int i2, MessageLite messageLite, Schema schema) {
            E0(i2, 2);
            F0(((AbstractMessageLite) messageLite).j(schema));
            schema.h(messageLite, this.f19163a);
        }
    }

    public static int S(int i2) {
        return k0(i2) + 1;
    }

    public static int T(int i2, ByteString byteString) {
        int k02 = k0(i2);
        int size = byteString.size();
        return m0(size) + size + k02;
    }

    public static int U(int i2) {
        return k0(i2) + 8;
    }

    public static int V(int i2, int i3) {
        return b0(i3) + k0(i2);
    }

    public static int W(int i2) {
        return k0(i2) + 4;
    }

    public static int X(int i2) {
        return k0(i2) + 8;
    }

    public static int Y(int i2) {
        return k0(i2) + 4;
    }

    public static int Z(int i2, MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).j(schema) + (k0(i2) * 2);
    }

    public static int a0(int i2, int i3) {
        return b0(i3) + k0(i2);
    }

    public static int b0(int i2) {
        if (i2 >= 0) {
            return m0(i2);
        }
        return 10;
    }

    public static int c0(int i2, long j2) {
        return o0(j2) + k0(i2);
    }

    public static int d0(LazyFieldLite lazyFieldLite) {
        int size = lazyFieldLite.f19270b != null ? lazyFieldLite.f19270b.size() : lazyFieldLite.f19269a != null ? lazyFieldLite.f19269a.c() : 0;
        return m0(size) + size;
    }

    public static int e0(int i2) {
        return k0(i2) + 4;
    }

    public static int f0(int i2) {
        return k0(i2) + 8;
    }

    public static int g0(int i2, int i3) {
        return m0(p0(i3)) + k0(i2);
    }

    public static int h0(int i2, long j2) {
        return o0(q0(j2)) + k0(i2);
    }

    public static int i0(int i2, String str) {
        return j0(str) + k0(i2);
    }

    public static int j0(String str) {
        int length;
        try {
            length = Utf8.d(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f19251a).length;
        }
        return m0(length) + length;
    }

    public static int k0(int i2) {
        return m0(i2 << 3);
    }

    public static int l0(int i2, int i3) {
        return m0(i3) + k0(i2);
    }

    public static int m0(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int n0(int i2, long j2) {
        return o0(j2) + k0(i2);
    }

    public static int o0(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int p0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long q0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public abstract void A0(MessageLite messageLite);

    public abstract void B0(int i2, MessageLite messageLite);

    public abstract void C0(int i2, ByteString byteString);

    public abstract void D(int i2, boolean z2);

    public abstract void D0(String str);

    public abstract void E0(int i2, int i3);

    public abstract void F0(int i2);

    public abstract void G0(long j2);

    public abstract void c(int i2, int i3);

    public abstract void f(int i2, String str);

    public abstract void g(int i2, long j2);

    public abstract void i(int i2, int i3);

    public abstract void k(int i2, ByteString byteString);

    public final void r0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        f19161b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f19251a);
        try {
            F0(bytes.length);
            Q(0, bytes, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public abstract void s0(byte b2);

    public abstract void t0(byte[] bArr, int i2);

    public abstract void u(int i2, int i3);

    public abstract void u0(ByteString byteString);

    public abstract void v0(int i2);

    public abstract void w0(long j2);

    public abstract void x(int i2, long j2);

    public abstract void x0(int i2);

    public abstract void y0(int i2, MessageLite messageLite);

    public abstract void z0(int i2, MessageLite messageLite, Schema schema);

    /* loaded from: classes2.dex */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str) {
            super(j.b("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(j.b("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }

        public OutOfSpaceException(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }
    }
}
