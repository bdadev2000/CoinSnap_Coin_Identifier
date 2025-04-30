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
/* loaded from: classes3.dex */
public class S5 {
    private static final /* synthetic */ S5[] $VALUES;
    public static final S5 BOOL;
    public static final S5 BYTES;
    public static final S5 ENUM;
    public static final S5 FIXED32;
    public static final S5 FIXED64;
    public static final S5 GROUP;
    public static final S5 INT32;
    public static final S5 INT64;
    public static final S5 MESSAGE;
    public static final S5 SFIXED32;
    public static final S5 SFIXED64;
    public static final S5 SINT32;
    public static final S5 SINT64;
    public static final S5 STRING;
    public static final S5 UINT32;
    public static final S5 UINT64;
    private final T5 javaType;
    private final int wireType;
    public static final S5 DOUBLE = new S5("DOUBLE", 0, T5.DOUBLE, 1);
    public static final S5 FLOAT = new S5("FLOAT", 1, T5.FLOAT, 5);

    private static /* synthetic */ S5[] $values() {
        return new S5[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
    }

    static {
        T5 t52 = T5.LONG;
        final int i9 = 2;
        INT64 = new S5("INT64", 2, t52, 0);
        final int i10 = 3;
        UINT64 = new S5("UINT64", 3, t52, 0);
        T5 t53 = T5.INT;
        INT32 = new S5("INT32", 4, t53, 0);
        FIXED64 = new S5("FIXED64", 5, t52, 1);
        FIXED32 = new S5("FIXED32", 6, t53, 5);
        BOOL = new S5("BOOL", 7, T5.BOOLEAN, 0);
        final int i11 = 8;
        final T5 t54 = T5.STRING;
        final String str = "STRING";
        STRING = new S5(str, i11, t54, i9) { // from class: com.google.protobuf.O5
            {
                N5 n52 = null;
            }

            @Override // com.google.protobuf.S5
            public boolean isPackable() {
                return false;
            }
        };
        final T5 t55 = T5.MESSAGE;
        final String str2 = "GROUP";
        final int i12 = 9;
        GROUP = new S5(str2, i12, t55, i10) { // from class: com.google.protobuf.P5
            {
                N5 n52 = null;
            }

            @Override // com.google.protobuf.S5
            public boolean isPackable() {
                return false;
            }
        };
        final String str3 = "MESSAGE";
        final int i13 = 10;
        MESSAGE = new S5(str3, i13, t55, i9) { // from class: com.google.protobuf.Q5
            {
                N5 n52 = null;
            }

            @Override // com.google.protobuf.S5
            public boolean isPackable() {
                return false;
            }
        };
        final int i14 = 11;
        final T5 t56 = T5.BYTE_STRING;
        final String str4 = "BYTES";
        BYTES = new S5(str4, i14, t56, i9) { // from class: com.google.protobuf.R5
            {
                N5 n52 = null;
            }

            @Override // com.google.protobuf.S5
            public boolean isPackable() {
                return false;
            }
        };
        UINT32 = new S5("UINT32", 12, t53, 0);
        ENUM = new S5("ENUM", 13, T5.ENUM, 0);
        SFIXED32 = new S5("SFIXED32", 14, t53, 5);
        SFIXED64 = new S5("SFIXED64", 15, t52, 1);
        SINT32 = new S5("SINT32", 16, t53, 0);
        SINT64 = new S5("SINT64", 17, t52, 0);
        $VALUES = $values();
    }

    public /* synthetic */ S5(String str, int i9, T5 t52, int i10, N5 n52) {
        this(str, i9, t52, i10);
    }

    public static S5 valueOf(String str) {
        return (S5) java.lang.Enum.valueOf(S5.class, str);
    }

    public static S5[] values() {
        return (S5[]) $VALUES.clone();
    }

    public T5 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private S5(String str, int i9, T5 t52, int i10) {
        this.javaType = t52;
        this.wireType = i10;
    }
}
