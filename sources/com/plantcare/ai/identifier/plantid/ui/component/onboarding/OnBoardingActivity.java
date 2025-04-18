package com.plantcare.ai.identifier.plantid.ui.component.onboarding;

import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager2.adapter.d;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.e;
import com.facebook.internal.i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.GuideModel;
import j2.b;
import j2.c;
import kf.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import pf.g;
import v8.u0;
import y0.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/onboarding/OnBoardingActivity;", "Lmf/a;", "Lkf/a0;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OnBoardingActivity extends a {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f16664l = 0;

    /* renamed from: f, reason: collision with root package name */
    public lg.a f16665f;

    /* renamed from: g, reason: collision with root package name */
    public int f16666g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16667h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16668i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16669j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16670k;

    @Override // mf.a
    public final int m() {
        return R.layout.activity_onboarding;
    }

    @Override // mf.a
    public final void q() {
        boolean z10;
        boolean z11;
        if (u0.f26302h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16669j = z10;
        if (u0.f26303i != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f16670k = z11;
        ((a0) n()).f20694x.setText(getString(R.string.next_onb));
        ViewPager2 viewPager2 = ((a0) n()).H;
        lg.a aVar = new lg.a(this, 0);
        int i10 = 4;
        aVar.d(CollectionsKt.mutableListOf(new GuideModel(R.drawable.img_onb_1, R.string.title_onb_1, R.string.des_onb_1), new GuideModel(R.drawable.img_onb_2, R.string.title_onb_2, R.string.des_onb_2), new GuideModel(R.drawable.img_onb_3, R.string.title_onb_3, R.string.des_onb_3), new GuideModel(R.drawable.img_onb_4, R.string.title_onb_4, R.string.des_onb_4)));
        this.f16665f = aVar;
        b bVar = new b();
        bVar.b(new c(100));
        bVar.b(new g(i10));
        viewPager2.setAdapter(this.f16665f);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(4);
        viewPager2.getChildAt(0).setOverScrollMode(0);
        viewPager2.setPageTransformer(bVar);
        viewPager2.a(new d(this, i10));
        Intrinsics.checkNotNullExpressionValue(viewPager2, "apply(...)");
        u(u0.f26302h);
    }

    @Override // mf.a
    public final void s() {
        ((a0) n()).f20694x.setOnClickListener(new z2.b(this, 8));
        TextView tvGetStartCenter = ((a0) n()).f20695y;
        Intrinsics.checkNotNullExpressionValue(tvGetStartCenter, "tvGetStartCenter");
        e.p(tvGetStartCenter, new p0(this, 11));
    }

    public final void t() {
        FrameLayout frAds = ((a0) n()).f20691t;
        Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
        e.D(frAds);
        FrameLayout frAds2 = ((a0) n()).f20691t;
        Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
        e.D(frAds2);
    }

    public final void u(e3.b bVar) {
        kg.a listener = new kg.a(this, bVar);
        Intrinsics.checkNotNullParameter(listener, "listener");
        u0.f26304j = listener;
        w(bVar);
    }

    public final void v() {
        FrameLayout frAds = ((a0) n()).f20691t;
        Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
        e.V(frAds);
    }

    public final void w(e3.b bVar) {
        Unit unit;
        if (bVar != null) {
            if (!i.A(this)) {
                t();
            } else if (!this.f16667h) {
                this.f16667h = true;
                v();
                d3.g r6 = d3.g.r();
                FrameLayout frameLayout = ((a0) n()).f20691t;
                ShimmerFrameLayout shimmerFrameLayout = ((a0) n()).f20693w.f20900t;
                r6.getClass();
                d3.g.C(this, bVar, frameLayout, shimmerFrameLayout);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            t();
        }
    }
}
