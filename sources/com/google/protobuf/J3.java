package com.google.protobuf;

/* loaded from: classes3.dex */
public final class J3 {
    private static final H3 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final H3 LITE_SCHEMA = new I3();

    public static H3 full() {
        return FULL_SCHEMA;
    }

    public static H3 lite() {
        return LITE_SCHEMA;
    }

    private static H3 loadSchemaForFullRuntime() {
        try {
            return (H3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
