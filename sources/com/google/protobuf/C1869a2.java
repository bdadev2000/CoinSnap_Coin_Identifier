package com.google.protobuf;

/* renamed from: com.google.protobuf.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1869a2 {
    private static final X1 LITE_SCHEMA = new Z1();
    private static final X1 FULL_SCHEMA = loadSchemaForFullRuntime();

    public static X1 full() {
        X1 x12 = FULL_SCHEMA;
        if (x12 != null) {
            return x12;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static X1 lite() {
        return LITE_SCHEMA;
    }

    private static X1 loadSchemaForFullRuntime() {
        try {
            return (X1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
