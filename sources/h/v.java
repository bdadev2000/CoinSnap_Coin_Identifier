package h;

import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class v extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18669g;

    public /* synthetic */ v(Object obj, int i10) {
        this.f18668f = i10;
        this.f18669g = obj;
    }

    @Override // p6.a, n0.s1
    public final void b() {
        int i10 = this.f18668f;
        Object obj = this.f18669g;
        switch (i10) {
            case 0:
                ((t) obj).f18663c.f18591x.setVisibility(0);
                return;
            case 1:
                g0 g0Var = (g0) obj;
                g0Var.f18591x.setVisibility(0);
                if (g0Var.f18591x.getParent() instanceof View) {
                    ViewCompat.requestApplyInsets((View) g0Var.f18591x.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // n0.s1
    public final void c() {
        int i10 = this.f18668f;
        Object obj = this.f18669g;
        switch (i10) {
            case 0:
                t tVar = (t) obj;
                tVar.f18663c.f18591x.setAlpha(1.0f);
                g0 g0Var = tVar.f18663c;
                g0Var.A.d(null);
                g0Var.A = null;
                return;
            case 1:
                g0 g0Var2 = (g0) obj;
                g0Var2.f18591x.setAlpha(1.0f);
                g0Var2.A.d(null);
                g0Var2.A = null;
                return;
            default:
                w wVar = (w) obj;
                wVar.f18676c.f18591x.setVisibility(8);
                g0 g0Var3 = wVar.f18676c;
                PopupWindow popupWindow = g0Var3.f18592y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (g0Var3.f18591x.getParent() instanceof View) {
                    ViewCompat.requestApplyInsets((View) g0Var3.f18591x.getParent());
                }
                g0Var3.f18591x.e();
                g0Var3.A.d(null);
                g0Var3.A = null;
                ViewCompat.requestApplyInsets(g0Var3.C);
                return;
        }
    }
}
