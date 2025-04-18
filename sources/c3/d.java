package c3;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ads.control.admob.AppOpenManager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* loaded from: classes.dex */
public final class d extends FullScreenContentCallback {
    public final /* synthetic */ Context a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb.g f2540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterstitialAd f2541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f2542d;

    public d(j jVar, FragmentActivity fragmentActivity, d3.c cVar, InterstitialAd interstitialAd) {
        this.f2542d = jVar;
        this.a = fragmentActivity;
        this.f2540b = cVar;
        this.f2541c = interstitialAd;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        super.onAdClicked();
        if (this.f2542d.f2570f) {
            AppOpenManager.f().f2916m = true;
        }
        jb.g gVar = this.f2540b;
        if (gVar != null) {
            gVar.o();
        }
        d6.g.t(this.a, this.f2541c.getAdUnitId());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
        AppOpenManager.f().f2915l = false;
        this.a.getSharedPreferences("itg_ad_pref", 0).edit().putLong("KEY_LAST_IMPRESSION_INTERSTITIAL_TIME", System.currentTimeMillis()).apply();
        j jVar = this.f2542d;
        jb.g gVar = this.f2540b;
        if (gVar != null) {
            if (!jVar.f2573i) {
                gVar.w();
            }
            gVar.p();
        }
        i3.a aVar = jVar.f2568d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
        jb.g gVar = this.f2540b;
        if (gVar != null) {
            gVar.r(adError);
            j jVar = this.f2542d;
            if (!jVar.f2573i) {
                gVar.w();
            }
            i3.a aVar = jVar.f2568d;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
        AppOpenManager.f().f2915l = true;
    }
}
