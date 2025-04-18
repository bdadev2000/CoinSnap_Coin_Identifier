package com.cooldev.gba.emulator.gameboy.features.game_pad.dials.new_style;

import com.cooldev.gba.emulator.gameboy.features.game_pad.config.ButtonConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class PrimaryButtonsDialNewStyle$gesture$2 extends r implements l {
    final /* synthetic */ GestureType $gestureType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonsDialNewStyle$gesture$2(GestureType gestureType) {
        super(1);
        this.$gestureType = gestureType;
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull ButtonConfig buttonConfig) {
        a.s(buttonConfig, "it");
        return Boolean.valueOf(buttonConfig.getSupportsGestures().contains(this.$gestureType));
    }
}
