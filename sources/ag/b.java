package ag;

import android.util.Log;
import com.ads.control.admob.AppOpenManager;
import com.google.android.ump.FormError;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import kotlin.jvm.internal.Intrinsics;
import pf.f;
import v8.u0;
import x5.i;

/* loaded from: classes4.dex */
public final class b implements k3.a, de.a {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf.a f483b;

    public /* synthetic */ b(mf.a aVar, int i10) {
        this.a = i10;
        this.f483b = aVar;
    }

    public void a(String s5) {
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(s5, "s");
                return;
            default:
                Intrinsics.checkNotNullParameter(s5, "s");
                return;
        }
    }

    public f b() {
        int i10 = this.a;
        mf.a aVar = this.f483b;
        switch (i10) {
            case 0:
                return (MainActivity) aVar;
            default:
                return (SplashActivity) aVar;
        }
    }

    public void c(FormError formError) {
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(formError, "formError");
                xg.b.a.a("consent_error_2");
                Log.v("Ynsuper", "onConsentError: " + formError.getMessage());
                return;
            default:
                Intrinsics.checkNotNullParameter(formError, "formError");
                SplashActivity splashActivity = (SplashActivity) this.f483b;
                splashActivity.getClass();
                xg.b.a.a("consent_error_1");
                new wg.b(splashActivity).start();
                return;
        }
    }

    public void d() {
        int i10 = this.a;
        mf.a aVar = this.f483b;
        switch (i10) {
            case 0:
                Log.v("Ynsuper", "onNotUsingAdConsent: ");
                xg.b.a.a("not_using_display_consent_2");
                u0.i0("key_is_user_global", Boolean.TRUE, ((MainActivity) aVar).o());
                return;
            default:
                xg.b.a.a("new_not_using_display_consent_1");
                SplashActivity splashActivity = (SplashActivity) aVar;
                u0.i0("key_is_user_global", Boolean.TRUE, splashActivity.o());
                new wg.b(splashActivity).start();
                return;
        }
    }

    public void e(String s5, String s12) {
        int i10 = this.a;
        mf.a aVar = this.f483b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(s5, "s");
                Intrinsics.checkNotNullParameter(s12, "s1");
                IapActivity iapActivity = (IapActivity) aVar;
                IapDomain iapDomain = iapActivity.f16631h;
                if (iapDomain != null) {
                    if (!iapDomain.isTypeSubYear()) {
                        g3.c.a().f18018m = false;
                        int numberOfScans = iapDomain.getNumberOfScans();
                        cg.a d10 = i.d();
                        d10.a += numberOfScans;
                        d10.f2796c = System.currentTimeMillis();
                        d10.f2797d++;
                        d10.f2798e = 1;
                        i.r(d10);
                    } else {
                        i.a();
                    }
                }
                if (GlobalApp.f16595i) {
                    GlobalApp.f16595i = false;
                }
                AppOpenManager.f().f2914k = false;
                g3.c.a().f18018m = false;
                w5.d.g(iapActivity);
                iapActivity.finish();
                return;
            default:
                Intrinsics.checkNotNullParameter(s5, "s");
                Intrinsics.checkNotNullParameter(s12, "s1");
                g3.c.a().f18018m = false;
                AppOpenManager.f().f2914k = false;
                int numberOfScans2 = va.b.l().getNumberOfScans();
                cg.a d11 = i.d();
                d11.a += numberOfScans2;
                d11.f2796c = System.currentTimeMillis();
                d11.f2797d++;
                d11.f2798e = 1;
                i.r(d11);
                MainActivity.J((MainActivity) aVar);
                return;
        }
    }
}
