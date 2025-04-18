package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f7689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7690d;

    public /* synthetic */ h0(k kVar, String str, int i10) {
        this.f7688b = i10;
        this.f7689c = kVar;
        this.f7690d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7688b;
        String str = this.f7690d;
        k kVar = this.f7689c;
        switch (i10) {
            case 0:
                kVar.c(str);
                return;
            default:
                kVar.b(str);
                return;
        }
    }
}
