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
/* renamed from: com.google.protobuf.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1926i3 {
    private static final /* synthetic */ EnumC1926i3[] $VALUES;
    public static final EnumC1926i3 BOOLEAN;
    public static final EnumC1926i3 BYTE_STRING;
    public static final EnumC1926i3 DOUBLE;
    public static final EnumC1926i3 ENUM;
    public static final EnumC1926i3 FLOAT;
    public static final EnumC1926i3 INT;
    public static final EnumC1926i3 LONG;
    public static final EnumC1926i3 MESSAGE;
    public static final EnumC1926i3 STRING;
    public static final EnumC1926i3 VOID = new EnumC1926i3("VOID", 0, Void.class, Void.class, null);
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    private static /* synthetic */ EnumC1926i3[] $values() {
        return new EnumC1926i3[]{VOID, INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }

    static {
        Class cls = Integer.TYPE;
        INT = new EnumC1926i3("INT", 1, cls, Integer.class, 0);
        LONG = new EnumC1926i3("LONG", 2, Long.TYPE, Long.class, 0L);
        FLOAT = new EnumC1926i3("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        DOUBLE = new EnumC1926i3("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        BOOLEAN = new EnumC1926i3("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        STRING = new EnumC1926i3("STRING", 6, String.class, String.class, "");
        BYTE_STRING = new EnumC1926i3("BYTE_STRING", 7, H.class, H.class, H.EMPTY);
        ENUM = new EnumC1926i3("ENUM", 8, cls, Integer.class, null);
        MESSAGE = new EnumC1926i3("MESSAGE", 9, Object.class, Object.class, null);
        $VALUES = $values();
    }

    private EnumC1926i3(String str, int i9, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static EnumC1926i3 valueOf(String str) {
        return (EnumC1926i3) java.lang.Enum.valueOf(EnumC1926i3.class, str);
    }

    public static EnumC1926i3[] values() {
        return (EnumC1926i3[]) $VALUES.clone();
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
