package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f28873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28874c;
    public final /* synthetic */ String d;

    public /* synthetic */ f(CrashlyticsCore crashlyticsCore, String str, String str2, int i2) {
        this.f28872a = i2;
        this.f28873b = crashlyticsCore;
        this.f28874c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28872a;
        CrashlyticsCore crashlyticsCore = this.f28873b;
        String str = this.d;
        String str2 = this.f28874c;
        switch (i2) {
            case 0:
                crashlyticsCore.lambda$setCustomKey$5(str2, str);
                return;
            default:
                crashlyticsCore.lambda$setInternalKey$7(str2, str);
                return;
        }
    }
}
