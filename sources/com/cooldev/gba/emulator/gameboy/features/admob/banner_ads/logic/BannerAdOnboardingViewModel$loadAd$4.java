package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class BannerAdOnboardingViewModel$loadAd$4 extends r implements a {
    final /* synthetic */ BannerAdOnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdOnboardingViewModel$loadAd$4(BannerAdOnboardingViewModel bannerAdOnboardingViewModel) {
        super(0);
        this.this$0 = bannerAdOnboardingViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m74invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m74invoke() {
        Context context;
        AppOpenAdPrefUtils appOpenAdPrefUtils = AppOpenAdPrefUtils.INSTANCE;
        context = this.this$0.context;
        p0.a.r(context, "access$getContext$p(...)");
        appOpenAdPrefUtils.setShowAppOpenAdOnResume(context, false);
    }
}
