package C6;

import F2.h;
import G7.j;
import android.widget.FrameLayout;
import com.facebook.appevents.n;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import com.tools.arruler.ui.component.bubble.BubbleActivity;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.permission.PermissionActivity;
import com.tools.arruler.ui.component.straight.StraightRulerActivity;
import n1.C2475f;
import o1.C2493b;
import u6.AbstractC2785a;
import u6.AbstractC2787c;
import u6.AbstractC2789e;
import u6.AbstractC2801q;
import u6.AbstractC2808y;
import u6.o0;

/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f574d;

    public /* synthetic */ b(Object obj, int i9) {
        this.f573c = i9;
        this.f574d = obj;
    }

    @Override // F2.h
    public final void G(LoadAdError loadAdError) {
        switch (this.f573c) {
            case 0:
                ((AbstractC2787c) ((BubbleActivity) this.f574d).k()).f23270s.removeAllViews();
                return;
            case 1:
                HomeActivity homeActivity = (HomeActivity) this.f574d;
                ((AbstractC2789e) homeActivity.k()).f23288q.removeAllViews();
                FrameLayout frameLayout = ((AbstractC2789e) homeActivity.k()).f23288q;
                j.d(frameLayout, "frBanner");
                com.bumptech.glide.d.M(frameLayout);
                return;
            case 2:
                ((o0) ((G6.e) this.f574d).c()).f23378r.removeAllViews();
                return;
            case 3:
                FrameLayout frameLayout2 = ((AbstractC2801q) ((PermissionActivity) this.f574d).k()).f23394r;
                j.d(frameLayout2, "frAds");
                com.bumptech.glide.d.M(frameLayout2);
                return;
            case 4:
                ((AbstractC2808y) ((StraightRulerActivity) this.f574d).k()).f23436q.removeAllViews();
                return;
            default:
                ((AbstractC2785a) ((ArRulerActivity) this.f574d).k()).f23250q.removeAllViews();
                return;
        }
    }

    @Override // F2.h
    public void H(AdError adError) {
        switch (this.f573c) {
            case 0:
                ((AbstractC2787c) ((BubbleActivity) this.f574d).k()).f23270s.removeAllViews();
                return;
            case 1:
            default:
                return;
            case 2:
                ((o0) ((G6.e) this.f574d).c()).f23378r.removeAllViews();
                return;
        }
    }

    @Override // F2.h
    public void M(C2493b c2493b) {
        switch (this.f573c) {
            case 0:
                return;
            case 1:
            default:
                return;
            case 2:
                n.f13502f = c2493b;
                return;
            case 3:
                C2475f p2 = C2475f.p();
                PermissionActivity permissionActivity = (PermissionActivity) this.f574d;
                AbstractC2801q abstractC2801q = (AbstractC2801q) permissionActivity.k();
                ShimmerFrameLayout shimmerFrameLayout = ((AbstractC2801q) permissionActivity.k()).f23397u.f23197q;
                p2.getClass();
                C2475f.u(permissionActivity, c2493b, abstractC2801q.f23394r, shimmerFrameLayout);
                return;
        }
    }

    private final void b0(C2493b c2493b) {
    }
}
