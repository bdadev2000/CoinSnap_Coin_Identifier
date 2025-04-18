package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum k2 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(k.f1389c),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: b, reason: collision with root package name */
    public final Object f1414b;

    k2(Serializable serializable) {
        this.f1414b = serializable;
    }
}
