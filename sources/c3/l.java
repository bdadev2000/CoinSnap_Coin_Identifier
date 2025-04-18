package c3;

import android.util.Log;
import com.ads.control.admob.AppOpenManager;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Date;

/* loaded from: classes.dex */
public final class l extends AppOpenAd.AppOpenAdLoadCallback {
    public final /* synthetic */ boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppOpenManager f2580b;

    public l(AppOpenManager appOpenManager, boolean z10) {
        this.f2580b = appOpenManager;
        this.a = z10;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        Log.d("AppOpenManager", "onAppOpenAdFailedToLoad: isSplash" + this.a + " message " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        final AppOpenAd appOpenAd2 = appOpenAd;
        StringBuilder sb2 = new StringBuilder("onAppOpenAdLoaded: isSplash = ");
        boolean z10 = this.a;
        sb2.append(z10);
        Log.d("AppOpenManager", sb2.toString());
        AppOpenManager appOpenManager = this.f2580b;
        if (!z10) {
            appOpenManager.f2906b = appOpenAd2;
            final int i10 = 0;
            appOpenAd2.setOnPaidEventListener(new OnPaidEventListener(this) { // from class: c3.k

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l f2578c;

                {
                    this.f2578c = this;
                }

                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    int i11 = i10;
                    AppOpenAd appOpenAd3 = appOpenAd2;
                    l lVar = this.f2578c;
                    switch (i11) {
                        case 0:
                            d6.g.v(lVar.f2580b.f2911h.getApplicationContext(), adValue, appOpenAd3.getAdUnitId(), appOpenAd3.getResponseInfo().getMediationAdapterClassName());
                            return;
                        default:
                            d6.g.v(lVar.f2580b.f2911h.getApplicationContext(), adValue, appOpenAd3.getAdUnitId(), appOpenAd3.getResponseInfo().getMediationAdapterClassName());
                            return;
                    }
                }
            });
            appOpenManager.f2912i = new Date().getTime();
            return;
        }
        appOpenManager.f2907c = appOpenAd2;
        final int i11 = 1;
        appOpenAd2.setOnPaidEventListener(new OnPaidEventListener(this) { // from class: c3.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f2578c;

            {
                this.f2578c = this;
            }

            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                int i112 = i11;
                AppOpenAd appOpenAd3 = appOpenAd2;
                l lVar = this.f2578c;
                switch (i112) {
                    case 0:
                        d6.g.v(lVar.f2580b.f2911h.getApplicationContext(), adValue, appOpenAd3.getAdUnitId(), appOpenAd3.getResponseInfo().getMediationAdapterClassName());
                        return;
                    default:
                        d6.g.v(lVar.f2580b.f2911h.getApplicationContext(), adValue, appOpenAd3.getAdUnitId(), appOpenAd3.getResponseInfo().getMediationAdapterClassName());
                        return;
                }
            }
        });
        appOpenManager.f2913j = new Date().getTime();
    }
}
