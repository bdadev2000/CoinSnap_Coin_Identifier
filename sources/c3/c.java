package c3;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes.dex */
public final class c extends InterstitialAdLoadCallback {
    public final /* synthetic */ jb.g a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f2539c;

    public c(j jVar, jb.g gVar, Context context) {
        this.f2539c = jVar;
        this.a = gVar;
        this.f2538b = context;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        Log.i("ITGStudio", loadAdError.getMessage());
        jb.g gVar = this.a;
        if (gVar != null) {
            gVar.q(loadAdError);
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        jb.g gVar = this.a;
        if (gVar != null) {
            gVar.t(interstitialAd2);
        }
        interstitialAd2.setOnPaidEventListener(new f2.i(1, this, this.f2538b, interstitialAd2));
    }
}
