package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class BinaryReader implements Reader {

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19109a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f19109a = iArr;
            try {
                iArr[WireFormat.FieldType.f19407k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19109a[WireFormat.FieldType.f19411o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19109a[WireFormat.FieldType.f19401c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19109a[WireFormat.FieldType.f19413q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19109a[WireFormat.FieldType.f19406j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19109a[WireFormat.FieldType.f19405i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19109a[WireFormat.FieldType.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19109a[WireFormat.FieldType.f19404h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19109a[WireFormat.FieldType.f19402f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19109a[WireFormat.FieldType.f19410n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19109a[WireFormat.FieldType.f19414r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19109a[WireFormat.FieldType.f19415s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19109a[WireFormat.FieldType.f19416t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19109a[WireFormat.FieldType.f19417u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19109a[WireFormat.FieldType.f19408l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19109a[WireFormat.FieldType.f19412p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19109a[WireFormat.FieldType.f19403g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class SafeHeapReader extends BinaryReader {

        /* renamed from: a, reason: collision with root package name */
        public int f19110a;

        /* renamed from: b, reason: collision with root package name */
        public int f19111b;

        /* renamed from: c, reason: collision with root package name */
        public int f19112c;

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void A(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) {
            Y(2);
            U();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void B(List list) {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 == 2) {
                    int U = U();
                    Z(U);
                    int i5 = this.f19110a + U;
                    while (this.f19110a < i5) {
                        list.add(Integer.valueOf(Q()));
                    }
                    return;
                }
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Integer.valueOf(x()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i6 = this.f19111b & 7;
            if (i6 == 2) {
                int U2 = U();
                Z(U2);
                int i7 = this.f19110a + U2;
                while (this.f19110a < i7) {
                    intArrayList.b(Q());
                }
                return;
            }
            if (i6 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                intArrayList.b(x());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long C() {
            Y(0);
            return CodedInputStream.c(V());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final String D() {
            return S(false);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int E() {
            if (O()) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            int U = U();
            this.f19111b = U;
            return U == this.f19112c ? Api.BaseClientBuilder.API_PRIORITY_OTHER : U >>> 3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void F(List list) {
            T(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void G(List list) {
            int i2;
            int i3;
            if (!(list instanceof FloatArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 == 2) {
                    int U = U();
                    Z(U);
                    int i5 = this.f19110a + U;
                    while (this.f19110a < i5) {
                        list.add(Float.valueOf(Float.intBitsToFloat(Q())));
                    }
                    return;
                }
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int i6 = this.f19111b & 7;
            if (i6 == 2) {
                int U2 = U();
                Z(U2);
                int i7 = this.f19110a + U2;
                while (this.f19110a < i7) {
                    floatArrayList.b(Float.intBitsToFloat(Q()));
                }
                return;
            }
            if (i6 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                floatArrayList.b(readFloat());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void H(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            if ((this.f19111b & 7) != 3) {
                throw InvalidProtocolBufferException.d();
            }
            list.add(P(schema, extensionRegistryLite));
            if (O()) {
                return;
            }
            U();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final boolean I() {
            int i2;
            int i3;
            if (O() || (i2 = this.f19111b) == (i3 = this.f19112c)) {
                return false;
            }
            int i4 = i2 & 7;
            if (i4 == 0) {
                int i5 = this.f19110a;
                if (0 - i5 >= 10) {
                    throw null;
                }
                if (i5 == 0) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f19110a = i5 + 1;
                throw null;
            }
            if (i4 == 1) {
                W(8);
                this.f19110a += 8;
                return true;
            }
            if (i4 == 2) {
                U();
                throw null;
            }
            if (i4 != 3) {
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                W(4);
                this.f19110a += 4;
                return true;
            }
            this.f19112c = ((i2 >>> 3) << 3) | 4;
            while (E() != Integer.MAX_VALUE && I()) {
            }
            if (this.f19111b != this.f19112c) {
                throw InvalidProtocolBufferException.g();
            }
            this.f19112c = i3;
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int J() {
            Y(5);
            W(4);
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void K(List list) {
            int i2;
            if ((this.f19111b & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(p());
                if (O()) {
                    return;
                } else {
                    i2 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void L(List list) {
            int i2;
            int i3;
            if (!(list instanceof DoubleArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = U();
                    a0(U);
                    int i5 = this.f19110a + U;
                    while (this.f19110a < i5) {
                        list.add(Double.valueOf(Double.longBitsToDouble(R())));
                    }
                    return;
                }
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int i6 = this.f19111b & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = U();
                a0(U2);
                int i7 = this.f19110a + U2;
                while (this.f19110a < i7) {
                    doubleArrayList.b(Double.longBitsToDouble(R()));
                }
                return;
            }
            do {
                doubleArrayList.b(readDouble());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long M() {
            Y(0);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final String N() {
            return S(true);
        }

        public final boolean O() {
            return this.f19110a == 0;
        }

        public final Object P(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f19112c;
            this.f19112c = ((this.f19111b >>> 3) << 3) | 4;
            try {
                Object f2 = schema.f();
                schema.b(f2, this, extensionRegistryLite);
                schema.c(f2);
                if (this.f19111b == this.f19112c) {
                    return f2;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f19112c = i2;
            }
        }

        public final int Q() {
            this.f19110a += 4;
            throw null;
        }

        public final long R() {
            this.f19110a += 8;
            throw null;
        }

        public final String S(boolean z2) {
            Y(2);
            U();
            throw null;
        }

        public final void T(List list, boolean z2) {
            int i2;
            int i3;
            if ((this.f19111b & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            if (!(list instanceof LazyStringList) || z2) {
                do {
                    list.add(S(z2));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.D(p());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        public final int U() {
            if (this.f19110a != 0) {
                throw null;
            }
            throw InvalidProtocolBufferException.h();
        }

        public final long V() {
            if (this.f19110a != 0) {
                throw null;
            }
            throw InvalidProtocolBufferException.h();
        }

        public final void W(int i2) {
            if (i2 < 0 || i2 > 0 - this.f19110a) {
                throw InvalidProtocolBufferException.h();
            }
        }

        public final void X(int i2) {
            if (this.f19110a != i2) {
                throw InvalidProtocolBufferException.h();
            }
        }

        public final void Y(int i2) {
            if ((this.f19111b & 7) != i2) {
                throw InvalidProtocolBufferException.d();
            }
        }

        public final void Z(int i2) {
            W(i2);
            if ((i2 & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final Object a(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            Y(2);
            U();
            throw null;
        }

        public final void a0(int i2) {
            W(i2);
            if ((i2 & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long b() {
            Y(1);
            W(8);
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void c(List list) {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 == 2) {
                    int U = U();
                    Z(U);
                    int i5 = this.f19110a + U;
                    while (this.f19110a < i5) {
                        list.add(Integer.valueOf(Q()));
                    }
                    return;
                }
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Integer.valueOf(J()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i6 = this.f19111b & 7;
            if (i6 == 2) {
                int U2 = U();
                Z(U2);
                int i7 = this.f19110a + U2;
                while (this.f19110a < i7) {
                    intArrayList.b(Q());
                }
                return;
            }
            if (i6 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                intArrayList.b(J());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void d(List list) {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = this.f19110a + U();
                    while (this.f19110a < U) {
                        list.add(Long.valueOf(CodedInputStream.c(V())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(C()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i5 = this.f19111b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = this.f19110a + U();
                while (this.f19110a < U2) {
                    longArrayList.b(CodedInputStream.c(V()));
                }
                return;
            }
            do {
                longArrayList.b(C());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final boolean e() {
            Y(0);
            return U() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long f() {
            Y(1);
            W(8);
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void g(List list) {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = this.f19110a + U();
                    while (this.f19110a < U) {
                        list.add(Long.valueOf(V()));
                    }
                    X(U);
                    return;
                }
                do {
                    list.add(Long.valueOf(v()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i5 = this.f19111b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = this.f19110a + U();
                while (this.f19110a < U2) {
                    longArrayList.b(V());
                }
                X(U2);
                return;
            }
            do {
                longArrayList.b(v());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int h() {
            Y(0);
            return U();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void i(List list) {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = this.f19110a + U();
                    while (this.f19110a < U) {
                        list.add(Long.valueOf(V()));
                    }
                    X(U);
                    return;
                }
                do {
                    list.add(Long.valueOf(M()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i5 = this.f19111b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = this.f19110a + U();
                while (this.f19110a < U2) {
                    longArrayList.b(V());
                }
                X(U2);
                return;
            }
            do {
                longArrayList.b(M());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void j(List list) {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = this.f19110a + U();
                    while (this.f19110a < U) {
                        list.add(Integer.valueOf(U()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(k()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.f19111b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = this.f19110a + U();
                while (this.f19110a < U2) {
                    intArrayList.b(U());
                }
                return;
            }
            do {
                intArrayList.b(k());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int k() {
            Y(0);
            return U();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int l() {
            return this.f19111b;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int m() {
            Y(0);
            return CodedInputStream.b(U());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void n(List list) {
            int i2;
            int i3;
            if (!(list instanceof BooleanArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = this.f19110a + U();
                    while (this.f19110a < U) {
                        list.add(Boolean.valueOf(U() != 0));
                    }
                    X(U);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(e()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int i5 = this.f19111b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = this.f19110a + U();
                while (this.f19110a < U2) {
                    booleanArrayList.b(U() != 0);
                }
                X(U2);
                return;
            }
            do {
                booleanArrayList.b(e());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void o(List list) {
            T(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final ByteString p() {
            Y(2);
            U();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int q() {
            Y(0);
            return U();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void r(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            if ((this.f19111b & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            U();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final double readDouble() {
            Y(1);
            W(8);
            return Double.longBitsToDouble(R());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final float readFloat() {
            Y(5);
            W(4);
            return Float.intBitsToFloat(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void s(List list) {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = U();
                    a0(U);
                    int i5 = this.f19110a + U;
                    while (this.f19110a < i5) {
                        list.add(Long.valueOf(R()));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(b()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i6 = this.f19111b & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = U();
                a0(U2);
                int i7 = this.f19110a + U2;
                while (this.f19110a < i7) {
                    longArrayList.b(R());
                }
                return;
            }
            do {
                longArrayList.b(b());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final Object t(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            Y(3);
            return P(schema, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void u(List list) {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = this.f19110a + U();
                    while (this.f19110a < U) {
                        list.add(Integer.valueOf(CodedInputStream.b(U())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(m()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.f19111b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = this.f19110a + U();
                while (this.f19110a < U2) {
                    intArrayList.b(CodedInputStream.b(U()));
                }
                return;
            }
            do {
                intArrayList.b(m());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long v() {
            Y(0);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void w(List list) {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = this.f19110a + U();
                    while (this.f19110a < U) {
                        list.add(Integer.valueOf(U()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(h()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.f19111b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = this.f19110a + U();
                while (this.f19110a < U2) {
                    intArrayList.b(U());
                }
                return;
            }
            do {
                intArrayList.b(h());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int x() {
            Y(5);
            W(4);
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void y(List list) {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = U();
                    a0(U);
                    int i5 = this.f19110a + U;
                    while (this.f19110a < i5) {
                        list.add(Long.valueOf(R()));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(f()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i6 = this.f19111b & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = U();
                a0(U2);
                int i7 = this.f19110a + U2;
                while (this.f19110a < i7) {
                    longArrayList.b(R());
                }
                return;
            }
            do {
                longArrayList.b(f());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void z(List list) {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f19111b & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int U = this.f19110a + U();
                    while (this.f19110a < U) {
                        list.add(Integer.valueOf(U()));
                    }
                    X(U);
                    return;
                }
                do {
                    list.add(Integer.valueOf(q()));
                    if (O()) {
                        return;
                    } else {
                        i2 = this.f19110a;
                    }
                } while (U() == this.f19111b);
                this.f19110a = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.f19111b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int U2 = this.f19110a + U();
                while (this.f19110a < U2) {
                    intArrayList.b(U());
                }
                X(U2);
                return;
            }
            do {
                intArrayList.b(q());
                if (O()) {
                    return;
                } else {
                    i3 = this.f19110a;
                }
            } while (U() == this.f19111b);
            this.f19110a = i3;
        }
    }
}
