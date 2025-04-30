package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f10709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f10710d;

    public /* synthetic */ E(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i9) {
        this.b = i9;
        this.f10709c = kVar;
        this.f10710d = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f10709c.b(this.f10710d);
                return;
            case 1:
                this.f10709c.d(this.f10710d);
                return;
            default:
                this.f10709c.c(this.f10710d);
                return;
        }
    }
}
