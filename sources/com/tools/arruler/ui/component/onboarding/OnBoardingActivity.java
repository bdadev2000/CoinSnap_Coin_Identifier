package com.tools.arruler.ui.component.onboarding;

import G7.j;
import R6.a;
import S0.b;
import S0.c;
import a.AbstractC0325a;
import com.bumptech.glide.d;
import com.facebook.appevents.n;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.models.GuideModel;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import n1.C2475f;
import o1.C2493b;
import u6.AbstractC2799o;
import x6.AbstractActivityC2926b;
import x6.f;

/* loaded from: classes3.dex */
public final class OnBoardingActivity extends AbstractActivityC2926b {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f19676j = 0;

    /* renamed from: f, reason: collision with root package name */
    public a f19677f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19678g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19679h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f19680i = new ArrayList();

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_onboarding;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x6.f, R6.a] */
    @Override // x6.AbstractActivityC2926b
    public final void p() {
        ?? fVar = new f();
        fVar.f2762k = this;
        this.f19677f = fVar;
        ((AbstractC2799o) k()).f23365A.setAdapter(this.f19677f);
        ((AbstractC2799o) k()).f23365A.setClipToPadding(false);
        ((AbstractC2799o) k()).f23365A.setClipChildren(false);
        ((AbstractC2799o) k()).f23365A.setOffscreenPageLimit(4);
        ((AbstractC2799o) k()).f23365A.getChildAt(0).setOverScrollMode(0);
        b bVar = new b();
        c cVar = new c();
        ArrayList arrayList = bVar.f2771a;
        arrayList.add(cVar);
        arrayList.add(new Object());
        ((AbstractC2799o) k()).f23365A.setPageTransformer(bVar);
        AbstractC2799o abstractC2799o = (AbstractC2799o) k();
        ((ArrayList) abstractC2799o.f23365A.f5168d.b).add(new E6.f(this, 1));
        ArrayList arrayList2 = this.f19680i;
        arrayList2.add(new GuideModel(R.drawable.img_ob_first, R.string.ar_rule_camera, R.string.ob_first));
        arrayList2.add(new GuideModel(R.drawable.img_ob_second, R.string.ar_rule_camera, R.string.ob_second));
        if (n.b != null) {
            arrayList2.add(new GuideModel(0, 0, 0, 7, null));
        }
        arrayList2.add(new GuideModel(R.drawable.img_ob_third, R.string.ar_rule_camera, R.string.ob_third));
        arrayList2.add(new GuideModel(R.drawable.img_ob_fourth, R.string.ar_rule_camera, R.string.ob_fourth));
        a aVar = this.f19677f;
        if (aVar != null) {
            ArrayList arrayList3 = aVar.f24240i;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            aVar.notifyDataSetChanged();
        }
        t(n.f13499c);
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        AbstractC2799o abstractC2799o = (AbstractC2799o) k();
        abstractC2799o.f23371v.setOnClickListener(new A6.c(this, 2));
    }

    public final void t(C2493b c2493b) {
        u(c2493b);
        n.f13505i = new a7.b(9, this, c2493b);
    }

    public final void u(C2493b c2493b) {
        if (!AbstractC0325a.i(this)) {
            ShimmerFrameLayout shimmerFrameLayout = ((AbstractC2799o) k()).f23370u.f23197q;
            j.d(shimmerFrameLayout, "shimmerNativeLarge");
            d.M(shimmerFrameLayout);
            return;
        }
        if (!this.f19678g) {
            if (c2493b != null) {
                ShimmerFrameLayout shimmerFrameLayout2 = ((AbstractC2799o) k()).f23370u.f23197q;
                j.d(shimmerFrameLayout2, "shimmerNativeLarge");
                d.a0(shimmerFrameLayout2);
                C2475f p2 = C2475f.p();
                AbstractC2799o abstractC2799o = (AbstractC2799o) k();
                ShimmerFrameLayout shimmerFrameLayout3 = ((AbstractC2799o) k()).f23370u.f23197q;
                p2.getClass();
                C2475f.u(this, c2493b, abstractC2799o.f23367r, shimmerFrameLayout3);
                this.f19678g = true;
                return;
            }
            ShimmerFrameLayout shimmerFrameLayout4 = ((AbstractC2799o) k()).f23370u.f23197q;
            j.d(shimmerFrameLayout4, "shimmerNativeLarge");
            d.M(shimmerFrameLayout4);
        }
    }
}
