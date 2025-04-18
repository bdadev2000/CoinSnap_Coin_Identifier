package d3;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* loaded from: classes.dex */
public final class b extends jb.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16795h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f16796i;

    public /* synthetic */ b(c cVar, int i10) {
        this.f16795h = i10;
        this.f16796i = cVar;
    }

    @Override // jb.g
    public final void q(LoadAdError loadAdError) {
        int i10 = this.f16795h;
        c cVar = this.f16796i;
        switch (i10) {
            case 0:
                cVar.f16800k.l(null);
                cVar.f16797h.q(loadAdError);
                return;
            default:
                cVar.f16797h.q(loadAdError);
                return;
        }
    }

    @Override // jb.g
    public final void r(AdError adError) {
        int i10 = this.f16795h;
        c cVar = this.f16796i;
        switch (i10) {
            case 0:
                cVar.f16797h.r(adError);
                return;
            default:
                cVar.f16797h.r(adError);
                return;
        }
    }

    @Override // jb.g
    public final void t(InterstitialAd interstitialAd) {
        int i10 = this.f16795h;
        c cVar = this.f16796i;
        switch (i10) {
            case 0:
                cVar.f16800k.l(interstitialAd);
                cVar.f16797h.t(cVar.f16800k.f17086d);
                return;
            default:
                cVar.f16800k.l(interstitialAd);
                cVar.f16797h.t(cVar.f16800k.f17086d);
                return;
        }
    }
}
