package com.google.protobuf;

/* loaded from: classes4.dex */
public final class k5 {
    private static final i5 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final i5 LITE_SCHEMA = new j5();

    public static i5 full() {
        return FULL_SCHEMA;
    }

    public static i5 lite() {
        return LITE_SCHEMA;
    }

    private static i5 loadSchemaForFullRuntime() {
        try {
            return (i5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
