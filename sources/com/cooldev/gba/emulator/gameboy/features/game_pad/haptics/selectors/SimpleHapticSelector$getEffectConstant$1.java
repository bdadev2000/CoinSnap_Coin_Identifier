package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors;

import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class SimpleHapticSelector$getEffectConstant$1 extends r implements l {
    public static final SimpleHapticSelector$getEffectConstant$1 INSTANCE = new SimpleHapticSelector$getEffectConstant$1();

    public SimpleHapticSelector$getEffectConstant$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Integer invoke(@NotNull Event event) {
        a.s(event, "it");
        return Integer.valueOf(event.getHaptic());
    }
}
