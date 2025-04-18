package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech;

import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech.CrossDialFutureTech;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class CrossDialFutureTech$getDiagonalStates$1 extends r implements l {
    public static final CrossDialFutureTech$getDiagonalStates$1 INSTANCE = new CrossDialFutureTech$getDiagonalStates$1();

    public CrossDialFutureTech$getDiagonalStates$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull CrossDialFutureTech.State state) {
        a.s(state, "it");
        return Boolean.valueOf(state.getAnchor().getIds().size() > 1);
    }
}
