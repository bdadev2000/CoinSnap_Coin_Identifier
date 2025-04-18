package uc;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Type f25746b;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f25746b = com.bumptech.glide.d.c(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && com.bumptech.glide.d.k(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f25746b;
    }

    public final int hashCode() {
        return this.f25746b.hashCode();
    }

    public final String toString() {
        return com.bumptech.glide.d.H(this.f25746b) + "[]";
    }
}
