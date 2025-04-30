package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements MaxFullscreenAdImpl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9034a;
    public final /* synthetic */ MaxFullscreenAdImpl b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9035c;

    public /* synthetic */ e(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i9) {
        this.f9034a = i9;
        this.b = maxFullscreenAdImpl;
        this.f9035c = str;
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final void a() {
        switch (this.f9034a) {
            case 0:
                MaxFullscreenAdImpl.j(this.b, this.f9035c);
                return;
            default:
                MaxFullscreenAdImpl.m(this.b, this.f9035c);
                return;
        }
    }
}
