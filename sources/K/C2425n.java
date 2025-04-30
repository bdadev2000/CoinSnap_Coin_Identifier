package k;

import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2425n extends android.support.v4.media.session.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21319c;

    public /* synthetic */ C2425n(Object obj, int i9) {
        this.b = i9;
        this.f21319c = obj;
    }

    @Override // android.support.v4.media.session.a, T.InterfaceC0277j0
    public void b() {
        switch (this.b) {
            case 0:
                ((RunnableC2423l) this.f21319c).f21318c.f21388x.setVisibility(0);
                return;
            case 1:
                w wVar = (w) this.f21319c;
                wVar.f21388x.setVisibility(0);
                if (wVar.f21388x.getParent() instanceof View) {
                    ViewCompat.requestApplyInsets((View) wVar.f21388x.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // T.InterfaceC0277j0
    public final void c() {
        switch (this.b) {
            case 0:
                RunnableC2423l runnableC2423l = (RunnableC2423l) this.f21319c;
                runnableC2423l.f21318c.f21388x.setAlpha(1.0f);
                w wVar = runnableC2423l.f21318c;
                wVar.f21345A.d(null);
                wVar.f21345A = null;
                return;
            case 1:
                w wVar2 = (w) this.f21319c;
                wVar2.f21388x.setAlpha(1.0f);
                wVar2.f21345A.d(null);
                wVar2.f21345A = null;
                return;
            default:
                a7.b bVar = (a7.b) this.f21319c;
                ((w) bVar.f4078d).f21388x.setVisibility(8);
                w wVar3 = (w) bVar.f4078d;
                PopupWindow popupWindow = wVar3.f21389y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (wVar3.f21388x.getParent() instanceof View) {
                    ViewCompat.requestApplyInsets((View) wVar3.f21388x.getParent());
                }
                wVar3.f21388x.e();
                wVar3.f21345A.d(null);
                wVar3.f21345A = null;
                ViewCompat.requestApplyInsets(wVar3.f21347C);
                return;
        }
    }
}
