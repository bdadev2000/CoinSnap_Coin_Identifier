package uc;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Type f25750b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f25751c;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z10;
        boolean z11;
        if (typeArr2.length <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        a6.k.i(z10);
        if (typeArr.length == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        a6.k.i(z11);
        if (typeArr2.length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            com.bumptech.glide.d.f(typeArr2[0]);
            a6.k.i(typeArr[0] == Object.class);
            this.f25751c = com.bumptech.glide.d.c(typeArr2[0]);
            this.f25750b = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        com.bumptech.glide.d.f(typeArr[0]);
        this.f25751c = null;
        this.f25750b = com.bumptech.glide.d.c(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && com.bumptech.glide.d.k(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f25751c;
        return type != null ? new Type[]{type} : com.bumptech.glide.d.f9624d;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f25750b};
    }

    public final int hashCode() {
        Type type = this.f25751c;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f25750b.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f25751c;
        if (type != null) {
            return "? super " + com.bumptech.glide.d.H(type);
        }
        Type type2 = this.f25750b;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + com.bumptech.glide.d.H(type2);
    }
}
