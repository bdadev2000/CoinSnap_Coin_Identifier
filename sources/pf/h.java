package pf;

import android.widget.FrameLayout;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.PlantDiseaseDetailActivity;
import kf.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import v8.u0;

/* loaded from: classes4.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlantDiseaseDetailActivity f23646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PlantDiseaseDetailActivity plantDiseaseDetailActivity, int i10) {
        super(0);
        this.f23645b = i10;
        this.f23646c = plantDiseaseDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23645b) {
            case 0:
                m1769invoke();
                return Unit.INSTANCE;
            default:
                m1769invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1769invoke() {
        int i10 = this.f23645b;
        PlantDiseaseDetailActivity plantDiseaseDetailActivity = this.f23646c;
        switch (i10) {
            case 0:
                FrameLayout frAds = ((c0) plantDiseaseDetailActivity.n()).f20716t;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                return;
            default:
                int i11 = PlantDiseaseDetailActivity.f16612g;
                FrameLayout frAds2 = ((c0) plantDiseaseDetailActivity.n()).f20716t;
                Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                u0.Q(frAds2, plantDiseaseDetailActivity, "ca-app-pub-6691965685689933/2165293673", hf.f.a() && com.bumptech.glide.d.q(plantDiseaseDetailActivity));
                return;
        }
    }
}
