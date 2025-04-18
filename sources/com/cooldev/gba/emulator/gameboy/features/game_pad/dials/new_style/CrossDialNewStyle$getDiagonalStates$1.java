package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style;

import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style.CrossDialNewStyle;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class CrossDialNewStyle$getDiagonalStates$1 extends r implements l {
    public static final CrossDialNewStyle$getDiagonalStates$1 INSTANCE = new CrossDialNewStyle$getDiagonalStates$1();

    public CrossDialNewStyle$getDiagonalStates$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull CrossDialNewStyle.State state) {
        a.s(state, "it");
        return Boolean.valueOf(state.getAnchor().getIds().size() > 1);
    }
}
