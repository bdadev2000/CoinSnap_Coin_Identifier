package y7;

import h.s0;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class e {
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final d f27960b;

    /* renamed from: c, reason: collision with root package name */
    public b f27961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27962d;

    public e(c cVar, d dVar, long j3, long j10, long j11, long j12, long j13, int i10) {
        this.f27960b = dVar;
        this.f27962d = i10;
        this.a = new a(cVar, j3, j10, j11, j12, j13);
    }

    public static int b(m mVar, long j3, p pVar) {
        if (j3 == mVar.getPosition()) {
            return 0;
        }
        pVar.a = j3;
        return 1;
    }

    public final int a(m mVar, p pVar) {
        boolean z10;
        while (true) {
            b bVar = this.f27961c;
            u0.p(bVar);
            long j3 = bVar.f27947f;
            long j10 = bVar.f27948g;
            long j11 = bVar.f27949h;
            long j12 = j10 - j3;
            long j13 = this.f27962d;
            d dVar = this.f27960b;
            if (j12 <= j13) {
                this.f27961c = null;
                dVar.h();
                return b(mVar, j3, pVar);
            }
            long position = j11 - mVar.getPosition();
            if (position >= 0 && position <= 262144) {
                mVar.skipFully((int) position);
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return b(mVar, j11, pVar);
            }
            mVar.resetPeekPosition();
            s0 g10 = dVar.g(mVar, bVar.f27943b);
            int i10 = g10.a;
            if (i10 != -3) {
                long j14 = g10.f18660b;
                long j15 = g10.f18661c;
                if (i10 != -2) {
                    if (i10 != -1) {
                        if (i10 == 0) {
                            long position2 = j15 - mVar.getPosition();
                            if (position2 >= 0 && position2 <= 262144) {
                                mVar.skipFully((int) position2);
                            }
                            this.f27961c = null;
                            dVar.h();
                            return b(mVar, j15, pVar);
                        }
                        throw new IllegalStateException("Invalid case");
                    }
                    bVar.f27946e = j14;
                    bVar.f27948g = j15;
                    bVar.f27949h = b.a(bVar.f27943b, bVar.f27945d, j14, bVar.f27947f, j15, bVar.f27944c);
                } else {
                    bVar.f27945d = j14;
                    bVar.f27947f = j15;
                    bVar.f27949h = b.a(bVar.f27943b, j14, bVar.f27946e, j15, bVar.f27948g, bVar.f27944c);
                }
            } else {
                this.f27961c = null;
                dVar.h();
                return b(mVar, j11, pVar);
            }
        }
    }

    public final void c(long j3) {
        b bVar = this.f27961c;
        if (bVar != null && bVar.a == j3) {
            return;
        }
        a aVar = this.a;
        this.f27961c = new b(j3, aVar.a.a(j3), aVar.f27938c, aVar.f27939d, aVar.f27940e, aVar.f27941f, aVar.f27942g);
    }
}
