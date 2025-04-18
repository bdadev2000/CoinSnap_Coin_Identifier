package com.google.protobuf;

/* loaded from: classes4.dex */
public final class e2 {
    private static final b2 LITE_SCHEMA = new d2();
    private static final b2 FULL_SCHEMA = loadSchemaForFullRuntime();

    public static b2 full() {
        b2 b2Var = FULL_SCHEMA;
        if (b2Var != null) {
            return b2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static b2 lite() {
        return LITE_SCHEMA;
    }

    private static b2 loadSchemaForFullRuntime() {
        try {
            return (b2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
