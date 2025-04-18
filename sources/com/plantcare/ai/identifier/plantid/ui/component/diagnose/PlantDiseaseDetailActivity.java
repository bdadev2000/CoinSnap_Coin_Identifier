package com.plantcare.ai.identifier.plantid.ui.component.diagnose;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import d0.h;
import j2.c;
import java.util.List;
import kf.c0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import pf.g;
import pf.i;
import pf.j;
import qf.b;
import y0.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/diagnose/PlantDiseaseDetailActivity;", "Lmf/a;", "Lkf/c0;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PlantDiseaseDetailActivity extends a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f16612g = 0;

    /* renamed from: f, reason: collision with root package name */
    public b f16613f;

    public static final void t(PlantDiseaseDetailActivity plantDiseaseDetailActivity, int i10) {
        int childCount = ((c0) plantDiseaseDetailActivity.n()).f20717v.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ((c0) plantDiseaseDetailActivity.n()).f20717v.getChildAt(i11);
            if (i11 == i10) {
                childAt.setBackgroundResource(R.drawable.slider_indicator_selected);
                childAt.setBackgroundTintList(h.getColorStateList(plantDiseaseDetailActivity, R.color.primary));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(60, 24);
                layoutParams.setMarginEnd(8);
                childAt.setLayoutParams(layoutParams);
            } else {
                childAt.setBackgroundResource(R.drawable.slider_indicator_unselected);
                childAt.setBackgroundTintList(h.getColorStateList(plantDiseaseDetailActivity, R.color.color_D1E7C2));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(24, 24);
                layoutParams2.setMarginEnd(8);
                childAt.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_plant_disease_detail;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(-1);
        finish();
    }

    @Override // h.m, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ViewPager2 viewPager2 = ((c0) n()).A;
        ((List) viewPager2.f2149d.f2130b).remove(new j());
    }

    @Override // mf.a
    public final void q() {
        rf.a aVar;
        List emptyList;
        int i10;
        String str;
        String str2;
        String str3;
        List list;
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = getIntent().getParcelableExtra("KEY_PLANT_DISEASE", rf.a.class);
            aVar = (rf.a) parcelableExtra;
        } else {
            aVar = (rf.a) getIntent().getParcelableExtra("KEY_PLANT_DISEASE");
        }
        int i11 = 0;
        b bVar = new b(i11);
        this.f16613f = bVar;
        if (aVar == null || (emptyList = aVar.f24120b) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        bVar.d(emptyList);
        ViewPager2 viewPager2 = ((c0) n()).A;
        b bVar2 = this.f16613f;
        String str4 = null;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewPagerAdapter");
            bVar2 = null;
        }
        viewPager2.setAdapter(bVar2);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        int i12 = 1;
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.getChildAt(0).setOverScrollMode(2);
        j2.b bVar3 = new j2.b();
        bVar3.b(new c(20));
        bVar3.b(new g(i11));
        viewPager2.setPageTransformer(bVar3);
        viewPager2.a(new i(this, i11));
        if (aVar != null && (list = aVar.f24120b) != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        LinearLayout indicatorContainer = ((c0) n()).f20717v;
        Intrinsics.checkNotNullExpressionValue(indicatorContainer, "indicatorContainer");
        e.D(indicatorContainer);
        for (int i13 = 0; i13 < i10; i13++) {
            View view = new View(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(24, 24);
            layoutParams.setMarginEnd(8);
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(R.drawable.slider_indicator_unselected);
            view.setBackgroundTintList(h.getColorStateList(this, R.color.color_D1E7C2));
            ((c0) n()).f20717v.addView(view);
        }
        if (((c0) n()).f20717v.getChildCount() > 0) {
            View childAt = ((c0) n()).f20717v.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.View");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(60, 24);
            layoutParams2.setMarginEnd(8);
            childAt.setLayoutParams(layoutParams2);
            View childAt2 = ((c0) n()).f20717v.getChildAt(0);
            Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type android.view.View");
            childAt2.setBackgroundResource(R.drawable.slider_indicator_selected);
            View childAt3 = ((c0) n()).f20717v.getChildAt(0);
            Intrinsics.checkNotNull(childAt3, "null cannot be cast to non-null type android.view.View");
            childAt3.setBackgroundTintList(h.getColorStateList(this, R.color.primary));
        }
        ((c0) n()).A.a(new i(this, i12));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(R.string.disease));
        sb2.append(' ');
        if (aVar != null) {
            str = getString(aVar.f24121c);
        } else {
            str = null;
        }
        sb2.append(str);
        SpannableString spannableString = new SpannableString(sb2.toString());
        spannableString.setSpan(new ForegroundColorSpan(h.getColor(this, R.color.primary)), 0, getString(R.string.disease).length(), 33);
        ((c0) n()).f20719x.setText(spannableString);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getString(R.string.symptoms));
        sb3.append(' ');
        if (aVar != null) {
            str2 = getString(aVar.f24122d);
        } else {
            str2 = null;
        }
        sb3.append(str2);
        SpannableString spannableString2 = new SpannableString(sb3.toString());
        spannableString2.setSpan(new ForegroundColorSpan(h.getColor(this, R.color.primary)), 0, getString(R.string.symptoms).length(), 33);
        ((c0) n()).f20721z.setText(spannableString2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getString(R.string.cause));
        sb4.append(' ');
        if (aVar != null) {
            str3 = getString(aVar.f24123f);
        } else {
            str3 = null;
        }
        sb4.append(str3);
        SpannableString spannableString3 = new SpannableString(sb4.toString());
        spannableString3.setSpan(new ForegroundColorSpan(h.getColor(this, R.color.primary)), 0, getString(R.string.cause).length(), 33);
        ((c0) n()).f20718w.setText(spannableString3);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(getString(R.string.management));
        sb5.append(' ');
        if (aVar != null) {
            str4 = getString(aVar.f24124g);
        }
        sb5.append(str4);
        SpannableString spannableString4 = new SpannableString(sb5.toString());
        spannableString4.setSpan(new ForegroundColorSpan(h.getColor(this, R.color.primary)), 0, getString(R.string.management).length(), 33);
        ((c0) n()).f20720y.setText(spannableString4);
        x5.i.c(new pf.h(this, i11), new pf.h(this, i12));
    }

    @Override // mf.a
    public final void s() {
        ImageView icClose = ((c0) n()).u;
        Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
        e.p(icClose, new p0(this, 3));
    }
}
