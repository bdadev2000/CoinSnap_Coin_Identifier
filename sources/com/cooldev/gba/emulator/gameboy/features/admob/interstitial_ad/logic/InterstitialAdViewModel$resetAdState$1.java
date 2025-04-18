package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class InterstitialAdViewModel$resetAdState$1 extends r implements l {
    public static final InterstitialAdViewModel$resetAdState$1 INSTANCE = new InterstitialAdViewModel$resetAdState$1();

    public InterstitialAdViewModel$resetAdState$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final InterstitialAdState invoke(@NotNull InterstitialAdState interstitialAdState) {
        a.s(interstitialAdState, "it");
        return interstitialAdState.copy(false, false);
    }
}
