package b7;

import a7.c;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.c1;
import com.vungle.ads.d;
import com.vungle.ads.e1;
import com.vungle.ads.n3;
import com.vungle.ads.o0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b implements MediationAppOpenAd, e1 {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAppOpenAdConfiguration f2319b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f2320c;

    /* renamed from: d, reason: collision with root package name */
    public final a7.a f2321d;

    /* renamed from: f, reason: collision with root package name */
    public c1 f2322f;

    /* renamed from: g, reason: collision with root package name */
    public MediationAppOpenAdCallback f2323g;

    public b(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a7.a vungleFactory) {
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
        this.f2319b = mediationAppOpenAdConfiguration;
        this.f2320c = mediationAdLoadCallback;
        this.f2321d = vungleFactory;
    }

    public abstract String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void b(d dVar, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public final void c() {
        boolean z10;
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = this.f2319b;
        Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        Intrinsics.checkNotNullExpressionValue(mediationExtras, "mediationAppOpenAdConfiguration.mediationExtras");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "mediationAppOpenAdConfiguration.serverParameters");
        String string = serverParameters.getString("appid");
        boolean z11 = false;
        if (string != null && string.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        MediationAdLoadCallback mediationAdLoadCallback = this.f2320c;
        if (z10) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            z11 = true;
        }
        if (z11) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            Context context = mediationAppOpenAdConfiguration.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "mediationAppOpenAdConfiguration.context");
            c cVar = c.f306c;
            Intrinsics.checkNotNull(string);
            cVar.a(string, context, new a(this, mediationExtras, context, string2));
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdClicked(o0 baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f2323g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdEnd(o0 baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f2323g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdFailedToLoad(o0 baseAd, n3 adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(adError)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        this.f2320c.onFailure(adError2);
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdFailedToPlay(o0 baseAd, n3 adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(adError)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f2323g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdImpression(o0 baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f2323g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdLeftApplication(o0 baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdLoaded(o0 baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.f2323g = (MediationAppOpenAdCallback) this.f2320c.onSuccess(this);
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdStart(o0 baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f2323g;
        if (mediationAppOpenAdCallback != null && mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c1 c1Var = this.f2322f;
        c1 c1Var2 = null;
        if (c1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            c1Var = null;
        }
        if (c1Var.canPlayAd().booleanValue()) {
            c1 c1Var3 = this.f2322f;
            if (c1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            } else {
                c1Var2 = c1Var3;
            }
            c1Var2.play(context);
            return;
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f2323g;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
