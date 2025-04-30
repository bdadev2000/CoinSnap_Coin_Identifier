package m1;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import r1.DialogC2656a;
import w4.v0;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2462b extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f21708a;
    public final /* synthetic */ F2.h b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterstitialAd f21709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f21710d;

    public C2462b(g gVar, Context context, f fVar, InterstitialAd interstitialAd) {
        this.f21710d = gVar;
        this.f21708a = context;
        this.b = fVar;
        this.f21709c = interstitialAd;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        super.onAdClicked();
        if (this.f21710d.f21733f) {
            k.f().f21749j = true;
        }
        F2.h hVar = this.b;
        if (hVar != null) {
            hVar.E();
        }
        v0.s(this.f21708a, this.f21709c.getAdUnitId());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
        k.f().f21748i = false;
        this.f21708a.getSharedPreferences("mia_ad_pref", 0).edit().putLong("KEY_LAST_IMPRESSION_INTERSTITIAL_TIME", System.currentTimeMillis()).apply();
        g gVar = this.f21710d;
        F2.h hVar = this.b;
        if (hVar != null) {
            if (!gVar.f21736i) {
                hVar.N();
            }
            hVar.F();
        }
        DialogC2656a dialogC2656a = gVar.f21731d;
        if (dialogC2656a != null) {
            dialogC2656a.dismiss();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
        F2.h hVar = this.b;
        if (hVar != null) {
            hVar.H(adError);
            g gVar = this.f21710d;
            if (!gVar.f21736i) {
                hVar.N();
            }
            DialogC2656a dialogC2656a = gVar.f21731d;
            if (dialogC2656a != null) {
                dialogC2656a.dismiss();
            }
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
        k.f().f21748i = true;
    }
}
