package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.manager;

import com.google.android.gms.ads.AdView;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdManager$loadAdWithRetry$4$1$1 extends r implements l {
    final /* synthetic */ l $onAdLoaded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdManager$loadAdWithRetry$4$1$1(l lVar) {
        super(1);
        this.$onAdLoaded = lVar;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AdView) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull AdView adView) {
        p0.a.s(adView, "it");
        this.$onAdLoaded.invoke(adView);
    }
}
