package com.squareup.moshi.internal;

import a6.k;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import zg.b;

/* loaded from: classes4.dex */
public final class Util$WildcardTypeImpl implements WildcardType {

    /* renamed from: b, reason: collision with root package name */
    public final Type f16749b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f16750c;

    public Util$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    Type type = typeArr2[0];
                    type.getClass();
                    b.b(type);
                    if (typeArr[0] == Object.class) {
                        this.f16750c = b.a(typeArr2[0]);
                        this.f16749b = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                Type type2 = typeArr[0];
                type2.getClass();
                b.b(type2);
                this.f16750c = null;
                this.f16749b = b.a(typeArr[0]);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && k.s(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f16750c;
        return type != null ? new Type[]{type} : b.f28763b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f16749b};
    }

    public final int hashCode() {
        Type type = this.f16750c;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16749b.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f16750c;
        if (type != null) {
            return "? super " + b.i(type);
        }
        Type type2 = this.f16749b;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + b.i(type2);
    }
}
