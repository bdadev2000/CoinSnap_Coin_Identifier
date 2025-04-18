package c3;

import com.ads.control.admob.AppOpenManager;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes.dex */
public final class i extends FullScreenContentCallback {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2563b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2564c;

    public i(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f2563b = abstractAdViewAdapter;
        this.f2564c = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        switch (this.a) {
            case 0:
                super.onAdClicked();
                j jVar = (j) this.f2564c;
                if (jVar.f2570f) {
                    AppOpenManager.f().f2916m = true;
                }
                d6.g.t(jVar.f2574j, jVar.f2575k.getAdUnitId());
                return;
            default:
                super.onAdClicked();
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        int i10 = this.a;
        Object obj = this.f2563b;
        Object obj2 = this.f2564c;
        switch (i10) {
            case 0:
                AppOpenManager.f().f2915l = false;
                j jVar = (j) obj2;
                jVar.f2575k = null;
                jb.g gVar = (jb.g) obj;
                if (gVar != null) {
                    if (!jVar.f2573i) {
                        gVar.w();
                    }
                    gVar.p();
                    i3.a aVar = jVar.f2568d;
                    if (aVar != null) {
                        aVar.dismiss();
                    }
                }
                jVar.f2571g = false;
                return;
            default:
                ((MediationInterstitialListener) obj2).onAdClosed((AbstractAdViewAdapter) obj);
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.f2564c;
                jVar.f2575k = null;
                jVar.f2571g = false;
                jb.g gVar = (jb.g) this.f2563b;
                if (gVar != null) {
                    gVar.r(adError);
                    if (!jVar.f2573i) {
                        gVar.w();
                    }
                    i3.a aVar = jVar.f2568d;
                    if (aVar != null) {
                        aVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onAdFailedToShowFullScreenContent(adError);
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        switch (this.a) {
            case 0:
                super.onAdImpression();
                jb.g gVar = (jb.g) this.f2563b;
                if (gVar != null) {
                    gVar.s();
                    return;
                }
                return;
            default:
                super.onAdImpression();
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        int i10 = this.a;
        Object obj = this.f2564c;
        switch (i10) {
            case 0:
                AppOpenManager.f().f2915l = true;
                ((j) obj).f2571g = false;
                return;
            default:
                ((MediationInterstitialListener) obj).onAdOpened((AbstractAdViewAdapter) this.f2563b);
                return;
        }
    }

    public i(j jVar, jb.g gVar) {
        this.f2564c = jVar;
        this.f2563b = gVar;
    }
}
