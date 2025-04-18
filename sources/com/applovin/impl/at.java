package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* loaded from: classes.dex */
public final /* synthetic */ class at implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f3793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3794d;

    public /* synthetic */ at(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i10) {
        this.f3792b = i10;
        this.f3793c = appLovinBidTokenCollectionListener;
        this.f3794d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3792b;
        String str = this.f3794d;
        AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener = this.f3793c;
        switch (i10) {
            case 0:
                bc.Q(appLovinBidTokenCollectionListener, str);
                return;
            default:
                bc.m(appLovinBidTokenCollectionListener, str);
                return;
        }
    }
}
