package com.google.protobuf;

/* loaded from: classes3.dex */
public enum T5 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(H.EMPTY),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    T5(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
