package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.ql;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements n.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7870c;

    public /* synthetic */ c(Object obj, int i10) {
        this.f7869b = i10;
        this.f7870c = obj;
    }

    @Override // n.a, o7.h
    public final Object apply(Object obj) {
        int i10 = this.f7869b;
        Object obj2 = this.f7870c;
        switch (i10) {
            case 0:
                return AppLovinNativeAdImpl.a((AppLovinNativeAdImpl) obj2, (JSONArray) obj);
            case 1:
                return AppLovinNativeAdImpl.y((AppLovinNativeAdImpl) obj2, (ql) obj);
            default:
                return AppLovinNativeAdImpl.z((n.a) obj2, (ql) obj);
        }
    }
}
