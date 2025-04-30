package P1;

import android.util.Log;
import b2.InterfaceC0554a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2349a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0554a f2350c;

    /* renamed from: d, reason: collision with root package name */
    public final S.c f2351d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2352e;

    public k(Class cls, Class cls2, Class cls3, List list, InterfaceC0554a interfaceC0554a, C.c cVar) {
        this.f2349a = cls;
        this.b = list;
        this.f2350c = interfaceC0554a;
        this.f2351d = cVar;
        this.f2352e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final B a(int i9, int i10, B3.g gVar, N1.i iVar, com.bumptech.glide.load.data.g gVar2) {
        B b;
        N1.m mVar;
        int i11;
        boolean z8;
        boolean z9;
        boolean z10;
        Object c0232f;
        String str;
        S.c cVar = this.f2351d;
        Object g9 = cVar.g();
        j2.g.c(g9, "Argument must not be null");
        List list = (List) g9;
        try {
            B b8 = b(gVar2, i9, i10, iVar, list);
            cVar.b(list);
            j jVar = (j) gVar.f286d;
            jVar.getClass();
            Class<?> cls = b8.get().getClass();
            int i12 = gVar.f285c;
            i iVar2 = jVar.b;
            N1.l lVar = null;
            if (i12 != 4) {
                N1.m f9 = iVar2.f(cls);
                b = f9.a(jVar.f2334j, b8, jVar.f2336n, jVar.f2337o);
                mVar = f9;
            } else {
                b = b8;
                mVar = null;
            }
            if (!b8.equals(b)) {
                b8.a();
            }
            if (iVar2.f2306c.a().f12826d.b(b.c()) != null) {
                com.bumptech.glide.i a6 = iVar2.f2306c.a();
                a6.getClass();
                lVar = a6.f12826d.b(b.c());
                if (lVar != null) {
                    i11 = lVar.p(jVar.f2339q);
                } else {
                    throw new com.bumptech.glide.h(b.c());
                }
            } else {
                i11 = 3;
            }
            N1.f fVar = jVar.f2346x;
            ArrayList b9 = iVar2.b();
            int size = b9.size();
            int i13 = 0;
            while (true) {
                if (i13 < size) {
                    if (((T1.t) b9.get(i13)).f2993a.equals(fVar)) {
                        z8 = true;
                        break;
                    }
                    i13++;
                } else {
                    z8 = false;
                    break;
                }
            }
            if (jVar.f2338p.d(i12, i11, !z8)) {
                if (lVar != null) {
                    int d2 = AbstractC2965e.d(i11);
                    if (d2 != 0) {
                        if (d2 == 1) {
                            z9 = true;
                            z10 = false;
                            c0232f = new D(iVar2.f2306c.f12810a, jVar.f2346x, jVar.f2335k, jVar.f2336n, jVar.f2337o, mVar, cls, jVar.f2339q);
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        str = "null";
                                    } else {
                                        str = "NONE";
                                    }
                                } else {
                                    str = "TRANSFORMED";
                                }
                            } else {
                                str = "SOURCE";
                            }
                            throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                        }
                    } else {
                        z9 = true;
                        z10 = false;
                        c0232f = new C0232f(jVar.f2346x, jVar.f2335k);
                    }
                    A a9 = (A) A.f2267g.g();
                    a9.f2270f = z10;
                    a9.f2269d = z9;
                    a9.f2268c = b;
                    C.c cVar2 = jVar.f2332h;
                    cVar2.f347c = c0232f;
                    cVar2.f348d = lVar;
                    cVar2.f349f = a9;
                    b = a9;
                } else {
                    throw new com.bumptech.glide.h(b.get().getClass());
                }
            }
            return this.f2350c.a(b, iVar);
        } catch (Throwable th) {
            cVar.b(list);
            throw th;
        }
    }

    public final B b(com.bumptech.glide.load.data.g gVar, int i9, int i10, N1.i iVar, List list) {
        List list2 = this.b;
        int size = list2.size();
        B b = null;
        for (int i11 = 0; i11 < size; i11++) {
            N1.k kVar = (N1.k) list2.get(i11);
            try {
                if (kVar.a(gVar.c(), iVar)) {
                    b = kVar.b(gVar.c(), i9, i10, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e4) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e4);
                }
                list.add(e4);
            }
            if (b != null) {
                break;
            }
        }
        if (b != null) {
            return b;
        }
        throw new x(this.f2352e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f2349a + ", decoders=" + this.b + ", transcoder=" + this.f2350c + '}';
    }
}
