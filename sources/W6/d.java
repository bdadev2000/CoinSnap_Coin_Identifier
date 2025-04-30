package W6;

import android.os.CountDownTimer;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.tools.arruler.ui.component.splash.SplashActivity;

/* loaded from: classes3.dex */
public final class d extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f3628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SplashActivity splashActivity) {
        super(6500L, 100L);
        this.f3628a = splashActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        SplashActivity splashActivity = this.f3628a;
        if (!splashActivity.f19705j) {
            SplashActivity.t(splashActivity);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j7) {
        SplashActivity splashActivity = this.f3628a;
        if (splashActivity.f19705j && j7 < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            SplashActivity.t(splashActivity);
            cancel();
        }
    }
}
