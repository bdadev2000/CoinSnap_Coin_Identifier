package com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import d0.h;
import d3.g;
import hf.a;
import java.io.Serializable;
import kf.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import lc.b;
import pf.f;
import vf.c;
import vf.d;
import x5.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/result/id/SearchPlantResultActivity;", "Lmf/a;", "Lkf/o0;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchPlantResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchPlantResultActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/result/id/SearchPlantResultActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,266:1\n75#2,13:267\n*S KotlinDebug\n*F\n+ 1 SearchPlantResultActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/result/id/SearchPlantResultActivity\n*L\n53#1:267,13\n*E\n"})
/* loaded from: classes4.dex */
public final class SearchPlantResultActivity extends f {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f16702n = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f16703j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16704k;

    /* renamed from: l, reason: collision with root package name */
    public PlantDomain f16705l;

    /* renamed from: m, reason: collision with root package name */
    public final y0 f16706m;

    public SearchPlantResultActivity() {
        super(9);
        this.f16706m = new y0(Reflection.getOrCreateKotlinClass(SearchPlantResultViewModel.class), new c(this, 15), new c(this, 14), new d(this, 7));
    }

    public final void I() {
        boolean z10;
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (hf.f.a) {
            b bVar = hf.f.f19113d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                bVar = null;
            }
            z10 = bVar.a("native_result");
            if (!z10) {
            }
            FrameLayout frAds = ((o0) n()).u;
            Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
            e.D(frAds);
            RelativeLayout relayAds = ((o0) n()).A;
            Intrinsics.checkNotNullExpressionValue(relayAds, "relayAds");
            e.D(relayAds);
        }
        z10 = false;
        if (!z10 && com.bumptech.glide.d.q(this)) {
            g.r().w(this, "ca-app-pub-6691965685689933/6089232406", R.layout.layout_native_small_result, ((o0) n()).u, ((o0) n()).f20850x.f20932t, new a(this, 6));
            return;
        }
        FrameLayout frAds2 = ((o0) n()).u;
        Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
        e.D(frAds2);
        RelativeLayout relayAds2 = ((o0) n()).A;
        Intrinsics.checkNotNullExpressionValue(relayAds2, "relayAds");
        e.D(relayAds2);
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_search_plant_result;
    }

    @Override // mf.a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        i.c(new qg.b(this, 0), new qg.b(this, 1));
        if (!i.f27402f) {
            if (!this.f16704k) {
                cg.a d10 = i.d();
                d10.f2795b++;
                i.r(d10);
                this.f16704k = true;
                return;
            }
            return;
        }
        i.f27402f = false;
    }

    @Override // mf.a
    public final void q() {
        Bundle extras = getIntent().getExtras();
        int i10 = 1;
        if (extras != null) {
            Serializable serializable = extras.getSerializable("KEY_RESULT_SEARCH");
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.plantcare.ai.identifier.plantid.domains.PlantDomain");
            PlantDomain plantDomain = (PlantDomain) serializable;
            this.f16705l = plantDomain;
            if (plantDomain == null) {
                com.bumptech.glide.d.E(this, R.string.some_thing_went_wrong);
                finish();
            } else {
                Intrinsics.checkNotNull(plantDomain);
                ViewPager2 viewPager2 = ((o0) n()).F;
                lg.a aVar = new lg.a(this, 1);
                aVar.d(plantDomain.getImages());
                viewPager2.setAdapter(aVar);
                viewPager2.setOrientation(0);
                viewPager2.setClipToPadding(false);
                viewPager2.setClipChildren(false);
                viewPager2.setOffscreenPageLimit(1);
                int i11 = 2;
                viewPager2.getChildAt(0).setOverScrollMode(2);
                j2.b bVar = new j2.b();
                bVar.b(new j2.c(20));
                int i12 = 6;
                bVar.b(new pf.g(i12));
                viewPager2.setPageTransformer(bVar);
                viewPager2.a(new androidx.viewpager2.adapter.d(this, i12));
                int size = plantDomain.getImages().size();
                LinearLayout indicatorContainer = ((o0) n()).f20849w;
                Intrinsics.checkNotNullExpressionValue(indicatorContainer, "indicatorContainer");
                e.D(indicatorContainer);
                for (int i13 = 0; i13 < size; i13++) {
                    View view = new View(this);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(24, 24);
                    layoutParams.setMarginEnd(8);
                    view.setLayoutParams(layoutParams);
                    view.setBackgroundResource(R.drawable.slider_indicator_unselected);
                    view.setBackgroundTintList(h.getColorStateList(this, R.color.color_D1E7C2));
                    ((o0) n()).f20849w.addView(view);
                }
                if (((o0) n()).f20849w.getChildCount() > 0) {
                    View childAt = ((o0) n()).f20849w.getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.View");
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(60, 24);
                    layoutParams2.setMarginEnd(8);
                    childAt.setLayoutParams(layoutParams2);
                    View childAt2 = ((o0) n()).f20849w.getChildAt(0);
                    Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type android.view.View");
                    childAt2.setBackgroundResource(R.drawable.slider_indicator_selected);
                    View childAt3 = ((o0) n()).f20849w.getChildAt(0);
                    Intrinsics.checkNotNull(childAt3, "null cannot be cast to non-null type android.view.View");
                    childAt3.setBackgroundTintList(h.getColorStateList(this, R.color.primary));
                }
                Intrinsics.checkNotNullExpressionValue(viewPager2, "apply(...)");
                RecyclerView recyclerView = ((o0) n()).f20852z;
                qf.b bVar2 = new qf.b(i11);
                bVar2.d(plantDomain.getCommonNames());
                recyclerView.setAdapter(bVar2);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
                RecyclerView recyclerView2 = ((o0) n()).f20851y;
                qf.b bVar3 = new qf.b(i10);
                bVar3.d(plantDomain.getCommonDiseases());
                recyclerView2.setAdapter(bVar3);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "apply(...)");
                ((o0) n()).D.setText(plantDomain.getScientificName());
                ((o0) n()).C.setText(plantDomain.getGenus());
                ((o0) n()).B.setText(plantDomain.getFamily());
                ((o0) n()).E.setText("\t" + plantDomain.getTreatment());
                ((o0) n()).D.setSelected(true);
            }
        } else {
            com.bumptech.glide.d.E(this, R.string.some_thing_went_wrong);
            finish();
        }
        if (!o().getBoolean("key_set_show_dialod_rate", false) && !GlobalApp.f16593g) {
            GlobalApp.f16593g = true;
            Intrinsics.checkNotNullParameter(this, "activity");
        }
    }

    @Override // mf.a
    public final void s() {
        ImageView icClose = ((o0) n()).f20848v;
        Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
        e.p(icClose, new qg.a(this, 0));
        LinearLayout btnAddMyPlant = ((o0) n()).f20847t;
        Intrinsics.checkNotNullExpressionValue(btnAddMyPlant, "btnAddMyPlant");
        e.p(btnAddMyPlant, new qg.a(this, 1));
    }
}
