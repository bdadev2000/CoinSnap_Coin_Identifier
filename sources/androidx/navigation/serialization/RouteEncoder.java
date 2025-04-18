package androidx.navigation.serialization;

import androidx.annotation.RestrictTo;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import b1.f0;
import e0.e0;
import java.util.LinkedHashMap;
import java.util.Map;
import l1.f;
import o1.b;
import p0.a;

@RestrictTo
/* loaded from: classes2.dex */
public final class RouteEncoder<T> extends a {

    /* renamed from: a, reason: collision with root package name */
    public final k1.a f20786a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f20787b;

    /* renamed from: c, reason: collision with root package name */
    public final o1.a f20788c = b.f31207a;
    public final LinkedHashMap d = new LinkedHashMap();
    public int e = -1;

    public RouteEncoder(k1.a aVar, LinkedHashMap linkedHashMap) {
        this.f20786a = aVar;
        this.f20787b = linkedHashMap;
    }

    public final Map J0(Object obj) {
        a.s(obj, "value");
        super.Z(this.f20786a, obj);
        return e0.x(this.d);
    }

    public final void K0(Object obj) {
        String e = this.f20786a.b().e(this.e);
        NavType navType = (NavType) this.f20787b.get(e);
        if (navType == null) {
            throw new IllegalStateException(androidx.compose.foundation.text.input.a.A("Cannot find NavType for argument ", e, ". Please provide NavType through typeMap.").toString());
        }
        this.d.put(e, navType instanceof CollectionNavType ? ((CollectionNavType) navType).i(obj) : f0.u(navType.f(obj)));
    }

    @Override // p0.a
    public final void S(f fVar, int i2) {
        a.s(fVar, "descriptor");
        this.e = i2;
    }

    @Override // p0.a
    public final void X() {
        K0(null);
    }

    @Override // p0.a
    public final void Z(k1.a aVar, Object obj) {
        a.s(aVar, "serializer");
        K0(obj);
    }

    @Override // p0.a
    public final void c0(Object obj) {
        a.s(obj, "value");
        K0(obj);
    }

    @Override // p0.a
    public final o1.a k0() {
        return this.f20788c;
    }
}
