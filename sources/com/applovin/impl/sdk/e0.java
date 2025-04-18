package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f7658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f7659d;

    public /* synthetic */ e0(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i10) {
        this.f7657b = i10;
        this.f7658c = kVar;
        this.f7659d = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7657b;
        AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.f7659d;
        k kVar = this.f7658c;
        switch (i10) {
            case 0:
                kVar.d(sdkInitializationListener);
                return;
            case 1:
                kVar.b(sdkInitializationListener);
                return;
            default:
                kVar.c(sdkInitializationListener);
                return;
        }
    }
}
