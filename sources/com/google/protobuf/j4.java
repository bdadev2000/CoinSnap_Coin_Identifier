package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
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
public final class j4 {
    private static final /* synthetic */ j4[] $VALUES;
    public static final j4 BOOLEAN;
    public static final j4 BYTE_STRING;
    public static final j4 DOUBLE;
    public static final j4 ENUM;
    public static final j4 FLOAT;
    public static final j4 INT;
    public static final j4 LONG;
    public static final j4 MESSAGE;
    public static final j4 STRING;
    public static final j4 VOID = new j4("VOID", 0, Void.class, Void.class, null);
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    private static /* synthetic */ j4[] $values() {
        return new j4[]{VOID, INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }

    static {
        Class cls = Integer.TYPE;
        INT = new j4("INT", 1, cls, Integer.class, 0);
        LONG = new j4("LONG", 2, Long.TYPE, Long.class, 0L);
        FLOAT = new j4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        DOUBLE = new j4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        BOOLEAN = new j4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        STRING = new j4("STRING", 6, String.class, String.class, "");
        BYTE_STRING = new j4("BYTE_STRING", 7, h0.class, h0.class, h0.EMPTY);
        ENUM = new j4("ENUM", 8, cls, Integer.class, null);
        MESSAGE = new j4("MESSAGE", 9, Object.class, Object.class, null);
        $VALUES = $values();
    }

    private j4(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static j4 valueOf(String str) {
        return (j4) java.lang.Enum.valueOf(j4.class, str);
    }

    public static j4[] values() {
        return (j4[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
