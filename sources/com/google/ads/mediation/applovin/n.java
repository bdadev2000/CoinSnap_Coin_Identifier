package com.google.ads.mediation.applovin;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.gms.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f13862a;
    public final /* synthetic */ o b;

    public n(o oVar, Bundle bundle) {
        this.b = oVar;
        this.f13862a = bundle;
    }

    @Override // com.google.ads.mediation.applovin.e
    public final void onInitializeSuccess(String str) {
        Bundle bundle = this.f13862a;
        String retrieveZoneId = AppLovinUtils.retrieveZoneId(bundle);
        o oVar = this.b;
        oVar.zoneId = retrieveZoneId;
        HashMap hashMap = o.f13863g;
        if (hashMap.containsKey(oVar.zoneId) && ((WeakReference) hashMap.get(oVar.zoneId)).get() != null) {
            AdError adError = new AdError(105, g.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(g.TAG, adError.getMessage());
            oVar.interstitialAdLoadCallback.onFailure(adError);
            return;
        }
        hashMap.put(oVar.zoneId, new WeakReference(oVar));
        oVar.b = oVar.appLovinInitializer.c(oVar.f13864c, bundle);
        oVar.f13865d = oVar.f13865d;
        Log.d(g.TAG, "Requesting interstitial for zone: " + oVar.zoneId);
        if (!TextUtils.isEmpty(oVar.zoneId)) {
            oVar.b.getAdService().loadNextAdForZoneId(oVar.zoneId, oVar);
        } else {
            oVar.b.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, oVar);
        }
    }
}
