package vf;

import android.widget.FrameLayout;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.disease.HistoryDeleteDiseaseActivity;
import hf.f;
import kf.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import v8.u0;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HistoryDeleteDiseaseActivity f26522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(HistoryDeleteDiseaseActivity historyDeleteDiseaseActivity, int i10) {
        super(0);
        this.f26521b = i10;
        this.f26522c = historyDeleteDiseaseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f26521b) {
            case 0:
                m1774invoke();
                return Unit.INSTANCE;
            case 1:
                m1774invoke();
                return Unit.INSTANCE;
            case 2:
                m1774invoke();
                return Unit.INSTANCE;
            case 3:
                m1774invoke();
                return Unit.INSTANCE;
            default:
                m1774invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1774invoke() {
        int i10 = this.f26521b;
        HistoryDeleteDiseaseActivity historyDeleteDiseaseActivity = this.f26522c;
        switch (i10) {
            case 0:
                FrameLayout frAds = ((m) historyDeleteDiseaseActivity.n()).u;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                return;
            case 1:
                int i11 = HistoryDeleteDiseaseActivity.f16618l;
                FrameLayout frAds2 = ((m) historyDeleteDiseaseActivity.n()).u;
                Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                u0.Q(frAds2, historyDeleteDiseaseActivity, "ca-app-pub-6691965685689933/2165293673", f.a() && com.bumptech.glide.d.q(historyDeleteDiseaseActivity));
                return;
            case 2:
                ((m) historyDeleteDiseaseActivity.n()).f20823w.setActivated(true);
                historyDeleteDiseaseActivity.I();
                return;
            case 3:
                ((m) historyDeleteDiseaseActivity.n()).f20823w.setActivated(false);
                return;
            default:
                int i12 = HistoryDeleteDiseaseActivity.f16618l;
                historyDeleteDiseaseActivity.I();
                return;
        }
    }
}
