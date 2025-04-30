package com.google.protobuf;

import java.io.IOException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOOSE' uses external variables
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
public abstract class X5 {
    private static final /* synthetic */ X5[] $VALUES = $values();
    public static final X5 LAZY;
    public static final X5 LOOSE;
    public static final X5 STRICT;

    private static /* synthetic */ X5[] $values() {
        return new X5[]{LOOSE, STRICT, LAZY};
    }

    static {
        final String str = "LOOSE";
        final int i9 = 0;
        LOOSE = new X5(str, i9) { // from class: com.google.protobuf.U5
            {
                N5 n52 = null;
            }

            @Override // com.google.protobuf.X5
            public Object readString(S s5) throws IOException {
                return s5.readString();
            }
        };
        final String str2 = "STRICT";
        final int i10 = 1;
        STRICT = new X5(str2, i10) { // from class: com.google.protobuf.V5
            {
                N5 n52 = null;
            }

            @Override // com.google.protobuf.X5
            public Object readString(S s5) throws IOException {
                return s5.readStringRequireUtf8();
            }
        };
        final String str3 = "LAZY";
        final int i11 = 2;
        LAZY = new X5(str3, i11) { // from class: com.google.protobuf.W5
            {
                N5 n52 = null;
            }

            @Override // com.google.protobuf.X5
            public Object readString(S s5) throws IOException {
                return s5.readBytes();
            }
        };
    }

    private X5(String str, int i9) {
    }

    public static X5 valueOf(String str) {
        return (X5) java.lang.Enum.valueOf(X5.class, str);
    }

    public static X5[] values() {
        return (X5[]) $VALUES.clone();
    }

    public abstract Object readString(S s5) throws IOException;

    public /* synthetic */ X5(String str, int i9, N5 n52) {
        this(str, i9);
    }
}
