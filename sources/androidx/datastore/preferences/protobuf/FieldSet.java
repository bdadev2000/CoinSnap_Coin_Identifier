package androidx.datastore.preferences.protobuf;

import androidx.compose.foundation.text.input.a;
import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FieldSet<T extends FieldDescriptorLite<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final SmallSortedMap f19214a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19215b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19216c;

    /* renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19217a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19218b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f19218b = iArr;
            try {
                iArr[WireFormat.FieldType.f19401c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19218b[WireFormat.FieldType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19218b[WireFormat.FieldType.f19402f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19218b[WireFormat.FieldType.f19403g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19218b[WireFormat.FieldType.f19404h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19218b[WireFormat.FieldType.f19405i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19218b[WireFormat.FieldType.f19406j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19218b[WireFormat.FieldType.f19407k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19218b[WireFormat.FieldType.f19409m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19218b[WireFormat.FieldType.f19410n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19218b[WireFormat.FieldType.f19408l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19218b[WireFormat.FieldType.f19411o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19218b[WireFormat.FieldType.f19412p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19218b[WireFormat.FieldType.f19414r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19218b[WireFormat.FieldType.f19415s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19218b[WireFormat.FieldType.f19416t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19218b[WireFormat.FieldType.f19417u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19218b[WireFormat.FieldType.f19413q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f19217a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f19217a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f19217a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f19217a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f19217a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f19217a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f19217a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f19217a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f19217a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder<T extends FieldDescriptorLite<T>> {
    }

    /* loaded from: classes.dex */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        void I();

        void J();

        WireFormat.JavaType K();

        void L();

        GeneratedMessageLite.Builder d(MessageLite.Builder builder, MessageLite messageLite);

        void getNumber();
    }

    static {
        new FieldSet(0);
    }

    public FieldSet() {
        this.f19214a = new SmallSortedMap(16);
    }

    public static int b(WireFormat.FieldType fieldType, int i2, Object obj) {
        int k02 = CodedOutputStream.k0(i2);
        if (fieldType == WireFormat.FieldType.f19409m) {
            k02 *= 2;
        }
        return k02 + c(fieldType, obj);
    }

    public static int c(WireFormat.FieldType fieldType, Object obj) {
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f19161b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f19161b;
                return 4;
            case 2:
                return CodedOutputStream.o0(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.o0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.b0(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f19161b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f19161b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f19161b;
                return 1;
            case 8:
                if (!(obj instanceof ByteString)) {
                    return CodedOutputStream.j0((String) obj);
                }
                Logger logger6 = CodedOutputStream.f19161b;
                int size = ((ByteString) obj).size();
                return CodedOutputStream.m0(size) + size;
            case 9:
                Logger logger7 = CodedOutputStream.f19161b;
                return ((MessageLite) obj).c();
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.d0((LazyField) obj);
                }
                Logger logger8 = CodedOutputStream.f19161b;
                int c2 = ((MessageLite) obj).c();
                return CodedOutputStream.m0(c2) + c2;
            case 11:
                if (obj instanceof ByteString) {
                    Logger logger9 = CodedOutputStream.f19161b;
                    int size2 = ((ByteString) obj).size();
                    return CodedOutputStream.m0(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f19161b;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.m0(length) + length;
            case 12:
                return CodedOutputStream.m0(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.b0(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.b0(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = CodedOutputStream.f19161b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f19161b;
                return 8;
            case 16:
                return CodedOutputStream.m0(CodedOutputStream.p0(((Integer) obj).intValue()));
            case 17:
                return CodedOutputStream.o0(CodedOutputStream.q0(((Long) obj).longValue()));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        fieldDescriptorLite.J();
        fieldDescriptorLite.getNumber();
        fieldDescriptorLite.I();
        return b(null, 0, obj);
    }

    public static int f(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.K() != WireFormat.JavaType.MESSAGE) {
            return d(fieldDescriptorLite, value);
        }
        fieldDescriptorLite.I();
        fieldDescriptorLite.L();
        if (value instanceof LazyField) {
            ((FieldDescriptorLite) entry.getKey()).getNumber();
            return CodedOutputStream.d0((LazyField) value) + CodedOutputStream.k0(3) + CodedOutputStream.l0(2, 0) + (CodedOutputStream.k0(1) * 2);
        }
        ((FieldDescriptorLite) entry.getKey()).getNumber();
        int l02 = CodedOutputStream.l0(2, 0) + (CodedOutputStream.k0(1) * 2);
        int k02 = CodedOutputStream.k0(3);
        int c2 = ((MessageLite) value).c();
        return a.D(c2, c2, k02, l02);
    }

    public static boolean j(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.K() == WireFormat.JavaType.MESSAGE) {
            fieldDescriptorLite.I();
            Object value = entry.getValue();
            if (!(value instanceof MessageLite)) {
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((MessageLite) value).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(androidx.datastore.preferences.protobuf.WireFormat.FieldType r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = androidx.datastore.preferences.protobuf.Internal.f19251a
            r2.getClass()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = r1.f19419a
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L18;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3e
        Lf:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.MessageLite
            if (r1 != 0) goto L3d
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r1 == 0) goto L3e
            goto L3d
        L18:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L3d
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite
            if (r1 == 0) goto L3e
            goto L3d
        L21:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r1 != 0) goto L3d
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L3e
            goto L3d
        L2a:
            boolean r1 = r2 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r1 = r2 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r1 = r2 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r1 = r2 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r1 = r2 instanceof java.lang.Integer
        L3b:
            if (r1 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.FieldSet.o(androidx.datastore.preferences.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public static void p(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i2, Object obj) {
        if (fieldType == WireFormat.FieldType.f19409m) {
            codedOutputStream.E0(i2, 3);
            ((MessageLite) obj).g(codedOutputStream);
            codedOutputStream.E0(i2, 4);
            return;
        }
        codedOutputStream.E0(i2, fieldType.f19420b);
        switch (fieldType.ordinal()) {
            case 0:
                codedOutputStream.w0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                codedOutputStream.v0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                codedOutputStream.G0(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.G0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.x0(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.w0(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.v0(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.s0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof ByteString) {
                    codedOutputStream.u0((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.D0((String) obj);
                    return;
                }
            case 9:
                ((MessageLite) obj).g(codedOutputStream);
                return;
            case 10:
                codedOutputStream.A0((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.u0((ByteString) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.t0(bArr, bArr.length);
                    return;
                }
            case 12:
                codedOutputStream.F0(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.x0(((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.x0(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.v0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.w0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.F0(CodedOutputStream.p0(((Integer) obj).intValue()));
                return;
            case 17:
                codedOutputStream.G0(CodedOutputStream.q0(((Long) obj).longValue()));
                return;
            default:
                return;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FieldSet clone() {
        SmallSortedMap smallSortedMap;
        FieldSet fieldSet = new FieldSet();
        int i2 = 0;
        while (true) {
            smallSortedMap = this.f19214a;
            if (i2 >= smallSortedMap.f19351b.size()) {
                break;
            }
            Map.Entry d = smallSortedMap.d(i2);
            fieldSet.n((FieldDescriptorLite) d.getKey(), d.getValue());
            i2++;
        }
        for (Map.Entry entry : smallSortedMap.e()) {
            fieldSet.n((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSet.f19216c = this.f19216c;
        return fieldSet;
    }

    public final Object e(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f19214a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).a(null) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f19214a.equals(((FieldSet) obj).f19214a);
        }
        return false;
    }

    public final int g() {
        SmallSortedMap smallSortedMap;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            smallSortedMap = this.f19214a;
            if (i2 >= smallSortedMap.f19351b.size()) {
                break;
            }
            Map.Entry d = smallSortedMap.d(i2);
            i3 += d((FieldDescriptorLite) d.getKey(), d.getValue());
            i2++;
        }
        for (Map.Entry entry : smallSortedMap.e()) {
            i3 += d((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i3;
    }

    public final boolean h() {
        return this.f19214a.isEmpty();
    }

    public final int hashCode() {
        return this.f19214a.hashCode();
    }

    public final boolean i() {
        int i2 = 0;
        while (true) {
            SmallSortedMap smallSortedMap = this.f19214a;
            if (i2 >= smallSortedMap.f19351b.size()) {
                Iterator it = smallSortedMap.e().iterator();
                while (it.hasNext()) {
                    if (!j((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!j(smallSortedMap.d(i2))) {
                return false;
            }
            i2++;
        }
    }

    public final Iterator k() {
        boolean z2 = this.f19216c;
        SmallSortedMap smallSortedMap = this.f19214a;
        return z2 ? new LazyField.LazyIterator(smallSortedMap.entrySet().iterator()) : smallSortedMap.entrySet().iterator();
    }

    public final void l() {
        if (this.f19215b) {
            return;
        }
        this.f19214a.g();
        this.f19215b = true;
    }

    public final void m(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).a(null);
        }
        fieldDescriptorLite.I();
        WireFormat.JavaType K = fieldDescriptorLite.K();
        WireFormat.JavaType javaType = WireFormat.JavaType.MESSAGE;
        SmallSortedMap smallSortedMap = this.f19214a;
        if (K != javaType) {
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                value = bArr2;
            }
            smallSortedMap.put(fieldDescriptorLite, value);
            return;
        }
        Object e = e(fieldDescriptorLite);
        if (e != null) {
            smallSortedMap.put(fieldDescriptorLite, fieldDescriptorLite.d(((MessageLite) e).a(), (MessageLite) value).k());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        smallSortedMap.put(fieldDescriptorLite, value);
    }

    public final void n(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        fieldDescriptorLite.I();
        fieldDescriptorLite.J();
        o(null, obj);
        if (obj instanceof LazyField) {
            this.f19216c = true;
        }
        this.f19214a.put(fieldDescriptorLite, obj);
    }

    public FieldSet(int i2) {
        int i3 = SmallSortedMap.f19349i;
        this.f19214a = new SmallSortedMap(0);
        l();
        l();
    }
}
