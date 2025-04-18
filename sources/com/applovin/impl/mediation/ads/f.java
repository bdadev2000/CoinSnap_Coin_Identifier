package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements MaxFullscreenAdImpl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f25376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25377c;

    public /* synthetic */ f(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i2) {
        this.f25375a = i2;
        this.f25376b = maxFullscreenAdImpl;
        this.f25377c = str;
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final void a() {
        int i2 = this.f25375a;
        String str = this.f25377c;
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f25376b;
        switch (i2) {
            case 0:
                MaxFullscreenAdImpl.l(maxFullscreenAdImpl, str);
                return;
            default:
                MaxFullscreenAdImpl.n(maxFullscreenAdImpl, str);
                return;
        }
    }
}
