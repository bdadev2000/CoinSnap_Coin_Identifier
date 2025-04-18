package b6;

import android.util.Log;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import mb.a1;
import mb.a2;
import mb.b0;
import mb.b2;
import mb.c1;
import mb.c2;
import mb.d0;
import mb.d2;
import mb.e;
import mb.e0;
import mb.e1;
import mb.e2;
import mb.f;
import mb.f0;
import mb.f2;
import mb.g;
import mb.g0;
import mb.g1;
import mb.g2;
import mb.h;
import mb.h0;
import mb.h1;
import mb.h2;
import mb.i;
import mb.i2;
import mb.j;
import mb.j0;
import mb.j1;
import mb.j2;
import mb.k;
import mb.k0;
import mb.k1;
import mb.k2;
import mb.l;
import mb.l0;
import mb.l1;
import mb.l2;
import mb.m;
import mb.m2;
import mb.n;
import mb.n0;
import mb.n1;
import mb.n2;
import mb.o;
import mb.o1;
import mb.o2;
import mb.p;
import mb.p0;
import mb.p2;
import mb.q;
import mb.q2;
import mb.r;
import mb.r0;
import mb.r2;
import mb.s;
import mb.s0;
import mb.s2;
import mb.t;
import mb.t1;
import mb.u;
import mb.u0;
import mb.u1;
import mb.v;
import mb.v1;
import mb.w;
import mb.w0;
import mb.w1;
import mb.x;
import mb.x1;
import mb.y;
import mb.y0;
import mb.y1;
import mb.z;
import mb.z1;

/* loaded from: classes3.dex */
public final class a implements k1.b, y0.c {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2286c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2287d;

    /* renamed from: b, reason: collision with root package name */
    public static final a f2285b = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final a f2288f = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final a f2289g = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final a f2290h = new a();

    @Override // y0.c
    public Object a(y0.b bVar) {
        throw bVar;
    }

    public boolean b(int i10) {
        if (4 > i10 && !Log.isLoggable("FirebaseCrashlytics", i10)) {
            return false;
        }
        return true;
    }

    public void c(wb.a aVar) {
        mb.d dVar = mb.d.a;
        xb.d dVar2 = (xb.d) aVar;
        dVar2.a(s2.class, dVar);
        dVar2.a(b0.class, dVar);
        j jVar = j.a;
        dVar2.a(r2.class, jVar);
        dVar2.a(j0.class, jVar);
        g gVar = g.a;
        dVar2.a(z1.class, gVar);
        dVar2.a(k0.class, gVar);
        h hVar = h.a;
        dVar2.a(y1.class, hVar);
        dVar2.a(l0.class, hVar);
        z zVar = z.a;
        dVar2.a(q2.class, zVar);
        dVar2.a(o1.class, zVar);
        y yVar = y.a;
        dVar2.a(p2.class, yVar);
        dVar2.a(n1.class, yVar);
        i iVar = i.a;
        dVar2.a(a2.class, iVar);
        dVar2.a(n0.class, iVar);
        t tVar = t.a;
        dVar2.a(o2.class, tVar);
        dVar2.a(p0.class, tVar);
        k kVar = k.a;
        dVar2.a(i2.class, kVar);
        dVar2.a(r0.class, kVar);
        m mVar = m.a;
        dVar2.a(g2.class, mVar);
        dVar2.a(s0.class, mVar);
        p pVar = p.a;
        dVar2.a(f2.class, pVar);
        dVar2.a(a1.class, pVar);
        q qVar = q.a;
        dVar2.a(e2.class, qVar);
        dVar2.a(c1.class, qVar);
        n nVar = n.a;
        dVar2.a(c2.class, nVar);
        dVar2.a(w0.class, nVar);
        mb.b bVar = mb.b.a;
        dVar2.a(u1.class, bVar);
        dVar2.a(d0.class, bVar);
        mb.a aVar2 = mb.a.a;
        dVar2.a(t1.class, aVar2);
        dVar2.a(e0.class, aVar2);
        o oVar = o.a;
        dVar2.a(d2.class, oVar);
        dVar2.a(y0.class, oVar);
        l lVar = l.a;
        dVar2.a(b2.class, lVar);
        dVar2.a(u0.class, lVar);
        mb.c cVar = mb.c.a;
        dVar2.a(v1.class, cVar);
        dVar2.a(f0.class, cVar);
        r rVar = r.a;
        dVar2.a(h2.class, rVar);
        dVar2.a(e1.class, rVar);
        s sVar = s.a;
        dVar2.a(j2.class, sVar);
        dVar2.a(g1.class, sVar);
        u uVar = u.a;
        dVar2.a(k2.class, uVar);
        dVar2.a(h1.class, uVar);
        x xVar = x.a;
        dVar2.a(n2.class, xVar);
        dVar2.a(l1.class, xVar);
        v vVar = v.a;
        dVar2.a(m2.class, vVar);
        dVar2.a(j1.class, vVar);
        w wVar = w.a;
        dVar2.a(l2.class, wVar);
        dVar2.a(k1.class, wVar);
        e eVar = e.a;
        dVar2.a(x1.class, eVar);
        dVar2.a(g0.class, eVar);
        f fVar = f.a;
        dVar2.a(w1.class, fVar);
        dVar2.a(h0.class, fVar);
    }

    public void d(String str, IOException iOException) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, iOException);
        }
    }

    public void e(String str, Throwable th2) {
        if (b(6)) {
            Log.e("FirebaseCrashlytics", str, th2);
        }
    }

    public void f(String str) {
        if (b(4)) {
            Log.i("FirebaseCrashlytics", str, null);
        }
    }

    public boolean g(String str) {
        if (m6.a.b(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!m6.a.b(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i10 = 0; i10 < 30; i10++) {
                        fArr[i10] = 0.0f;
                    }
                    d6.f fVar = d6.f.a;
                    String[] f10 = d6.f.f(d6.c.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                    if (f10 != null) {
                        String str3 = f10[0];
                        if (str3 != null) {
                            str2 = str3;
                        }
                    }
                    str2 = "none";
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            }
            return !Intrinsics.areEqual("none", str2);
        } catch (Throwable th3) {
            m6.a.a(this, th3);
            return false;
        }
    }

    public void h(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void i(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
