package k;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.ViewCompat;

/* renamed from: k.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2409F extends android.support.v4.media.session.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2411H f21231c;

    public /* synthetic */ C2409F(C2411H c2411h, int i9) {
        this.b = i9;
        this.f21231c = c2411h;
    }

    @Override // T.InterfaceC0277j0
    public final void c() {
        View view;
        switch (this.b) {
            case 0:
                C2411H c2411h = this.f21231c;
                if (c2411h.f21251q && (view = c2411h.f21245i) != null) {
                    view.setTranslationY(0.0f);
                    c2411h.f21242f.setTranslationY(0.0f);
                }
                c2411h.f21242f.setVisibility(8);
                c2411h.f21242f.setTransitioning(false);
                c2411h.f21255u = null;
                o.a aVar = c2411h.m;
                if (aVar != null) {
                    aVar.g(c2411h.l);
                    c2411h.l = null;
                    c2411h.m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c2411h.f21241e;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                C2411H c2411h2 = this.f21231c;
                c2411h2.f21255u = null;
                c2411h2.f21242f.requestLayout();
                return;
        }
    }
}
