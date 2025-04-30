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
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13867a;
    public final /* synthetic */ Cloneable b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13869d;

    public /* synthetic */ p(Object obj, Bundle bundle, Object obj2, int i9) {
        this.f13867a = i9;
        this.f13869d = obj;
        this.b = bundle;
        this.f13868c = obj2;
    }

    @Override // com.google.ads.mediation.applovin.e
    public final void onInitializeSuccess(String str) {
        Object obj = this.f13869d;
        Object obj2 = this.f13868c;
        Cloneable cloneable = this.b;
        switch (this.f13867a) {
            case 0:
                Bundle bundle = (Bundle) cloneable;
                q qVar = (q) obj;
                qVar.b = AppLovinUtils.retrieveZoneId(bundle);
                qVar.appLovinSdk = qVar.appLovinInitializer.c((Context) obj2, bundle);
                String e4 = AbstractC2914a.e("Requesting rewarded video for zone '", qVar.b, "'");
                String str2 = k.TAG;
                Log.d(str2, e4);
                HashMap hashMap = q.f13870d;
                if (hashMap.containsKey(qVar.b)) {
                    AdError adError = new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN);
                    Log.e(str2, adError.toString());
                    qVar.adLoadCallback.onFailure(adError);
                    return;
                }
                hashMap.put(qVar.b, new WeakReference(qVar));
                if (Objects.equals(qVar.b, "")) {
                    a aVar = qVar.appLovinAdFactory;
                    AppLovinSdk appLovinSdk = qVar.appLovinSdk;
                    aVar.getClass();
                    qVar.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(appLovinSdk);
                } else {
                    a aVar2 = qVar.appLovinAdFactory;
                    String str3 = qVar.b;
                    AppLovinSdk appLovinSdk2 = qVar.appLovinSdk;
                    aVar2.getClass();
                    qVar.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(str3, appLovinSdk2);
                }
                qVar.incentivizedInterstitial.preload(qVar);
                return;
            case 1:
                c cVar = (c) obj;
                Bundle bundle2 = (Bundle) cloneable;
                cVar.f13849c = cVar.f13852g.c(cVar.f13850d, bundle2);
                cVar.f13851f = AppLovinUtils.retrieveZoneId(bundle2);
                StringBuilder sb = new StringBuilder("Requesting banner of size ");
                AppLovinAdSize appLovinAdSize = (AppLovinAdSize) obj2;
                sb.append(appLovinAdSize);
                sb.append(" for zone: ");
                sb.append(cVar.f13851f);
                Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, sb.toString());
                a aVar3 = cVar.f13853h;
                AppLovinSdk appLovinSdk3 = cVar.f13849c;
                Context context = cVar.f13850d;
                aVar3.getClass();
                cVar.b = new b(appLovinSdk3, appLovinAdSize, context);
                cVar.b.f13847a.setAdDisplayListener(cVar);
                cVar.b.f13847a.setAdClickListener(cVar);
                cVar.b.f13847a.setAdViewEventListener(cVar);
                if (!TextUtils.isEmpty(cVar.f13851f)) {
                    cVar.f13849c.getAdService().loadNextAdForZoneId(cVar.f13851f, cVar);
                    return;
                } else {
                    cVar.f13849c.getAdService().loadNextAd(appLovinAdSize, cVar);
                    return;
                }
            default:
                HashSet hashSet = (HashSet) cloneable;
                hashSet.add(str);
                if (hashSet.equals((HashSet) obj2)) {
                    ((InitializationCompleteCallback) obj).onInitializationSucceeded();
                    return;
                }
                return;
        }
    }

    public p(HashSet hashSet, HashSet hashSet2, InitializationCompleteCallback initializationCompleteCallback) {
        this.f13867a = 2;
        this.b = hashSet;
        this.f13868c = hashSet2;
        this.f13869d = initializationCompleteCallback;
    }
}
