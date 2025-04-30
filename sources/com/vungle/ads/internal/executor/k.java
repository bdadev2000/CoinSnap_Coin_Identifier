package com.vungle.ads.internal.executor;

import com.vungle.ads.F0;
import t7.y;

/* loaded from: classes3.dex */
public final class k extends G7.k implements F7.a {
    public static final k INSTANCE = new k();

    public k() {
        super(0);
    }

    @Override // F7.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m45invoke();
        return y.f23029a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m45invoke() {
        new F0("submit callable error").logErrorNoReturnValue$vungle_ads_release();
    }
}
