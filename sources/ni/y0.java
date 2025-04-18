package ni;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class y0 implements ParameterizedType {

    /* renamed from: b, reason: collision with root package name */
    public final Type f22897b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f22898c;

    /* renamed from: d, reason: collision with root package name */
    public final Type[] f22899d;

    public y0(Type type, Type type2, Type... typeArr) {
        boolean z10;
        if (type2 instanceof Class) {
            if (type == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            com.facebook.appevents.g.b(type3);
        }
        this.f22897b = type;
        this.f22898c = type2;
        this.f22899d = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && com.facebook.appevents.g.g(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f22899d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f22897b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f22898c;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f22899d) ^ this.f22898c.hashCode();
        Type type = this.f22897b;
        if (type != null) {
            i10 = type.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        Type[] typeArr = this.f22899d;
        int length = typeArr.length;
        Type type = this.f22898c;
        if (length == 0) {
            return com.facebook.appevents.g.L(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(com.facebook.appevents.g.L(type));
        sb2.append("<");
        sb2.append(com.facebook.appevents.g.L(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb2.append(", ");
            sb2.append(com.facebook.appevents.g.L(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
