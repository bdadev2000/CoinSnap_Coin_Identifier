package vh;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import java.util.Date;
import net.premiumads.sdk.admob.PremiumAppOpenAd;

/* loaded from: classes5.dex */
public final class b extends AppOpenAd.AppOpenAdLoadCallback {
    public final /* synthetic */ MediationAdLoadCallback a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PremiumAppOpenAd f26534b;

    public b(PremiumAppOpenAd premiumAppOpenAd, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26534b = premiumAppOpenAd;
        this.a = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        PremiumAppOpenAd premiumAppOpenAd = this.f26534b;
        premiumAppOpenAd.f22751b = false;
        loadAdError.getCode();
        premiumAppOpenAd.f22753d = null;
        this.a.onFailure(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        PremiumAppOpenAd premiumAppOpenAd = this.f26534b;
        premiumAppOpenAd.f22753d = appOpenAd;
        premiumAppOpenAd.f22751b = false;
        premiumAppOpenAd.f22752c = new Date().getTime();
        premiumAppOpenAd.f22754f = (MediationAppOpenAdCallback) this.a.onSuccess(premiumAppOpenAd);
    }
}
