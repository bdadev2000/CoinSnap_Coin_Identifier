package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum k0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(k.class, k.f1389c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: b, reason: collision with root package name */
    public final Object f1403b;

    k0(Class cls, Serializable serializable) {
        this.f1403b = serializable;
    }
}
