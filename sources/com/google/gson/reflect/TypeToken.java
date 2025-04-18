package com.google.gson.reflect;

import c6.c;
import com.bumptech.glide.d;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes3.dex */
public class TypeToken<T> {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f12123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12124c;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                Type c10 = d.c(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(c10);
                }
                this.f12123b = c10;
                this.a = d.o(c10);
                this.f12124c = c10.hashCode();
                return;
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + c.i("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static void a(Type type) {
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                a(((GenericArrayType) type).getGenericComponentType());
                return;
            }
            int i10 = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    a(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i10 < length) {
                    a(actualTypeArguments[i10]);
                    i10++;
                }
                return;
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    a(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i10 < length2) {
                    a(upperBounds[i10]);
                    i10++;
                }
                return;
            }
            if (type != null) {
                return;
            } else {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
        }
        TypeVariable typeVariable = (TypeVariable) type;
        throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + c.i("typetoken-type-variable"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            if (d.k(this.f12123b, ((TypeToken) obj).f12123b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12124c;
    }

    public final String toString() {
        return d.H(this.f12123b);
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type c10 = d.c(type);
        this.f12123b = c10;
        this.a = d.o(c10);
        this.f12124c = c10.hashCode();
    }
}
