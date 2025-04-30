package n1;

import F2.h;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import o1.C2492a;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2471b extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1.f f21823d;

    public /* synthetic */ C2471b(m1.f fVar, int i9) {
        this.f21822c = i9;
        this.f21823d = fVar;
    }

    @Override // F2.h
    public final void G(LoadAdError loadAdError) {
        switch (this.f21822c) {
            case 0:
                m1.f fVar = this.f21823d;
                ((C2492a) fVar.f21728g).f(null);
                fVar.f21725d.G(loadAdError);
                return;
            default:
                this.f21823d.f21725d.G(loadAdError);
                return;
        }
    }

    @Override // F2.h
    public final void H(AdError adError) {
        switch (this.f21822c) {
            case 0:
                this.f21823d.f21725d.H(adError);
                return;
            default:
                this.f21823d.f21725d.H(adError);
                return;
        }
    }

    @Override // F2.h
    public final void K(InterstitialAd interstitialAd) {
        switch (this.f21822c) {
            case 0:
                m1.f fVar = this.f21823d;
                ((C2492a) fVar.f21728g).f(interstitialAd);
                fVar.f21725d.K(((C2492a) fVar.f21728g).b);
                return;
            default:
                m1.f fVar2 = this.f21823d;
                ((C2492a) fVar2.f21728g).f(interstitialAd);
                fVar2.f21725d.K(((C2492a) fVar2.f21728g).b);
                return;
        }
    }
}
