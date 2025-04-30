package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum A0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0432g.f4560d),
    ENUM(null),
    MESSAGE(null);

    public final Object b;

    A0(Serializable serializable) {
        this.b = serializable;
    }
}
