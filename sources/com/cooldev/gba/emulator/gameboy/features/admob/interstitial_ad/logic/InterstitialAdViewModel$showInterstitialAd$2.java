package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class InterstitialAdViewModel$showInterstitialAd$2 extends r implements l {
    public static final InterstitialAdViewModel$showInterstitialAd$2 INSTANCE = new InterstitialAdViewModel$showInterstitialAd$2();

    public InterstitialAdViewModel$showInterstitialAd$2() {
        super(1);
    }

    public final void invoke(@NotNull String str) {
        a.s(str, "it");
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }
}
