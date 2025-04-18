package com.google.protobuf;

/* loaded from: classes4.dex */
public final class c6 {
    private static final a6 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final a6 LITE_SCHEMA = new b6();

    public static a6 full() {
        return FULL_SCHEMA;
    }

    public static a6 lite() {
        return LITE_SCHEMA;
    }

    private static a6 loadSchemaForFullRuntime() {
        try {
            return (a6) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
