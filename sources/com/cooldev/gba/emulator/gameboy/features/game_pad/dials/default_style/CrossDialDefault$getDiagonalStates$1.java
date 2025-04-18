package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style;

import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.CrossDialDefault;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class CrossDialDefault$getDiagonalStates$1 extends r implements l {
    public static final CrossDialDefault$getDiagonalStates$1 INSTANCE = new CrossDialDefault$getDiagonalStates$1();

    public CrossDialDefault$getDiagonalStates$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull CrossDialDefault.State state) {
        a.s(state, "it");
        return Boolean.valueOf(state.getAnchor().getIds().size() > 1);
    }
}
