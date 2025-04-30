package W6;

import F2.h;
import com.tools.arruler.ui.component.splash.SplashActivity;

/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f3627d;

    public /* synthetic */ c(SplashActivity splashActivity, int i9) {
        this.f3626c = i9;
        this.f3627d = splashActivity;
    }

    @Override // F2.h
    public final void N() {
        SplashActivity splashActivity = this.f3627d;
        switch (this.f3626c) {
            case 0:
                int i9 = SplashActivity.l;
                splashActivity.v();
                return;
            default:
                int i10 = SplashActivity.l;
                splashActivity.v();
                return;
        }
    }
}
