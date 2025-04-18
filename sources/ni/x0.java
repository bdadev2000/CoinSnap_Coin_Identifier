package ni;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public final class x0 implements GenericArrayType {

    /* renamed from: b, reason: collision with root package name */
    public final Type f22895b;

    public x0(Type type) {
        this.f22895b = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && com.facebook.appevents.g.g(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f22895b;
    }

    public final int hashCode() {
        return this.f22895b.hashCode();
    }

    public final String toString() {
        return com.facebook.appevents.g.L(this.f22895b) + "[]";
    }
}
