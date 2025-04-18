package e3;

import com.google.android.gms.ads.interstitial.InterstitialAd;
import l0.h;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: d, reason: collision with root package name */
    public InterstitialAd f17086d;

    public a() {
        super(2);
    }

    public final boolean k() {
        return this.f17086d != null;
    }

    public final void l(InterstitialAd interstitialAd) {
        this.f17086d = interstitialAd;
        this.f21106c = c.AD_LOADED;
    }
}
