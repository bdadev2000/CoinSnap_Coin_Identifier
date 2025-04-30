package g8;

import a5.C0398b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import u7.AbstractC2816g;
import u7.AbstractC2817h;

/* loaded from: classes3.dex */
public class n implements f8.o, d8.d, d8.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20509a;
    public final f8.b b;

    /* renamed from: c, reason: collision with root package name */
    public final F7.l f20510c;

    /* renamed from: d, reason: collision with root package name */
    public final f8.h f20511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20512e;

    /* renamed from: f, reason: collision with root package name */
    public Object f20513f;

    public n(f8.b bVar, F7.l lVar, char c9) {
        this.f20509a = new ArrayList();
        this.b = bVar;
        this.f20510c = lVar;
        this.f20511d = bVar.f20370a;
    }

    @Override // d8.b
    public final void A(c8.g gVar, int i9, char c9) {
        G7.j.e(gVar, "descriptor");
        O(C2.m.b(String.valueOf(c9)), M(gVar, i9));
    }

    @Override // d8.d
    public final void B(long j7) {
        String str = (String) N();
        G7.j.e(str, "tag");
        O(C2.m.a(Long.valueOf(j7)), str);
    }

    @Override // d8.b
    public final void C(int i9, int i10, c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        O(C2.m.a(Integer.valueOf(i10)), M(gVar, i9));
    }

    @Override // d8.d
    public final void D(c8.g gVar, int i9) {
        G7.j.e(gVar, "enumDescriptor");
        String str = (String) N();
        G7.j.e(str, "tag");
        O(C2.m.b(gVar.g(i9)), str);
    }

    @Override // f8.o
    public final void E(f8.j jVar) {
        G7.j.e(jVar, "element");
        g(f8.m.f20403a, jVar);
    }

    @Override // d8.d
    public final void F(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        String str2 = (String) N();
        G7.j.e(str2, "tag");
        O(C2.m.b(str), str2);
    }

    public String G(c8.g gVar, int i9) {
        switch (this.f20512e) {
            case 2:
                G7.j.e(gVar, "descriptor");
                return String.valueOf(i9);
            default:
                return H(gVar, i9);
        }
    }

    public final String H(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return gVar.g(i9);
    }

    public final void I(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "serializer");
        this.f20509a.add(M(gVar, i9));
        com.facebook.appevents.g.f(this, bVar, obj);
    }

    public final void J(Object obj, double d2) {
        String str = (String) obj;
        G7.j.e(str, "tag");
        O(C2.m.a(Double.valueOf(d2)), str);
        if (!this.f20511d.f20394k) {
            if (Double.isInfinite(d2) || Double.isNaN(d2)) {
                Double valueOf = Double.valueOf(d2);
                String obj2 = L().toString();
                G7.j.e(obj2, "output");
                throw new h(k.o(valueOf, str, obj2), 1);
            }
        }
    }

    public final void K(Object obj, float f9) {
        String str = (String) obj;
        G7.j.e(str, "tag");
        O(C2.m.a(Float.valueOf(f9)), str);
        if (!this.f20511d.f20394k) {
            if (Float.isInfinite(f9) || Float.isNaN(f9)) {
                Float valueOf = Float.valueOf(f9);
                String obj2 = L().toString();
                G7.j.e(obj2, "output");
                throw new h(k.o(valueOf, str, obj2), 1);
            }
        }
    }

    public f8.j L() {
        switch (this.f20512e) {
            case 0:
                f8.j jVar = (f8.j) this.f20513f;
                if (jVar != null) {
                    return jVar;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
            case 1:
                return new f8.v((LinkedHashMap) this.f20513f);
            default:
                return new f8.c((ArrayList) this.f20513f);
        }
    }

    public final String M(c8.g gVar, int i9) {
        G7.j.e(gVar, "<this>");
        String G3 = G(gVar, i9);
        G7.j.e(G3, "nestedName");
        return G3;
    }

    public final Object N() {
        ArrayList arrayList = this.f20509a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(AbstractC2817h.A(arrayList));
        }
        throw new IllegalArgumentException("No tag in stack for requested element");
    }

    public void O(f8.j jVar, String str) {
        switch (this.f20512e) {
            case 0:
                G7.j.e(str, "key");
                G7.j.e(jVar, "element");
                if (str == "primitive") {
                    if (((f8.j) this.f20513f) == null) {
                        this.f20513f = jVar;
                        return;
                    }
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
                }
                throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
            case 1:
                G7.j.e(str, "key");
                G7.j.e(jVar, "element");
                ((LinkedHashMap) this.f20513f).put(str, jVar);
                return;
            default:
                G7.j.e(str, "key");
                G7.j.e(jVar, "element");
                ((ArrayList) this.f20513f).add(Integer.parseInt(str), jVar);
                return;
        }
    }

    @Override // d8.d
    public final C0398b a() {
        return this.b.b;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [d8.b, g8.r, g8.n] */
    @Override // d8.d
    public final d8.b b(c8.g gVar) {
        F7.l wVar;
        boolean z8;
        G7.j.e(gVar, "descriptor");
        if (AbstractC2816g.Q(this.f20509a) == null) {
            wVar = this.f20510c;
        } else {
            wVar = new G7.w(this, 12);
        }
        com.bumptech.glide.c kind = gVar.getKind();
        if (G7.j.a(kind, c8.l.f5454e)) {
            z8 = true;
        } else {
            z8 = kind instanceof c8.d;
        }
        f8.b bVar = this.b;
        if (z8) {
            return new n(bVar, wVar, 2);
        }
        if (G7.j.a(kind, c8.l.f5455f)) {
            c8.g f9 = k.f(gVar.j(0), bVar.b);
            com.bumptech.glide.c kind2 = f9.getKind();
            if (!(kind2 instanceof c8.f) && !G7.j.a(kind2, c8.k.f5452e)) {
                if (bVar.f20370a.f20387d) {
                    return new n(bVar, wVar, 2);
                }
                throw k.b(f9);
            }
            G7.j.e(wVar, "nodeConsumer");
            ?? nVar = new n(bVar, wVar, 1);
            nVar.f20525h = true;
            return nVar;
        }
        return new n(bVar, wVar, 1);
    }

    @Override // d8.b
    public final void c(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        if (!this.f20509a.isEmpty()) {
            N();
        }
        this.f20510c.invoke(L());
    }

    @Override // f8.o
    public final f8.b d() {
        return this.b;
    }

    @Override // d8.b
    public final void e(c8.g gVar, int i9, double d2) {
        G7.j.e(gVar, "descriptor");
        J(M(gVar, i9), d2);
    }

    @Override // d8.d
    public final void f() {
        String str = (String) AbstractC2816g.Q(this.f20509a);
        if (str == null) {
            this.f20510c.invoke(f8.t.b);
        } else {
            O(f8.t.b, str);
        }
    }

    @Override // d8.d
    public final void g(a8.b bVar, Object obj) {
        G7.j.e(bVar, "serializer");
        Object Q8 = AbstractC2816g.Q(this.f20509a);
        f8.b bVar2 = this.b;
        if (Q8 == null) {
            c8.g f9 = k.f(bVar.getDescriptor(), bVar2.b);
            if ((f9.getKind() instanceof c8.f) || f9.getKind() == c8.k.f5452e) {
                F7.l lVar = this.f20510c;
                G7.j.e(lVar, "nodeConsumer");
                n nVar = new n(bVar2, lVar, 0);
                nVar.f20509a.add("primitive");
                nVar.g(bVar, obj);
                G7.j.e(bVar.getDescriptor(), "descriptor");
                nVar.f20510c.invoke(nVar.L());
                return;
            }
        }
        if ((bVar instanceof a8.f) && !bVar2.f20370a.f20392i) {
            k.h(bVar.getDescriptor(), bVar2);
            G7.j.c(obj, "null cannot be cast to non-null type kotlin.Any");
            R2.b.m((a8.f) bVar, this, obj);
            throw null;
        }
        bVar.serialize(this, obj);
    }

    @Override // d8.d
    public final void h(double d2) {
        J(N(), d2);
    }

    @Override // d8.d
    public final void i(short s5) {
        String str = (String) N();
        G7.j.e(str, "tag");
        O(C2.m.a(Short.valueOf(s5)), str);
    }

    @Override // d8.d
    public final void j(byte b) {
        String str = (String) N();
        G7.j.e(str, "tag");
        O(C2.m.a(Byte.valueOf(b)), str);
    }

    @Override // d8.b
    public final void k(c8.g gVar, int i9, String str) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        O(C2.m.b(str), M(gVar, i9));
    }

    @Override // d8.d
    public final void l(boolean z8) {
        String str = (String) N();
        G7.j.e(str, "tag");
        O(new f8.q(Boolean.valueOf(z8), false), str);
    }

    @Override // d8.b
    public final void m(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "serializer");
        this.f20509a.add(M(gVar, i9));
        g(bVar, obj);
    }

    @Override // d8.b
    public final void n(c8.g gVar, int i9, byte b) {
        G7.j.e(gVar, "descriptor");
        O(C2.m.a(Byte.valueOf(b)), M(gVar, i9));
    }

    @Override // d8.b
    public final boolean o(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return this.f20511d.f20385a;
    }

    @Override // d8.d
    public final void p(float f9) {
        K(N(), f9);
    }

    @Override // d8.d
    public final d8.d q(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        String str = (String) N();
        G7.j.e(str, "tag");
        if (x.a(gVar)) {
            return new b(this, str);
        }
        this.f20509a.add(str);
        return this;
    }

    @Override // d8.d
    public final void r(char c9) {
        String str = (String) N();
        G7.j.e(str, "tag");
        O(C2.m.b(String.valueOf(c9)), str);
    }

    @Override // d8.d
    public final d8.b s(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return b(gVar);
    }

    @Override // d8.b
    public final void t(c8.g gVar, int i9, float f9) {
        G7.j.e(gVar, "descriptor");
        K(M(gVar, i9), f9);
    }

    @Override // d8.b
    public void u(c8.g gVar, int i9, a8.b bVar, Object obj) {
        switch (this.f20512e) {
            case 1:
                G7.j.e(gVar, "descriptor");
                G7.j.e(bVar, "serializer");
                if (obj != null || this.f20511d.f20389f) {
                    I(gVar, i9, bVar, obj);
                    return;
                }
                return;
            default:
                I(gVar, i9, bVar, obj);
                return;
        }
    }

    @Override // d8.b
    public final void v(c8.g gVar, int i9, boolean z8) {
        G7.j.e(gVar, "descriptor");
        O(new f8.q(Boolean.valueOf(z8), false), M(gVar, i9));
    }

    @Override // d8.b
    public final void w(c8.g gVar, int i9, short s5) {
        G7.j.e(gVar, "descriptor");
        O(C2.m.a(Short.valueOf(s5)), M(gVar, i9));
    }

    @Override // d8.b
    public final d8.d x(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        String M8 = M(gVar, i9);
        c8.g j7 = gVar.j(i9);
        G7.j.e(j7, "inlineDescriptor");
        if (x.a(j7)) {
            return new b(this, M8);
        }
        this.f20509a.add(M8);
        return this;
    }

    @Override // d8.d
    public final void y(int i9) {
        String str = (String) N();
        G7.j.e(str, "tag");
        O(C2.m.a(Integer.valueOf(i9)), str);
    }

    @Override // d8.b
    public final void z(c8.g gVar, int i9, long j7) {
        G7.j.e(gVar, "descriptor");
        O(C2.m.a(Long.valueOf(j7)), M(gVar, i9));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(f8.b bVar, F7.l lVar, int i9) {
        this(bVar, lVar, (char) 0);
        this.f20512e = i9;
        switch (i9) {
            case 1:
                G7.j.e(bVar, "json");
                G7.j.e(lVar, "nodeConsumer");
                this(bVar, lVar, (char) 0);
                this.f20513f = new LinkedHashMap();
                return;
            case 2:
                G7.j.e(bVar, "json");
                G7.j.e(lVar, "nodeConsumer");
                this(bVar, lVar, (char) 0);
                this.f20513f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
