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
/* loaded from: classes4.dex */
public abstract class y9 {
    private static final /* synthetic */ y9[] $VALUES = $values();
    public static final y9 LAZY;
    public static final y9 LOOSE;
    public static final y9 STRICT;

    private static /* synthetic */ y9[] $values() {
        return new y9[]{LOOSE, STRICT, LAZY};
    }

    static {
        final String str = "LOOSE";
        final int i10 = 0;
        LOOSE = new y9(str, i10) { // from class: com.google.protobuf.v9
            {
                o9 o9Var = null;
            }

            @Override // com.google.protobuf.y9
            public Object readString(r0 r0Var) throws IOException {
                return r0Var.readString();
            }
        };
        final String str2 = "STRICT";
        final int i11 = 1;
        STRICT = new y9(str2, i11) { // from class: com.google.protobuf.w9
            {
                o9 o9Var = null;
            }

            @Override // com.google.protobuf.y9
            public Object readString(r0 r0Var) throws IOException {
                return r0Var.readStringRequireUtf8();
            }
        };
        final String str3 = "LAZY";
        final int i12 = 2;
        LAZY = new y9(str3, i12) { // from class: com.google.protobuf.x9
            {
                o9 o9Var = null;
            }

            @Override // com.google.protobuf.y9
            public Object readString(r0 r0Var) throws IOException {
                return r0Var.readBytes();
            }
        };
    }

    private y9(String str, int i10) {
    }

    public static y9 valueOf(String str) {
        return (y9) java.lang.Enum.valueOf(y9.class, str);
    }

    public static y9[] values() {
        return (y9[]) $VALUES.clone();
    }

    public abstract Object readString(r0 r0Var) throws IOException;

    public /* synthetic */ y9(String str, int i10, o9 o9Var) {
        this(str, i10);
    }
}
