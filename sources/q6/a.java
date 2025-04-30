package Q6;

import S0.l;
import android.view.View;
import com.tools.arruler.ui.component.onboarding.OnBoardingActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {
    @Override // S0.l
    public final void a(View view, float f9) {
        int i9 = OnBoardingActivity.f19676j;
        view.setScaleY(((1 - Math.abs(f9)) * 0.2f) + 0.8f);
        view.setAlpha(1.0f - (Math.abs(f9) * 0.7f));
    }
}
