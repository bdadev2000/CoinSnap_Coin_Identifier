package kg;

import android.widget.FrameLayout;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.ui.component.onboarding.OnBoardingActivity;
import e3.b;
import hf.c;
import kf.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements c {
    public final /* synthetic */ OnBoardingActivity a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f20949b;

    public a(OnBoardingActivity onBoardingActivity, b bVar) {
        this.a = onBoardingActivity;
        this.f20949b = bVar;
    }

    @Override // hf.c
    public final void a() {
        if (this.f20949b == null) {
            OnBoardingActivity onBoardingActivity = this.a;
            FrameLayout frAds = ((a0) onBoardingActivity.n()).f20691t;
            Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
            e.D(frAds);
            FrameLayout frAds2 = ((a0) onBoardingActivity.n()).f20691t;
            Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
            e.D(frAds2);
        }
    }

    @Override // hf.c
    public final void b() {
        int i10 = OnBoardingActivity.f16664l;
        this.a.w(this.f20949b);
    }
}
