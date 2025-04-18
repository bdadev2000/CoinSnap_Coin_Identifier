package h;

import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import n0.r1;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f18663c;

    public /* synthetic */ t(g0 g0Var, int i10) {
        this.f18662b = i10;
        this.f18663c = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        boolean z10 = true;
        int i10 = this.f18662b;
        g0 g0Var = this.f18663c;
        switch (i10) {
            case 0:
                if ((1 & g0Var.f18572b0) != 0) {
                    g0Var.w(0);
                }
                if ((g0Var.f18572b0 & 4096) != 0) {
                    g0Var.w(108);
                }
                g0Var.f18571a0 = false;
                g0Var.f18572b0 = 0;
                return;
            default:
                g0Var.f18592y.showAtLocation(g0Var.f18591x, 55, 0, 0);
                r1 r1Var = g0Var.A;
                if (r1Var != null) {
                    r1Var.b();
                }
                if (!g0Var.B || (viewGroup = g0Var.C) == null || !ViewCompat.isLaidOut(viewGroup)) {
                    z10 = false;
                }
                if (z10) {
                    g0Var.f18591x.setAlpha(0.0f);
                    r1 animate = ViewCompat.animate(g0Var.f18591x);
                    animate.a(1.0f);
                    g0Var.A = animate;
                    animate.d(new v(this, 0));
                    return;
                }
                g0Var.f18591x.setAlpha(1.0f);
                g0Var.f18591x.setVisibility(0);
                return;
        }
    }
}
