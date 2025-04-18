package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style;

import com.cooldev.gba.emulator.gameboy.features.game_pad.config.CrossConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.default_style.CrossDialDefault;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class CrossDialDefault$computeStateForPosition$1 extends r implements l {
    final /* synthetic */ CrossDialDefault this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossDialDefault$computeStateForPosition$1(CrossDialDefault crossDialDefault) {
        super(1);
        this.this$0 = crossDialDefault;
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull CrossDialDefault.State state) {
        CrossConfig crossConfig;
        a.s(state, "it");
        crossConfig = this.this$0.config;
        return Boolean.valueOf(crossConfig.getUseDiagonals() || !state.isDiagonal());
    }
}
