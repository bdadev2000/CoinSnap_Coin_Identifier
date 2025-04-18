package com.google.protobuf;

/* loaded from: classes4.dex */
public enum u9 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(h0.EMPTY),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    u9(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
