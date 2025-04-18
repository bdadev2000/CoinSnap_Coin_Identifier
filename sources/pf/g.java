package pf;

import android.view.View;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.PlantDiseaseDetailActivity;
import com.plantcare.ai.identifier.plantid.ui.component.history.details.DetailsDiseaseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.myplant.MyPlantDetailActivity;
import com.plantcare.ai.identifier.plantid.ui.component.onboarding.OnBoardingActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.di.DiResultActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultActivity;
import j2.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements n {
    public final /* synthetic */ int a;

    @Override // j2.n
    public final void a(View page, float f10) {
        switch (this.a) {
            case 0:
                int i10 = PlantDiseaseDetailActivity.f16612g;
                Intrinsics.checkNotNullParameter(page, "page");
                page.setScaleY(((1 - Math.abs(f10)) * 0.15f) + 0.85f);
                return;
            case 1:
                int i11 = DetailsDiseaseActivity.f16624f;
                Intrinsics.checkNotNullParameter(page, "page");
                page.setScaleY(((1 - Math.abs(f10)) * 0.15f) + 0.85f);
                return;
            case 2:
                int i12 = MyPlantDetailActivity.f16661f;
                Intrinsics.checkNotNullParameter(page, "page");
                page.setScaleY(((1 - Math.abs(f10)) * 0.15f) + 0.85f);
                return;
            case 3:
                int i13 = MyPlantDetailActivity.f16661f;
                Intrinsics.checkNotNullParameter(page, "page");
                page.setScaleY(((1 - Math.abs(f10)) * 0.15f) + 0.85f);
                return;
            case 4:
                int i14 = OnBoardingActivity.f16664l;
                Intrinsics.checkNotNullParameter(page, "view");
                page.setScaleY(((1 - Math.abs(f10)) * 0.2f) + 0.8f);
                page.setAlpha(1.0f - (Math.abs(f10) * 0.7f));
                return;
            case 5:
                int i15 = DiResultActivity.f16701j;
                Intrinsics.checkNotNullParameter(page, "page");
                page.setScaleY(((1 - Math.abs(f10)) * 0.15f) + 0.85f);
                return;
            default:
                int i16 = SearchPlantResultActivity.f16702n;
                Intrinsics.checkNotNullParameter(page, "page");
                page.setScaleY(((1 - Math.abs(f10)) * 0.15f) + 0.85f);
                return;
        }
    }
}
