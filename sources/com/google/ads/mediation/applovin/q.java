package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class q implements e {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f11467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11469d;

    public /* synthetic */ q(Object obj, Bundle bundle, Object obj2, int i10) {
        this.a = i10;
        this.f11469d = obj;
        this.f11467b = bundle;
        this.f11468c = obj2;
    }

    @Override // com.google.ads.mediation.applovin.e
    public final void onInitializeSuccess(String str) {
        int i10 = this.a;
        Object obj = this.f11468c;
        Bundle bundle = this.f11467b;
        Object obj2 = this.f11469d;
        switch (i10) {
            case 0:
                r rVar = (r) obj2;
                rVar.f11471b = AppLovinUtils.retrieveZoneId(bundle);
                rVar.appLovinSdk = rVar.appLovinInitializer.c((Context) obj, bundle);
                boolean z10 = true;
                String format = String.format("Requesting rewarded video for zone '%s'", rVar.f11471b);
                String str2 = l.TAG;
                Log.d(str2, format);
                HashMap hashMap = r.f11470d;
                if (!hashMap.containsKey(rVar.f11471b)) {
                    hashMap.put(rVar.f11471b, new WeakReference(rVar));
                    z10 = false;
                }
                if (z10) {
                    AdError adError = new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN);
                    Log.e(str2, adError.toString());
                    rVar.adLoadCallback.onFailure(adError);
                    return;
                }
                if (Objects.equals(rVar.f11471b, "")) {
                    a aVar = rVar.appLovinAdFactory;
                    AppLovinSdk appLovinSdk = rVar.appLovinSdk;
                    aVar.getClass();
                    rVar.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(appLovinSdk);
                } else {
                    a aVar2 = rVar.appLovinAdFactory;
                    String str3 = rVar.f11471b;
                    AppLovinSdk appLovinSdk2 = rVar.appLovinSdk;
                    aVar2.getClass();
                    rVar.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(str3, appLovinSdk2);
                }
                rVar.incentivizedInterstitial.preload(rVar);
                return;
            default:
                c cVar = (c) obj2;
                cVar.f11443c = cVar.f11446g.c(cVar.f11444d, bundle);
                cVar.f11445f = AppLovinUtils.retrieveZoneId(bundle);
                int i11 = c.f11441k;
                StringBuilder sb2 = new StringBuilder("Requesting banner of size ");
                AppLovinAdSize appLovinAdSize = (AppLovinAdSize) obj;
                sb2.append(appLovinAdSize);
                sb2.append(" for zone: ");
                sb2.append(cVar.f11445f);
                Log.d(com.mbridge.msdk.foundation.controller.a.a, sb2.toString());
                AppLovinSdk appLovinSdk3 = cVar.f11443c;
                Context context = cVar.f11444d;
                cVar.f11447h.getClass();
                b bVar = new b(appLovinSdk3, appLovinAdSize, context);
                cVar.f11442b = bVar;
                bVar.a.setAdDisplayListener(cVar);
                cVar.f11442b.a.setAdClickListener(cVar);
                cVar.f11442b.a.setAdViewEventListener(cVar);
                if (!TextUtils.isEmpty(cVar.f11445f)) {
                    cVar.f11443c.getAdService().loadNextAdForZoneId(cVar.f11445f, cVar);
                    return;
                } else {
                    cVar.f11443c.getAdService().loadNextAd(appLovinAdSize, cVar);
                    return;
                }
        }
    }
}
