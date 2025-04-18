package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style;

import com.cooldev.gba.emulator.gameboy.features.game_pad.config.CrossConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.three_d_style.CrossDialThreeDStyle;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class CrossDialThreeDStyle$computeStateForPosition$1 extends r implements l {
    final /* synthetic */ CrossDialThreeDStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossDialThreeDStyle$computeStateForPosition$1(CrossDialThreeDStyle crossDialThreeDStyle) {
        super(1);
        this.this$0 = crossDialThreeDStyle;
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull CrossDialThreeDStyle.State state) {
        CrossConfig crossConfig;
        a.s(state, "it");
        crossConfig = this.this$0.config;
        return Boolean.valueOf(crossConfig.getUseDiagonals() || !state.isDiagonal());
    }
}
