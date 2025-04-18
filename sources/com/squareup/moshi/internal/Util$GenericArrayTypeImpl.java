package com.squareup.moshi.internal;

import a6.k;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import zg.b;

/* loaded from: classes4.dex */
public final class Util$GenericArrayTypeImpl implements GenericArrayType {

    /* renamed from: b, reason: collision with root package name */
    public final Type f16745b;

    public Util$GenericArrayTypeImpl(Type type) {
        this.f16745b = b.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && k.s(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f16745b;
    }

    public final int hashCode() {
        return this.f16745b.hashCode();
    }

    public final String toString() {
        return b.i(this.f16745b) + "[]";
    }
}
