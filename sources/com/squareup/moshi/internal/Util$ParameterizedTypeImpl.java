package com.squareup.moshi.internal;

import a6.k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;
import zg.b;

/* loaded from: classes4.dex */
public final class Util$ParameterizedTypeImpl implements ParameterizedType {

    /* renamed from: b, reason: collision with root package name */
    public final Type f16746b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f16747c;

    /* renamed from: d, reason: collision with root package name */
    public final Type[] f16748d;

    public Util$ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
        Type a;
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || k.z(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        if (type == null) {
            a = null;
        } else {
            a = b.a(type);
        }
        this.f16746b = a;
        this.f16747c = b.a(type2);
        this.f16748d = (Type[]) typeArr.clone();
        int i10 = 0;
        while (true) {
            Type[] typeArr2 = this.f16748d;
            if (i10 < typeArr2.length) {
                Type type3 = typeArr2[i10];
                type3.getClass();
                b.b(type3);
                Type[] typeArr3 = this.f16748d;
                typeArr3[i10] = b.a(typeArr3[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && k.s(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f16748d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f16746b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f16747c;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f16748d) ^ this.f16747c.hashCode();
        Set set = b.a;
        Type type = this.f16746b;
        if (type != null) {
            i10 = type.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        Type[] typeArr = this.f16748d;
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(b.i(this.f16747c));
        if (typeArr.length == 0) {
            return sb2.toString();
        }
        sb2.append("<");
        sb2.append(b.i(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb2.append(", ");
            sb2.append(b.i(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
