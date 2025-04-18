package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static final y f1481c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f1482d;

    /* renamed from: f, reason: collision with root package name */
    public static final y[] f1483f;

    /* renamed from: g, reason: collision with root package name */
    public static final Type[] f1484g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ y[] f1485h;

    /* renamed from: b, reason: collision with root package name */
    public final int f1486b;

    /* JADX INFO: Fake field, exist only in values array */
    y EF6;

    static {
        k0 k0Var = k0.DOUBLE;
        y yVar = new y("DOUBLE", 0, 0, 1, k0Var);
        k0 k0Var2 = k0.FLOAT;
        y yVar2 = new y("FLOAT", 1, 1, 1, k0Var2);
        k0 k0Var3 = k0.LONG;
        y yVar3 = new y("INT64", 2, 2, 1, k0Var3);
        y yVar4 = new y("UINT64", 3, 3, 1, k0Var3);
        k0 k0Var4 = k0.INT;
        y yVar5 = new y("INT32", 4, 4, 1, k0Var4);
        y yVar6 = new y("FIXED64", 5, 5, 1, k0Var3);
        y yVar7 = new y("FIXED32", 6, 6, 1, k0Var4);
        k0 k0Var5 = k0.BOOLEAN;
        y yVar8 = new y("BOOL", 7, 7, 1, k0Var5);
        k0 k0Var6 = k0.STRING;
        y yVar9 = new y("STRING", 8, 8, 1, k0Var6);
        k0 k0Var7 = k0.MESSAGE;
        y yVar10 = new y("MESSAGE", 9, 9, 1, k0Var7);
        k0 k0Var8 = k0.BYTE_STRING;
        y yVar11 = new y("BYTES", 10, 10, 1, k0Var8);
        y yVar12 = new y("UINT32", 11, 11, 1, k0Var4);
        k0 k0Var9 = k0.ENUM;
        y yVar13 = new y("ENUM", 12, 12, 1, k0Var9);
        y yVar14 = new y("SFIXED32", 13, 13, 1, k0Var4);
        y yVar15 = new y("SFIXED64", 14, 14, 1, k0Var3);
        y yVar16 = new y("SINT32", 15, 15, 1, k0Var4);
        y yVar17 = new y("SINT64", 16, 16, 1, k0Var3);
        y yVar18 = new y("GROUP", 17, 17, 1, k0Var7);
        y yVar19 = new y("DOUBLE_LIST", 18, 18, 2, k0Var);
        y yVar20 = new y("FLOAT_LIST", 19, 19, 2, k0Var2);
        y yVar21 = new y("INT64_LIST", 20, 20, 2, k0Var3);
        y yVar22 = new y("UINT64_LIST", 21, 21, 2, k0Var3);
        y yVar23 = new y("INT32_LIST", 22, 22, 2, k0Var4);
        y yVar24 = new y("FIXED64_LIST", 23, 23, 2, k0Var3);
        y yVar25 = new y("FIXED32_LIST", 24, 24, 2, k0Var4);
        y yVar26 = new y("BOOL_LIST", 25, 25, 2, k0Var5);
        y yVar27 = new y("STRING_LIST", 26, 26, 2, k0Var6);
        y yVar28 = new y("MESSAGE_LIST", 27, 27, 2, k0Var7);
        y yVar29 = new y("BYTES_LIST", 28, 28, 2, k0Var8);
        y yVar30 = new y("UINT32_LIST", 29, 29, 2, k0Var4);
        y yVar31 = new y("ENUM_LIST", 30, 30, 2, k0Var9);
        y yVar32 = new y("SFIXED32_LIST", 31, 31, 2, k0Var4);
        y yVar33 = new y("SFIXED64_LIST", 32, 32, 2, k0Var3);
        y yVar34 = new y("SINT32_LIST", 33, 33, 2, k0Var4);
        y yVar35 = new y("SINT64_LIST", 34, 34, 2, k0Var3);
        y yVar36 = new y("DOUBLE_LIST_PACKED", 35, 35, 3, k0Var);
        f1481c = yVar36;
        y yVar37 = new y("FLOAT_LIST_PACKED", 36, 36, 3, k0Var2);
        y yVar38 = new y("INT64_LIST_PACKED", 37, 37, 3, k0Var3);
        y yVar39 = new y("UINT64_LIST_PACKED", 38, 38, 3, k0Var3);
        y yVar40 = new y("INT32_LIST_PACKED", 39, 39, 3, k0Var4);
        y yVar41 = new y("FIXED64_LIST_PACKED", 40, 40, 3, k0Var3);
        y yVar42 = new y("FIXED32_LIST_PACKED", 41, 41, 3, k0Var4);
        y yVar43 = new y("BOOL_LIST_PACKED", 42, 42, 3, k0Var5);
        y yVar44 = new y("UINT32_LIST_PACKED", 43, 43, 3, k0Var4);
        y yVar45 = new y("ENUM_LIST_PACKED", 44, 44, 3, k0Var9);
        y yVar46 = new y("SFIXED32_LIST_PACKED", 45, 45, 3, k0Var4);
        y yVar47 = new y("SFIXED64_LIST_PACKED", 46, 46, 3, k0Var3);
        y yVar48 = new y("SINT32_LIST_PACKED", 47, 47, 3, k0Var4);
        y yVar49 = new y("SINT64_LIST_PACKED", 48, 48, 3, k0Var3);
        f1482d = yVar49;
        f1485h = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10, yVar11, yVar12, yVar13, yVar14, yVar15, yVar16, yVar17, yVar18, yVar19, yVar20, yVar21, yVar22, yVar23, yVar24, yVar25, yVar26, yVar27, yVar28, yVar29, yVar30, yVar31, yVar32, yVar33, yVar34, yVar35, yVar36, yVar37, yVar38, yVar39, yVar40, yVar41, yVar42, yVar43, yVar44, yVar45, yVar46, yVar47, yVar48, yVar49, new y("GROUP_LIST", 49, 49, 2, k0Var7), new y("MAP", 50, 50, 4, k0.VOID)};
        f1484g = new Type[0];
        y[] values = values();
        f1483f = new y[values.length];
        for (y yVar50 : values) {
            f1483f[yVar50.f1486b] = yVar50;
        }
    }

    public y(String str, int i10, int i11, int i12, k0 k0Var) {
        this.f1486b = i11;
        if (i12 != 0) {
            int i13 = i12 - 1;
            if (i13 != 1) {
                if (i13 == 3) {
                    k0Var.getClass();
                }
            } else {
                k0Var.getClass();
            }
            if (i12 == 1) {
                k0Var.ordinal();
                return;
            }
            return;
        }
        throw null;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f1485h.clone();
    }

    public final int a() {
        return this.f1486b;
    }
}
