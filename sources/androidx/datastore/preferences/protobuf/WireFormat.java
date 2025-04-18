package androidx.datastore.preferences.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class WireFormat {

    /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19400a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f19400a = iArr;
            try {
                iArr[FieldType.f19401c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19400a[FieldType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19400a[FieldType.f19402f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19400a[FieldType.f19403g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19400a[FieldType.f19404h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19400a[FieldType.f19405i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19400a[FieldType.f19406j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19400a[FieldType.f19407k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19400a[FieldType.f19411o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19400a[FieldType.f19412p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19400a[FieldType.f19414r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19400a[FieldType.f19415s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19400a[FieldType.f19416t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19400a[FieldType.f19417u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19400a[FieldType.f19408l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19400a[FieldType.f19409m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19400a[FieldType.f19410n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19400a[FieldType.f19413q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static class FieldType {

        /* renamed from: c, reason: collision with root package name */
        public static final FieldType f19401c;
        public static final FieldType d;

        /* renamed from: f, reason: collision with root package name */
        public static final FieldType f19402f;

        /* renamed from: g, reason: collision with root package name */
        public static final FieldType f19403g;

        /* renamed from: h, reason: collision with root package name */
        public static final FieldType f19404h;

        /* renamed from: i, reason: collision with root package name */
        public static final FieldType f19405i;

        /* renamed from: j, reason: collision with root package name */
        public static final FieldType f19406j;

        /* renamed from: k, reason: collision with root package name */
        public static final FieldType f19407k;

        /* renamed from: l, reason: collision with root package name */
        public static final FieldType f19408l;

        /* renamed from: m, reason: collision with root package name */
        public static final FieldType f19409m;

        /* renamed from: n, reason: collision with root package name */
        public static final FieldType f19410n;

        /* renamed from: o, reason: collision with root package name */
        public static final FieldType f19411o;

        /* renamed from: p, reason: collision with root package name */
        public static final FieldType f19412p;

        /* renamed from: q, reason: collision with root package name */
        public static final FieldType f19413q;

        /* renamed from: r, reason: collision with root package name */
        public static final FieldType f19414r;

        /* renamed from: s, reason: collision with root package name */
        public static final FieldType f19415s;

        /* renamed from: t, reason: collision with root package name */
        public static final FieldType f19416t;

        /* renamed from: u, reason: collision with root package name */
        public static final FieldType f19417u;

        /* renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ FieldType[] f19418v;

        /* renamed from: a, reason: collision with root package name */
        public final JavaType f19419a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19420b;

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public enum AnonymousClass1 extends FieldType {
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public enum AnonymousClass2 extends FieldType {
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public enum AnonymousClass3 extends FieldType {
        }

        /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$4, reason: invalid class name */
        /* loaded from: classes.dex */
        public enum AnonymousClass4 extends FieldType {
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f19401c = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            d = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f19402f = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f19403g = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f19404h = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f19405i = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f19406j = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            f19407k = fieldType8;
            FieldType fieldType9 = new FieldType("STRING", 8, JavaType.STRING, 2);
            f19408l = fieldType9;
            JavaType javaType3 = JavaType.MESSAGE;
            FieldType fieldType10 = new FieldType("GROUP", 9, javaType3, 3);
            f19409m = fieldType10;
            FieldType fieldType11 = new FieldType("MESSAGE", 10, javaType3, 2);
            f19410n = fieldType11;
            FieldType fieldType12 = new FieldType("BYTES", 11, JavaType.BYTE_STRING, 2);
            f19411o = fieldType12;
            FieldType fieldType13 = new FieldType("UINT32", 12, javaType2, 0);
            f19412p = fieldType13;
            FieldType fieldType14 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            f19413q = fieldType14;
            FieldType fieldType15 = new FieldType("SFIXED32", 14, javaType2, 5);
            f19414r = fieldType15;
            FieldType fieldType16 = new FieldType("SFIXED64", 15, javaType, 1);
            f19415s = fieldType16;
            FieldType fieldType17 = new FieldType("SINT32", 16, javaType2, 0);
            f19416t = fieldType17;
            FieldType fieldType18 = new FieldType("SINT64", 17, javaType, 0);
            f19417u = fieldType18;
            f19418v = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        public FieldType(String str, int i2, JavaType javaType, int i3) {
            this.f19419a = javaType;
            this.f19420b = i3;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) f19418v.clone();
        }
    }

    /* loaded from: classes.dex */
    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.f19122b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        public final Object f19430a;

        JavaType(Serializable serializable) {
            this.f19430a = serializable;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class Utf8Validation {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Utf8Validation[] f19431a = {new Utf8Validation() { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.1
        }, new Utf8Validation() { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.2
        }, new Utf8Validation() { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.3
        }};

        /* JADX INFO: Fake field, exist only in values array */
        Utf8Validation EF2;

        public static Utf8Validation valueOf(String str) {
            return (Utf8Validation) java.lang.Enum.valueOf(Utf8Validation.class, str);
        }

        public static Utf8Validation[] values() {
            return (Utf8Validation[]) f19431a.clone();
        }
    }
}
