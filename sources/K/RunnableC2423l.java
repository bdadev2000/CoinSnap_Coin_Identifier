package k;

import T.C0275i0;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* renamed from: k.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2423l implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f21318c;

    public /* synthetic */ RunnableC2423l(w wVar, int i9) {
        this.b = i9;
        this.f21318c = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                w wVar = this.f21318c;
                if ((wVar.f21371b0 & 1) != 0) {
                    wVar.v(0);
                }
                if ((wVar.f21371b0 & 4096) != 0) {
                    wVar.v(108);
                }
                wVar.f21370a0 = false;
                wVar.f21371b0 = 0;
                return;
            default:
                w wVar2 = this.f21318c;
                wVar2.f21389y.showAtLocation(wVar2.f21388x, 55, 0, 0);
                C0275i0 c0275i0 = wVar2.f21345A;
                if (c0275i0 != null) {
                    c0275i0.b();
                }
                if (wVar2.f21346B && (viewGroup = wVar2.f21347C) != null && viewGroup.isLaidOut()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    wVar2.f21388x.setAlpha(0.0f);
                    C0275i0 animate = ViewCompat.animate(wVar2.f21388x);
                    animate.a(1.0f);
                    wVar2.f21345A = animate;
                    animate.d(new C2425n(this, 0));
                    return;
                }
                wVar2.f21388x.setAlpha(1.0f);
                wVar2.f21388x.setVisibility(0);
                return;
        }
    }
}
