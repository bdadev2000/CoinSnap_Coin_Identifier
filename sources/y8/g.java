package y8;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import m9.i0;
import m9.k0;
import m9.n0;
import m9.q0;
import m9.v0;
import n9.a0;
import n9.w;
import n9.z;
import v8.u;

/* loaded from: classes3.dex */
public final class g implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28059b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28060c;

    public /* synthetic */ g(Object obj, int i10) {
        this.f28059b = i10;
        this.f28060c = obj;
    }

    @Override // m9.i0
    public final j8.e a(k0 k0Var, long j3, long j10, IOException iOException, int i10) {
        switch (this.f28059b) {
            case 0:
                return f((q0) k0Var, j3, j10, iOException, i10);
            case 1:
                return f((q0) k0Var, j3, j10, iOException, i10);
            default:
                z zVar = (z) this.f28060c;
                if (zVar != null) {
                    h hVar = (h) ((y7.q) zVar).f27991b;
                    int i11 = h.Q;
                    hVar.getClass();
                    n9.o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                    hVar.u(true);
                }
                return n0.f21691f;
        }
    }

    @Override // m9.i0
    public final void b(k0 k0Var, long j3, long j10, boolean z10) {
        switch (this.f28059b) {
            case 0:
                d((q0) k0Var, j3, j10);
                return;
            case 1:
                d((q0) k0Var, j3, j10);
                return;
            default:
                return;
        }
    }

    @Override // m9.i0
    public final void c(k0 k0Var, long j3, long j10) {
        boolean z10;
        switch (this.f28059b) {
            case 0:
                e((q0) k0Var, j3, j10);
                return;
            case 1:
                e((q0) k0Var, j3, j10);
                return;
            default:
                z zVar = (z) this.f28060c;
                if (zVar != null) {
                    synchronized (a0.f22513b) {
                        z10 = a0.f22514c;
                    }
                    if (!z10) {
                        IOException iOException = new IOException(new ConcurrentModificationException());
                        h hVar = (h) ((y7.q) zVar).f27991b;
                        int i10 = h.Q;
                        hVar.getClass();
                        n9.o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                        hVar.u(true);
                        return;
                    }
                    ((y7.q) zVar).c();
                    return;
                }
                return;
        }
    }

    public final void d(q0 q0Var, long j3, long j10) {
        int i10 = this.f28059b;
        Object obj = this.f28060c;
        switch (i10) {
            case 0:
                ((h) obj).t(q0Var, j3, j10);
                return;
            default:
                ((h) obj).t(q0Var, j3, j10);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(m9.q0 r18, long r19, long r21) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.g.e(m9.q0, long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j8.e f(q0 q0Var, long j3, long j10, IOException iOException, int i10) {
        j8.e eVar;
        int i11 = this.f28059b;
        Object obj = this.f28060c;
        switch (i11) {
            case 0:
                h hVar = (h) obj;
                hVar.getClass();
                long j11 = q0Var.f21720b;
                v0 v0Var = q0Var.f21723f;
                Uri uri = v0Var.f21778c;
                v8.p pVar = new v8.p(v0Var.f21779d);
                int i12 = q0Var.f21722d;
                w wVar = new w(pVar, new u(i12), iOException, i10);
                hVar.f28067n.getClass();
                long k10 = ac.e.k(wVar);
                int i13 = 0;
                if (k10 == C.TIME_UNSET) {
                    eVar = n0.f21692g;
                } else {
                    eVar = new j8.e(i13, k10, i13);
                }
                j8.e eVar2 = eVar;
                int i14 = eVar2.a;
                if (i14 == 0 || i14 == 1) {
                    i13 = 1;
                }
                hVar.f28071r.p(pVar, i12, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, 1 ^ i13);
                return eVar2;
            default:
                h hVar2 = (h) obj;
                hVar2.getClass();
                long j12 = q0Var.f21720b;
                v0 v0Var2 = q0Var.f21723f;
                Uri uri2 = v0Var2.f21778c;
                hVar2.f28071r.p(new v8.p(v0Var2.f21779d), q0Var.f21722d, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, true);
                hVar2.f28067n.getClass();
                n9.o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                hVar2.u(true);
                return n0.f21691f;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        this((Object) hVar, 0);
        this.f28059b = i10;
        int i11 = 1;
        if (i10 != 1) {
        } else {
            this((Object) hVar, i11);
        }
    }
}
