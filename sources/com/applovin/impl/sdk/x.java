package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f26869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f26870c;

    public /* synthetic */ x(j jVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i2) {
        this.f26868a = i2;
        this.f26869b = jVar;
        this.f26870c = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26868a;
        AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.f26870c;
        j jVar = this.f26869b;
        switch (i2) {
            case 0:
                jVar.c(sdkInitializationListener);
                return;
            case 1:
                jVar.d(sdkInitializationListener);
                return;
            default:
                jVar.b(sdkInitializationListener);
                return;
        }
    }
}
