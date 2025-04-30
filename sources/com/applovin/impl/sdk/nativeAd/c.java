package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.ql;
import org.json.JSONArray;
import t.InterfaceC2702a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC2702a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11042c;

    public /* synthetic */ c(Object obj, int i9) {
        this.b = i9;
        this.f11042c = obj;
    }

    @Override // t.InterfaceC2702a
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return AppLovinNativeAdImpl.b((AppLovinNativeAdImpl) this.f11042c, (ql) obj);
            case 1:
                return AppLovinNativeAdImpl.a((AppLovinNativeAdImpl) this.f11042c, (JSONArray) obj);
            default:
                return AppLovinNativeAdImpl.y((c) ((InterfaceC2702a) this.f11042c), (ql) obj);
        }
    }
}
