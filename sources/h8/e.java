package h8;

import n9.h0;
import n9.x;
import s7.x1;
import y7.m;
import y7.n;

/* loaded from: classes3.dex */
public final class e implements y7.l {
    public n a;

    /* renamed from: b, reason: collision with root package name */
    public j f18886b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18887c;

    @Override // y7.l
    public final void a(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r21, y7.p r22) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.e.b(y7.m, y7.p):int");
    }

    public final boolean c(m mVar) {
        boolean z10;
        boolean z11;
        g gVar = new g();
        if (gVar.a(mVar, true) && (gVar.a & 2) == 2) {
            int min = Math.min(gVar.f18895e, 8);
            x xVar = new x(min);
            mVar.peekFully(xVar.a, 0, min);
            xVar.G(0);
            if (xVar.f22600c - xVar.f22599b >= 5 && xVar.v() == 127 && xVar.w() == 1179402563) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f18886b = new d();
            } else {
                xVar.G(0);
                try {
                    z11 = com.bumptech.glide.d.K(1, xVar, true);
                } catch (x1 unused) {
                    z11 = false;
                }
                if (z11) {
                    this.f18886b = new l();
                } else {
                    xVar.G(0);
                    if (i.e(xVar, i.f18898o)) {
                        this.f18886b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        try {
            return c(mVar);
        } catch (x1 unused) {
            return false;
        }
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        j jVar = this.f18886b;
        if (jVar != null) {
            f fVar = jVar.a;
            g gVar = fVar.a;
            gVar.a = 0;
            gVar.f18892b = 0L;
            gVar.f18893c = 0;
            gVar.f18894d = 0;
            gVar.f18895e = 0;
            fVar.f18888b.D(0);
            fVar.f18889c = -1;
            fVar.f18891e = false;
            if (j3 == 0) {
                jVar.d(!jVar.f18911l);
                return;
            }
            if (jVar.f18907h != 0) {
                long j11 = (jVar.f18908i * j10) / 1000000;
                jVar.f18904e = j11;
                h hVar = jVar.f18903d;
                int i10 = h0.a;
                hVar.startSeek(j11);
                jVar.f18907h = 2;
            }
        }
    }
}
