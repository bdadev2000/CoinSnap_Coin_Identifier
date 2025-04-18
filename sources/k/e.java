package k;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.q2;
import androidx.appcompat.widget.t0;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20057c;

    public /* synthetic */ e(Object obj, int i10) {
        this.f20056b = i10;
        this.f20057c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f20056b;
        boolean z10 = false;
        Object obj = this.f20057c;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                if (iVar.a()) {
                    ArrayList arrayList = iVar.f20094k;
                    if (arrayList.size() > 0 && !((h) arrayList.get(0)).a.A) {
                        View view = iVar.f20101r;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((h) it.next()).a.show();
                            }
                            return;
                        }
                        iVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h0 h0Var = (h0) obj;
                if (h0Var.a()) {
                    q2 q2Var = h0Var.f20075k;
                    if (!q2Var.A) {
                        View view2 = h0Var.f20080p;
                        if (view2 != null && view2.isShown()) {
                            q2Var.show();
                            return;
                        } else {
                            h0Var.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                t0 t0Var = (t0) obj;
                if (!t0Var.getInternalPopup().a()) {
                    t0Var.f1036h.j(l0.b(t0Var), l0.a(t0Var));
                }
                ViewTreeObserver viewTreeObserver = t0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    k0.a(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                q0 q0Var = (q0) obj;
                t0 t0Var2 = q0Var.I;
                if (ViewCompat.isAttachedToWindow(t0Var2) && t0Var2.getGlobalVisibleRect(q0Var.G)) {
                    z10 = true;
                }
                if (!z10) {
                    q0Var.dismiss();
                    return;
                } else {
                    q0Var.r();
                    q0Var.show();
                    return;
                }
        }
    }
}
