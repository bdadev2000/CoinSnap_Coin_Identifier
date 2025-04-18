package d3;

import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* loaded from: classes.dex */
public final class a extends jb.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e3.a f16793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ jb.g f16794i;

    public a(e3.a aVar, hf.b bVar) {
        this.f16793h = aVar;
        this.f16794i = bVar;
    }

    @Override // jb.g
    public final void q(LoadAdError loadAdError) {
        Log.d("ITGAd", "Admob onAdFailedToLoad");
        this.f16794i.q(loadAdError);
    }

    @Override // jb.g
    public final void r(AdError adError) {
        Log.d("ITGAd", "Admob onAdFailedToShow");
        this.f16794i.r(adError);
    }

    @Override // jb.g
    public final void t(InterstitialAd interstitialAd) {
        this.f16793h.l(interstitialAd);
        this.f16794i.getClass();
    }
}
