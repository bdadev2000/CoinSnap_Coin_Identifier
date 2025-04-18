package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.manager;

import com.google.android.gms.ads.AdView;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdManager$loadAd$1 extends r implements l {
    public static final BannerAdManager$loadAd$1 INSTANCE = new BannerAdManager$loadAd$1();

    public BannerAdManager$loadAd$1() {
        super(1);
    }

    public final void invoke(@NotNull AdView adView) {
        p0.a.s(adView, "it");
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AdView) obj);
        return b0.f30125a;
    }
}
