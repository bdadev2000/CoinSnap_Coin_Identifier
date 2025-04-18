package com.facebook.appevents.internal;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28546c;

    public /* synthetic */ a(long j2, String str, int i2) {
        this.f28544a = i2;
        this.f28545b = j2;
        this.f28546c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28544a;
        String str = this.f28546c;
        long j2 = this.f28545b;
        switch (i2) {
            case 0:
                ActivityLifecycleTracker.m477onActivityPaused$lambda6$lambda4(j2, str);
                return;
            default:
                ActivityLifecycleTracker.m476onActivityPaused$lambda6(j2, str);
                return;
        }
    }
}
