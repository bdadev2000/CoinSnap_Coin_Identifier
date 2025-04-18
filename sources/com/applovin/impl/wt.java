package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class wt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f27790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27791c;

    public /* synthetic */ wt(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i2) {
        this.f27789a = i2;
        this.f27790b = appLovinBidTokenCollectionListener;
        this.f27791c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27789a;
        String str = this.f27791c;
        AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener = this.f27790b;
        switch (i2) {
            case 0:
                gc.w(appLovinBidTokenCollectionListener, str);
                return;
            default:
                gc.E(appLovinBidTokenCollectionListener, str);
                return;
        }
    }
}
