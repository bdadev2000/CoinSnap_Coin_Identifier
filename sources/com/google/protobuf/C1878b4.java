package com.google.protobuf;

/* renamed from: com.google.protobuf.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1878b4 {
    private static final Z3 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final Z3 LITE_SCHEMA = new C1871a4();

    public static Z3 full() {
        return FULL_SCHEMA;
    }

    public static Z3 lite() {
        return LITE_SCHEMA;
    }

    private static Z3 loadSchemaForFullRuntime() {
        try {
            return (Z3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
