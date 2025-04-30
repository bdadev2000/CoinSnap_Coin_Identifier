package m1;

import android.util.Log;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Date;

/* loaded from: classes.dex */
public final class i extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21740a;
    public final /* synthetic */ k b;

    public i(k kVar, boolean z8) {
        this.b = kVar;
        this.f21740a = z8;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        Log.d("AppOpenManager", "onAppOpenAdFailedToLoad: isSplash" + this.f21740a + " message " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        final AppOpenAd appOpenAd2 = appOpenAd;
        StringBuilder sb = new StringBuilder("onAppOpenAdLoaded: isSplash = ");
        boolean z8 = this.f21740a;
        sb.append(z8);
        Log.d("AppOpenManager", sb.toString());
        k kVar = this.b;
        if (!z8) {
            kVar.b = appOpenAd2;
            final int i9 = 0;
            appOpenAd2.setOnPaidEventListener(new OnPaidEventListener(this, appOpenAd2, i9) { // from class: m1.h
                public final /* synthetic */ int b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f21739c;

                {
                    this.b = i9;
                    this.f21739c = this;
                }

                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    switch (this.b) {
                        case 0:
                            this.f21739c.b.getClass();
                            throw null;
                        default:
                            this.f21739c.b.getClass();
                            throw null;
                    }
                }
            });
            kVar.f21746g = new Date().getTime();
            return;
        }
        kVar.f21743c = appOpenAd2;
        final int i10 = 1;
        appOpenAd2.setOnPaidEventListener(new OnPaidEventListener(this, appOpenAd2, i10) { // from class: m1.h
            public final /* synthetic */ int b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f21739c;

            {
                this.b = i10;
                this.f21739c = this;
            }

            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                switch (this.b) {
                    case 0:
                        this.f21739c.b.getClass();
                        throw null;
                    default:
                        this.f21739c.b.getClass();
                        throw null;
                }
            }
        });
        kVar.f21747h = new Date().getTime();
    }
}
