package com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.myplant;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.HistoryDomain;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import d0.h;
import j2.c;
import java.io.Serializable;
import java.util.List;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import pf.g;
import pf.j;
import qf.b;
import x5.i;
import y0.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/main/bottom_bar/myplant/MyPlantDetailActivity;", "Lmf/a;", "Lkf/w;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MyPlantDetailActivity extends a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16661f = 0;

    public static final void t(MyPlantDetailActivity myPlantDetailActivity, int i10) {
        int childCount = ((w) myPlantDetailActivity.n()).f20910v.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ((w) myPlantDetailActivity.n()).f20910v.getChildAt(i11);
            if (i11 == i10) {
                childAt.setBackgroundResource(R.drawable.slider_indicator_selected);
                childAt.setBackgroundTintList(h.getColorStateList(myPlantDetailActivity, R.color.primary));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(60, 24);
                layoutParams.setMarginEnd(8);
                childAt.setLayoutParams(layoutParams);
            } else {
                childAt.setBackgroundResource(R.drawable.slider_indicator_unselected);
                childAt.setBackgroundTintList(h.getColorStateList(myPlantDetailActivity, R.color.color_D1E7C2));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(24, 24);
                layoutParams2.setMarginEnd(8);
                childAt.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_my_plant_detail;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // h.m, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ViewPager2 viewPager2 = ((w) n()).C;
        ((List) viewPager2.f2149d.f2130b).remove(new j());
    }

    @Override // mf.a
    public final void q() {
        PlantDomain plantDomain;
        boolean z10;
        boolean z11;
        Serializable serializableExtra;
        Serializable serializableExtra2;
        int i10 = Build.VERSION.SDK_INT;
        HistoryDomain historyDomain = null;
        if (i10 >= 33) {
            serializableExtra2 = getIntent().getSerializableExtra("KEY_PLANT", PlantDomain.class);
            plantDomain = (PlantDomain) serializableExtra2;
        } else {
            Serializable serializableExtra3 = getIntent().getSerializableExtra("KEY_PLANT");
            if (serializableExtra3 instanceof PlantDomain) {
                plantDomain = (PlantDomain) serializableExtra3;
            } else {
                plantDomain = null;
            }
        }
        if (i10 >= 33) {
            serializableExtra = getIntent().getSerializableExtra("KEY_HISTORY", HistoryDomain.class);
            historyDomain = (HistoryDomain) serializableExtra;
        } else {
            Serializable serializableExtra4 = getIntent().getSerializableExtra("KEY_HISTORY");
            if (serializableExtra4 instanceof HistoryDomain) {
                historyDomain = (HistoryDomain) serializableExtra4;
            }
        }
        int i11 = 0;
        int i12 = 1;
        if (plantDomain != null && historyDomain == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (plantDomain == null && historyDomain != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i13 = 2;
        if (z10) {
            Intrinsics.checkNotNull(plantDomain);
            RecyclerView recyclerView = ((w) n()).f20912x;
            b bVar = new b(i13);
            bVar.d(plantDomain.getCommonNames());
            recyclerView.setAdapter(bVar);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
            ViewPager2 viewPager2 = ((w) n()).C;
            lg.a aVar = new lg.a(this, 1);
            aVar.d(plantDomain.getImages());
            viewPager2.setAdapter(aVar);
            viewPager2.setOrientation(0);
            viewPager2.setClipToPadding(false);
            viewPager2.setClipChildren(false);
            viewPager2.setOffscreenPageLimit(1);
            viewPager2.getChildAt(0).setOverScrollMode(2);
            j2.b bVar2 = new j2.b();
            bVar2.b(new c(20));
            bVar2.b(new g(i13));
            viewPager2.setPageTransformer(bVar2);
            viewPager2.a(new hg.b(this, i11));
            u(plantDomain.getImages().size());
            Intrinsics.checkNotNullExpressionValue(viewPager2, "apply(...)");
            RecyclerView recyclerView2 = ((w) n()).f20911w;
            b bVar3 = new b(i12);
            bVar3.d(plantDomain.getCommonDiseases());
            recyclerView2.setAdapter(bVar3);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "apply(...)");
            w wVar = (w) n();
            wVar.A.setText(plantDomain.getScientificName());
            wVar.f20914z.setText(plantDomain.getGenus());
            wVar.f20913y.setText(plantDomain.getFamily());
            wVar.A.setSelected(true);
            wVar.B.setText("\t" + plantDomain.getTreatment());
        } else if (z11) {
            Intrinsics.checkNotNull(historyDomain);
            RecyclerView recyclerView3 = ((w) n()).f20912x;
            b bVar4 = new b(i13);
            bVar4.d(historyDomain.getCommonNames());
            recyclerView3.setAdapter(bVar4);
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "apply(...)");
            ViewPager2 viewPager22 = ((w) n()).C;
            lg.a aVar2 = new lg.a(this, 1);
            aVar2.d(historyDomain.getImages());
            viewPager22.setAdapter(aVar2);
            viewPager22.setOrientation(0);
            viewPager22.setClipToPadding(false);
            viewPager22.setClipChildren(false);
            viewPager22.setOffscreenPageLimit(1);
            viewPager22.getChildAt(0).setOverScrollMode(2);
            j2.b bVar5 = new j2.b();
            bVar5.b(new c(20));
            bVar5.b(new g(3));
            viewPager22.setPageTransformer(bVar5);
            viewPager22.a(new hg.b(this, i12));
            u(historyDomain.getImages().size());
            Intrinsics.checkNotNullExpressionValue(viewPager22, "apply(...)");
            RecyclerView recyclerView4 = ((w) n()).f20911w;
            b bVar6 = new b(i12);
            bVar6.d(historyDomain.getCommonDiseases());
            recyclerView4.setAdapter(bVar6);
            Intrinsics.checkNotNullExpressionValue(recyclerView4, "apply(...)");
            w wVar2 = (w) n();
            wVar2.A.setText(historyDomain.getScientificName());
            wVar2.f20914z.setText(historyDomain.getGenus());
            wVar2.f20913y.setText(historyDomain.getFamily());
            wVar2.A.setSelected(true);
            wVar2.B.setText("\t" + historyDomain.getTreatment());
        }
        i.c(new hg.a(this, i11), new hg.a(this, i12));
    }

    @Override // mf.a
    public final void s() {
        ImageView icClose = ((w) n()).u;
        Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
        e.p(icClose, new p0(this, 10));
    }

    public final void u(int i10) {
        LinearLayout indicatorContainer = ((w) n()).f20910v;
        Intrinsics.checkNotNullExpressionValue(indicatorContainer, "indicatorContainer");
        e.D(indicatorContainer);
        for (int i11 = 0; i11 < i10; i11++) {
            View view = new View(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(24, 24);
            layoutParams.setMarginEnd(8);
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(R.drawable.slider_indicator_unselected);
            view.setBackgroundTintList(h.getColorStateList(this, R.color.color_D1E7C2));
            ((w) n()).f20910v.addView(view);
        }
        if (((w) n()).f20910v.getChildCount() > 0) {
            View childAt = ((w) n()).f20910v.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.View");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(60, 24);
            layoutParams2.setMarginEnd(8);
            childAt.setLayoutParams(layoutParams2);
            View childAt2 = ((w) n()).f20910v.getChildAt(0);
            Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type android.view.View");
            childAt2.setBackgroundResource(R.drawable.slider_indicator_selected);
            View childAt3 = ((w) n()).f20910v.getChildAt(0);
            Intrinsics.checkNotNull(childAt3, "null cannot be cast to non-null type android.view.View");
            childAt3.setBackgroundTintList(h.getColorStateList(this, R.color.primary));
        }
    }
}
