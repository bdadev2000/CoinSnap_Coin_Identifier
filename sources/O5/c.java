package O5;

import i8.C2369f;
import i8.C2370g;
import java.io.IOException;
import w8.x;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2198a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2199c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2200d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2201e;

    public c(f fVar, i iVar) {
        h hVar = h.BEGIN_TO_RENDER;
        i iVar2 = i.NATIVE;
        this.f2200d = fVar;
        this.f2201e = hVar;
        this.b = iVar2;
        this.f2199c = iVar;
        this.f2198a = false;
    }

    public static c b(f fVar, i iVar) {
        if (fVar != f.DEFINED_BY_JAVASCRIPT) {
            return new c(fVar, iVar);
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    public static c c(Z5.d dVar, Z5.e eVar, Z5.f fVar, Z5.f fVar2) {
        if (fVar != Z5.f.NONE) {
            Z5.d dVar2 = Z5.d.DEFINED_BY_JAVASCRIPT;
            Z5.f fVar3 = Z5.f.NATIVE;
            if (dVar == dVar2 && fVar == fVar3) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (eVar == Z5.e.DEFINED_BY_JAVASCRIPT && fVar == fVar3) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new c(dVar, eVar, fVar, fVar2);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public void a() {
        synchronized (((C2370g) this.f2201e)) {
            if (this.f2198a) {
                return;
            }
            this.f2198a = true;
            j8.b.c((x) this.f2199c);
            try {
                ((H0.b) this.b).a();
            } catch (IOException unused) {
            }
        }
    }

    public c(Z5.d dVar, Z5.e eVar, Z5.f fVar, Z5.f fVar2) {
        this.f2200d = dVar;
        this.f2201e = eVar;
        this.b = fVar;
        this.f2199c = fVar2;
        this.f2198a = false;
    }

    public c(C2370g c2370g, H0.b bVar) {
        G7.j.e(c2370g, "this$0");
        this.f2201e = c2370g;
        this.b = bVar;
        x g9 = bVar.g(1);
        this.f2199c = g9;
        this.f2200d = new C2369f(c2370g, this, g9);
    }
}
