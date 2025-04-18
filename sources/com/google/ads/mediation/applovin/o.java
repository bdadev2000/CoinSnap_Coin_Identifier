package com.google.ads.mediation.applovin;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.gms.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class o implements e {
    public final /* synthetic */ Bundle a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11461b;

    public o(p pVar, Bundle bundle) {
        this.f11461b = pVar;
        this.a = bundle;
    }

    @Override // com.google.ads.mediation.applovin.e
    public final void onInitializeSuccess(String str) {
        Bundle bundle = this.a;
        String retrieveZoneId = AppLovinUtils.retrieveZoneId(bundle);
        p pVar = this.f11461b;
        pVar.zoneId = retrieveZoneId;
        HashMap hashMap = p.f11462g;
        if (hashMap.containsKey(pVar.zoneId) && ((WeakReference) hashMap.get(pVar.zoneId)).get() != null) {
            AdError adError = new AdError(105, g.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(g.TAG, adError.getMessage());
            pVar.interstitialAdLoadCallback.onFailure(adError);
            return;
        }
        hashMap.put(pVar.zoneId, new WeakReference(pVar));
        pVar.f11463b = pVar.appLovinInitializer.c(pVar.f11464c, bundle);
        pVar.f11465d = pVar.f11465d;
        Log.d(g.TAG, "Requesting interstitial for zone: " + pVar.zoneId);
        if (!TextUtils.isEmpty(pVar.zoneId)) {
            pVar.f11463b.getAdService().loadNextAdForZoneId(pVar.zoneId, pVar);
        } else {
            pVar.f11463b.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, pVar);
        }
    }
}
