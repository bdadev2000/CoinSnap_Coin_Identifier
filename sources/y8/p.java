package y8;

import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.h0;
import n9.x;
import s7.r0;
import s7.x1;
import v8.t0;
import v8.y0;
import y7.a0;
import y7.z;

/* loaded from: classes3.dex */
public final class p implements a0 {
    public final y0 a;

    /* renamed from: b, reason: collision with root package name */
    public final r4.c f28109b = new r4.c(14, 0);

    /* renamed from: c, reason: collision with root package name */
    public final l8.d f28110c = new l8.d();

    /* renamed from: d, reason: collision with root package name */
    public long f28111d = C.TIME_UNSET;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f28112e;

    public p(q qVar, m9.q qVar2) {
        this.f28112e = qVar;
        this.a = new y0(qVar2, null, null);
    }

    @Override // y7.a0
    public final void a(int i10, x xVar) {
        this.a.e(i10, xVar);
    }

    @Override // y7.a0
    public final int b(m9.i iVar, int i10, boolean z10) {
        return this.a.c(iVar, i10, z10);
    }

    @Override // y7.a0
    public final void d(long j3, int i10, int i11, int i12, z zVar) {
        long g10;
        long j10;
        this.a.d(j3, i10, i11, i12, zVar);
        while (true) {
            boolean z10 = false;
            if (!this.a.p(false)) {
                break;
            }
            l8.d dVar = this.f28110c;
            dVar.e();
            if (this.a.s(this.f28109b, dVar, 0, false) == -4) {
                dVar.h();
            } else {
                dVar = null;
            }
            if (dVar != null) {
                long j11 = dVar.f26892h;
                l8.b f10 = this.f28112e.f28115d.f(dVar);
                if (f10 != null) {
                    n8.a aVar = (n8.a) f10.f21159b[0];
                    String str = aVar.f22507b;
                    String str2 = aVar.f22508c;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(str2) || "3".equals(str2))) {
                        z10 = true;
                    }
                    if (z10) {
                        try {
                            j10 = h0.K(h0.l(aVar.f22511g));
                        } catch (x1 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != C.TIME_UNSET) {
                            o oVar = new o(j11, j10);
                            Handler handler = this.f28112e.f28116f;
                            handler.sendMessage(handler.obtainMessage(1, oVar));
                        }
                    }
                }
            }
        }
        y0 y0Var = this.a;
        t0 t0Var = y0Var.a;
        synchronized (y0Var) {
            int i13 = y0Var.f26339s;
            if (i13 == 0) {
                g10 = -1;
            } else {
                g10 = y0Var.g(i13);
            }
        }
        t0Var.b(g10);
    }

    @Override // y7.a0
    public final void f(r0 r0Var) {
        this.a.f(r0Var);
    }
}
