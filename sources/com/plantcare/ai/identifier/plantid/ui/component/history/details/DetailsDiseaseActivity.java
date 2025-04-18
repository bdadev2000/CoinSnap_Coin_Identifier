package com.plantcare.ai.identifier.plantid.ui.component.history.details;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain;
import com.plantcare.ai.identifier.plantid.domains.HistoryDomain;
import d0.h;
import j2.b;
import j2.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import pf.g;
import y0.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/history/details/DetailsDiseaseActivity;", "Lmf/a;", "Lkf/a;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DetailsDiseaseActivity extends a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16624f = 0;

    @Override // mf.a
    public final int m() {
        return R.layout.activity_details_disease;
    }

    @Override // mf.a
    public final void q() {
        String str;
        String description;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("KEY_HISTORY");
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.plantcare.ai.identifier.plantid.domains.HistoryDomain");
            HistoryDomain historyDomain = (HistoryDomain) serializable;
            if (historyDomain == null) {
                d.E(this, R.string.some_thing_went_wrong);
                finish();
                return;
            }
            Intrinsics.checkNotNull(historyDomain);
            ViewPager2 viewPager2 = ((kf.a) n()).A;
            lg.a aVar = new lg.a(this, 1);
            aVar.d(historyDomain.getImages());
            viewPager2.setAdapter(aVar);
            viewPager2.setOrientation(0);
            viewPager2.setClipToPadding(false);
            viewPager2.setClipChildren(false);
            viewPager2.setOffscreenPageLimit(1);
            viewPager2.getChildAt(0).setOverScrollMode(2);
            b bVar = new b();
            bVar.b(new c(20));
            bVar.b(new g(1));
            viewPager2.setPageTransformer(bVar);
            viewPager2.a(new androidx.viewpager2.adapter.d(this, 2));
            int size = historyDomain.getImages().size();
            LinearLayout indicatorContainer = ((kf.a) n()).f20686v;
            Intrinsics.checkNotNullExpressionValue(indicatorContainer, "indicatorContainer");
            e.D(indicatorContainer);
            for (int i10 = 0; i10 < size; i10++) {
                View view = new View(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(24, 24);
                layoutParams.setMarginEnd(8);
                view.setLayoutParams(layoutParams);
                view.setBackgroundResource(R.drawable.slider_indicator_unselected);
                view.setBackgroundTintList(h.getColorStateList(this, R.color.color_D1E7C2));
                ((kf.a) n()).f20686v.addView(view);
            }
            if (((kf.a) n()).f20686v.getChildCount() > 0) {
                View childAt = ((kf.a) n()).f20686v.getChildAt(0);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.View");
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(60, 24);
                layoutParams2.setMarginEnd(8);
                childAt.setLayoutParams(layoutParams2);
                View childAt2 = ((kf.a) n()).f20686v.getChildAt(0);
                Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type android.view.View");
                childAt2.setBackgroundResource(R.drawable.slider_indicator_selected);
                View childAt3 = ((kf.a) n()).f20686v.getChildAt(0);
                Intrinsics.checkNotNull(childAt3, "null cannot be cast to non-null type android.view.View");
                childAt3.setBackgroundTintList(h.getColorStateList(this, R.color.primary));
            }
            Intrinsics.checkNotNullExpressionValue(viewPager2, "apply(...)");
            TextView textView = ((kf.a) n()).f20689y;
            DiseasePlantDomain diseases = historyDomain.getDiseases();
            String str2 = "";
            if (diseases == null || (str = diseases.getName()) == null) {
                str = "";
            }
            textView.setText(str);
            TextView textView2 = ((kf.a) n()).f20688x;
            DiseasePlantDomain diseases2 = historyDomain.getDiseases();
            if (diseases2 != null && (description = diseases2.getDescription()) != null) {
                str2 = description;
            }
            textView2.setText(str2);
            ((kf.a) n()).f20690z.setText(historyDomain.getTreatment());
            ((kf.a) n()).f20689y.setSelected(true);
            return;
        }
        d.E(this, R.string.some_thing_went_wrong);
        finish();
    }

    @Override // mf.a
    public final void s() {
        ImageView icClose = ((kf.a) n()).u;
        Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
        e.p(icClose, new p0(this, 6));
    }
}
