package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum B {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0432g.class, C0432g.f4560d),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object b;

    B(Class cls, Serializable serializable) {
        this.b = serializable;
    }
}
