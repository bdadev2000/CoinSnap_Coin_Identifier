package androidx.datastore.preferences.protobuf;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.UnsafeUtil;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MessageSchema<T> implements Schema<T> {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f19293r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f19294s = UnsafeUtil.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f19295a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f19296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19297c;
    public final int d;
    public final MessageLite e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19298f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19299g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19300h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19301i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f19302j;

    /* renamed from: k, reason: collision with root package name */
    public final int f19303k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19304l;

    /* renamed from: m, reason: collision with root package name */
    public final NewInstanceSchema f19305m;

    /* renamed from: n, reason: collision with root package name */
    public final ListFieldSchema f19306n;

    /* renamed from: o, reason: collision with root package name */
    public final UnknownFieldSchema f19307o;

    /* renamed from: p, reason: collision with root package name */
    public final ExtensionSchema f19308p;

    /* renamed from: q, reason: collision with root package name */
    public final MapFieldSchema f19309q;

    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19310a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f19310a = iArr;
            try {
                iArr[WireFormat.FieldType.f19407k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19310a[WireFormat.FieldType.f19411o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19310a[WireFormat.FieldType.f19401c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19310a[WireFormat.FieldType.f19406j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19310a[WireFormat.FieldType.f19414r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19310a[WireFormat.FieldType.f19405i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19310a[WireFormat.FieldType.f19415s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19310a[WireFormat.FieldType.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19310a[WireFormat.FieldType.f19413q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19310a[WireFormat.FieldType.f19404h.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19310a[WireFormat.FieldType.f19412p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19310a[WireFormat.FieldType.f19402f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19310a[WireFormat.FieldType.f19403g.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19310a[WireFormat.FieldType.f19410n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19310a[WireFormat.FieldType.f19416t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19310a[WireFormat.FieldType.f19417u.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19310a[WireFormat.FieldType.f19408l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, boolean z2, int[] iArr2, int i4, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.f19295a = iArr;
        this.f19296b = objArr;
        this.f19297c = i2;
        this.d = i3;
        this.f19299g = messageLite instanceof GeneratedMessageLite;
        this.f19300h = z2;
        this.f19298f = extensionSchema != null && extensionSchema.e(messageLite);
        this.f19301i = false;
        this.f19302j = iArr2;
        this.f19303k = i4;
        this.f19304l = i5;
        this.f19305m = newInstanceSchema;
        this.f19306n = listFieldSchema;
        this.f19307o = unknownFieldSchema;
        this.f19308p = extensionSchema;
        this.e = messageLite;
        this.f19309q = mapFieldSchema;
    }

    public static int A(long j2, Object obj) {
        return ((Integer) UnsafeUtil.d.m(j2, obj)).intValue();
    }

    public static long B(long j2, Object obj) {
        return ((Long) UnsafeUtil.d.m(j2, obj)).longValue();
    }

    public static java.lang.reflect.Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder v2 = d.v("Field ", str, " for ");
            v2.append(cls.getName());
            v2.append(" not found. Known fields are ");
            v2.append(Arrays.toString(declaredFields));
            throw new RuntimeException(v2.toString());
        }
    }

    public static int K(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static void O(int i2, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.f(i2, (String) obj);
        } else {
            writer.k(i2, (ByteString) obj);
        }
    }

    public static List s(long j2, Object obj) {
        return (List) UnsafeUtil.d.m(j2, obj);
    }

    public static MessageSchema x(MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return y((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.MessageSchema y(androidx.datastore.preferences.protobuf.RawMessageInfo r33, androidx.datastore.preferences.protobuf.NewInstanceSchema r34, androidx.datastore.preferences.protobuf.ListFieldSchema r35, androidx.datastore.preferences.protobuf.UnknownFieldSchema r36, androidx.datastore.preferences.protobuf.ExtensionSchema r37, androidx.datastore.preferences.protobuf.MapFieldSchema r38) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.y(androidx.datastore.preferences.protobuf.RawMessageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema):androidx.datastore.preferences.protobuf.MessageSchema");
    }

    public static long z(int i2) {
        return i2 & 1048575;
    }

    public final void C(Object obj, long j2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.H(this.f19306n.c(j2, obj), schema, extensionRegistryLite);
    }

    public final void D(Object obj, int i2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.r(this.f19306n.c(i2 & 1048575, obj), schema, extensionRegistryLite);
    }

    public final void E(Object obj, int i2, Reader reader) {
        if ((536870912 & i2) != 0) {
            UnsafeUtil.v(obj, i2 & 1048575, reader.N());
        } else if (this.f19299g) {
            UnsafeUtil.v(obj, i2 & 1048575, reader.D());
        } else {
            UnsafeUtil.v(obj, i2 & 1048575, reader.p());
        }
    }

    public final void F(Object obj, int i2, Reader reader) {
        boolean z2 = (536870912 & i2) != 0;
        ListFieldSchema listFieldSchema = this.f19306n;
        if (z2) {
            reader.o(listFieldSchema.c(i2 & 1048575, obj));
        } else {
            reader.F(listFieldSchema.c(i2 & 1048575, obj));
        }
    }

    public final void H(int i2, Object obj) {
        if (this.f19300h) {
            return;
        }
        int i3 = this.f19295a[i2 + 2];
        long j2 = i3 & 1048575;
        UnsafeUtil.t(UnsafeUtil.d.j(j2, obj) | (1 << (i3 >>> 20)), j2, obj);
    }

    public final void I(int i2, int i3, Object obj) {
        UnsafeUtil.t(i2, this.f19295a[i3 + 2] & 1048575, obj);
    }

    public final int J(int i2, int i3) {
        int[] iArr = this.f19295a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final int L(int i2) {
        return this.f19295a[i2 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.lang.Object r21, androidx.datastore.preferences.protobuf.Writer r22) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.M(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    public final void N(Writer writer, int i2, Object obj, int i3) {
        if (obj != null) {
            Object m2 = m(i3);
            MapFieldSchema mapFieldSchema = this.f19309q;
            writer.s(i2, mapFieldSchema.b(m2), mapFieldSchema.d(obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void a(Object obj, Object obj2) {
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f19295a;
            if (i2 >= iArr.length) {
                if (this.f19300h) {
                    return;
                }
                Class cls = SchemaUtil.f19346a;
                UnknownFieldSchema unknownFieldSchema = this.f19307o;
                unknownFieldSchema.o(obj, unknownFieldSchema.k(unknownFieldSchema.g(obj), unknownFieldSchema.g(obj2)));
                if (this.f19298f) {
                    SchemaUtil.B(this.f19308p, obj, obj2);
                    return;
                }
                return;
            }
            int L = L(i2);
            long j2 = 1048575 & L;
            int i3 = iArr[i2];
            switch (K(L)) {
                case 0:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.r(obj, j2, UnsafeUtil.d.h(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 1:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.s(obj, j2, UnsafeUtil.d.i(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 2:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.u(obj, j2, UnsafeUtil.d.l(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 3:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.u(obj, j2, UnsafeUtil.d.l(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 4:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.t(UnsafeUtil.d.j(j2, obj2), j2, obj);
                        H(i2, obj);
                        break;
                    }
                case 5:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.u(obj, j2, UnsafeUtil.d.l(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 6:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.t(UnsafeUtil.d.j(j2, obj2), j2, obj);
                        H(i2, obj);
                        break;
                    }
                case 7:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.m(obj, j2, UnsafeUtil.d.e(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 8:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.v(obj, j2, UnsafeUtil.d.m(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 9:
                    v(i2, obj, obj2);
                    break;
                case 10:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.v(obj, j2, UnsafeUtil.d.m(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 11:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.t(UnsafeUtil.d.j(j2, obj2), j2, obj);
                        H(i2, obj);
                        break;
                    }
                case 12:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.t(UnsafeUtil.d.j(j2, obj2), j2, obj);
                        H(i2, obj);
                        break;
                    }
                case 13:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.t(UnsafeUtil.d.j(j2, obj2), j2, obj);
                        H(i2, obj);
                        break;
                    }
                case 14:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.u(obj, j2, UnsafeUtil.d.l(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 15:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.t(UnsafeUtil.d.j(j2, obj2), j2, obj);
                        H(i2, obj);
                        break;
                    }
                case 16:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.u(obj, j2, UnsafeUtil.d.l(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 17:
                    v(i2, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f19306n.b(obj, j2, obj2);
                    break;
                case 50:
                    Class cls2 = SchemaUtil.f19346a;
                    UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                    UnsafeUtil.v(obj, j2, this.f19309q.a(memoryAccessor.m(j2, obj), memoryAccessor.m(j2, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case Opcodes.V15 /* 59 */:
                    if (!r(i3, i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.v(obj, j2, UnsafeUtil.d.m(j2, obj2));
                        I(i3, i2, obj);
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    w(i2, obj, obj2);
                    break;
                case Opcodes.V17 /* 61 */:
                case Opcodes.V18 /* 62 */:
                case 63:
                case 64:
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                case TypeReference.INSTANCEOF /* 67 */:
                    if (!r(i3, i2, obj2)) {
                        break;
                    } else {
                        UnsafeUtil.v(obj, j2, UnsafeUtil.d.m(j2, obj2));
                        I(i3, i2, obj);
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    w(i2, obj, obj2);
                    break;
            }
            i2 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void b(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        t(this.f19307o, this.f19308p, obj, reader, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void c(Object obj) {
        int[] iArr;
        int i2;
        int i3 = this.f19303k;
        while (true) {
            iArr = this.f19302j;
            i2 = this.f19304l;
            if (i3 >= i2) {
                break;
            }
            long L = L(iArr[i3]) & 1048575;
            Object m2 = UnsafeUtil.d.m(L, obj);
            if (m2 != null) {
                UnsafeUtil.v(obj, L, this.f19309q.e(m2));
            }
            i3++;
        }
        int length = iArr.length;
        while (i2 < length) {
            this.f19306n.a(iArr[i2], obj);
            i2++;
        }
        this.f19307o.j(obj);
        if (this.f19298f) {
            this.f19308p.f(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.d(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int e(Object obj) {
        return this.f19300h ? p(obj) : o(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final Object f() {
        return this.f19305m.a(this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0219, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.g(java.lang.Object):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:323:0x05dc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x057d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05df A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018b  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r18, androidx.datastore.preferences.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 3210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.h(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01eb A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.i(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        return q(i2, obj) == q(i2, obj2);
    }

    public final Object k(Object obj, int i2, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        Internal.EnumVerifier l2;
        int i3 = this.f19295a[i2];
        Object m2 = UnsafeUtil.d.m(L(i2) & 1048575, obj);
        if (m2 == null || (l2 = l(i2)) == null) {
            return obj2;
        }
        MapFieldSchema mapFieldSchema = this.f19309q;
        MapFieldLite c2 = mapFieldSchema.c(m2);
        MapEntryLite.Metadata b2 = mapFieldSchema.b(m(i2));
        Iterator it = c2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!l2.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = unknownFieldSchema.m();
                }
                ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(MapEntryLite.a(b2, entry.getKey(), entry.getValue()));
                CodedOutputStream codedOutputStream = codedBuilder.f19130a;
                try {
                    MapEntryLite.b(codedOutputStream, b2, entry.getKey(), entry.getValue());
                    CodedOutputStream.ArrayEncoder arrayEncoder = (CodedOutputStream.ArrayEncoder) codedOutputStream;
                    if (arrayEncoder.e - arrayEncoder.f19165f != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    unknownFieldSchema.d(obj2, i3, new ByteString.LiteralByteString(codedBuilder.f19131b));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier l(int i2) {
        return (Internal.EnumVerifier) this.f19296b[((i2 / 3) * 2) + 1];
    }

    public final Object m(int i2) {
        return this.f19296b[(i2 / 3) * 2];
    }

    public final Schema n(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f19296b;
        Schema schema = (Schema) objArr[i3];
        if (schema != null) {
            return schema;
        }
        Schema a2 = Protobuf.f19325c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a2;
        return a2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0056. Please report as an issue. */
    public final int o(Object obj) {
        int i2;
        int i3;
        int U;
        int T;
        int o2;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f19295a;
            if (i5 >= iArr.length) {
                UnknownFieldSchema unknownFieldSchema = this.f19307o;
                int h2 = i6 + unknownFieldSchema.h(unknownFieldSchema.g(obj));
                return this.f19298f ? h2 + this.f19308p.c(obj).g() : h2;
            }
            int L = L(i5);
            int i8 = iArr[i5];
            int K = K(L);
            boolean z2 = this.f19301i;
            Unsafe unsafe = f19294s;
            if (K <= 17) {
                i2 = iArr[i5 + 2];
                int i9 = i2 & 1048575;
                i3 = 1 << (i2 >>> 20);
                if (i9 != i4) {
                    i7 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
            } else {
                i2 = (!z2 || K < FieldType.f19221f.a() || K > FieldType.f19222g.a()) ? 0 : iArr[i5 + 2] & 1048575;
                i3 = 0;
            }
            long j2 = L & 1048575;
            switch (K) {
                case 0:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.U(i8);
                        i6 += U;
                        break;
                    }
                case 1:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.Y(i8);
                        i6 += U;
                        break;
                    }
                case 2:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.c0(i8, unsafe.getLong(obj, j2));
                        i6 += U;
                        break;
                    }
                case 3:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.n0(i8, unsafe.getLong(obj, j2));
                        i6 += U;
                        break;
                    }
                case 4:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.a0(i8, unsafe.getInt(obj, j2));
                        i6 += U;
                        break;
                    }
                case 5:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.X(i8);
                        i6 += U;
                        break;
                    }
                case 6:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.W(i8);
                        i6 += U;
                        break;
                    }
                case 7:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.S(i8);
                        i6 += U;
                        break;
                    }
                case 8:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j2);
                        T = object instanceof ByteString ? CodedOutputStream.T(i8, (ByteString) object) : CodedOutputStream.i0(i8, (String) object);
                        i6 = T + i6;
                        break;
                    }
                case 9:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        o2 = SchemaUtil.o(i8, n(i5), unsafe.getObject(obj, j2));
                        i6 += o2;
                        break;
                    }
                case 10:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.T(i8, (ByteString) unsafe.getObject(obj, j2));
                        i6 += U;
                        break;
                    }
                case 11:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.l0(i8, unsafe.getInt(obj, j2));
                        i6 += U;
                        break;
                    }
                case 12:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.V(i8, unsafe.getInt(obj, j2));
                        i6 += U;
                        break;
                    }
                case 13:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.e0(i8);
                        i6 += U;
                        break;
                    }
                case 14:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.f0(i8);
                        i6 += U;
                        break;
                    }
                case 15:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.g0(i8, unsafe.getInt(obj, j2));
                        i6 += U;
                        break;
                    }
                case 16:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.h0(i8, unsafe.getLong(obj, j2));
                        i6 += U;
                        break;
                    }
                case 17:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        U = CodedOutputStream.Z(i8, (MessageLite) unsafe.getObject(obj, j2), n(i5));
                        i6 += U;
                        break;
                    }
                case 18:
                    o2 = SchemaUtil.h(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 19:
                    o2 = SchemaUtil.f(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 20:
                    o2 = SchemaUtil.m(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 21:
                    o2 = SchemaUtil.x(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 22:
                    o2 = SchemaUtil.k(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 23:
                    o2 = SchemaUtil.h(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 24:
                    o2 = SchemaUtil.f(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 25:
                    o2 = SchemaUtil.a(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 26:
                    o2 = SchemaUtil.u(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 27:
                    o2 = SchemaUtil.p(i8, (List) unsafe.getObject(obj, j2), n(i5));
                    i6 += o2;
                    break;
                case 28:
                    o2 = SchemaUtil.c(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 29:
                    o2 = SchemaUtil.v(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 30:
                    o2 = SchemaUtil.d(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 31:
                    o2 = SchemaUtil.f(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 32:
                    o2 = SchemaUtil.h(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    o2 = SchemaUtil.q(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 34:
                    o2 = SchemaUtil.s(i8, (List) unsafe.getObject(obj, j2));
                    i6 += o2;
                    break;
                case 35:
                    int i10 = SchemaUtil.i((List) unsafe.getObject(obj, j2));
                    if (i10 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, i10);
                        }
                        i6 = a.D(i10, CodedOutputStream.k0(i8), i10, i6);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int g2 = SchemaUtil.g((List) unsafe.getObject(obj, j2));
                    if (g2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, g2);
                        }
                        i6 = a.D(g2, CodedOutputStream.k0(i8), g2, i6);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int n2 = SchemaUtil.n((List) unsafe.getObject(obj, j2));
                    if (n2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, n2);
                        }
                        i6 = a.D(n2, CodedOutputStream.k0(i8), n2, i6);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int y2 = SchemaUtil.y((List) unsafe.getObject(obj, j2));
                    if (y2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, y2);
                        }
                        i6 = a.D(y2, CodedOutputStream.k0(i8), y2, i6);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int l2 = SchemaUtil.l((List) unsafe.getObject(obj, j2));
                    if (l2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, l2);
                        }
                        i6 = a.D(l2, CodedOutputStream.k0(i8), l2, i6);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int i11 = SchemaUtil.i((List) unsafe.getObject(obj, j2));
                    if (i11 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, i11);
                        }
                        i6 = a.D(i11, CodedOutputStream.k0(i8), i11, i6);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int g3 = SchemaUtil.g((List) unsafe.getObject(obj, j2));
                    if (g3 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, g3);
                        }
                        i6 = a.D(g3, CodedOutputStream.k0(i8), g3, i6);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int b2 = SchemaUtil.b((List) unsafe.getObject(obj, j2));
                    if (b2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, b2);
                        }
                        i6 = a.D(b2, CodedOutputStream.k0(i8), b2, i6);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int w = SchemaUtil.w((List) unsafe.getObject(obj, j2));
                    if (w > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, w);
                        }
                        i6 = a.D(w, CodedOutputStream.k0(i8), w, i6);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int e = SchemaUtil.e((List) unsafe.getObject(obj, j2));
                    if (e > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, e);
                        }
                        i6 = a.D(e, CodedOutputStream.k0(i8), e, i6);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int g4 = SchemaUtil.g((List) unsafe.getObject(obj, j2));
                    if (g4 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, g4);
                        }
                        i6 = a.D(g4, CodedOutputStream.k0(i8), g4, i6);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int i12 = SchemaUtil.i((List) unsafe.getObject(obj, j2));
                    if (i12 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, i12);
                        }
                        i6 = a.D(i12, CodedOutputStream.k0(i8), i12, i6);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int r2 = SchemaUtil.r((List) unsafe.getObject(obj, j2));
                    if (r2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, r2);
                        }
                        i6 = a.D(r2, CodedOutputStream.k0(i8), r2, i6);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int t2 = SchemaUtil.t((List) unsafe.getObject(obj, j2));
                    if (t2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i2, t2);
                        }
                        i6 = a.D(t2, CodedOutputStream.k0(i8), t2, i6);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    o2 = SchemaUtil.j(i8, (List) unsafe.getObject(obj, j2), n(i5));
                    i6 += o2;
                    break;
                case 50:
                    o2 = this.f19309q.g(i8, unsafe.getObject(obj, j2), m(i5));
                    i6 += o2;
                    break;
                case 51:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.U(i8);
                        i6 += U;
                        break;
                    }
                case 52:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.Y(i8);
                        i6 += U;
                        break;
                    }
                case 53:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.c0(i8, B(j2, obj));
                        i6 += U;
                        break;
                    }
                case 54:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.n0(i8, B(j2, obj));
                        i6 += U;
                        break;
                    }
                case 55:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.a0(i8, A(j2, obj));
                        i6 += U;
                        break;
                    }
                case 56:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.X(i8);
                        i6 += U;
                        break;
                    }
                case 57:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.W(i8);
                        i6 += U;
                        break;
                    }
                case 58:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.S(i8);
                        i6 += U;
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j2);
                        T = object2 instanceof ByteString ? CodedOutputStream.T(i8, (ByteString) object2) : CodedOutputStream.i0(i8, (String) object2);
                        i6 = T + i6;
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        o2 = SchemaUtil.o(i8, n(i5), unsafe.getObject(obj, j2));
                        i6 += o2;
                        break;
                    }
                case Opcodes.V17 /* 61 */:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.T(i8, (ByteString) unsafe.getObject(obj, j2));
                        i6 += U;
                        break;
                    }
                case Opcodes.V18 /* 62 */:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.l0(i8, A(j2, obj));
                        i6 += U;
                        break;
                    }
                case 63:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.V(i8, A(j2, obj));
                        i6 += U;
                        break;
                    }
                case 64:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.e0(i8);
                        i6 += U;
                        break;
                    }
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.f0(i8);
                        i6 += U;
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.g0(i8, A(j2, obj));
                        i6 += U;
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.h0(i8, B(j2, obj));
                        i6 += U;
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (!r(i8, i5, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.Z(i8, (MessageLite) unsafe.getObject(obj, j2), n(i5));
                        i6 += U;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0032. Please report as an issue. */
    public final int p(Object obj) {
        int U;
        int T;
        int o2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f19295a;
            if (i2 >= iArr.length) {
                UnknownFieldSchema unknownFieldSchema = this.f19307o;
                return i3 + unknownFieldSchema.h(unknownFieldSchema.g(obj));
            }
            int L = L(i2);
            int K = K(L);
            int i4 = iArr[i2];
            long j2 = L & 1048575;
            int i5 = (K < FieldType.f19221f.a() || K > FieldType.f19222g.a()) ? 0 : iArr[i2 + 2] & 1048575;
            boolean z2 = this.f19301i;
            Unsafe unsafe = f19294s;
            switch (K) {
                case 0:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.U(i4);
                        i3 += U;
                        break;
                    }
                case 1:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.Y(i4);
                        i3 += U;
                        break;
                    }
                case 2:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.c0(i4, UnsafeUtil.j(j2, obj));
                        i3 += U;
                        break;
                    }
                case 3:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.n0(i4, UnsafeUtil.j(j2, obj));
                        i3 += U;
                        break;
                    }
                case 4:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.a0(i4, UnsafeUtil.i(j2, obj));
                        i3 += U;
                        break;
                    }
                case 5:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.X(i4);
                        i3 += U;
                        break;
                    }
                case 6:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.W(i4);
                        i3 += U;
                        break;
                    }
                case 7:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.S(i4);
                        i3 += U;
                        break;
                    }
                case 8:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        Object k2 = UnsafeUtil.k(j2, obj);
                        T = k2 instanceof ByteString ? CodedOutputStream.T(i4, (ByteString) k2) : CodedOutputStream.i0(i4, (String) k2);
                        i3 = T + i3;
                        break;
                    }
                case 9:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        o2 = SchemaUtil.o(i4, n(i2), UnsafeUtil.k(j2, obj));
                        i3 += o2;
                        break;
                    }
                case 10:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.T(i4, (ByteString) UnsafeUtil.k(j2, obj));
                        i3 += U;
                        break;
                    }
                case 11:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.l0(i4, UnsafeUtil.i(j2, obj));
                        i3 += U;
                        break;
                    }
                case 12:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.V(i4, UnsafeUtil.i(j2, obj));
                        i3 += U;
                        break;
                    }
                case 13:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.e0(i4);
                        i3 += U;
                        break;
                    }
                case 14:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.f0(i4);
                        i3 += U;
                        break;
                    }
                case 15:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.g0(i4, UnsafeUtil.i(j2, obj));
                        i3 += U;
                        break;
                    }
                case 16:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.h0(i4, UnsafeUtil.j(j2, obj));
                        i3 += U;
                        break;
                    }
                case 17:
                    if (!q(i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.Z(i4, (MessageLite) UnsafeUtil.k(j2, obj), n(i2));
                        i3 += U;
                        break;
                    }
                case 18:
                    o2 = SchemaUtil.h(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 19:
                    o2 = SchemaUtil.f(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 20:
                    o2 = SchemaUtil.m(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 21:
                    o2 = SchemaUtil.x(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 22:
                    o2 = SchemaUtil.k(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 23:
                    o2 = SchemaUtil.h(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 24:
                    o2 = SchemaUtil.f(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 25:
                    o2 = SchemaUtil.a(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 26:
                    o2 = SchemaUtil.u(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 27:
                    o2 = SchemaUtil.p(i4, s(j2, obj), n(i2));
                    i3 += o2;
                    break;
                case 28:
                    o2 = SchemaUtil.c(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 29:
                    o2 = SchemaUtil.v(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 30:
                    o2 = SchemaUtil.d(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 31:
                    o2 = SchemaUtil.f(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 32:
                    o2 = SchemaUtil.h(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    o2 = SchemaUtil.q(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 34:
                    o2 = SchemaUtil.s(i4, s(j2, obj));
                    i3 += o2;
                    break;
                case 35:
                    int i6 = SchemaUtil.i((List) unsafe.getObject(obj, j2));
                    if (i6 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, i6);
                        }
                        i3 = a.D(i6, CodedOutputStream.k0(i4), i6, i3);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int g2 = SchemaUtil.g((List) unsafe.getObject(obj, j2));
                    if (g2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, g2);
                        }
                        i3 = a.D(g2, CodedOutputStream.k0(i4), g2, i3);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int n2 = SchemaUtil.n((List) unsafe.getObject(obj, j2));
                    if (n2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, n2);
                        }
                        i3 = a.D(n2, CodedOutputStream.k0(i4), n2, i3);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int y2 = SchemaUtil.y((List) unsafe.getObject(obj, j2));
                    if (y2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, y2);
                        }
                        i3 = a.D(y2, CodedOutputStream.k0(i4), y2, i3);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int l2 = SchemaUtil.l((List) unsafe.getObject(obj, j2));
                    if (l2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, l2);
                        }
                        i3 = a.D(l2, CodedOutputStream.k0(i4), l2, i3);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int i7 = SchemaUtil.i((List) unsafe.getObject(obj, j2));
                    if (i7 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, i7);
                        }
                        i3 = a.D(i7, CodedOutputStream.k0(i4), i7, i3);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int g3 = SchemaUtil.g((List) unsafe.getObject(obj, j2));
                    if (g3 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, g3);
                        }
                        i3 = a.D(g3, CodedOutputStream.k0(i4), g3, i3);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int b2 = SchemaUtil.b((List) unsafe.getObject(obj, j2));
                    if (b2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, b2);
                        }
                        i3 = a.D(b2, CodedOutputStream.k0(i4), b2, i3);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int w = SchemaUtil.w((List) unsafe.getObject(obj, j2));
                    if (w > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, w);
                        }
                        i3 = a.D(w, CodedOutputStream.k0(i4), w, i3);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int e = SchemaUtil.e((List) unsafe.getObject(obj, j2));
                    if (e > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, e);
                        }
                        i3 = a.D(e, CodedOutputStream.k0(i4), e, i3);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int g4 = SchemaUtil.g((List) unsafe.getObject(obj, j2));
                    if (g4 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, g4);
                        }
                        i3 = a.D(g4, CodedOutputStream.k0(i4), g4, i3);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int i8 = SchemaUtil.i((List) unsafe.getObject(obj, j2));
                    if (i8 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, i8);
                        }
                        i3 = a.D(i8, CodedOutputStream.k0(i4), i8, i3);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int r2 = SchemaUtil.r((List) unsafe.getObject(obj, j2));
                    if (r2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, r2);
                        }
                        i3 = a.D(r2, CodedOutputStream.k0(i4), r2, i3);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int t2 = SchemaUtil.t((List) unsafe.getObject(obj, j2));
                    if (t2 > 0) {
                        if (z2) {
                            unsafe.putInt(obj, i5, t2);
                        }
                        i3 = a.D(t2, CodedOutputStream.k0(i4), t2, i3);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    o2 = SchemaUtil.j(i4, s(j2, obj), n(i2));
                    i3 += o2;
                    break;
                case 50:
                    o2 = this.f19309q.g(i4, UnsafeUtil.k(j2, obj), m(i2));
                    i3 += o2;
                    break;
                case 51:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.U(i4);
                        i3 += U;
                        break;
                    }
                case 52:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.Y(i4);
                        i3 += U;
                        break;
                    }
                case 53:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.c0(i4, B(j2, obj));
                        i3 += U;
                        break;
                    }
                case 54:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.n0(i4, B(j2, obj));
                        i3 += U;
                        break;
                    }
                case 55:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.a0(i4, A(j2, obj));
                        i3 += U;
                        break;
                    }
                case 56:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.X(i4);
                        i3 += U;
                        break;
                    }
                case 57:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.W(i4);
                        i3 += U;
                        break;
                    }
                case 58:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.S(i4);
                        i3 += U;
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        Object k3 = UnsafeUtil.k(j2, obj);
                        T = k3 instanceof ByteString ? CodedOutputStream.T(i4, (ByteString) k3) : CodedOutputStream.i0(i4, (String) k3);
                        i3 = T + i3;
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        o2 = SchemaUtil.o(i4, n(i2), UnsafeUtil.k(j2, obj));
                        i3 += o2;
                        break;
                    }
                case Opcodes.V17 /* 61 */:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.T(i4, (ByteString) UnsafeUtil.k(j2, obj));
                        i3 += U;
                        break;
                    }
                case Opcodes.V18 /* 62 */:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.l0(i4, A(j2, obj));
                        i3 += U;
                        break;
                    }
                case 63:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.V(i4, A(j2, obj));
                        i3 += U;
                        break;
                    }
                case 64:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.e0(i4);
                        i3 += U;
                        break;
                    }
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.f0(i4);
                        i3 += U;
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.g0(i4, A(j2, obj));
                        i3 += U;
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.h0(i4, B(j2, obj));
                        i3 += U;
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (!r(i4, i2, obj)) {
                        break;
                    } else {
                        U = CodedOutputStream.Z(i4, (MessageLite) UnsafeUtil.k(j2, obj), n(i2));
                        i3 += U;
                        break;
                    }
            }
            i2 += 3;
        }
    }

    public final boolean q(int i2, Object obj) {
        if (!this.f19300h) {
            int i3 = this.f19295a[i2 + 2];
            return (UnsafeUtil.d.j((long) (i3 & 1048575), obj) & (1 << (i3 >>> 20))) != 0;
        }
        int L = L(i2);
        long j2 = L & 1048575;
        switch (K(L)) {
            case 0:
                return UnsafeUtil.d.h(j2, obj) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            case 1:
                return UnsafeUtil.d.i(j2, obj) != 0.0f;
            case 2:
                return UnsafeUtil.d.l(j2, obj) != 0;
            case 3:
                return UnsafeUtil.d.l(j2, obj) != 0;
            case 4:
                return UnsafeUtil.d.j(j2, obj) != 0;
            case 5:
                return UnsafeUtil.d.l(j2, obj) != 0;
            case 6:
                return UnsafeUtil.d.j(j2, obj) != 0;
            case 7:
                return UnsafeUtil.d.e(j2, obj);
            case 8:
                Object m2 = UnsafeUtil.d.m(j2, obj);
                if (m2 instanceof String) {
                    return !((String) m2).isEmpty();
                }
                if (m2 instanceof ByteString) {
                    return !ByteString.f19122b.equals(m2);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.d.m(j2, obj) != null;
            case 10:
                return !ByteString.f19122b.equals(UnsafeUtil.d.m(j2, obj));
            case 11:
                return UnsafeUtil.d.j(j2, obj) != 0;
            case 12:
                return UnsafeUtil.d.j(j2, obj) != 0;
            case 13:
                return UnsafeUtil.d.j(j2, obj) != 0;
            case 14:
                return UnsafeUtil.d.l(j2, obj) != 0;
            case 15:
                return UnsafeUtil.d.j(j2, obj) != 0;
            case 16:
                return UnsafeUtil.d.l(j2, obj) != 0;
            case 17:
                return UnsafeUtil.d.m(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean r(int i2, int i3, Object obj) {
        return UnsafeUtil.d.j((long) (this.f19295a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0097. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0635 A[Catch: all -> 0x063b, TryCatch #5 {all -> 0x063b, blocks: (B:37:0x0630, B:39:0x0635, B:40:0x063d), top: B:36:0x0630 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0643 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0661 A[LOOP:3: B:55:0x065f->B:56:0x0661, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x066c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(androidx.datastore.preferences.protobuf.UnknownFieldSchema r21, androidx.datastore.preferences.protobuf.ExtensionSchema r22, java.lang.Object r23, androidx.datastore.preferences.protobuf.Reader r24, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r25) {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.t(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    public final void u(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long L = L(i2) & 1048575;
        Object m2 = UnsafeUtil.d.m(L, obj);
        MapFieldSchema mapFieldSchema = this.f19309q;
        if (m2 == null) {
            m2 = mapFieldSchema.f();
            UnsafeUtil.v(obj, L, m2);
        } else if (mapFieldSchema.h(m2)) {
            MapFieldLite f2 = mapFieldSchema.f();
            mapFieldSchema.a(f2, m2);
            UnsafeUtil.v(obj, L, f2);
            m2 = f2;
        }
        reader.A(mapFieldSchema.c(m2), mapFieldSchema.b(obj2), extensionRegistryLite);
    }

    public final void v(int i2, Object obj, Object obj2) {
        long L = L(i2) & 1048575;
        if (q(i2, obj2)) {
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            Object m2 = memoryAccessor.m(L, obj);
            Object m3 = memoryAccessor.m(L, obj2);
            if (m2 != null && m3 != null) {
                UnsafeUtil.v(obj, L, Internal.b(m2, m3));
                H(i2, obj);
            } else if (m3 != null) {
                UnsafeUtil.v(obj, L, m3);
                H(i2, obj);
            }
        }
    }

    public final void w(int i2, Object obj, Object obj2) {
        int L = L(i2);
        int i3 = this.f19295a[i2];
        long j2 = L & 1048575;
        if (r(i3, i2, obj2)) {
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            Object m2 = memoryAccessor.m(j2, obj);
            Object m3 = memoryAccessor.m(j2, obj2);
            if (m2 != null && m3 != null) {
                UnsafeUtil.v(obj, j2, Internal.b(m2, m3));
                I(i3, i2, obj);
            } else if (m3 != null) {
                UnsafeUtil.v(obj, j2, m3);
                I(i3, i2, obj);
            }
        }
    }
}
