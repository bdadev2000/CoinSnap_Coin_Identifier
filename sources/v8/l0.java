package v8;

import android.net.Uri;
import java.io.InterruptedIOException;

/* loaded from: classes3.dex */
public final class l0 implements m9.k0 {

    /* renamed from: c, reason: collision with root package name */
    public final Uri f26198c;

    /* renamed from: d, reason: collision with root package name */
    public final m9.v0 f26199d;

    /* renamed from: f, reason: collision with root package name */
    public final h.c f26200f;

    /* renamed from: g, reason: collision with root package name */
    public final y7.n f26201g;

    /* renamed from: h, reason: collision with root package name */
    public final a4.g0 f26202h;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f26204j;

    /* renamed from: l, reason: collision with root package name */
    public long f26206l;

    /* renamed from: n, reason: collision with root package name */
    public y0 f26208n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26209o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0 f26210p;

    /* renamed from: i, reason: collision with root package name */
    public final y7.p f26203i = new y7.p();

    /* renamed from: k, reason: collision with root package name */
    public boolean f26205k = true;

    /* renamed from: b, reason: collision with root package name */
    public final long f26197b = p.f26222b.getAndIncrement();

    /* renamed from: m, reason: collision with root package name */
    public m9.p f26207m = a(0);

    public l0(p0 p0Var, Uri uri, m9.l lVar, h.c cVar, y7.n nVar, a4.g0 g0Var) {
        this.f26210p = p0Var;
        this.f26198c = uri;
        this.f26199d = new m9.v0(lVar);
        this.f26200f = cVar;
        this.f26201g = nVar;
        this.f26202h = g0Var;
    }

    public final m9.p a(long j3) {
        m9.o oVar = new m9.o();
        oVar.a = this.f26198c;
        oVar.f21700f = j3;
        oVar.f21702h = this.f26210p.f26231k;
        oVar.f21703i = 6;
        oVar.f21699e = p0.O;
        return oVar.a();
    }

    @Override // m9.k0
    public final void cancelLoad() {
        this.f26204j = true;
    }

    @Override // m9.k0
    public final void load() {
        m9.l lVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.f26204j) {
            try {
                long j3 = this.f26203i.a;
                m9.p a = a(j3);
                this.f26207m = a;
                long a10 = this.f26199d.a(a);
                if (a10 != -1) {
                    a10 += j3;
                    p0 p0Var = this.f26210p;
                    p0Var.f26238r.post(new k0(p0Var, 2));
                }
                long j10 = a10;
                this.f26210p.f26240t = p8.b.a(this.f26199d.getResponseHeaders());
                m9.v0 v0Var = this.f26199d;
                p8.b bVar = this.f26210p.f26240t;
                if (bVar != null && (i10 = bVar.f23490h) != -1) {
                    lVar = new o(v0Var, i10, this);
                    p0 p0Var2 = this.f26210p;
                    p0Var2.getClass();
                    y0 l10 = p0Var2.l(new n0(0, true));
                    this.f26208n = l10;
                    l10.f(p0.P);
                } else {
                    lVar = v0Var;
                }
                long j11 = j3;
                this.f26200f.B(lVar, this.f26198c, this.f26199d.getResponseHeaders(), j3, j10, this.f26201g);
                if (this.f26210p.f26240t != null) {
                    Object obj = this.f26200f.f18524d;
                    if (((y7.l) obj) instanceof f8.d) {
                        ((f8.d) ((y7.l) obj)).f17712q = true;
                    }
                }
                if (this.f26205k) {
                    h.c cVar = this.f26200f;
                    long j12 = this.f26206l;
                    y7.l lVar2 = (y7.l) cVar.f18524d;
                    lVar2.getClass();
                    lVar2.seek(j11, j12);
                    this.f26205k = false;
                }
                while (true) {
                    long j13 = j11;
                    while (i11 == 0 && !this.f26204j) {
                        try {
                            a4.g0 g0Var = this.f26202h;
                            synchronized (g0Var) {
                                while (!g0Var.a) {
                                    g0Var.wait();
                                }
                            }
                            h.c cVar2 = this.f26200f;
                            y7.p pVar = this.f26203i;
                            y7.l lVar3 = (y7.l) cVar2.f18524d;
                            lVar3.getClass();
                            y7.m mVar = (y7.m) cVar2.f18525f;
                            mVar.getClass();
                            i11 = lVar3.b(mVar, pVar);
                            j11 = this.f26200f.u();
                            if (j11 > this.f26210p.f26232l + j13) {
                                a4.g0 g0Var2 = this.f26202h;
                                synchronized (g0Var2) {
                                    g0Var2.a = false;
                                }
                                p0 p0Var3 = this.f26210p;
                                p0Var3.f26238r.post(p0Var3.f26237q);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f26200f.u() != -1) {
                    this.f26203i.a = this.f26200f.u();
                }
                u0.q(this.f26199d);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f26200f.u() != -1) {
                    this.f26203i.a = this.f26200f.u();
                }
                u0.q(this.f26199d);
                throw th2;
            }
        }
    }
}
