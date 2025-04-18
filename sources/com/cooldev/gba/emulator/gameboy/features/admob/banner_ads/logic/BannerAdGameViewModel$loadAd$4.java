package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class BannerAdGameViewModel$loadAd$4 extends r implements a {
    final /* synthetic */ BannerAdGameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdGameViewModel$loadAd$4(BannerAdGameViewModel bannerAdGameViewModel) {
        super(0);
        this.this$0 = bannerAdGameViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m72invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m72invoke() {
        Context context;
        AppOpenAdPrefUtils appOpenAdPrefUtils = AppOpenAdPrefUtils.INSTANCE;
        context = this.this$0.context;
        p0.a.r(context, "access$getContext$p(...)");
        appOpenAdPrefUtils.setShowAppOpenAdOnResume(context, false);
    }
}
