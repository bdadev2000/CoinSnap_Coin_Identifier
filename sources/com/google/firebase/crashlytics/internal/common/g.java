package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f28876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28877c;
    public final /* synthetic */ String d;

    public /* synthetic */ g(CrashlyticsCore crashlyticsCore, long j2, String str, int i2) {
        this.f28875a = i2;
        this.f28876b = crashlyticsCore;
        this.f28877c = j2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28875a;
        CrashlyticsCore crashlyticsCore = this.f28876b;
        String str = this.d;
        long j2 = this.f28877c;
        switch (i2) {
            case 0:
                crashlyticsCore.lambda$log$3(j2, str);
                return;
            default:
                crashlyticsCore.lambda$log$2(j2, str);
                return;
        }
    }
}
