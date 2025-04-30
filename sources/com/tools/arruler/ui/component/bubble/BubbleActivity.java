package com.tools.arruler.ui.component.bubble;

import C6.a;
import C6.d;
import G7.j;
import Q7.AbstractC0255x;
import Q7.F;
import R7.c;
import V7.o;
import X7.e;
import a7.b;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import m1.g;
import n1.C2473d;
import n1.C2475f;
import p1.C2538b;
import u6.AbstractC2787c;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class BubbleActivity extends AbstractActivityC2926b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f19648f = 0;

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_bubble;
    }

    @Override // f.l, android.app.Activity
    public final void onBackPressed() {
        b bVar = b.f4076f;
        if (bVar != null) {
            bVar.A("FIRST_RATE", true);
            finish();
            return;
        }
        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        boolean z8 = true;
        AbstractC2787c abstractC2787c = (AbstractC2787c) k();
        e eVar = F.f2529a;
        c cVar = o.f3533a;
        AbstractC0255x.l(AbstractC0255x.a(cVar), null, null, new d(abstractC2787c, null), 3);
        AbstractC0255x.l(AbstractC0255x.a(cVar), null, null, new C6.e(abstractC2787c, null), 3);
        ImageView imageView = abstractC2787c.f23271t;
        j.d(imageView, "ivBack");
        com.bumptech.glide.d.I(imageView, new a(this, 0));
        ImageView imageView2 = abstractC2787c.f23272u;
        j.d(imageView2, "ivSetSensor");
        com.bumptech.glide.d.I(imageView2, new a(abstractC2787c, 1));
        if (android.support.v4.media.session.a.v(this)) {
            q6.c a6 = q6.c.f22801e.a();
            try {
                if (a6.f22803a) {
                    k5.b bVar = a6.f22805d;
                    if (bVar != null) {
                        z8 = bVar.c("native_spirit");
                    } else {
                        j.k("remoteConfig");
                        throw null;
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                z8 = false;
            }
            if (z8 && !C2538b.a().m) {
                C2475f p2 = C2475f.p();
                AbstractC2787c abstractC2787c2 = (AbstractC2787c) k();
                ShimmerFrameLayout shimmerFrameLayout = ((AbstractC2787c) k()).f23274w.f23194q;
                C6.b bVar2 = new C6.b(this, 0);
                p2.getClass();
                g.b().d(this, "ca-app-pub-6691965685689933/4355352096", new C2473d(p2, bVar2, R.layout.layout_native_spirit, this, abstractC2787c2.f23270s, shimmerFrameLayout));
                return;
            }
        }
        ((AbstractC2787c) k()).f23270s.removeAllViews();
    }
}
