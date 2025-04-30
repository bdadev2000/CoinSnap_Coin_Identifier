package m1;

import M0.C0218i;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2461a extends InterstitialAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F2.h f21706a;
    public final /* synthetic */ Context b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f21707c;

    public C2461a(g gVar, F2.h hVar, Context context) {
        this.f21707c = gVar;
        this.f21706a = hVar;
        this.b = context;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        Log.i("MiaStudio", loadAdError.getMessage());
        F2.h hVar = this.f21706a;
        if (hVar != null) {
            hVar.G(loadAdError);
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        F2.h hVar = this.f21706a;
        if (hVar != null) {
            hVar.K(interstitialAd2);
        }
        interstitialAd2.setOnPaidEventListener(new C0218i(this, this.b, interstitialAd2, 4));
    }
}
