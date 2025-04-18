package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.LinearLayout;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.history.details.DetailsDiseaseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.history.list.HistoryActivity;
import com.plantcare.ai.identifier.plantid.ui.component.onboarding.OnBoardingActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.di.DiResultActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultActivity;
import j2.l;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kf.a0;
import kf.o0;
import kotlin.jvm.internal.Intrinsics;
import v8.u0;

/* loaded from: classes.dex */
public final class d extends l {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2130b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.f2130b = obj;
    }

    @Override // j2.l
    public final void a(int i10) {
        int i11 = this.a;
        Object obj = this.f2130b;
        switch (i11) {
            case 0:
                ((f) obj).b(false);
                return;
            case 1:
                try {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).a(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e2) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
                }
            default:
                return;
        }
    }

    @Override // j2.l
    public final void b(int i10, float f10, int i11) {
        switch (this.a) {
            case 1:
                try {
                    Iterator it = ((List) this.f2130b).iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).b(i10, f10, i11);
                    }
                    return;
                } catch (ConcurrentModificationException e2) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
                }
            default:
                return;
        }
    }

    @Override // j2.l
    public final void c(int i10) {
        e3.b bVar;
        int i11 = this.a;
        int i12 = 0;
        Object obj = this.f2130b;
        switch (i11) {
            case 0:
                ((f) obj).b(false);
                return;
            case 1:
                try {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).c(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e2) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
                }
            case 2:
                DetailsDiseaseActivity detailsDiseaseActivity = (DetailsDiseaseActivity) obj;
                int i13 = DetailsDiseaseActivity.f16624f;
                int childCount = ((kf.a) detailsDiseaseActivity.n()).f20686v.getChildCount();
                while (i12 < childCount) {
                    View childAt = ((kf.a) detailsDiseaseActivity.n()).f20686v.getChildAt(i12);
                    if (i12 == i10) {
                        childAt.setBackgroundResource(R.drawable.slider_indicator_selected);
                        childAt.setBackgroundTintList(d0.h.getColorStateList(detailsDiseaseActivity, R.color.primary));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(60, 24);
                        layoutParams.setMarginEnd(8);
                        childAt.setLayoutParams(layoutParams);
                    } else {
                        childAt.setBackgroundResource(R.drawable.slider_indicator_unselected);
                        childAt.setBackgroundTintList(d0.h.getColorStateList(detailsDiseaseActivity, R.color.color_D1E7C2));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(24, 24);
                        layoutParams2.setMarginEnd(8);
                        childAt.setLayoutParams(layoutParams2);
                    }
                    i12++;
                }
                return;
            case 3:
                if (i10 == 0) {
                    int i14 = HistoryActivity.f16625l;
                    ((HistoryActivity) obj).I().f16615e.postValue(0);
                    return;
                } else {
                    int i15 = HistoryActivity.f16625l;
                    ((HistoryActivity) obj).I().f16615e.postValue(1);
                    return;
                }
            case 4:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) obj;
                                onBoardingActivity.f16666g = 3;
                                ((a0) onBoardingActivity.n()).f20694x.setText(onBoardingActivity.getString(R.string.start_onb));
                                ((a0) onBoardingActivity.n()).f20695y.setText(onBoardingActivity.getString(R.string.start_onb));
                                LinearLayout llCenter = ((a0) onBoardingActivity.n()).u;
                                Intrinsics.checkNotNullExpressionValue(llCenter, "llCenter");
                                com.bumptech.glide.e.V(llCenter);
                                LinearLayout llCircle = ((a0) onBoardingActivity.n()).f20692v;
                                Intrinsics.checkNotNullExpressionValue(llCircle, "llCircle");
                                com.bumptech.glide.e.D(llCircle);
                                ((a0) onBoardingActivity.n()).D.setImageResource(R.drawable.ic_view_select);
                                ((a0) onBoardingActivity.n()).E.setImageResource(R.drawable.ic_view_select);
                                ((a0) onBoardingActivity.n()).F.setImageResource(R.drawable.ic_view_select);
                                ((a0) onBoardingActivity.n()).G.setImageResource(R.drawable.ic_view_select);
                                if (onBoardingActivity.o().getBoolean("KEY_FIRST_INSTALL_APP", true) && onBoardingActivity.f16670k) {
                                    e3.b bVar2 = u0.f26303i;
                                    if (bVar2 != null) {
                                        onBoardingActivity.f16667h = false;
                                        onBoardingActivity.u(bVar2);
                                    }
                                    onBoardingActivity.v();
                                    return;
                                }
                                ((a0) onBoardingActivity.n()).f20691t.removeAllViews();
                                return;
                            }
                            return;
                        }
                        OnBoardingActivity onBoardingActivity2 = (OnBoardingActivity) obj;
                        onBoardingActivity2.f16666g = 2;
                        ((a0) onBoardingActivity2.n()).f20694x.setText(onBoardingActivity2.getString(R.string.next_onb));
                        ((a0) onBoardingActivity2.n()).f20695y.setText(onBoardingActivity2.getString(R.string.next_onb));
                        LinearLayout llCenter2 = ((a0) onBoardingActivity2.n()).u;
                        Intrinsics.checkNotNullExpressionValue(llCenter2, "llCenter");
                        com.bumptech.glide.e.E(llCenter2);
                        LinearLayout llCircle2 = ((a0) onBoardingActivity2.n()).f20692v;
                        Intrinsics.checkNotNullExpressionValue(llCircle2, "llCircle");
                        com.bumptech.glide.e.V(llCircle2);
                        ((a0) onBoardingActivity2.n()).f20696z.setImageResource(R.drawable.ic_view_select);
                        ((a0) onBoardingActivity2.n()).A.setImageResource(R.drawable.ic_view_select);
                        ((a0) onBoardingActivity2.n()).B.setImageResource(R.drawable.ic_view_select);
                        ((a0) onBoardingActivity2.n()).C.setImageResource(R.drawable.ic_view_un_select);
                        onBoardingActivity2.t();
                        return;
                    }
                    OnBoardingActivity onBoardingActivity3 = (OnBoardingActivity) obj;
                    onBoardingActivity3.f16668i = true;
                    onBoardingActivity3.f16666g = 1;
                    ((a0) onBoardingActivity3.n()).f20694x.setText(onBoardingActivity3.getString(R.string.next_onb));
                    ((a0) onBoardingActivity3.n()).f20695y.setText(onBoardingActivity3.getString(R.string.next_onb));
                    LinearLayout llCenter3 = ((a0) onBoardingActivity3.n()).u;
                    Intrinsics.checkNotNullExpressionValue(llCenter3, "llCenter");
                    com.bumptech.glide.e.E(llCenter3);
                    LinearLayout llCircle3 = ((a0) onBoardingActivity3.n()).f20692v;
                    Intrinsics.checkNotNullExpressionValue(llCircle3, "llCircle");
                    com.bumptech.glide.e.V(llCircle3);
                    ((a0) onBoardingActivity3.n()).f20696z.setImageResource(R.drawable.ic_view_select);
                    ((a0) onBoardingActivity3.n()).A.setImageResource(R.drawable.ic_view_select);
                    ((a0) onBoardingActivity3.n()).B.setImageResource(R.drawable.ic_view_un_select);
                    ((a0) onBoardingActivity3.n()).C.setImageResource(R.drawable.ic_view_un_select);
                    onBoardingActivity3.t();
                    return;
                }
                OnBoardingActivity onBoardingActivity4 = (OnBoardingActivity) obj;
                onBoardingActivity4.f16666g = 0;
                ((a0) onBoardingActivity4.n()).f20694x.setText(onBoardingActivity4.getString(R.string.next_onb));
                ((a0) onBoardingActivity4.n()).f20695y.setText(onBoardingActivity4.getString(R.string.next_onb));
                LinearLayout llCenter4 = ((a0) onBoardingActivity4.n()).u;
                Intrinsics.checkNotNullExpressionValue(llCenter4, "llCenter");
                com.bumptech.glide.e.V(llCenter4);
                LinearLayout llCircle4 = ((a0) onBoardingActivity4.n()).f20692v;
                Intrinsics.checkNotNullExpressionValue(llCircle4, "llCircle");
                com.bumptech.glide.e.D(llCircle4);
                ((a0) onBoardingActivity4.n()).D.setImageResource(R.drawable.ic_view_select);
                ((a0) onBoardingActivity4.n()).E.setImageResource(R.drawable.ic_view_un_select);
                ((a0) onBoardingActivity4.n()).F.setImageResource(R.drawable.ic_view_un_select);
                ((a0) onBoardingActivity4.n()).G.setImageResource(R.drawable.ic_view_un_select);
                if (onBoardingActivity4.o().getBoolean("KEY_FIRST_INSTALL_APP", true) && onBoardingActivity4.f16669j) {
                    if (onBoardingActivity4.f16668i && (bVar = u0.f26302h) != null) {
                        onBoardingActivity4.f16667h = false;
                        onBoardingActivity4.u(bVar);
                    }
                    onBoardingActivity4.v();
                    return;
                }
                ((a0) onBoardingActivity4.n()).f20691t.removeAllViews();
                return;
            case 5:
                DiResultActivity diResultActivity = (DiResultActivity) obj;
                int i16 = DiResultActivity.f16701j;
                int childCount2 = ((kf.c) diResultActivity.n()).f20711v.getChildCount();
                while (i12 < childCount2) {
                    View childAt2 = ((kf.c) diResultActivity.n()).f20711v.getChildAt(i12);
                    if (i12 == i10) {
                        childAt2.setBackgroundResource(R.drawable.slider_indicator_selected);
                        childAt2.setBackgroundTintList(d0.h.getColorStateList(diResultActivity, R.color.primary));
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(60, 24);
                        layoutParams3.setMarginEnd(8);
                        childAt2.setLayoutParams(layoutParams3);
                    } else {
                        childAt2.setBackgroundResource(R.drawable.slider_indicator_unselected);
                        childAt2.setBackgroundTintList(d0.h.getColorStateList(diResultActivity, R.color.color_D1E7C2));
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(24, 24);
                        layoutParams4.setMarginEnd(8);
                        childAt2.setLayoutParams(layoutParams4);
                    }
                    i12++;
                }
                return;
            default:
                SearchPlantResultActivity searchPlantResultActivity = (SearchPlantResultActivity) obj;
                int i17 = SearchPlantResultActivity.f16702n;
                int childCount3 = ((o0) searchPlantResultActivity.n()).f20849w.getChildCount();
                while (i12 < childCount3) {
                    View childAt3 = ((o0) searchPlantResultActivity.n()).f20849w.getChildAt(i12);
                    if (i12 == i10) {
                        childAt3.setBackgroundResource(R.drawable.slider_indicator_selected);
                        childAt3.setBackgroundTintList(d0.h.getColorStateList(searchPlantResultActivity, R.color.primary));
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(60, 24);
                        layoutParams5.setMarginEnd(8);
                        childAt3.setLayoutParams(layoutParams5);
                    } else {
                        childAt3.setBackgroundResource(R.drawable.slider_indicator_unselected);
                        childAt3.setBackgroundTintList(d0.h.getColorStateList(searchPlantResultActivity, R.color.color_D1E7C2));
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(24, 24);
                        layoutParams6.setMarginEnd(8);
                        childAt3.setLayoutParams(layoutParams6);
                    }
                    i12++;
                }
                return;
        }
    }

    public d() {
        this.a = 1;
        this.f2130b = new ArrayList(3);
    }
}
