package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class BinaryWriter extends ByteOutput implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public int f19113a;

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19114a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f19114a = iArr;
            try {
                iArr[WireFormat.FieldType.f19407k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19114a[WireFormat.FieldType.f19406j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19114a[WireFormat.FieldType.f19405i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19114a[WireFormat.FieldType.f19404h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19114a[WireFormat.FieldType.f19402f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19114a[WireFormat.FieldType.f19414r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19114a[WireFormat.FieldType.f19415s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19114a[WireFormat.FieldType.f19416t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19114a[WireFormat.FieldType.f19417u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19114a[WireFormat.FieldType.f19408l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19114a[WireFormat.FieldType.f19412p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19114a[WireFormat.FieldType.f19403g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19114a[WireFormat.FieldType.d.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19114a[WireFormat.FieldType.f19401c.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19114a[WireFormat.FieldType.f19410n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19114a[WireFormat.FieldType.f19411o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19114a[WireFormat.FieldType.f19413q.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class SafeDirectWriter extends BinaryWriter {

        /* renamed from: b, reason: collision with root package name */
        public int f19115b;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void A(int i2, Object obj) {
            int T = T();
            Protobuf protobuf = Protobuf.f19325c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).h(obj, this);
            int T2 = T() - T;
            U(10);
            d0(T2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void D(int i2, boolean z2) {
            U(6);
            this.f19115b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void F(int i2) {
            c0(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void J(int i2) {
            c0(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void O(int i2, int i3) {
            U(10);
            a0(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            int i4 = this.f19115b;
            if (i4 + 1 >= i3) {
                this.f19115b = i4 - i3;
                throw null;
            }
            this.f19113a += i3;
            AllocatedBuffer.b(i2, bArr, i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i2 = this.f19115b;
            if (i2 + 1 >= remaining) {
                this.f19115b = i2 - remaining;
                throw null;
            }
            this.f19113a += remaining;
            AllocatedBuffer.a(byteBuffer);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final int T() {
            return (0 - this.f19115b) + this.f19113a;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void U(int i2) {
            if (this.f19115b + 1 >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void V(boolean z2) {
            this.f19115b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void W(int i2) {
            this.f19115b -= 4;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void X(long j2) {
            this.f19115b -= 8;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void Y(int i2) {
            if (i2 >= 0) {
                d0(i2);
            } else {
                e0(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void a0(int i2) {
            d0(CodedOutputStream.p0(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void b0(long j2) {
            e0(CodedOutputStream.q0(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void c(int i2, int i3) {
            U(9);
            W(i3);
            c0(i2, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void c0(int i2, int i3) {
            d0((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void d0(int i2) {
            if ((i2 & (-128)) == 0) {
                this.f19115b--;
                throw null;
            }
            if ((i2 & (-16384)) == 0) {
                h0(i2);
                throw null;
            }
            if (((-2097152) & i2) == 0) {
                g0(i2);
                throw null;
            }
            if (((-268435456) & i2) == 0) {
                f0(i2);
                throw null;
            }
            this.f19115b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void e0(long j2) {
            switch (BinaryWriter.S(j2)) {
                case 1:
                    this.f19115b--;
                    throw null;
                case 2:
                    h0((int) j2);
                    throw null;
                case 3:
                    g0((int) j2);
                    throw null;
                case 4:
                    f0((int) j2);
                    throw null;
                case 5:
                    this.f19115b -= 5;
                    throw null;
                case 6:
                    this.f19115b -= 6;
                    throw null;
                case 7:
                    this.f19115b -= 7;
                    throw null;
                case 8:
                    this.f19115b -= 8;
                    throw null;
                case 9:
                    this.f19115b--;
                    throw null;
                case 10:
                    this.f19115b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void f(int i2, String str) {
            int i3;
            int i4;
            int i5;
            int T = T();
            U(str.length());
            int length = str.length();
            int i6 = length - 1;
            this.f19115b -= i6;
            if (i6 >= 0 && str.charAt(i6) < 128) {
                throw null;
            }
            if (i6 != -1) {
                this.f19115b += i6;
                while (i6 >= 0) {
                    char charAt = str.charAt(i6);
                    if (charAt < 128 && (i5 = this.f19115b) >= 0) {
                        this.f19115b = i5 - 1;
                        throw null;
                    }
                    if (charAt < 2048 && (i4 = this.f19115b) > 0) {
                        this.f19115b = i4 - 1;
                        throw null;
                    }
                    if ((charAt < 55296 || 57343 < charAt) && (i3 = this.f19115b) > 1) {
                        this.f19115b = i3 - 1;
                        throw null;
                    }
                    if (this.f19115b > 2) {
                        if (i6 != 0) {
                            char charAt2 = str.charAt(length - 2);
                            if (Character.isSurrogatePair(charAt2, charAt)) {
                                Character.toCodePoint(charAt2, charAt);
                                this.f19115b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 2, i6);
                    }
                    U(i6);
                }
            } else {
                this.f19115b--;
            }
            int T2 = T() - T;
            U(10);
            d0(T2);
            throw null;
        }

        public final void f0(int i2) {
            this.f19115b -= 4;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void g(int i2, long j2) {
            U(15);
            e0(j2);
            c0(i2, 0);
        }

        public final void g0(int i2) {
            this.f19115b -= 3;
            throw null;
        }

        public final void h0(int i2) {
            this.f19115b -= 2;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void i(int i2, int i3) {
            U(15);
            Y(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void k(int i2, ByteString byteString) {
            try {
                byteString.u(this);
                U(10);
                d0(byteString.size());
                c0(i2, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void p(int i2, Schema schema, Object obj) {
            c0(i2, 4);
            schema.h(obj, this);
            c0(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void q(int i2, long j2) {
            U(15);
            b0(j2);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void t(int i2, Schema schema, Object obj) {
            int T = T();
            schema.h(obj, this);
            int T2 = T() - T;
            U(10);
            d0(T2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void u(int i2, int i3) {
            U(10);
            d0(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void x(int i2, long j2) {
            U(13);
            X(j2);
            c0(i2, 1);
        }
    }

    /* loaded from: classes.dex */
    public static final class SafeHeapWriter extends BinaryWriter {

        /* renamed from: b, reason: collision with root package name */
        public int f19116b;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void A(int i2, Object obj) {
            int T = T();
            Protobuf protobuf = Protobuf.f19325c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).h(obj, this);
            int T2 = T() - T;
            U(10);
            d0(T2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void D(int i2, boolean z2) {
            U(6);
            this.f19116b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void F(int i2) {
            c0(i2, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void J(int i2) {
            c0(i2, 4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void O(int i2, int i3) {
            U(10);
            a0(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            int i4 = this.f19116b;
            if (i4 < i3) {
                this.f19113a += i3;
                AllocatedBuffer.b(i2, bArr, i3);
                throw null;
            }
            int i5 = i4 - i3;
            this.f19116b = i5;
            System.arraycopy(bArr, i2, null, i5 + 1, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i2 = this.f19116b;
            if (i2 < remaining) {
                this.f19113a += remaining;
                AllocatedBuffer.a(byteBuffer);
                throw null;
            }
            int i3 = i2 - remaining;
            this.f19116b = i3;
            byteBuffer.get(null, i3 + 1, remaining);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final int T() {
            return (0 - this.f19116b) + this.f19113a;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void U(int i2) {
            if (this.f19116b >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void V(boolean z2) {
            this.f19116b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void W(int i2) {
            this.f19116b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void X(long j2) {
            this.f19116b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void Y(int i2) {
            if (i2 < 0) {
                e0(i2);
            } else {
                d0(i2);
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void a0(int i2) {
            d0(CodedOutputStream.p0(i2));
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void b0(long j2) {
            e0(CodedOutputStream.q0(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void c(int i2, int i3) {
            U(9);
            W(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void c0(int i2, int i3) {
            d0((i2 << 3) | i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void d0(int i2) {
            if ((i2 & (-128)) == 0) {
                this.f19116b--;
                throw null;
            }
            if ((i2 & (-16384)) == 0) {
                this.f19116b--;
                throw null;
            }
            if (((-2097152) & i2) == 0) {
                this.f19116b--;
                throw null;
            }
            if ((i2 & (-268435456)) == 0) {
                this.f19116b--;
                throw null;
            }
            this.f19116b--;
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void e0(long j2) {
            switch (BinaryWriter.S(j2)) {
                case 1:
                    this.f19116b--;
                    throw null;
                case 2:
                    this.f19116b--;
                    throw null;
                case 3:
                    this.f19116b--;
                    throw null;
                case 4:
                    this.f19116b--;
                    throw null;
                case 5:
                    this.f19116b--;
                    throw null;
                case 6:
                    this.f19116b--;
                    throw null;
                case 7:
                    this.f19116b--;
                    throw null;
                case 8:
                    this.f19116b--;
                    throw null;
                case 9:
                    this.f19116b--;
                    throw null;
                case 10:
                    this.f19116b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void f(int i2, String str) {
            int i3;
            int i4;
            int i5;
            int T = T();
            U(str.length());
            int length = str.length();
            int i6 = length - 1;
            this.f19116b -= i6;
            if (i6 >= 0 && str.charAt(i6) < 128) {
                throw null;
            }
            if (i6 != -1) {
                this.f19116b += i6;
                while (i6 >= 0) {
                    char charAt = str.charAt(i6);
                    if (charAt < 128 && (i5 = this.f19116b) > 0) {
                        this.f19116b = i5 - 1;
                        throw null;
                    }
                    if (charAt < 2048 && (i4 = this.f19116b) > 0) {
                        this.f19116b = i4 - 1;
                        throw null;
                    }
                    if ((charAt < 55296 || 57343 < charAt) && (i3 = this.f19116b) > 1) {
                        this.f19116b = i3 - 1;
                        throw null;
                    }
                    if (this.f19116b > 2) {
                        if (i6 != 0) {
                            char charAt2 = str.charAt(length - 2);
                            if (Character.isSurrogatePair(charAt2, charAt)) {
                                Character.toCodePoint(charAt2, charAt);
                                this.f19116b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 2, i6);
                    }
                    U(i6);
                }
            } else {
                this.f19116b--;
            }
            int T2 = T() - T;
            U(10);
            d0(T2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void g(int i2, long j2) {
            U(15);
            e0(j2);
            c0(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void i(int i2, int i3) {
            U(15);
            Y(i3);
            c0(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void k(int i2, ByteString byteString) {
            try {
                byteString.u(this);
                U(10);
                d0(byteString.size());
                throw null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void p(int i2, Schema schema, Object obj) {
            c0(i2, 4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void q(int i2, long j2) {
            U(15);
            b0(j2);
            c0(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void t(int i2, Schema schema, Object obj) {
            int T = T();
            schema.h(obj, this);
            int T2 = T() - T;
            U(10);
            d0(T2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void u(int i2, int i3) {
            U(10);
            d0(i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void x(int i2, long j2) {
            U(13);
            X(j2);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeDirectWriter extends BinaryWriter {

        /* renamed from: b, reason: collision with root package name */
        public long f19117b;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void A(int i2, Object obj) {
            int T = T();
            Protobuf protobuf = Protobuf.f19325c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).h(obj, this);
            int T2 = T() - T;
            U(10);
            d0(T2);
            c0(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void D(int i2, boolean z2) {
            U(6);
            byte b2 = z2 ? (byte) 1 : (byte) 0;
            long j2 = this.f19117b;
            this.f19117b = j2 - 1;
            UnsafeUtil.n(j2, b2);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void F(int i2) {
            c0(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void J(int i2) {
            c0(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void O(int i2, int i3) {
            U(10);
            a0(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            long j2 = this.f19117b;
            if (((int) j2) + 1 >= i3) {
                this.f19117b = j2 - i3;
                throw null;
            }
            this.f19113a += i3;
            AllocatedBuffer.b(i2, bArr, i3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            long j2 = this.f19117b;
            if (((int) j2) + 1 >= remaining) {
                this.f19117b = j2 - remaining;
                throw null;
            }
            this.f19113a += remaining;
            AllocatedBuffer.a(byteBuffer);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final int T() {
            return this.f19113a + ((int) (0 - this.f19117b));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void U(int i2) {
            if (((int) this.f19117b) + 1 >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void V(boolean z2) {
            byte b2 = z2 ? (byte) 1 : (byte) 0;
            long j2 = this.f19117b;
            this.f19117b = j2 - 1;
            UnsafeUtil.n(j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void W(int i2) {
            long j2 = this.f19117b;
            this.f19117b = j2 - 1;
            UnsafeUtil.n(j2, (byte) ((i2 >> 24) & 255));
            long j3 = this.f19117b;
            this.f19117b = j3 - 1;
            UnsafeUtil.n(j3, (byte) ((i2 >> 16) & 255));
            long j4 = this.f19117b;
            this.f19117b = j4 - 1;
            UnsafeUtil.n(j4, (byte) ((i2 >> 8) & 255));
            long j5 = this.f19117b;
            this.f19117b = j5 - 1;
            UnsafeUtil.n(j5, (byte) (i2 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void X(long j2) {
            long j3 = this.f19117b;
            this.f19117b = j3 - 1;
            UnsafeUtil.n(j3, (byte) (((int) (j2 >> 56)) & 255));
            long j4 = this.f19117b;
            this.f19117b = j4 - 1;
            UnsafeUtil.n(j4, (byte) (((int) (j2 >> 48)) & 255));
            long j5 = this.f19117b;
            this.f19117b = j5 - 1;
            UnsafeUtil.n(j5, (byte) (((int) (j2 >> 40)) & 255));
            long j6 = this.f19117b;
            this.f19117b = j6 - 1;
            UnsafeUtil.n(j6, (byte) (((int) (j2 >> 32)) & 255));
            long j7 = this.f19117b;
            this.f19117b = j7 - 1;
            UnsafeUtil.n(j7, (byte) (((int) (j2 >> 24)) & 255));
            long j8 = this.f19117b;
            this.f19117b = j8 - 1;
            UnsafeUtil.n(j8, (byte) (((int) (j2 >> 16)) & 255));
            long j9 = this.f19117b;
            this.f19117b = j9 - 1;
            UnsafeUtil.n(j9, (byte) (((int) (j2 >> 8)) & 255));
            long j10 = this.f19117b;
            this.f19117b = j10 - 1;
            UnsafeUtil.n(j10, (byte) (((int) j2) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void Y(int i2) {
            if (i2 >= 0) {
                d0(i2);
            } else {
                e0(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void a0(int i2) {
            d0(CodedOutputStream.p0(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void b0(long j2) {
            e0(CodedOutputStream.q0(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void c(int i2, int i3) {
            U(9);
            W(i3);
            c0(i2, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void c0(int i2, int i3) {
            d0((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void d0(int i2) {
            if ((i2 & (-128)) == 0) {
                long j2 = this.f19117b;
                this.f19117b = j2 - 1;
                UnsafeUtil.n(j2, (byte) i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                long j3 = this.f19117b;
                this.f19117b = j3 - 1;
                UnsafeUtil.n(j3, (byte) (i2 >>> 7));
                long j4 = this.f19117b;
                this.f19117b = j4 - 1;
                UnsafeUtil.n(j4, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-2097152) & i2) == 0) {
                long j5 = this.f19117b;
                this.f19117b = j5 - 1;
                UnsafeUtil.n(j5, (byte) (i2 >>> 14));
                long j6 = this.f19117b;
                this.f19117b = j6 - 1;
                UnsafeUtil.n(j6, (byte) (((i2 >>> 7) & 127) | 128));
                long j7 = this.f19117b;
                this.f19117b = j7 - 1;
                UnsafeUtil.n(j7, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-268435456) & i2) == 0) {
                long j8 = this.f19117b;
                this.f19117b = j8 - 1;
                UnsafeUtil.n(j8, (byte) (i2 >>> 21));
                long j9 = this.f19117b;
                this.f19117b = j9 - 1;
                UnsafeUtil.n(j9, (byte) (((i2 >>> 14) & 127) | 128));
                long j10 = this.f19117b;
                this.f19117b = j10 - 1;
                UnsafeUtil.n(j10, (byte) (((i2 >>> 7) & 127) | 128));
                long j11 = this.f19117b;
                this.f19117b = j11 - 1;
                UnsafeUtil.n(j11, (byte) ((i2 & 127) | 128));
                return;
            }
            long j12 = this.f19117b;
            this.f19117b = j12 - 1;
            UnsafeUtil.n(j12, (byte) (i2 >>> 28));
            long j13 = this.f19117b;
            this.f19117b = j13 - 1;
            UnsafeUtil.n(j13, (byte) (((i2 >>> 21) & 127) | 128));
            long j14 = this.f19117b;
            this.f19117b = j14 - 1;
            UnsafeUtil.n(j14, (byte) (((i2 >>> 14) & 127) | 128));
            long j15 = this.f19117b;
            this.f19117b = j15 - 1;
            UnsafeUtil.n(j15, (byte) (((i2 >>> 7) & 127) | 128));
            long j16 = this.f19117b;
            this.f19117b = j16 - 1;
            UnsafeUtil.n(j16, (byte) ((i2 & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void e0(long j2) {
            switch (BinaryWriter.S(j2)) {
                case 1:
                    long j3 = this.f19117b;
                    this.f19117b = j3 - 1;
                    UnsafeUtil.n(j3, (byte) j2);
                    return;
                case 2:
                    long j4 = this.f19117b;
                    this.f19117b = j4 - 1;
                    UnsafeUtil.n(j4, (byte) (j2 >>> 7));
                    long j5 = this.f19117b;
                    this.f19117b = j5 - 1;
                    UnsafeUtil.n(j5, (byte) ((((int) j2) & 127) | 128));
                    return;
                case 3:
                    long j6 = this.f19117b;
                    this.f19117b = j6 - 1;
                    UnsafeUtil.n(j6, (byte) (((int) j2) >>> 14));
                    long j7 = this.f19117b;
                    this.f19117b = j7 - 1;
                    UnsafeUtil.n(j7, (byte) (((j2 >>> 7) & 127) | 128));
                    long j8 = this.f19117b;
                    this.f19117b = j8 - 1;
                    UnsafeUtil.n(j8, (byte) ((j2 & 127) | 128));
                    return;
                case 4:
                    long j9 = this.f19117b;
                    this.f19117b = j9 - 1;
                    UnsafeUtil.n(j9, (byte) (j2 >>> 21));
                    long j10 = this.f19117b;
                    this.f19117b = j10 - 1;
                    UnsafeUtil.n(j10, (byte) (((j2 >>> 14) & 127) | 128));
                    long j11 = this.f19117b;
                    this.f19117b = j11 - 1;
                    UnsafeUtil.n(j11, (byte) (((j2 >>> 7) & 127) | 128));
                    long j12 = this.f19117b;
                    this.f19117b = j12 - 1;
                    UnsafeUtil.n(j12, (byte) ((j2 & 127) | 128));
                    return;
                case 5:
                    long j13 = this.f19117b;
                    this.f19117b = j13 - 1;
                    UnsafeUtil.n(j13, (byte) (j2 >>> 28));
                    long j14 = this.f19117b;
                    this.f19117b = j14 - 1;
                    UnsafeUtil.n(j14, (byte) (((j2 >>> 21) & 127) | 128));
                    long j15 = this.f19117b;
                    this.f19117b = j15 - 1;
                    UnsafeUtil.n(j15, (byte) (((j2 >>> 14) & 127) | 128));
                    long j16 = this.f19117b;
                    this.f19117b = j16 - 1;
                    UnsafeUtil.n(j16, (byte) (((j2 >>> 7) & 127) | 128));
                    long j17 = this.f19117b;
                    this.f19117b = j17 - 1;
                    UnsafeUtil.n(j17, (byte) ((j2 & 127) | 128));
                    return;
                case 6:
                    long j18 = this.f19117b;
                    this.f19117b = j18 - 1;
                    UnsafeUtil.n(j18, (byte) (j2 >>> 35));
                    long j19 = this.f19117b;
                    this.f19117b = j19 - 1;
                    UnsafeUtil.n(j19, (byte) (((j2 >>> 28) & 127) | 128));
                    long j20 = this.f19117b;
                    this.f19117b = j20 - 1;
                    UnsafeUtil.n(j20, (byte) (((j2 >>> 21) & 127) | 128));
                    long j21 = this.f19117b;
                    this.f19117b = j21 - 1;
                    UnsafeUtil.n(j21, (byte) (((j2 >>> 14) & 127) | 128));
                    long j22 = this.f19117b;
                    this.f19117b = j22 - 1;
                    UnsafeUtil.n(j22, (byte) (((j2 >>> 7) & 127) | 128));
                    long j23 = this.f19117b;
                    this.f19117b = j23 - 1;
                    UnsafeUtil.n(j23, (byte) ((j2 & 127) | 128));
                    return;
                case 7:
                    long j24 = this.f19117b;
                    this.f19117b = j24 - 1;
                    UnsafeUtil.n(j24, (byte) (j2 >>> 42));
                    long j25 = this.f19117b;
                    this.f19117b = j25 - 1;
                    UnsafeUtil.n(j25, (byte) (((j2 >>> 35) & 127) | 128));
                    long j26 = this.f19117b;
                    this.f19117b = j26 - 1;
                    UnsafeUtil.n(j26, (byte) (((j2 >>> 28) & 127) | 128));
                    long j27 = this.f19117b;
                    this.f19117b = j27 - 1;
                    UnsafeUtil.n(j27, (byte) (((j2 >>> 21) & 127) | 128));
                    long j28 = this.f19117b;
                    this.f19117b = j28 - 1;
                    UnsafeUtil.n(j28, (byte) (((j2 >>> 14) & 127) | 128));
                    long j29 = this.f19117b;
                    this.f19117b = j29 - 1;
                    UnsafeUtil.n(j29, (byte) (((j2 >>> 7) & 127) | 128));
                    long j30 = this.f19117b;
                    this.f19117b = j30 - 1;
                    UnsafeUtil.n(j30, (byte) ((j2 & 127) | 128));
                    return;
                case 8:
                    long j31 = this.f19117b;
                    this.f19117b = j31 - 1;
                    UnsafeUtil.n(j31, (byte) (j2 >>> 49));
                    long j32 = this.f19117b;
                    this.f19117b = j32 - 1;
                    UnsafeUtil.n(j32, (byte) (((j2 >>> 42) & 127) | 128));
                    long j33 = this.f19117b;
                    this.f19117b = j33 - 1;
                    UnsafeUtil.n(j33, (byte) (((j2 >>> 35) & 127) | 128));
                    long j34 = this.f19117b;
                    this.f19117b = j34 - 1;
                    UnsafeUtil.n(j34, (byte) (((j2 >>> 28) & 127) | 128));
                    long j35 = this.f19117b;
                    this.f19117b = j35 - 1;
                    UnsafeUtil.n(j35, (byte) (((j2 >>> 21) & 127) | 128));
                    long j36 = this.f19117b;
                    this.f19117b = j36 - 1;
                    UnsafeUtil.n(j36, (byte) (((j2 >>> 14) & 127) | 128));
                    long j37 = this.f19117b;
                    this.f19117b = j37 - 1;
                    UnsafeUtil.n(j37, (byte) (((j2 >>> 7) & 127) | 128));
                    long j38 = this.f19117b;
                    this.f19117b = j38 - 1;
                    UnsafeUtil.n(j38, (byte) ((j2 & 127) | 128));
                    return;
                case 9:
                    long j39 = this.f19117b;
                    this.f19117b = j39 - 1;
                    UnsafeUtil.n(j39, (byte) (j2 >>> 56));
                    long j40 = this.f19117b;
                    this.f19117b = j40 - 1;
                    UnsafeUtil.n(j40, (byte) (((j2 >>> 49) & 127) | 128));
                    long j41 = this.f19117b;
                    this.f19117b = j41 - 1;
                    UnsafeUtil.n(j41, (byte) (((j2 >>> 42) & 127) | 128));
                    long j42 = this.f19117b;
                    this.f19117b = j42 - 1;
                    UnsafeUtil.n(j42, (byte) (((j2 >>> 35) & 127) | 128));
                    long j43 = this.f19117b;
                    this.f19117b = j43 - 1;
                    UnsafeUtil.n(j43, (byte) (((j2 >>> 28) & 127) | 128));
                    long j44 = this.f19117b;
                    this.f19117b = j44 - 1;
                    UnsafeUtil.n(j44, (byte) (((j2 >>> 21) & 127) | 128));
                    long j45 = this.f19117b;
                    this.f19117b = j45 - 1;
                    UnsafeUtil.n(j45, (byte) (((j2 >>> 14) & 127) | 128));
                    long j46 = this.f19117b;
                    this.f19117b = j46 - 1;
                    UnsafeUtil.n(j46, (byte) (((j2 >>> 7) & 127) | 128));
                    long j47 = this.f19117b;
                    this.f19117b = j47 - 1;
                    UnsafeUtil.n(j47, (byte) ((j2 & 127) | 128));
                    return;
                case 10:
                    long j48 = this.f19117b;
                    this.f19117b = j48 - 1;
                    UnsafeUtil.n(j48, (byte) (j2 >>> 63));
                    long j49 = this.f19117b;
                    this.f19117b = j49 - 1;
                    UnsafeUtil.n(j49, (byte) (((j2 >>> 56) & 127) | 128));
                    long j50 = this.f19117b;
                    this.f19117b = j50 - 1;
                    UnsafeUtil.n(j50, (byte) (((j2 >>> 49) & 127) | 128));
                    long j51 = this.f19117b;
                    this.f19117b = j51 - 1;
                    UnsafeUtil.n(j51, (byte) (((j2 >>> 42) & 127) | 128));
                    long j52 = this.f19117b;
                    this.f19117b = j52 - 1;
                    UnsafeUtil.n(j52, (byte) (((j2 >>> 35) & 127) | 128));
                    long j53 = this.f19117b;
                    this.f19117b = j53 - 1;
                    UnsafeUtil.n(j53, (byte) (((j2 >>> 28) & 127) | 128));
                    long j54 = this.f19117b;
                    this.f19117b = j54 - 1;
                    UnsafeUtil.n(j54, (byte) (((j2 >>> 21) & 127) | 128));
                    long j55 = this.f19117b;
                    this.f19117b = j55 - 1;
                    UnsafeUtil.n(j55, (byte) (((j2 >>> 14) & 127) | 128));
                    long j56 = this.f19117b;
                    this.f19117b = j56 - 1;
                    UnsafeUtil.n(j56, (byte) (((j2 >>> 7) & 127) | 128));
                    long j57 = this.f19117b;
                    this.f19117b = j57 - 1;
                    UnsafeUtil.n(j57, (byte) ((j2 & 127) | 128));
                    return;
                default:
                    return;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void f(int i2, String str) {
            char charAt;
            int T = T();
            U(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j2 = this.f19117b;
                this.f19117b = j2 - 1;
                UnsafeUtil.n(j2, (byte) charAt);
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j3 = this.f19117b;
                        if (j3 >= 0) {
                            this.f19117b = j3 - 1;
                            UnsafeUtil.n(j3, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j4 = this.f19117b;
                        if (j4 > 0) {
                            this.f19117b = j4 - 1;
                            UnsafeUtil.n(j4, (byte) ((charAt2 & '?') | 128));
                            long j5 = this.f19117b;
                            this.f19117b = j5 - 1;
                            UnsafeUtil.n(j5, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j6 = this.f19117b;
                        if (j6 > 1) {
                            this.f19117b = j6 - 1;
                            UnsafeUtil.n(j6, (byte) ((charAt2 & '?') | 128));
                            long j7 = this.f19117b;
                            this.f19117b = j7 - 1;
                            UnsafeUtil.n(j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j8 = this.f19117b;
                            this.f19117b = j8 - 1;
                            UnsafeUtil.n(j8, (byte) ((charAt2 >>> '\f') | 480));
                            length--;
                        }
                    }
                    if (this.f19117b > 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j9 = this.f19117b;
                                this.f19117b = j9 - 1;
                                UnsafeUtil.n(j9, (byte) ((codePoint & 63) | 128));
                                long j10 = this.f19117b;
                                this.f19117b = j10 - 1;
                                UnsafeUtil.n(j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j11 = this.f19117b;
                                this.f19117b = j11 - 1;
                                UnsafeUtil.n(j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = this.f19117b;
                                this.f19117b = j12 - 1;
                                UnsafeUtil.n(j12, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    U(length);
                    length++;
                    length--;
                }
            }
            int T2 = T() - T;
            U(10);
            d0(T2);
            c0(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void g(int i2, long j2) {
            U(15);
            e0(j2);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void i(int i2, int i3) {
            U(15);
            Y(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void k(int i2, ByteString byteString) {
            try {
                byteString.u(this);
                U(10);
                d0(byteString.size());
                c0(i2, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void p(int i2, Schema schema, Object obj) {
            c0(i2, 4);
            schema.h(obj, this);
            c0(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void q(int i2, long j2) {
            U(15);
            b0(j2);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void t(int i2, Schema schema, Object obj) {
            int T = T();
            schema.h(obj, this);
            int T2 = T() - T;
            U(10);
            d0(T2);
            c0(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void u(int i2, int i3) {
            U(10);
            d0(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void x(int i2, long j2) {
            U(13);
            X(j2);
            c0(i2, 1);
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeHeapWriter extends BinaryWriter {

        /* renamed from: b, reason: collision with root package name */
        public long f19118b;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void A(int i2, Object obj) {
            int T = T();
            Protobuf protobuf = Protobuf.f19325c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).h(obj, this);
            int T2 = T() - T;
            U(10);
            d0(T2);
            c0(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void D(int i2, boolean z2) {
            U(6);
            byte b2 = z2 ? (byte) 1 : (byte) 0;
            long j2 = this.f19118b;
            this.f19118b = j2 - 1;
            UnsafeUtil.o(null, j2, b2);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void F(int i2) {
            c0(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void J(int i2) {
            c0(i2, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void O(int i2, int i3) {
            U(10);
            a0(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void Q(int i2, byte[] bArr, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long j2 = this.f19118b;
            if (((int) j2) < i3) {
                this.f19113a += i3;
                AllocatedBuffer.b(i2, bArr, i3);
                throw null;
            }
            long j3 = j2 - i3;
            this.f19118b = j3;
            System.arraycopy(bArr, i2, null, ((int) j3) + 1, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            long j2 = this.f19118b;
            if (((int) j2) < remaining) {
                this.f19113a += remaining;
                AllocatedBuffer.a(byteBuffer);
                throw null;
            }
            long j3 = j2 - remaining;
            this.f19118b = j3;
            byteBuffer.get(null, ((int) j3) + 1, remaining);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final int T() {
            return this.f19113a + ((int) (0 - this.f19118b));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void U(int i2) {
            if (((int) this.f19118b) >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void V(boolean z2) {
            byte b2 = z2 ? (byte) 1 : (byte) 0;
            long j2 = this.f19118b;
            this.f19118b = j2 - 1;
            UnsafeUtil.o(null, j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void W(int i2) {
            long j2 = this.f19118b;
            this.f19118b = j2 - 1;
            UnsafeUtil.o(null, j2, (byte) ((i2 >> 24) & 255));
            long j3 = this.f19118b;
            this.f19118b = j3 - 1;
            UnsafeUtil.o(null, j3, (byte) ((i2 >> 16) & 255));
            long j4 = this.f19118b;
            this.f19118b = j4 - 1;
            UnsafeUtil.o(null, j4, (byte) ((i2 >> 8) & 255));
            long j5 = this.f19118b;
            this.f19118b = j5 - 1;
            UnsafeUtil.o(null, j5, (byte) (i2 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void X(long j2) {
            long j3 = this.f19118b;
            this.f19118b = j3 - 1;
            UnsafeUtil.o(null, j3, (byte) (((int) (j2 >> 56)) & 255));
            long j4 = this.f19118b;
            this.f19118b = j4 - 1;
            UnsafeUtil.o(null, j4, (byte) (((int) (j2 >> 48)) & 255));
            long j5 = this.f19118b;
            this.f19118b = j5 - 1;
            UnsafeUtil.o(null, j5, (byte) (((int) (j2 >> 40)) & 255));
            long j6 = this.f19118b;
            this.f19118b = j6 - 1;
            UnsafeUtil.o(null, j6, (byte) (((int) (j2 >> 32)) & 255));
            long j7 = this.f19118b;
            this.f19118b = j7 - 1;
            UnsafeUtil.o(null, j7, (byte) (((int) (j2 >> 24)) & 255));
            long j8 = this.f19118b;
            this.f19118b = j8 - 1;
            UnsafeUtil.o(null, j8, (byte) (((int) (j2 >> 16)) & 255));
            long j9 = this.f19118b;
            this.f19118b = j9 - 1;
            UnsafeUtil.o(null, j9, (byte) (((int) (j2 >> 8)) & 255));
            long j10 = this.f19118b;
            this.f19118b = j10 - 1;
            UnsafeUtil.o(null, j10, (byte) (((int) j2) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void Y(int i2) {
            if (i2 >= 0) {
                d0(i2);
            } else {
                e0(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void a0(int i2) {
            d0(CodedOutputStream.p0(i2));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void b0(long j2) {
            e0(CodedOutputStream.q0(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void c(int i2, int i3) {
            U(9);
            W(i3);
            c0(i2, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void c0(int i2, int i3) {
            d0((i2 << 3) | i3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void d0(int i2) {
            if ((i2 & (-128)) == 0) {
                long j2 = this.f19118b;
                this.f19118b = j2 - 1;
                UnsafeUtil.o(null, j2, (byte) i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                long j3 = this.f19118b;
                this.f19118b = j3 - 1;
                UnsafeUtil.o(null, j3, (byte) (i2 >>> 7));
                long j4 = this.f19118b;
                this.f19118b = j4 - 1;
                UnsafeUtil.o(null, j4, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-2097152) & i2) == 0) {
                long j5 = this.f19118b;
                this.f19118b = j5 - 1;
                UnsafeUtil.o(null, j5, (byte) (i2 >>> 14));
                long j6 = this.f19118b;
                this.f19118b = j6 - 1;
                UnsafeUtil.o(null, j6, (byte) (((i2 >>> 7) & 127) | 128));
                long j7 = this.f19118b;
                this.f19118b = j7 - 1;
                UnsafeUtil.o(null, j7, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-268435456) & i2) == 0) {
                long j8 = this.f19118b;
                this.f19118b = j8 - 1;
                UnsafeUtil.o(null, j8, (byte) (i2 >>> 21));
                long j9 = this.f19118b;
                this.f19118b = j9 - 1;
                UnsafeUtil.o(null, j9, (byte) (((i2 >>> 14) & 127) | 128));
                long j10 = this.f19118b;
                this.f19118b = j10 - 1;
                UnsafeUtil.o(null, j10, (byte) (((i2 >>> 7) & 127) | 128));
                long j11 = this.f19118b;
                this.f19118b = j11 - 1;
                UnsafeUtil.o(null, j11, (byte) ((i2 & 127) | 128));
                return;
            }
            long j12 = this.f19118b;
            this.f19118b = j12 - 1;
            UnsafeUtil.o(null, j12, (byte) (i2 >>> 28));
            long j13 = this.f19118b;
            this.f19118b = j13 - 1;
            UnsafeUtil.o(null, j13, (byte) (((i2 >>> 21) & 127) | 128));
            long j14 = this.f19118b;
            this.f19118b = j14 - 1;
            UnsafeUtil.o(null, j14, (byte) (((i2 >>> 14) & 127) | 128));
            long j15 = this.f19118b;
            this.f19118b = j15 - 1;
            UnsafeUtil.o(null, j15, (byte) (((i2 >>> 7) & 127) | 128));
            long j16 = this.f19118b;
            this.f19118b = j16 - 1;
            UnsafeUtil.o(null, j16, (byte) ((i2 & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public final void e0(long j2) {
            switch (BinaryWriter.S(j2)) {
                case 1:
                    long j3 = this.f19118b;
                    this.f19118b = j3 - 1;
                    UnsafeUtil.o(null, j3, (byte) j2);
                    return;
                case 2:
                    long j4 = this.f19118b;
                    this.f19118b = j4 - 1;
                    UnsafeUtil.o(null, j4, (byte) (j2 >>> 7));
                    long j5 = this.f19118b;
                    this.f19118b = j5 - 1;
                    UnsafeUtil.o(null, j5, (byte) ((((int) j2) & 127) | 128));
                    return;
                case 3:
                    long j6 = this.f19118b;
                    this.f19118b = j6 - 1;
                    UnsafeUtil.o(null, j6, (byte) (((int) j2) >>> 14));
                    long j7 = this.f19118b;
                    this.f19118b = j7 - 1;
                    UnsafeUtil.o(null, j7, (byte) (((j2 >>> 7) & 127) | 128));
                    long j8 = this.f19118b;
                    this.f19118b = j8 - 1;
                    UnsafeUtil.o(null, j8, (byte) ((j2 & 127) | 128));
                    return;
                case 4:
                    long j9 = this.f19118b;
                    this.f19118b = j9 - 1;
                    UnsafeUtil.o(null, j9, (byte) (j2 >>> 21));
                    long j10 = this.f19118b;
                    this.f19118b = j10 - 1;
                    UnsafeUtil.o(null, j10, (byte) (((j2 >>> 14) & 127) | 128));
                    long j11 = this.f19118b;
                    this.f19118b = j11 - 1;
                    UnsafeUtil.o(null, j11, (byte) (((j2 >>> 7) & 127) | 128));
                    long j12 = this.f19118b;
                    this.f19118b = j12 - 1;
                    UnsafeUtil.o(null, j12, (byte) ((j2 & 127) | 128));
                    return;
                case 5:
                    long j13 = this.f19118b;
                    this.f19118b = j13 - 1;
                    UnsafeUtil.o(null, j13, (byte) (j2 >>> 28));
                    long j14 = this.f19118b;
                    this.f19118b = j14 - 1;
                    UnsafeUtil.o(null, j14, (byte) (((j2 >>> 21) & 127) | 128));
                    long j15 = this.f19118b;
                    this.f19118b = j15 - 1;
                    UnsafeUtil.o(null, j15, (byte) (((j2 >>> 14) & 127) | 128));
                    long j16 = this.f19118b;
                    this.f19118b = j16 - 1;
                    UnsafeUtil.o(null, j16, (byte) (((j2 >>> 7) & 127) | 128));
                    long j17 = this.f19118b;
                    this.f19118b = j17 - 1;
                    UnsafeUtil.o(null, j17, (byte) ((j2 & 127) | 128));
                    return;
                case 6:
                    long j18 = this.f19118b;
                    this.f19118b = j18 - 1;
                    UnsafeUtil.o(null, j18, (byte) (j2 >>> 35));
                    long j19 = this.f19118b;
                    this.f19118b = j19 - 1;
                    UnsafeUtil.o(null, j19, (byte) (((j2 >>> 28) & 127) | 128));
                    long j20 = this.f19118b;
                    this.f19118b = j20 - 1;
                    UnsafeUtil.o(null, j20, (byte) (((j2 >>> 21) & 127) | 128));
                    long j21 = this.f19118b;
                    this.f19118b = j21 - 1;
                    UnsafeUtil.o(null, j21, (byte) (((j2 >>> 14) & 127) | 128));
                    long j22 = this.f19118b;
                    this.f19118b = j22 - 1;
                    UnsafeUtil.o(null, j22, (byte) (((j2 >>> 7) & 127) | 128));
                    long j23 = this.f19118b;
                    this.f19118b = j23 - 1;
                    UnsafeUtil.o(null, j23, (byte) ((j2 & 127) | 128));
                    return;
                case 7:
                    long j24 = this.f19118b;
                    this.f19118b = j24 - 1;
                    UnsafeUtil.o(null, j24, (byte) (j2 >>> 42));
                    long j25 = this.f19118b;
                    this.f19118b = j25 - 1;
                    UnsafeUtil.o(null, j25, (byte) (((j2 >>> 35) & 127) | 128));
                    long j26 = this.f19118b;
                    this.f19118b = j26 - 1;
                    UnsafeUtil.o(null, j26, (byte) (((j2 >>> 28) & 127) | 128));
                    long j27 = this.f19118b;
                    this.f19118b = j27 - 1;
                    UnsafeUtil.o(null, j27, (byte) (((j2 >>> 21) & 127) | 128));
                    long j28 = this.f19118b;
                    this.f19118b = j28 - 1;
                    UnsafeUtil.o(null, j28, (byte) (((j2 >>> 14) & 127) | 128));
                    long j29 = this.f19118b;
                    this.f19118b = j29 - 1;
                    UnsafeUtil.o(null, j29, (byte) (((j2 >>> 7) & 127) | 128));
                    long j30 = this.f19118b;
                    this.f19118b = j30 - 1;
                    UnsafeUtil.o(null, j30, (byte) ((j2 & 127) | 128));
                    return;
                case 8:
                    long j31 = this.f19118b;
                    this.f19118b = j31 - 1;
                    UnsafeUtil.o(null, j31, (byte) (j2 >>> 49));
                    long j32 = this.f19118b;
                    this.f19118b = j32 - 1;
                    UnsafeUtil.o(null, j32, (byte) (((j2 >>> 42) & 127) | 128));
                    long j33 = this.f19118b;
                    this.f19118b = j33 - 1;
                    UnsafeUtil.o(null, j33, (byte) (((j2 >>> 35) & 127) | 128));
                    long j34 = this.f19118b;
                    this.f19118b = j34 - 1;
                    UnsafeUtil.o(null, j34, (byte) (((j2 >>> 28) & 127) | 128));
                    long j35 = this.f19118b;
                    this.f19118b = j35 - 1;
                    UnsafeUtil.o(null, j35, (byte) (((j2 >>> 21) & 127) | 128));
                    long j36 = this.f19118b;
                    this.f19118b = j36 - 1;
                    UnsafeUtil.o(null, j36, (byte) (((j2 >>> 14) & 127) | 128));
                    long j37 = this.f19118b;
                    this.f19118b = j37 - 1;
                    UnsafeUtil.o(null, j37, (byte) (((j2 >>> 7) & 127) | 128));
                    long j38 = this.f19118b;
                    this.f19118b = j38 - 1;
                    UnsafeUtil.o(null, j38, (byte) ((j2 & 127) | 128));
                    return;
                case 9:
                    long j39 = this.f19118b;
                    this.f19118b = j39 - 1;
                    UnsafeUtil.o(null, j39, (byte) (j2 >>> 56));
                    long j40 = this.f19118b;
                    this.f19118b = j40 - 1;
                    UnsafeUtil.o(null, j40, (byte) (((j2 >>> 49) & 127) | 128));
                    long j41 = this.f19118b;
                    this.f19118b = j41 - 1;
                    UnsafeUtil.o(null, j41, (byte) (((j2 >>> 42) & 127) | 128));
                    long j42 = this.f19118b;
                    this.f19118b = j42 - 1;
                    UnsafeUtil.o(null, j42, (byte) (((j2 >>> 35) & 127) | 128));
                    long j43 = this.f19118b;
                    this.f19118b = j43 - 1;
                    UnsafeUtil.o(null, j43, (byte) (((j2 >>> 28) & 127) | 128));
                    long j44 = this.f19118b;
                    this.f19118b = j44 - 1;
                    UnsafeUtil.o(null, j44, (byte) (((j2 >>> 21) & 127) | 128));
                    long j45 = this.f19118b;
                    this.f19118b = j45 - 1;
                    UnsafeUtil.o(null, j45, (byte) (((j2 >>> 14) & 127) | 128));
                    long j46 = this.f19118b;
                    this.f19118b = j46 - 1;
                    UnsafeUtil.o(null, j46, (byte) (((j2 >>> 7) & 127) | 128));
                    long j47 = this.f19118b;
                    this.f19118b = j47 - 1;
                    UnsafeUtil.o(null, j47, (byte) ((j2 & 127) | 128));
                    return;
                case 10:
                    long j48 = this.f19118b;
                    this.f19118b = j48 - 1;
                    UnsafeUtil.o(null, j48, (byte) (j2 >>> 63));
                    long j49 = this.f19118b;
                    this.f19118b = j49 - 1;
                    UnsafeUtil.o(null, j49, (byte) (((j2 >>> 56) & 127) | 128));
                    long j50 = this.f19118b;
                    this.f19118b = j50 - 1;
                    UnsafeUtil.o(null, j50, (byte) (((j2 >>> 49) & 127) | 128));
                    long j51 = this.f19118b;
                    this.f19118b = j51 - 1;
                    UnsafeUtil.o(null, j51, (byte) (((j2 >>> 42) & 127) | 128));
                    long j52 = this.f19118b;
                    this.f19118b = j52 - 1;
                    UnsafeUtil.o(null, j52, (byte) (((j2 >>> 35) & 127) | 128));
                    long j53 = this.f19118b;
                    this.f19118b = j53 - 1;
                    UnsafeUtil.o(null, j53, (byte) (((j2 >>> 28) & 127) | 128));
                    long j54 = this.f19118b;
                    this.f19118b = j54 - 1;
                    UnsafeUtil.o(null, j54, (byte) (((j2 >>> 21) & 127) | 128));
                    long j55 = this.f19118b;
                    this.f19118b = j55 - 1;
                    UnsafeUtil.o(null, j55, (byte) (((j2 >>> 14) & 127) | 128));
                    long j56 = this.f19118b;
                    this.f19118b = j56 - 1;
                    UnsafeUtil.o(null, j56, (byte) (((j2 >>> 7) & 127) | 128));
                    long j57 = this.f19118b;
                    this.f19118b = j57 - 1;
                    UnsafeUtil.o(null, j57, (byte) ((j2 & 127) | 128));
                    return;
                default:
                    return;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void f(int i2, String str) {
            char charAt;
            int T = T();
            U(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j2 = this.f19118b;
                this.f19118b = j2 - 1;
                UnsafeUtil.o(null, j2, (byte) charAt);
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j3 = this.f19118b;
                        if (j3 > 0) {
                            this.f19118b = j3 - 1;
                            UnsafeUtil.o(null, j3, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j4 = this.f19118b;
                        if (j4 > 0) {
                            this.f19118b = j4 - 1;
                            UnsafeUtil.o(null, j4, (byte) ((charAt2 & '?') | 128));
                            long j5 = this.f19118b;
                            this.f19118b = j5 - 1;
                            UnsafeUtil.o(null, j5, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j6 = this.f19118b;
                        if (j6 > 1) {
                            this.f19118b = j6 - 1;
                            UnsafeUtil.o(null, j6, (byte) ((charAt2 & '?') | 128));
                            long j7 = this.f19118b;
                            this.f19118b = j7 - 1;
                            UnsafeUtil.o(null, j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j8 = this.f19118b;
                            this.f19118b = j8 - 1;
                            UnsafeUtil.o(null, j8, (byte) ((charAt2 >>> '\f') | 480));
                            length--;
                        }
                    }
                    if (this.f19118b > 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j9 = this.f19118b;
                                this.f19118b = j9 - 1;
                                UnsafeUtil.o(null, j9, (byte) ((codePoint & 63) | 128));
                                long j10 = this.f19118b;
                                this.f19118b = j10 - 1;
                                UnsafeUtil.o(null, j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j11 = this.f19118b;
                                this.f19118b = j11 - 1;
                                UnsafeUtil.o(null, j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = this.f19118b;
                                this.f19118b = j12 - 1;
                                UnsafeUtil.o(null, j12, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    U(length);
                    length++;
                    length--;
                }
            }
            int T2 = T() - T;
            U(10);
            d0(T2);
            c0(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void g(int i2, long j2) {
            U(15);
            e0(j2);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void i(int i2, int i3) {
            U(15);
            Y(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void k(int i2, ByteString byteString) {
            try {
                byteString.u(this);
                U(10);
                d0(byteString.size());
                c0(i2, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void p(int i2, Schema schema, Object obj) {
            c0(i2, 4);
            schema.h(obj, this);
            c0(i2, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void q(int i2, long j2) {
            U(15);
            b0(j2);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void t(int i2, Schema schema, Object obj) {
            int T = T();
            schema.h(obj, this);
            int T2 = T() - T;
            U(10);
            d0(T2);
            c0(i2, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void u(int i2, int i3) {
            U(10);
            d0(i3);
            c0(i2, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void x(int i2, long j2) {
            U(13);
            X(j2);
            c0(i2, 1);
        }
    }

    public static byte S(long j2) {
        byte b2;
        if (((-128) & j2) == 0) {
            return (byte) 1;
        }
        if (j2 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j2) != 0) {
            b2 = (byte) 6;
            j2 >>>= 28;
        } else {
            b2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            b2 = (byte) (b2 + 2);
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? (byte) (b2 + 1) : b2;
    }

    public static final void Z(Writer writer, int i2, WireFormat.FieldType fieldType, Object obj) {
        switch (fieldType.ordinal()) {
            case 0:
                writer.j(((Double) obj).doubleValue(), i2);
                return;
            case 1:
                writer.B(((Float) obj).floatValue(), i2);
                return;
            case 2:
                writer.C(i2, ((Long) obj).longValue());
                return;
            case 3:
                writer.g(i2, ((Long) obj).longValue());
                return;
            case 4:
                writer.i(i2, ((Integer) obj).intValue());
                return;
            case 5:
                writer.x(i2, ((Long) obj).longValue());
                return;
            case 6:
                writer.c(i2, ((Integer) obj).intValue());
                return;
            case 7:
                writer.D(i2, ((Boolean) obj).booleanValue());
                return;
            case 8:
                writer.f(i2, (String) obj);
                return;
            case 9:
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
            case 10:
                writer.A(i2, obj);
                return;
            case 11:
                writer.k(i2, (ByteString) obj);
                return;
            case 12:
                writer.u(i2, ((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof Internal.EnumLite) {
                    writer.L(i2, ((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.L(i2, ((Integer) obj).intValue());
                    return;
                }
            case 14:
                writer.E(i2, ((Integer) obj).intValue());
                return;
            case 15:
                writer.l(i2, ((Long) obj).longValue());
                return;
            case 16:
                writer.O(i2, ((Integer) obj).intValue());
                return;
            case 17:
                writer.q(i2, ((Long) obj).longValue());
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void B(float f2, int i2) {
        c(i2, Float.floatToRawIntBits(f2));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void C(int i2, long j2) {
        g(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void E(int i2, int i3) {
        c(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void G(int i2, List list, boolean z2) {
        if (!(list instanceof LongArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    x(i2, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U((list.size() * 8) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                X(((Long) list.get(size2)).longValue());
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            for (int i3 = longArrayList.f19278c - 1; i3 >= 0; i3--) {
                x(i2, longArrayList.d(i3));
            }
            return;
        }
        U((longArrayList.f19278c * 8) + 10);
        int T2 = T();
        for (int i4 = longArrayList.f19278c - 1; i4 >= 0; i4--) {
            X(longArrayList.d(i4));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void H(int i2, List list, boolean z2) {
        m(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void I(int i2, List list, boolean z2) {
        if (!(list instanceof BooleanArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    D(i2, ((Boolean) list.get(size)).booleanValue());
                }
                return;
            }
            U(list.size() + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                V(((Boolean) list.get(size2)).booleanValue());
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        if (!z2) {
            for (int i3 = booleanArrayList.f19121c - 1; i3 >= 0; i3--) {
                booleanArrayList.c(i3);
                D(i2, booleanArrayList.f19120b[i3]);
            }
            return;
        }
        U(booleanArrayList.f19121c + 10);
        int T2 = T();
        for (int i4 = booleanArrayList.f19121c - 1; i4 >= 0; i4--) {
            booleanArrayList.c(i4);
            V(booleanArrayList.f19120b[i4]);
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void K(int i2, List list, boolean z2) {
        if (!(list instanceof IntArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    O(i2, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U((list.size() * 5) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                a0(((Integer) list.get(size2)).intValue());
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            for (int i3 = intArrayList.f19250c - 1; i3 >= 0; i3--) {
                O(i2, intArrayList.d(i3));
            }
            return;
        }
        U((intArrayList.f19250c * 5) + 10);
        int T2 = T();
        for (int i4 = intArrayList.f19250c - 1; i4 >= 0; i4--) {
            a0(intArrayList.d(i4));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void L(int i2, int i3) {
        i(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void M(int i2, List list, boolean z2) {
        w(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void N(int i2, List list, boolean z2) {
        if (!(list instanceof DoubleArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    j(((Double) list.get(size)).doubleValue(), i2);
                }
                return;
            }
            U((list.size() * 8) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                X(Double.doubleToRawLongBits(((Double) list.get(size2)).doubleValue()));
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        if (!z2) {
            for (int i3 = doubleArrayList.f19170c - 1; i3 >= 0; i3--) {
                doubleArrayList.c(i3);
                j(doubleArrayList.f19169b[i3], i2);
            }
            return;
        }
        U((doubleArrayList.f19170c * 8) + 10);
        int T2 = T();
        for (int i4 = doubleArrayList.f19170c - 1; i4 >= 0; i4--) {
            doubleArrayList.c(i4);
            X(Double.doubleToRawLongBits(doubleArrayList.f19169b[i4]));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void P(int i2, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            k(i2, (ByteString) list.get(size));
        }
    }

    public abstract int T();

    public abstract void U(int i2);

    public abstract void V(boolean z2);

    public abstract void W(int i2);

    public abstract void X(long j2);

    public abstract void Y(int i2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void a(int i2, List list, boolean z2) {
        if (!(list instanceof FloatArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    B(((Float) list.get(size)).floatValue(), i2);
                }
                return;
            }
            U((list.size() * 4) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                W(Float.floatToRawIntBits(((Float) list.get(size2)).floatValue()));
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        if (!z2) {
            for (int i3 = floatArrayList.f19234c - 1; i3 >= 0; i3--) {
                floatArrayList.c(i3);
                B(floatArrayList.f19233b[i3], i2);
            }
            return;
        }
        U((floatArrayList.f19234c * 4) + 10);
        int T2 = T();
        for (int i4 = floatArrayList.f19234c - 1; i4 >= 0; i4--) {
            floatArrayList.c(i4);
            W(Float.floatToRawIntBits(floatArrayList.f19233b[i4]));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    public abstract void a0(int i2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i2, Object obj) {
        c0(1, 4);
        if (obj instanceof ByteString) {
            k(3, (ByteString) obj);
        } else {
            A(3, obj);
        }
        u(2, i2);
        c0(1, 3);
    }

    public abstract void b0(long j2);

    public abstract void c0(int i2, int i3);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void d(int i2, List list) {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                f(i2, (String) list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Object F = lazyStringList.F(size2);
            if (F instanceof String) {
                f(i2, (String) F);
            } else {
                k(i2, (ByteString) F);
            }
        }
    }

    public abstract void d0(int i2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void e(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            p(i2, schema, list.get(size));
        }
    }

    public abstract void e0(long j2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void h(int i2, List list, boolean z2) {
        if (!(list instanceof IntArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    i(i2, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U((list.size() * 10) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                Y(((Integer) list.get(size2)).intValue());
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            for (int i3 = intArrayList.f19250c - 1; i3 >= 0; i3--) {
                i(i2, intArrayList.d(i3));
            }
            return;
        }
        U((intArrayList.f19250c * 10) + 10);
        int T2 = T();
        for (int i4 = intArrayList.f19250c - 1; i4 >= 0; i4--) {
            Y(intArrayList.d(i4));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void j(double d, int i2) {
        x(i2, Double.doubleToRawLongBits(d));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void l(int i2, long j2) {
        x(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void m(int i2, List list, boolean z2) {
        if (!(list instanceof IntArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    c(i2, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U((list.size() * 4) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                W(((Integer) list.get(size2)).intValue());
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            for (int i3 = intArrayList.f19250c - 1; i3 >= 0; i3--) {
                c(i2, intArrayList.d(i3));
            }
            return;
        }
        U((intArrayList.f19250c * 4) + 10);
        int T2 = T();
        for (int i4 = intArrayList.f19250c - 1; i4 >= 0; i4--) {
            W(intArrayList.d(i4));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void n(int i2, List list, boolean z2) {
        if (!(list instanceof IntArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    u(i2, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U((list.size() * 5) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                d0(((Integer) list.get(size2)).intValue());
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            for (int i3 = intArrayList.f19250c - 1; i3 >= 0; i3--) {
                u(i2, intArrayList.d(i3));
            }
            return;
        }
        U((intArrayList.f19250c * 5) + 10);
        int T2 = T();
        for (int i4 = intArrayList.f19250c - 1; i4 >= 0; i4--) {
            d0(intArrayList.d(i4));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void o(int i2, List list, boolean z2) {
        if (!(list instanceof LongArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    q(i2, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U((list.size() * 10) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                b0(((Long) list.get(size2)).longValue());
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            for (int i3 = longArrayList.f19278c - 1; i3 >= 0; i3--) {
                q(i2, longArrayList.d(i3));
            }
            return;
        }
        U((longArrayList.f19278c * 10) + 10);
        int T2 = T();
        for (int i4 = longArrayList.f19278c - 1; i4 >= 0; i4--) {
            b0(longArrayList.d(i4));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void r(int i2, List list, boolean z2) {
        h(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void s(int i2, MapEntryLite.Metadata metadata, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            int T = T();
            Z(this, 2, metadata.f19288c, entry.getValue());
            Z(this, 1, metadata.f19286a, entry.getKey());
            d0(T() - T);
            c0(i2, 2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void v(int i2, List list, boolean z2) {
        G(i2, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void w(int i2, List list, boolean z2) {
        if (!(list instanceof LongArrayList)) {
            if (!z2) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    g(i2, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U((list.size() * 10) + 10);
            int T = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                e0(((Long) list.get(size2)).longValue());
            }
            d0(T() - T);
            c0(i2, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            for (int i3 = longArrayList.f19278c - 1; i3 >= 0; i3--) {
                g(i2, longArrayList.d(i3));
            }
            return;
        }
        U((longArrayList.f19278c * 10) + 10);
        int T2 = T();
        for (int i4 = longArrayList.f19278c - 1; i4 >= 0; i4--) {
            e0(longArrayList.d(i4));
        }
        d0(T() - T2);
        c0(i2, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder y() {
        return Writer.FieldOrder.f19433b;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void z(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            t(i2, schema, list.get(size));
        }
    }
}
