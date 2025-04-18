package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public class t9 {
    private static final /* synthetic */ t9[] $VALUES;
    public static final t9 BOOL;
    public static final t9 BYTES;
    public static final t9 ENUM;
    public static final t9 FIXED32;
    public static final t9 FIXED64;
    public static final t9 GROUP;
    public static final t9 INT32;
    public static final t9 INT64;
    public static final t9 MESSAGE;
    public static final t9 SFIXED32;
    public static final t9 SFIXED64;
    public static final t9 SINT32;
    public static final t9 SINT64;
    public static final t9 STRING;
    public static final t9 UINT32;
    public static final t9 UINT64;
    private final u9 javaType;
    private final int wireType;
    public static final t9 DOUBLE = new t9("DOUBLE", 0, u9.DOUBLE, 1);
    public static final t9 FLOAT = new t9("FLOAT", 1, u9.FLOAT, 5);

    private static /* synthetic */ t9[] $values() {
        return new t9[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
    }

    static {
        u9 u9Var = u9.LONG;
        final int i10 = 2;
        INT64 = new t9("INT64", 2, u9Var, 0);
        final int i11 = 3;
        UINT64 = new t9("UINT64", 3, u9Var, 0);
        u9 u9Var2 = u9.INT;
        INT32 = new t9("INT32", 4, u9Var2, 0);
        FIXED64 = new t9("FIXED64", 5, u9Var, 1);
        FIXED32 = new t9("FIXED32", 6, u9Var2, 5);
        BOOL = new t9("BOOL", 7, u9.BOOLEAN, 0);
        final int i12 = 8;
        final u9 u9Var3 = u9.STRING;
        final String str = "STRING";
        STRING = new t9(str, i12, u9Var3, i10) { // from class: com.google.protobuf.p9
            {
                o9 o9Var = null;
            }

            @Override // com.google.protobuf.t9
            public boolean isPackable() {
                return false;
            }
        };
        final u9 u9Var4 = u9.MESSAGE;
        final String str2 = "GROUP";
        final int i13 = 9;
        GROUP = new t9(str2, i13, u9Var4, i11) { // from class: com.google.protobuf.q9
            {
                o9 o9Var = null;
            }

            @Override // com.google.protobuf.t9
            public boolean isPackable() {
                return false;
            }
        };
        final String str3 = "MESSAGE";
        final int i14 = 10;
        MESSAGE = new t9(str3, i14, u9Var4, i10) { // from class: com.google.protobuf.r9
            {
                o9 o9Var = null;
            }

            @Override // com.google.protobuf.t9
            public boolean isPackable() {
                return false;
            }
        };
        final int i15 = 11;
        final u9 u9Var5 = u9.BYTE_STRING;
        final String str4 = "BYTES";
        BYTES = new t9(str4, i15, u9Var5, i10) { // from class: com.google.protobuf.s9
            {
                o9 o9Var = null;
            }

            @Override // com.google.protobuf.t9
            public boolean isPackable() {
                return false;
            }
        };
        UINT32 = new t9("UINT32", 12, u9Var2, 0);
        ENUM = new t9("ENUM", 13, u9.ENUM, 0);
        SFIXED32 = new t9("SFIXED32", 14, u9Var2, 5);
        SFIXED64 = new t9("SFIXED64", 15, u9Var, 1);
        SINT32 = new t9("SINT32", 16, u9Var2, 0);
        SINT64 = new t9("SINT64", 17, u9Var, 0);
        $VALUES = $values();
    }

    public /* synthetic */ t9(String str, int i10, u9 u9Var, int i11, o9 o9Var) {
        this(str, i10, u9Var, i11);
    }

    public static t9 valueOf(String str) {
        return (t9) java.lang.Enum.valueOf(t9.class, str);
    }

    public static t9[] values() {
        return (t9[]) $VALUES.clone();
    }

    public u9 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private t9(String str, int i10, u9 u9Var, int i11) {
        this.javaType = u9Var;
        this.wireType = i11;
    }
}
