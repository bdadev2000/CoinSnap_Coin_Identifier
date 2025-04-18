package g4;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class n {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18136b;

    /* renamed from: c, reason: collision with root package name */
    public final q4.a f18137c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.c f18138d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18139e;

    public n(Class cls, Class cls2, Class cls3, List list, q4.a aVar, h.c cVar) {
        this.a = cls;
        this.f18136b = list;
        this.f18137c = aVar;
        this.f18138d = cVar;
        this.f18139e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final g0 a(int i10, int i11, d3.g gVar, e4.m mVar, com.bumptech.glide.load.data.g gVar2) {
        g0 g0Var;
        e4.q qVar;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        Object fVar;
        m0.c cVar = this.f18138d;
        Object d10 = cVar.d();
        com.bumptech.glide.c.l(d10);
        List list = (List) d10;
        try {
            g0 b3 = b(gVar2, i10, i11, mVar, list);
            cVar.c(list);
            m mVar2 = (m) gVar.f16813d;
            e4.a aVar = (e4.a) gVar.f16812c;
            mVar2.getClass();
            Class<?> cls = b3.get().getClass();
            e4.a aVar2 = e4.a.RESOURCE_DISK_CACHE;
            i iVar = mVar2.f18113b;
            e4.p pVar = null;
            if (aVar != aVar2) {
                e4.q f10 = iVar.f(cls);
                g0Var = f10.a(mVar2.f18120j, b3, mVar2.f18124n, mVar2.f18125o);
                qVar = f10;
            } else {
                g0Var = b3;
                qVar = null;
            }
            if (!b3.equals(g0Var)) {
                b3.a();
            }
            if (iVar.f18076c.a().f9680d.b(g0Var.c()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                com.bumptech.glide.k a = iVar.f18076c.a();
                a.getClass();
                pVar = a.f9680d.b(g0Var.c());
                if (pVar != null) {
                    i12 = pVar.h(mVar2.f18127q);
                } else {
                    throw new com.bumptech.glide.j(g0Var.c(), 2);
                }
            } else {
                i12 = 3;
            }
            e4.j jVar = mVar2.f18133x;
            ArrayList b10 = iVar.b();
            int size = b10.size();
            int i13 = 0;
            while (true) {
                if (i13 < size) {
                    if (((k4.x) b10.get(i13)).a.equals(jVar)) {
                        z11 = true;
                        break;
                    }
                    i13++;
                } else {
                    z11 = false;
                    break;
                }
            }
            boolean z14 = !z11;
            switch (((o) mVar2.f18126p).f18140d) {
                default:
                    if (((z14 && aVar == e4.a.DATA_DISK_CACHE) || aVar == e4.a.LOCAL) && i12 == 2) {
                        z12 = true;
                        break;
                    }
                    break;
                case 1:
                case 2:
                    z12 = false;
                    break;
            }
            if (z12) {
                if (pVar != null) {
                    int b11 = t.h.b(i12);
                    if (b11 != 0) {
                        if (b11 == 1) {
                            z13 = false;
                            fVar = new i0(iVar.f18076c.a, mVar2.f18133x, mVar2.f18121k, mVar2.f18124n, mVar2.f18125o, qVar, cls, mVar2.f18127q);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: ".concat(com.applovin.impl.mediation.ads.e.B(i12)));
                        }
                    } else {
                        z13 = false;
                        fVar = new f(mVar2.f18133x, mVar2.f18121k);
                    }
                    f0 f0Var = (f0) f0.f18060g.d();
                    com.bumptech.glide.c.l(f0Var);
                    f0Var.f18064f = z13;
                    f0Var.f18063d = true;
                    f0Var.f18062c = g0Var;
                    k kVar = mVar2.f18118h;
                    kVar.a = fVar;
                    kVar.f18102b = pVar;
                    kVar.f18103c = f0Var;
                    g0Var = f0Var;
                } else {
                    throw new com.bumptech.glide.j(g0Var.get().getClass(), 2);
                }
            }
            return this.f18137c.i(g0Var, mVar);
        } catch (Throwable th2) {
            cVar.c(list);
            throw th2;
        }
    }

    public final g0 b(com.bumptech.glide.load.data.g gVar, int i10, int i11, e4.m mVar, List list) {
        List list2 = this.f18136b;
        int size = list2.size();
        g0 g0Var = null;
        for (int i12 = 0; i12 < size; i12++) {
            e4.o oVar = (e4.o) list2.get(i12);
            try {
                if (oVar.a(gVar.i(), mVar)) {
                    g0Var = oVar.b(gVar.i(), i10, i11, mVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + oVar, e2);
                }
                list.add(e2);
            }
            if (g0Var != null) {
                break;
            }
        }
        if (g0Var != null) {
            return g0Var;
        }
        throw new b0(this.f18139e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.f18136b + ", transcoder=" + this.f18137c + AbstractJsonLexerKt.END_OBJ;
    }
}
