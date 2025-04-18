package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f28867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f28868c;

    public /* synthetic */ d(CrashlyticsCore crashlyticsCore, Throwable th, int i2) {
        this.f28866a = i2;
        this.f28867b = crashlyticsCore;
        this.f28868c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28866a;
        Throwable th = this.f28868c;
        CrashlyticsCore crashlyticsCore = this.f28867b;
        switch (i2) {
            case 0:
                CrashlyticsCore.c(crashlyticsCore, th);
                return;
            default:
                CrashlyticsCore.b(crashlyticsCore, th);
                return;
        }
    }
}
