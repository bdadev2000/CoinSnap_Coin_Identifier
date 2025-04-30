package androidx.datastore.preferences.protobuf;

import z.AbstractC2965e;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0442q {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0442q f4593c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0442q f4594d;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0442q[] f4595f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0442q[] f4596g;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0442q EF0;

    static {
        B b = B.DOUBLE;
        EnumC0442q enumC0442q = new EnumC0442q("DOUBLE", 0, 0, 1, b);
        B b8 = B.FLOAT;
        EnumC0442q enumC0442q2 = new EnumC0442q("FLOAT", 1, 1, 1, b8);
        B b9 = B.LONG;
        EnumC0442q enumC0442q3 = new EnumC0442q("INT64", 2, 2, 1, b9);
        EnumC0442q enumC0442q4 = new EnumC0442q("UINT64", 3, 3, 1, b9);
        B b10 = B.INT;
        EnumC0442q enumC0442q5 = new EnumC0442q("INT32", 4, 4, 1, b10);
        EnumC0442q enumC0442q6 = new EnumC0442q("FIXED64", 5, 5, 1, b9);
        EnumC0442q enumC0442q7 = new EnumC0442q("FIXED32", 6, 6, 1, b10);
        B b11 = B.BOOLEAN;
        EnumC0442q enumC0442q8 = new EnumC0442q("BOOL", 7, 7, 1, b11);
        B b12 = B.STRING;
        EnumC0442q enumC0442q9 = new EnumC0442q("STRING", 8, 8, 1, b12);
        B b13 = B.MESSAGE;
        EnumC0442q enumC0442q10 = new EnumC0442q("MESSAGE", 9, 9, 1, b13);
        B b14 = B.BYTE_STRING;
        EnumC0442q enumC0442q11 = new EnumC0442q("BYTES", 10, 10, 1, b14);
        EnumC0442q enumC0442q12 = new EnumC0442q("UINT32", 11, 11, 1, b10);
        B b15 = B.ENUM;
        EnumC0442q enumC0442q13 = new EnumC0442q("ENUM", 12, 12, 1, b15);
        EnumC0442q enumC0442q14 = new EnumC0442q("SFIXED32", 13, 13, 1, b10);
        EnumC0442q enumC0442q15 = new EnumC0442q("SFIXED64", 14, 14, 1, b9);
        EnumC0442q enumC0442q16 = new EnumC0442q("SINT32", 15, 15, 1, b10);
        EnumC0442q enumC0442q17 = new EnumC0442q("SINT64", 16, 16, 1, b9);
        EnumC0442q enumC0442q18 = new EnumC0442q("GROUP", 17, 17, 1, b13);
        EnumC0442q enumC0442q19 = new EnumC0442q("DOUBLE_LIST", 18, 18, 2, b);
        EnumC0442q enumC0442q20 = new EnumC0442q("FLOAT_LIST", 19, 19, 2, b8);
        EnumC0442q enumC0442q21 = new EnumC0442q("INT64_LIST", 20, 20, 2, b9);
        EnumC0442q enumC0442q22 = new EnumC0442q("UINT64_LIST", 21, 21, 2, b9);
        EnumC0442q enumC0442q23 = new EnumC0442q("INT32_LIST", 22, 22, 2, b10);
        EnumC0442q enumC0442q24 = new EnumC0442q("FIXED64_LIST", 23, 23, 2, b9);
        EnumC0442q enumC0442q25 = new EnumC0442q("FIXED32_LIST", 24, 24, 2, b10);
        EnumC0442q enumC0442q26 = new EnumC0442q("BOOL_LIST", 25, 25, 2, b11);
        EnumC0442q enumC0442q27 = new EnumC0442q("STRING_LIST", 26, 26, 2, b12);
        EnumC0442q enumC0442q28 = new EnumC0442q("MESSAGE_LIST", 27, 27, 2, b13);
        EnumC0442q enumC0442q29 = new EnumC0442q("BYTES_LIST", 28, 28, 2, b14);
        EnumC0442q enumC0442q30 = new EnumC0442q("UINT32_LIST", 29, 29, 2, b10);
        EnumC0442q enumC0442q31 = new EnumC0442q("ENUM_LIST", 30, 30, 2, b15);
        EnumC0442q enumC0442q32 = new EnumC0442q("SFIXED32_LIST", 31, 31, 2, b10);
        EnumC0442q enumC0442q33 = new EnumC0442q("SFIXED64_LIST", 32, 32, 2, b9);
        EnumC0442q enumC0442q34 = new EnumC0442q("SINT32_LIST", 33, 33, 2, b10);
        EnumC0442q enumC0442q35 = new EnumC0442q("SINT64_LIST", 34, 34, 2, b9);
        EnumC0442q enumC0442q36 = new EnumC0442q("DOUBLE_LIST_PACKED", 35, 35, 3, b);
        f4593c = enumC0442q36;
        EnumC0442q enumC0442q37 = new EnumC0442q("FLOAT_LIST_PACKED", 36, 36, 3, b8);
        EnumC0442q enumC0442q38 = new EnumC0442q("INT64_LIST_PACKED", 37, 37, 3, b9);
        EnumC0442q enumC0442q39 = new EnumC0442q("UINT64_LIST_PACKED", 38, 38, 3, b9);
        EnumC0442q enumC0442q40 = new EnumC0442q("INT32_LIST_PACKED", 39, 39, 3, b10);
        EnumC0442q enumC0442q41 = new EnumC0442q("FIXED64_LIST_PACKED", 40, 40, 3, b9);
        EnumC0442q enumC0442q42 = new EnumC0442q("FIXED32_LIST_PACKED", 41, 41, 3, b10);
        EnumC0442q enumC0442q43 = new EnumC0442q("BOOL_LIST_PACKED", 42, 42, 3, b11);
        EnumC0442q enumC0442q44 = new EnumC0442q("UINT32_LIST_PACKED", 43, 43, 3, b10);
        EnumC0442q enumC0442q45 = new EnumC0442q("ENUM_LIST_PACKED", 44, 44, 3, b15);
        EnumC0442q enumC0442q46 = new EnumC0442q("SFIXED32_LIST_PACKED", 45, 45, 3, b10);
        EnumC0442q enumC0442q47 = new EnumC0442q("SFIXED64_LIST_PACKED", 46, 46, 3, b9);
        EnumC0442q enumC0442q48 = new EnumC0442q("SINT32_LIST_PACKED", 47, 47, 3, b10);
        EnumC0442q enumC0442q49 = new EnumC0442q("SINT64_LIST_PACKED", 48, 48, 3, b9);
        f4594d = enumC0442q49;
        f4596g = new EnumC0442q[]{enumC0442q, enumC0442q2, enumC0442q3, enumC0442q4, enumC0442q5, enumC0442q6, enumC0442q7, enumC0442q8, enumC0442q9, enumC0442q10, enumC0442q11, enumC0442q12, enumC0442q13, enumC0442q14, enumC0442q15, enumC0442q16, enumC0442q17, enumC0442q18, enumC0442q19, enumC0442q20, enumC0442q21, enumC0442q22, enumC0442q23, enumC0442q24, enumC0442q25, enumC0442q26, enumC0442q27, enumC0442q28, enumC0442q29, enumC0442q30, enumC0442q31, enumC0442q32, enumC0442q33, enumC0442q34, enumC0442q35, enumC0442q36, enumC0442q37, enumC0442q38, enumC0442q39, enumC0442q40, enumC0442q41, enumC0442q42, enumC0442q43, enumC0442q44, enumC0442q45, enumC0442q46, enumC0442q47, enumC0442q48, enumC0442q49, new EnumC0442q("GROUP_LIST", 49, 49, 2, b13), new EnumC0442q("MAP", 50, 50, 4, B.VOID)};
        EnumC0442q[] values = values();
        f4595f = new EnumC0442q[values.length];
        for (EnumC0442q enumC0442q50 : values) {
            f4595f[enumC0442q50.b] = enumC0442q50;
        }
    }

    public EnumC0442q(String str, int i9, int i10, int i11, B b) {
        this.b = i10;
        int d2 = AbstractC2965e.d(i11);
        if (d2 != 1) {
            if (d2 == 3) {
                b.getClass();
            }
        } else {
            b.getClass();
        }
        if (i11 == 1) {
            b.ordinal();
        }
    }

    public static EnumC0442q valueOf(String str) {
        return (EnumC0442q) Enum.valueOf(EnumC0442q.class, str);
    }

    public static EnumC0442q[] values() {
        return (EnumC0442q[]) f4596g.clone();
    }

    public final int a() {
        return this.b;
    }
}
