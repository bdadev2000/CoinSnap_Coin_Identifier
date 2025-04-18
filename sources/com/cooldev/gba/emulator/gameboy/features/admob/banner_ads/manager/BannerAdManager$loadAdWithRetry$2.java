package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.manager;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdManager$loadAdWithRetry$2 extends r implements l {
    public static final BannerAdManager$loadAdWithRetry$2 INSTANCE = new BannerAdManager$loadAdWithRetry$2();

    public BannerAdManager$loadAdWithRetry$2() {
        super(1);
    }

    public final void invoke(@NotNull String str) {
        p0.a.s(str, "it");
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }
}
