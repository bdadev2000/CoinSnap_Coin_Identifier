package com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.di;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import d0.h;
import j2.b;
import java.io.Serializable;
import kf.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.a;
import pf.f;
import pf.g;
import x5.i;
import y0.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/result/di/DiResultActivity;", "Lmf/a;", "Lkf/c;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DiResultActivity extends f {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f16701j = 0;

    public DiResultActivity() {
        super(8);
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_di_result;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // mf.a
    public final void q() {
        String str;
        String description;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("KEY_RESULT_SEARCH");
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.plantcare.ai.identifier.plantid.domains.PlantDomain");
            PlantDomain plantDomain = (PlantDomain) serializable;
            if (plantDomain == null) {
                d.E(this, R.string.some_thing_went_wrong);
                finish();
            } else {
                Intrinsics.checkNotNull(plantDomain);
                ViewPager2 viewPager2 = ((c) n()).A;
                a aVar = new a(this, 1);
                aVar.d(plantDomain.getImages());
                viewPager2.setAdapter(aVar);
                viewPager2.setOrientation(0);
                viewPager2.setClipToPadding(false);
                viewPager2.setClipChildren(false);
                viewPager2.setOffscreenPageLimit(1);
                viewPager2.getChildAt(0).setOverScrollMode(2);
                b bVar = new b();
                bVar.b(new j2.c(20));
                bVar.b(new g(5));
                viewPager2.setPageTransformer(bVar);
                viewPager2.a(new androidx.viewpager2.adapter.d(this, 5));
                int size = plantDomain.getImages().size();
                LinearLayout indicatorContainer = ((c) n()).f20711v;
                Intrinsics.checkNotNullExpressionValue(indicatorContainer, "indicatorContainer");
                e.D(indicatorContainer);
                for (int i10 = 0; i10 < size; i10++) {
                    View view = new View(this);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(24, 24);
                    layoutParams.setMarginEnd(8);
                    view.setLayoutParams(layoutParams);
                    view.setBackgroundResource(R.drawable.slider_indicator_unselected);
                    view.setBackgroundTintList(h.getColorStateList(this, R.color.color_D1E7C2));
                    ((c) n()).f20711v.addView(view);
                }
                if (((c) n()).f20711v.getChildCount() > 0) {
                    View childAt = ((c) n()).f20711v.getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.View");
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(60, 24);
                    layoutParams2.setMarginEnd(8);
                    childAt.setLayoutParams(layoutParams2);
                    View childAt2 = ((c) n()).f20711v.getChildAt(0);
                    Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type android.view.View");
                    childAt2.setBackgroundResource(R.drawable.slider_indicator_selected);
                    View childAt3 = ((c) n()).f20711v.getChildAt(0);
                    Intrinsics.checkNotNull(childAt3, "null cannot be cast to non-null type android.view.View");
                    childAt3.setBackgroundTintList(h.getColorStateList(this, R.color.primary));
                }
                Intrinsics.checkNotNullExpressionValue(viewPager2, "apply(...)");
                TextView textView = ((c) n()).f20714y;
                DiseasePlantDomain diseases = plantDomain.getDiseases();
                String str2 = "";
                if (diseases == null || (str = diseases.getName()) == null) {
                    str = "";
                }
                textView.setText(str);
                TextView textView2 = ((c) n()).f20713x;
                StringBuilder sb2 = new StringBuilder("\t");
                DiseasePlantDomain diseases2 = plantDomain.getDiseases();
                if (diseases2 != null && (description = diseases2.getDescription()) != null) {
                    str2 = description;
                }
                sb2.append(str2);
                textView2.setText(sb2.toString());
                ((c) n()).f20715z.setText("\t" + plantDomain.getTreatment());
                ((c) n()).f20714y.setSelected(true);
            }
        } else {
            d.E(this, R.string.some_thing_went_wrong);
            finish();
        }
        if (!o().getBoolean("key_set_show_dialod_rate", false) && !GlobalApp.f16593g) {
            GlobalApp.f16593g = true;
            Intrinsics.checkNotNullParameter(this, "activity");
        }
        if (!i.f27402f) {
            cg.a d10 = i.d();
            d10.f2795b++;
            i.r(d10);
            return;
        }
        i.f27402f = false;
    }

    @Override // mf.a
    public final void s() {
        ImageView icClose = ((c) n()).u;
        Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
        e.p(icClose, new p0(this, 12));
    }
}
