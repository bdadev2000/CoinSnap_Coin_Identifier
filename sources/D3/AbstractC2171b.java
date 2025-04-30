package d3;

import G7.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c3.C0603a;
import c3.C0605c;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.C2073d;
import com.vungle.ads.C2076e0;
import com.vungle.ads.InterfaceC2080g0;
import com.vungle.ads.P;
import com.vungle.ads.o1;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2171b implements MediationAppOpenAd, InterfaceC2080g0 {
    public final MediationAppOpenAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f19820c;

    /* renamed from: d, reason: collision with root package name */
    public final C0603a f19821d;

    /* renamed from: f, reason: collision with root package name */
    public C2076e0 f19822f;

    /* renamed from: g, reason: collision with root package name */
    public MediationAppOpenAdCallback f19823g;

    public AbstractC2171b(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, C0603a c0603a) {
        j.e(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        j.e(mediationAdLoadCallback, "mediationAdLoadCallback");
        j.e(c0603a, "vungleFactory");
        this.b = mediationAppOpenAdConfiguration;
        this.f19820c = mediationAdLoadCallback;
        this.f19821d = c0603a;
    }

    public abstract String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void b(C2073d c2073d, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public final void c() {
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = this.b;
        Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        j.d(mediationExtras, "mediationAppOpenAdConfiguration.mediationExtras");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        j.d(serverParameters, "mediationAppOpenAdConfiguration.serverParameters");
        String string = serverParameters.getString("appid");
        MediationAdLoadCallback mediationAdLoadCallback = this.f19820c;
        if (string != null && string.length() != 0) {
            String string2 = serverParameters.getString("placementID");
            if (string2 != null && string2.length() != 0) {
                Context context = mediationAppOpenAdConfiguration.getContext();
                j.d(context, "mediationAppOpenAdConfiguration.context");
                C0605c c0605c = C0605c.f5405c;
                j.b(string);
                c0605c.a(string, context, new C2170a(this, mediationExtras, context, string2));
                return;
            }
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        mediationAdLoadCallback.onFailure(adError2);
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdClicked(P p2) {
        j.e(p2, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19823g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdEnd(P p2) {
        j.e(p2, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19823g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdFailedToLoad(P p2, o1 o1Var) {
        j.e(p2, "baseAd");
        j.e(o1Var, "adError");
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        j.d(adError, "getAdError(adError)");
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f19820c.onFailure(adError);
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdFailedToPlay(P p2, o1 o1Var) {
        j.e(p2, "baseAd");
        j.e(o1Var, "adError");
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        j.d(adError, "getAdError(adError)");
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19823g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdImpression(P p2) {
        j.e(p2, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19823g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdLeftApplication(P p2) {
        j.e(p2, "baseAd");
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdLoaded(P p2) {
        j.e(p2, "baseAd");
        this.f19823g = (MediationAppOpenAdCallback) this.f19820c.onSuccess(this);
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdStart(P p2) {
        j.e(p2, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19823g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        j.e(context, "context");
        C2076e0 c2076e0 = this.f19822f;
        if (c2076e0 != null) {
            if (c2076e0.canPlayAd().booleanValue()) {
                C2076e0 c2076e02 = this.f19822f;
                if (c2076e02 != null) {
                    c2076e02.play(context);
                    return;
                } else {
                    j.k("appOpenAd");
                    throw null;
                }
            }
            AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19823g;
            if (mediationAppOpenAdCallback != null) {
                mediationAppOpenAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        j.k("appOpenAd");
        throw null;
    }
}
