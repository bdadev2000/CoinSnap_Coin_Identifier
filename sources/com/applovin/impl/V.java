package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* loaded from: classes.dex */
public final /* synthetic */ class V implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f6500c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6501d;

    public /* synthetic */ V(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i9) {
        this.b = i9;
        this.f6500c = appLovinBidTokenCollectionListener;
        this.f6501d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bc.p(this.f6500c, this.f6501d);
                return;
            default:
                bc.L(this.f6500c, this.f6501d);
                return;
        }
    }
}
