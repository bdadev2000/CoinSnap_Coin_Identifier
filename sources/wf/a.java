package wf;

import android.widget.FrameLayout;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.plant.HistoryDeletePlantActivity;
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
    public final /* synthetic */ int f26986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HistoryDeletePlantActivity f26987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(HistoryDeletePlantActivity historyDeletePlantActivity, int i10) {
        super(0);
        this.f26986b = i10;
        this.f26987c = historyDeletePlantActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f26986b) {
            case 0:
                m1775invoke();
                return Unit.INSTANCE;
            case 1:
                m1775invoke();
                return Unit.INSTANCE;
            case 2:
                m1775invoke();
                return Unit.INSTANCE;
            case 3:
                m1775invoke();
                return Unit.INSTANCE;
            default:
                m1775invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1775invoke() {
        int i10 = this.f26986b;
        HistoryDeletePlantActivity historyDeletePlantActivity = this.f26987c;
        switch (i10) {
            case 0:
                FrameLayout frAds = ((m) historyDeletePlantActivity.n()).u;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                e.D(frAds);
                return;
            case 1:
                int i11 = HistoryDeletePlantActivity.f16621l;
                FrameLayout frAds2 = ((m) historyDeletePlantActivity.n()).u;
                Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                u0.Q(frAds2, historyDeletePlantActivity, "ca-app-pub-6691965685689933/2165293673", f.a() && d.q(historyDeletePlantActivity));
                return;
            case 2:
                ((m) historyDeletePlantActivity.n()).f20823w.setActivated(true);
                historyDeletePlantActivity.I();
                return;
            case 3:
                ((m) historyDeletePlantActivity.n()).f20823w.setActivated(false);
                return;
            default:
                int i12 = HistoryDeletePlantActivity.f16621l;
                historyDeletePlantActivity.I();
                return;
        }
    }
}
