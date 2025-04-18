package wg;

import android.os.CountDownTimer;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;

/* loaded from: classes4.dex */
public final class b extends CountDownTimer {
    public final /* synthetic */ SplashActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SplashActivity splashActivity) {
        super(6500L, 100L);
        this.a = splashActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        SplashActivity splashActivity = this.a;
        if (!splashActivity.f16742l) {
            SplashActivity.I(splashActivity);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j3) {
        SplashActivity splashActivity = this.a;
        if (splashActivity.f16742l && j3 < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            SplashActivity.I(splashActivity);
            cancel();
        }
    }
}
