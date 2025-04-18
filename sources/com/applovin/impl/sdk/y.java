package com.applovin.impl.sdk;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f26872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26873c;

    public /* synthetic */ y(j jVar, String str, int i2) {
        this.f26871a = i2;
        this.f26872b = jVar;
        this.f26873c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26871a;
        String str = this.f26873c;
        j jVar = this.f26872b;
        switch (i2) {
            case 0:
                j.l(jVar, str);
                return;
            default:
                j.k(jVar, str);
                return;
        }
    }
}
