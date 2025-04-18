package ni;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes5.dex */
public final class z0 implements WildcardType {

    /* renamed from: b, reason: collision with root package name */
    public final Type f22903b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f22904c;

    public z0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    Type type = typeArr2[0];
                    type.getClass();
                    com.facebook.appevents.g.b(type);
                    if (typeArr[0] == Object.class) {
                        this.f22904c = typeArr2[0];
                        this.f22903b = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                Type type2 = typeArr[0];
                type2.getClass();
                com.facebook.appevents.g.b(type2);
                this.f22904c = null;
                this.f22903b = typeArr[0];
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && com.facebook.appevents.g.g(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f22904c;
        return type != null ? new Type[]{type} : com.facebook.appevents.g.f10940e;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f22903b};
    }

    public final int hashCode() {
        Type type = this.f22904c;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f22903b.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f22904c;
        if (type != null) {
            return "? super " + com.facebook.appevents.g.L(type);
        }
        Type type2 = this.f22903b;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + com.facebook.appevents.g.L(type2);
    }
}
