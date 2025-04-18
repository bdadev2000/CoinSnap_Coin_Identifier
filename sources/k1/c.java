package k1;

import b1.f0;
import e0.w;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j;
import q0.l;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final x0.c f30897a;

    /* renamed from: b, reason: collision with root package name */
    public final w f30898b = w.f30218a;

    /* renamed from: c, reason: collision with root package name */
    public final d0.h f30899c = f0.s(d0.i.f30132b, new g.b(this, 5));

    public c(j jVar) {
        this.f30897a = jVar;
    }

    @Override // k1.a
    public final void a(p0.a aVar, Object obj) {
        p0.a.s(aVar, "encoder");
        p0.a.s(obj, "value");
        o1.a k02 = aVar.k0();
        k02.getClass();
        x0.c cVar = this.f30897a;
        p0.a.s(cVar, "baseClass");
        j jVar = (j) cVar;
        a aVar2 = null;
        if (jVar.d(obj)) {
            Map map = (Map) k02.f31205b.get(cVar);
            a aVar3 = map != null ? (a) map.get(g0.a(obj.getClass())) : null;
            if (!(aVar3 instanceof a)) {
                aVar3 = null;
            }
            if (aVar3 != null) {
                aVar2 = aVar3;
            } else {
                Object obj2 = k02.f31206c.get(cVar);
                l lVar = kotlin.jvm.internal.e.r(1, obj2) ? (l) obj2 : null;
                if (lVar != null) {
                    aVar2 = (a) lVar.invoke(obj);
                }
            }
        }
        if (aVar2 != null) {
            p0.a.s(b(), "descriptor");
            l1.f b2 = b();
            String g2 = aVar2.b().g();
            p0.a.s(b2, "descriptor");
            p0.a.s(g2, "value");
            aVar.S(b2, 0);
            aVar.b0(g2);
            aVar.Y(b(), 1, aVar2, obj);
            return;
        }
        j a2 = g0.a(obj.getClass());
        String c2 = a2.c();
        if (c2 == null) {
            c2 = String.valueOf(a2);
        }
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Serializer for subclass '", c2, "' is not found ", "in the polymorphic scope of '" + jVar.c() + '\'', ".\nCheck if class with serial name '");
        t2.append(c2);
        t2.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
        t2.append(c2);
        t2.append("' has to be '@Serializable', and the base class '");
        t2.append(jVar.c());
        t2.append("' has to be sealed and '@Serializable'.");
        throw new IllegalArgumentException(t2.toString());
    }

    @Override // k1.a
    public final l1.f b() {
        return (l1.f) this.f30899c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f30897a + ')';
    }
}
