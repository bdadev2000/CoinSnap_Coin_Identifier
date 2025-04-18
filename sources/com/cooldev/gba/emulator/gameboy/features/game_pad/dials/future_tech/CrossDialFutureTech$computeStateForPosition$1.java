package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech;

import com.cooldev.gba.emulator.gameboy.features.game_pad.config.CrossConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.future_tech.CrossDialFutureTech;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class CrossDialFutureTech$computeStateForPosition$1 extends r implements l {
    final /* synthetic */ CrossDialFutureTech this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossDialFutureTech$computeStateForPosition$1(CrossDialFutureTech crossDialFutureTech) {
        super(1);
        this.this$0 = crossDialFutureTech;
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull CrossDialFutureTech.State state) {
        CrossConfig crossConfig;
        a.s(state, "it");
        crossConfig = this.this$0.config;
        return Boolean.valueOf(crossConfig.getUseDiagonals() || !state.isDiagonal());
    }
}
