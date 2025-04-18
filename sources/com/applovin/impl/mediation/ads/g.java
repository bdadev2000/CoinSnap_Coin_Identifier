package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements MaxFullscreenAdImpl.e {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f6080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6081c;

    public /* synthetic */ g(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i10) {
        this.a = i10;
        this.f6080b = maxFullscreenAdImpl;
        this.f6081c = str;
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final void a() {
        int i10 = this.a;
        String str = this.f6081c;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f6080b;
        switch (i10) {
            case 0:
                MaxFullscreenAdImpl.m(maxFullscreenAdImpl, str);
                return;
            default:
                MaxFullscreenAdImpl.j(maxFullscreenAdImpl, str);
                return;
        }
    }
}
