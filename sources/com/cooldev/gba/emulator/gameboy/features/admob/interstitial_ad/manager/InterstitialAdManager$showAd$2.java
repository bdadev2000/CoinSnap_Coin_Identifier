package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.manager;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class InterstitialAdManager$showAd$2 extends r implements l {
    public static final InterstitialAdManager$showAd$2 INSTANCE = new InterstitialAdManager$showAd$2();

    public InterstitialAdManager$showAd$2() {
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
