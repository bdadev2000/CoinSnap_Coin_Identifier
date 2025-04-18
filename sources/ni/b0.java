package ni;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements c {

    /* renamed from: b, reason: collision with root package name */
    public final r0 f22779b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f22780c;

    /* renamed from: d, reason: collision with root package name */
    public final wh.j f22781d;

    /* renamed from: f, reason: collision with root package name */
    public final l f22782f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f22783g;

    /* renamed from: h, reason: collision with root package name */
    public bi.i f22784h;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f22785i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22786j;

    public b0(r0 r0Var, Object[] objArr, wh.j jVar, l lVar) {
        this.f22779b = r0Var;
        this.f22780c = objArr;
        this.f22781d = jVar;
        this.f22782f = lVar;
    }

    public final bi.i a() {
        wh.b0 b0Var;
        wh.d0 url;
        r0 r0Var = this.f22779b;
        r0Var.getClass();
        Object[] objArr = this.f22780c;
        int length = objArr.length;
        va.b[] bVarArr = r0Var.f22873j;
        if (length == bVarArr.length) {
            p0 p0Var = new p0(r0Var.f22866c, r0Var.f22865b, r0Var.f22867d, r0Var.f22868e, r0Var.f22869f, r0Var.f22870g, r0Var.f22871h, r0Var.f22872i);
            if (r0Var.f22874k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                bVarArr[i10].e(p0Var, objArr[i10]);
            }
            wh.b0 b0Var2 = p0Var.f22831d;
            if (b0Var2 != null) {
                url = b0Var2.a();
            } else {
                String link = p0Var.f22830c;
                wh.d0 d0Var = p0Var.f22829b;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(link, "link");
                Intrinsics.checkNotNullParameter(link, "link");
                try {
                    b0Var = new wh.b0();
                    b0Var.c(d0Var, link);
                } catch (IllegalArgumentException unused) {
                    b0Var = null;
                }
                if (b0Var == null) {
                    url = null;
                } else {
                    url = b0Var.a();
                }
                if (url == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + d0Var + ", Relative: " + p0Var.f22830c);
                }
            }
            wh.s0 s0Var = p0Var.f22838k;
            if (s0Var == null) {
                wh.v vVar = p0Var.f22837j;
                if (vVar != null) {
                    s0Var = new wh.w(vVar.a, vVar.f27227b);
                } else {
                    wh.h0 h0Var = p0Var.f22836i;
                    if (h0Var != null) {
                        ArrayList arrayList2 = h0Var.f27065c;
                        if (!arrayList2.isEmpty()) {
                            s0Var = new wh.j0(h0Var.a, h0Var.f27064b, xh.b.x(arrayList2));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (p0Var.f22835h) {
                        s0Var = wh.s0.create((wh.g0) null, new byte[0]);
                    }
                }
            }
            wh.g0 g0Var = p0Var.f22834g;
            a4.s sVar = p0Var.f22833f;
            if (g0Var != null) {
                if (s0Var != null) {
                    s0Var = new wh.p0(s0Var, g0Var);
                } else {
                    sVar.a("Content-Type", g0Var.a);
                }
            }
            wh.n0 n0Var = p0Var.f22832e;
            n0Var.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            n0Var.a = url;
            n0Var.d(sVar.d());
            n0Var.e(p0Var.a, s0Var);
            n0Var.h(t.class, new t(r0Var.a, arrayList));
            return ((wh.l0) this.f22781d).a(n0Var.b());
        }
        throw new IllegalArgumentException(vd.e.g(a4.j.m("Argument count (", length, ") doesn't match expected count ("), bVarArr.length, ")"));
    }

    public final wh.k b() {
        bi.i iVar = this.f22784h;
        if (iVar != null) {
            return iVar;
        }
        Throwable th2 = this.f22785i;
        if (th2 != null) {
            if (!(th2 instanceof IOException)) {
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw ((Error) th2);
            }
            throw ((IOException) th2);
        }
        try {
            bi.i a = a();
            this.f22784h = a;
            return a;
        } catch (IOException | Error | RuntimeException e2) {
            com.facebook.appevents.g.K(e2);
            this.f22785i = e2;
            throw e2;
        }
    }

    public final s0 c(wh.u0 u0Var) {
        wh.t0 t0Var = new wh.t0(u0Var);
        wh.y0 y0Var = u0Var.f27219i;
        t0Var.f27205g = new a0(y0Var.contentType(), y0Var.contentLength());
        wh.u0 a = t0Var.a();
        int i10 = a.f27216f;
        if (i10 >= 200 && i10 < 300) {
            if (i10 != 204 && i10 != 205) {
                z zVar = new z(y0Var);
                try {
                    return s0.b(this.f22782f.convert(zVar), a);
                } catch (RuntimeException e2) {
                    IOException iOException = zVar.f22902d;
                    if (iOException == null) {
                        throw e2;
                    }
                    throw iOException;
                }
            }
            y0Var.close();
            return s0.b(null, a);
        }
        try {
            ki.i iVar = new ki.i();
            y0Var.source().l(iVar);
            Objects.requireNonNull(wh.y0.create(y0Var.contentType(), y0Var.contentLength(), iVar), "body == null");
            if (!a.j()) {
                return new s0(a, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            y0Var.close();
        }
    }

    @Override // ni.c
    public final void cancel() {
        bi.i iVar;
        this.f22783g = true;
        synchronized (this) {
            iVar = this.f22784h;
        }
        if (iVar != null) {
            iVar.cancel();
        }
    }

    public final Object clone() {
        return new b0(this.f22779b, this.f22780c, this.f22781d, this.f22782f);
    }

    @Override // ni.c
    public final void enqueue(f fVar) {
        bi.i iVar;
        Throwable th2;
        synchronized (this) {
            if (!this.f22786j) {
                this.f22786j = true;
                iVar = this.f22784h;
                th2 = this.f22785i;
                if (iVar == null && th2 == null) {
                    try {
                        bi.i a = a();
                        this.f22784h = a;
                        iVar = a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.facebook.appevents.g.K(th2);
                        this.f22785i = th2;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th2 != null) {
            fVar.onFailure(this, th2);
            return;
        }
        if (this.f22783g) {
            iVar.cancel();
        }
        iVar.d(new x(this, fVar));
    }

    @Override // ni.c
    public final boolean isCanceled() {
        boolean z10 = true;
        if (this.f22783g) {
            return true;
        }
        synchronized (this) {
            bi.i iVar = this.f22784h;
            if (iVar == null || !iVar.f2482r) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // ni.c
    public final synchronized wh.o0 request() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return ((bi.i) b()).f2468c;
    }

    @Override // ni.c
    /* renamed from: clone */
    public final c mo12clone() {
        return new b0(this.f22779b, this.f22780c, this.f22781d, this.f22782f);
    }
}
