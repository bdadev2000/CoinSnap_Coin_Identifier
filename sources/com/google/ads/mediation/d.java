package com.google.ads.mediation;

import F2.h;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import m1.g;
import m1.k;
import r1.DialogC2656a;
import w4.v0;

/* loaded from: classes.dex */
public final class d extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13874a = 0;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13875c;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.b = abstractAdViewAdapter;
        this.f13875c = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        switch (this.f13874a) {
            case 1:
                super.onAdClicked();
                g gVar = (g) this.f13875c;
                if (gVar.f21733f) {
                    k.f().f21749j = true;
                }
                v0.s(gVar.f21737j, gVar.f21738k.getAdUnitId());
                return;
            default:
                super.onAdClicked();
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        switch (this.f13874a) {
            case 0:
                ((MediationInterstitialListener) this.f13875c).onAdClosed((AbstractAdViewAdapter) this.b);
                return;
            default:
                k.f().f21748i = false;
                g gVar = (g) this.f13875c;
                gVar.f21738k = null;
                h hVar = (h) this.b;
                if (hVar != null) {
                    if (!gVar.f21736i) {
                        hVar.N();
                    }
                    hVar.F();
                    DialogC2656a dialogC2656a = gVar.f21731d;
                    if (dialogC2656a != null) {
                        dialogC2656a.dismiss();
                    }
                }
                gVar.f21734g = false;
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        switch (this.f13874a) {
            case 1:
                g gVar = (g) this.f13875c;
                gVar.f21738k = null;
                gVar.f21734g = false;
                h hVar = (h) this.b;
                if (hVar != null) {
                    hVar.H(adError);
                    if (!gVar.f21736i) {
                        hVar.N();
                    }
                    DialogC2656a dialogC2656a = gVar.f21731d;
                    if (dialogC2656a != null) {
                        dialogC2656a.dismiss();
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
    public void onAdImpression() {
        switch (this.f13874a) {
            case 1:
                super.onAdImpression();
                h hVar = (h) this.b;
                if (hVar != null) {
                    hVar.I();
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
        switch (this.f13874a) {
            case 0:
                ((MediationInterstitialListener) this.f13875c).onAdOpened((AbstractAdViewAdapter) this.b);
                return;
            default:
                k.f().f21748i = true;
                ((g) this.f13875c).f21734g = false;
                return;
        }
    }

    public d(g gVar, h hVar) {
        this.f13875c = gVar;
        this.b = hVar;
    }
}
