package c3;

import android.app.Activity;
import android.util.Log;
import com.ads.control.admob.AppOpenManager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* loaded from: classes.dex */
public final class m extends FullScreenContentCallback {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppOpenManager f2581b;

    public /* synthetic */ m(AppOpenManager appOpenManager, int i10) {
        this.a = i10;
        this.f2581b = appOpenManager;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        int i10 = this.a;
        AppOpenManager appOpenManager = this.f2581b;
        switch (i10) {
            case 0:
                super.onAdClicked();
                Activity activity = appOpenManager.f2910g;
                if (activity != null) {
                    d6.g.t(activity, null);
                    return;
                }
                return;
            default:
                super.onAdClicked();
                Activity activity2 = appOpenManager.f2910g;
                if (activity2 != null) {
                    d6.g.t(activity2, appOpenManager.f2909f);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        int i10 = this.a;
        AppOpenManager appOpenManager = this.f2581b;
        switch (i10) {
            case 0:
                appOpenManager.f2906b = null;
                AppOpenManager.f2905q = false;
                appOpenManager.e(true);
                return;
            default:
                appOpenManager.f2906b = null;
                AppOpenManager.f2905q = false;
                appOpenManager.e(false);
                appOpenManager.d();
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        i3.a aVar;
        int i10 = this.a;
        AppOpenManager appOpenManager = this.f2581b;
        switch (i10) {
            case 0:
                appOpenManager.getClass();
                return;
            default:
                Log.e("AppOpenManager", "onAdFailedToShowFullScreenContent: " + adError.getMessage());
                appOpenManager.getClass();
                Activity activity = appOpenManager.f2910g;
                if (activity != null && !activity.isDestroyed() && (aVar = appOpenManager.f2918o) != null && aVar.isShowing()) {
                    Log.d("AppOpenManager", "dismiss dialog loading ad open: ");
                    try {
                        appOpenManager.f2918o.dismiss();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                appOpenManager.f2906b = null;
                AppOpenManager.f2905q = false;
                appOpenManager.e(false);
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        switch (this.a) {
            case 1:
                super.onAdImpression();
                Activity activity = this.f2581b.f2910g;
                return;
            default:
                super.onAdImpression();
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        int i10 = this.a;
        AppOpenManager appOpenManager = this.f2581b;
        switch (i10) {
            case 0:
                appOpenManager.getClass();
                AppOpenManager.f2905q = true;
                appOpenManager.f2907c = null;
                return;
            default:
                appOpenManager.getClass();
                AppOpenManager.f2905q = true;
                appOpenManager.f2906b = null;
                return;
        }
    }
}
