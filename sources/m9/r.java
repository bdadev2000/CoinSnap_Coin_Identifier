package m9;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final /* synthetic */ class r {
    public final /* synthetic */ t a;

    public final void a(int i10) {
        int i11;
        t tVar = this.a;
        synchronized (tVar) {
            int i12 = tVar.f21751i;
            if (i12 == 0 || tVar.f21747e) {
                if (i12 != i10) {
                    tVar.f21751i = i10;
                    if (i10 != 1 && i10 != 0 && i10 != 8) {
                        tVar.f21754l = tVar.b(i10);
                        ((n9.c0) tVar.f21746d).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (tVar.f21748f > 0) {
                            i11 = (int) (elapsedRealtime - tVar.f21749g);
                        } else {
                            i11 = 0;
                        }
                        tVar.c(i11, tVar.f21750h, tVar.f21754l);
                        tVar.f21749g = elapsedRealtime;
                        tVar.f21750h = 0L;
                        tVar.f21753k = 0L;
                        tVar.f21752j = 0L;
                        u0 u0Var = tVar.f21745c;
                        u0Var.f21761b.clear();
                        u0Var.f21763d = -1;
                        u0Var.f21764e = 0;
                        u0Var.f21765f = 0;
                    }
                }
            }
        }
    }
}
