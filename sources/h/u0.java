package h;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class u0 extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f18667g;

    public /* synthetic */ u0(w0 w0Var, int i10) {
        this.f18666f = i10;
        this.f18667g = w0Var;
    }

    @Override // n0.s1
    public final void c() {
        View view;
        int i10 = this.f18666f;
        w0 w0Var = this.f18667g;
        switch (i10) {
            case 0:
                if (w0Var.u && (view = w0Var.f18684m) != null) {
                    view.setTranslationY(0.0f);
                    w0Var.f18681j.setTranslationY(0.0f);
                }
                w0Var.f18681j.setVisibility(8);
                w0Var.f18681j.setTransitioning(false);
                w0Var.f18695y = null;
                j.b bVar = w0Var.f18688q;
                if (bVar != null) {
                    bVar.a(w0Var.f18687p);
                    w0Var.f18687p = null;
                    w0Var.f18688q = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = w0Var.f18680i;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                w0Var.f18695y = null;
                w0Var.f18681j.requestLayout();
                return;
        }
    }
}
