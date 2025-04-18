package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CodedInputStreamReader implements Reader {

    /* renamed from: a, reason: collision with root package name */
    public final CodedInputStream f19157a;

    /* renamed from: b, reason: collision with root package name */
    public int f19158b;

    /* renamed from: c, reason: collision with root package name */
    public int f19159c;
    public int d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19160a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f19160a = iArr;
            try {
                iArr[WireFormat.FieldType.f19407k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19160a[WireFormat.FieldType.f19411o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19160a[WireFormat.FieldType.f19401c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19160a[WireFormat.FieldType.f19413q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19160a[WireFormat.FieldType.f19406j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19160a[WireFormat.FieldType.f19405i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19160a[WireFormat.FieldType.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19160a[WireFormat.FieldType.f19404h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19160a[WireFormat.FieldType.f19402f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19160a[WireFormat.FieldType.f19410n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19160a[WireFormat.FieldType.f19414r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19160a[WireFormat.FieldType.f19415s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19160a[WireFormat.FieldType.f19416t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19160a[WireFormat.FieldType.f19417u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19160a[WireFormat.FieldType.f19408l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19160a[WireFormat.FieldType.f19412p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19160a[WireFormat.FieldType.f19403g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        Charset charset = Internal.f19251a;
        if (codedInputStream == null) {
            throw new NullPointerException("input");
        }
        this.f19157a = codedInputStream;
        codedInputStream.d = this;
    }

    public static void U(int i2) {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void V(int i2) {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        r1.h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.util.Map r10, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata r11, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r12) {
        /*
            r9 = this;
            r0 = 2
            r9.T(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r9.f19157a
            int r2 = r1.z()
            int r2 = r1.i(r2)
            java.lang.Object r3 = r11.f19287b
            java.lang.Object r4 = r11.d
            r5 = r4
        L13:
            int r6 = r9.E()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L59
            boolean r7 = r1.e()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L59
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L44
            if (r6 == r0) goto L39
            boolean r6 = r9.I()     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            if (r6 == 0) goto L31
            goto L13
        L31:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            throw r6     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
        L37:
            r10 = move-exception
            goto L60
        L39:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = r11.f19288c     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            java.lang.Object r5 = r9.O(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            goto L13
        L44:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = r11.f19286a     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            r7 = 0
            java.lang.Object r3 = r9.O(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            goto L13
        L4c:
            boolean r6 = r9.I()     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L53
            goto L13
        L53:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r10 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L59:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L37
            r1.h(r2)
            return
        L60:
            r1.h(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStreamReader.A(java.util.Map, androidx.datastore.preferences.protobuf.MapEntryLite$Metadata, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void B(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 == 2) {
                int z3 = codedInputStream.z();
                U(z3);
                int d = codedInputStream.d() + z3;
                do {
                    list.add(Integer.valueOf(codedInputStream.n()));
                } while (codedInputStream.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.n()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 == 2) {
            int z4 = codedInputStream.z();
            U(z4);
            int d2 = codedInputStream.d() + z4;
            do {
                intArrayList.b(codedInputStream.n());
            } while (codedInputStream.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            intArrayList.b(codedInputStream.n());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long C() {
        T(0);
        return this.f19157a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String D() {
        T(2);
        return this.f19157a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int E() {
        int i2 = this.d;
        if (i2 != 0) {
            this.f19158b = i2;
            this.d = 0;
        } else {
            this.f19158b = this.f19157a.y();
        }
        int i3 = this.f19158b;
        return (i3 == 0 || i3 == this.f19159c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void F(List list) {
        R(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void G(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof FloatArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 == 2) {
                int z3 = codedInputStream.z();
                U(z3);
                int d = codedInputStream.d() + z3;
                do {
                    list.add(Float.valueOf(codedInputStream.p()));
                } while (codedInputStream.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(codedInputStream.p()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 == 2) {
            int z4 = codedInputStream.z();
            U(z4);
            int d2 = codedInputStream.d() + z4;
            do {
                floatArrayList.b(codedInputStream.p());
            } while (codedInputStream.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            floatArrayList.b(codedInputStream.p());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void H(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int y2;
        int i2 = this.f19158b;
        if ((i2 & 7) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(P(schema, extensionRegistryLite));
            CodedInputStream codedInputStream = this.f19157a;
            if (codedInputStream.e() || this.d != 0) {
                return;
            } else {
                y2 = codedInputStream.y();
            }
        } while (y2 == i2);
        this.d = y2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean I() {
        int i2;
        CodedInputStream codedInputStream = this.f19157a;
        if (codedInputStream.e() || (i2 = this.f19158b) == this.f19159c) {
            return false;
        }
        return codedInputStream.B(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int J() {
        T(5);
        return this.f19157a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void K(List list) {
        int y2;
        if ((this.f19158b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(p());
            CodedInputStream codedInputStream = this.f19157a;
            if (codedInputStream.e()) {
                return;
            } else {
                y2 = codedInputStream.y();
            }
        } while (y2 == this.f19158b);
        this.d = y2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void L(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof DoubleArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int z3 = codedInputStream.z();
                V(z3);
                int d = codedInputStream.d() + z3;
                do {
                    list.add(Double.valueOf(codedInputStream.l()));
                } while (codedInputStream.d() < d);
                return;
            }
            do {
                list.add(Double.valueOf(codedInputStream.l()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 1) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int z4 = codedInputStream.z();
            V(z4);
            int d2 = codedInputStream.d() + z4;
            do {
                doubleArrayList.b(codedInputStream.l());
            } while (codedInputStream.d() < d2);
            return;
        }
        do {
            doubleArrayList.b(codedInputStream.l());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long M() {
        T(0);
        return this.f19157a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String N() {
        T(2);
        return this.f19157a.x();
    }

    public final Object O(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(M());
            case 3:
                return Long.valueOf(v());
            case 4:
                return Integer.valueOf(q());
            case 5:
                return Long.valueOf(b());
            case 6:
                return Integer.valueOf(x());
            case 7:
                return Boolean.valueOf(e());
            case 8:
                return N();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                T(2);
                return Q(Protobuf.f19325c.a(cls), extensionRegistryLite);
            case 11:
                return p();
            case 12:
                return Integer.valueOf(h());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Integer.valueOf(J());
            case 15:
                return Long.valueOf(f());
            case 16:
                return Integer.valueOf(m());
            case 17:
                return Long.valueOf(C());
        }
    }

    public final Object P(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i2 = this.f19159c;
        this.f19159c = ((this.f19158b >>> 3) << 3) | 4;
        try {
            Object f2 = schema.f();
            schema.b(f2, this, extensionRegistryLite);
            schema.c(f2);
            if (this.f19158b == this.f19159c) {
                return f2;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f19159c = i2;
        }
    }

    public final Object Q(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream codedInputStream = this.f19157a;
        int z2 = codedInputStream.z();
        if (codedInputStream.f19133a >= codedInputStream.f19134b) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int i2 = codedInputStream.i(z2);
        Object f2 = schema.f();
        codedInputStream.f19133a++;
        schema.b(f2, this, extensionRegistryLite);
        schema.c(f2);
        codedInputStream.a(0);
        codedInputStream.f19133a--;
        codedInputStream.h(i2);
        return f2;
    }

    public final void R(List list, boolean z2) {
        int y2;
        int y3;
        if ((this.f19158b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z3 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z3 || z2) {
            do {
                list.add(z2 ? N() : D());
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.D(p());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    public final void S(int i2) {
        if (this.f19157a.d() != i2) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void T(int i2) {
        if ((this.f19158b & 7) != i2) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object a(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        T(2);
        return Q(schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long b() {
        T(1);
        return this.f19157a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void c(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 == 2) {
                int z3 = codedInputStream.z();
                U(z3);
                int d = codedInputStream.d() + z3;
                do {
                    list.add(Integer.valueOf(codedInputStream.s()));
                } while (codedInputStream.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.s()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 == 2) {
            int z4 = codedInputStream.z();
            U(z4);
            int d2 = codedInputStream.d() + z4;
            do {
                intArrayList.b(codedInputStream.s());
            } while (codedInputStream.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            intArrayList.b(codedInputStream.s());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void d(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int d = codedInputStream.d() + codedInputStream.z();
                do {
                    list.add(Long.valueOf(codedInputStream.v()));
                } while (codedInputStream.d() < d);
                S(d);
                return;
            }
            do {
                list.add(Long.valueOf(codedInputStream.v()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 0) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d2 = codedInputStream.d() + codedInputStream.z();
            do {
                longArrayList.b(codedInputStream.v());
            } while (codedInputStream.d() < d2);
            S(d2);
            return;
        }
        do {
            longArrayList.b(codedInputStream.v());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean e() {
        T(0);
        return this.f19157a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long f() {
        T(1);
        return this.f19157a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void g(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int d = codedInputStream.d() + codedInputStream.z();
                do {
                    list.add(Long.valueOf(codedInputStream.A()));
                } while (codedInputStream.d() < d);
                S(d);
                return;
            }
            do {
                list.add(Long.valueOf(codedInputStream.A()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 0) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d2 = codedInputStream.d() + codedInputStream.z();
            do {
                longArrayList.b(codedInputStream.A());
            } while (codedInputStream.d() < d2);
            S(d2);
            return;
        }
        do {
            longArrayList.b(codedInputStream.A());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int h() {
        T(0);
        return this.f19157a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void i(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int d = codedInputStream.d() + codedInputStream.z();
                do {
                    list.add(Long.valueOf(codedInputStream.r()));
                } while (codedInputStream.d() < d);
                S(d);
                return;
            }
            do {
                list.add(Long.valueOf(codedInputStream.r()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 0) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d2 = codedInputStream.d() + codedInputStream.z();
            do {
                longArrayList.b(codedInputStream.r());
            } while (codedInputStream.d() < d2);
            S(d2);
            return;
        }
        do {
            longArrayList.b(codedInputStream.r());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void j(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int d = codedInputStream.d() + codedInputStream.z();
                do {
                    list.add(Integer.valueOf(codedInputStream.m()));
                } while (codedInputStream.d() < d);
                S(d);
                return;
            }
            do {
                list.add(Integer.valueOf(codedInputStream.m()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 0) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d2 = codedInputStream.d() + codedInputStream.z();
            do {
                intArrayList.b(codedInputStream.m());
            } while (codedInputStream.d() < d2);
            S(d2);
            return;
        }
        do {
            intArrayList.b(codedInputStream.m());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int k() {
        T(0);
        return this.f19157a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int l() {
        return this.f19158b;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int m() {
        T(0);
        return this.f19157a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void n(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof BooleanArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int d = codedInputStream.d() + codedInputStream.z();
                do {
                    list.add(Boolean.valueOf(codedInputStream.j()));
                } while (codedInputStream.d() < d);
                S(d);
                return;
            }
            do {
                list.add(Boolean.valueOf(codedInputStream.j()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 0) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d2 = codedInputStream.d() + codedInputStream.z();
            do {
                booleanArrayList.b(codedInputStream.j());
            } while (codedInputStream.d() < d2);
            S(d2);
            return;
        }
        do {
            booleanArrayList.b(codedInputStream.j());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void o(List list) {
        R(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final ByteString p() {
        T(2);
        return this.f19157a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int q() {
        T(0);
        return this.f19157a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void r(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int y2;
        int i2 = this.f19158b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Q(schema, extensionRegistryLite));
            CodedInputStream codedInputStream = this.f19157a;
            if (codedInputStream.e() || this.d != 0) {
                return;
            } else {
                y2 = codedInputStream.y();
            }
        } while (y2 == i2);
        this.d = y2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final double readDouble() {
        T(1);
        return this.f19157a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final float readFloat() {
        T(5);
        return this.f19157a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void s(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int z3 = codedInputStream.z();
                V(z3);
                int d = codedInputStream.d() + z3;
                do {
                    list.add(Long.valueOf(codedInputStream.o()));
                } while (codedInputStream.d() < d);
                return;
            }
            do {
                list.add(Long.valueOf(codedInputStream.o()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 1) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int z4 = codedInputStream.z();
            V(z4);
            int d2 = codedInputStream.d() + z4;
            do {
                longArrayList.b(codedInputStream.o());
            } while (codedInputStream.d() < d2);
            return;
        }
        do {
            longArrayList.b(codedInputStream.o());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object t(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        T(3);
        return P(schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void u(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int d = codedInputStream.d() + codedInputStream.z();
                do {
                    list.add(Integer.valueOf(codedInputStream.u()));
                } while (codedInputStream.d() < d);
                S(d);
                return;
            }
            do {
                list.add(Integer.valueOf(codedInputStream.u()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 0) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d2 = codedInputStream.d() + codedInputStream.z();
            do {
                intArrayList.b(codedInputStream.u());
            } while (codedInputStream.d() < d2);
            S(d2);
            return;
        }
        do {
            intArrayList.b(codedInputStream.u());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long v() {
        T(0);
        return this.f19157a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void w(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int d = codedInputStream.d() + codedInputStream.z();
                do {
                    list.add(Integer.valueOf(codedInputStream.z()));
                } while (codedInputStream.d() < d);
                S(d);
                return;
            }
            do {
                list.add(Integer.valueOf(codedInputStream.z()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 0) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d2 = codedInputStream.d() + codedInputStream.z();
            do {
                intArrayList.b(codedInputStream.z());
            } while (codedInputStream.d() < d2);
            S(d2);
            return;
        }
        do {
            intArrayList.b(codedInputStream.z());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int x() {
        T(5);
        return this.f19157a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void y(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int z3 = codedInputStream.z();
                V(z3);
                int d = codedInputStream.d() + z3;
                do {
                    list.add(Long.valueOf(codedInputStream.t()));
                } while (codedInputStream.d() < d);
                return;
            }
            do {
                list.add(Long.valueOf(codedInputStream.t()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 1) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int z4 = codedInputStream.z();
            V(z4);
            int d2 = codedInputStream.d() + z4;
            do {
                longArrayList.b(codedInputStream.t());
            } while (codedInputStream.d() < d2);
            return;
        }
        do {
            longArrayList.b(codedInputStream.t());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void z(List list) {
        int y2;
        int y3;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f19157a;
        if (!z2) {
            int i2 = this.f19158b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int d = codedInputStream.d() + codedInputStream.z();
                do {
                    list.add(Integer.valueOf(codedInputStream.q()));
                } while (codedInputStream.d() < d);
                S(d);
                return;
            }
            do {
                list.add(Integer.valueOf(codedInputStream.q()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    y2 = codedInputStream.y();
                }
            } while (y2 == this.f19158b);
            this.d = y2;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f19158b & 7;
        if (i3 != 0) {
            if (i3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d2 = codedInputStream.d() + codedInputStream.z();
            do {
                intArrayList.b(codedInputStream.q());
            } while (codedInputStream.d() < d2);
            S(d2);
            return;
        }
        do {
            intArrayList.b(codedInputStream.q());
            if (codedInputStream.e()) {
                return;
            } else {
                y3 = codedInputStream.y();
            }
        } while (y3 == this.f19158b);
        this.d = y3;
    }
}
