package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.actuators.HapticActuator;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors.HapticSelector;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class HapticEngine {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int EFFECT_NONE = 0;
    public static final int EFFECT_PRESS = 2;
    public static final int EFFECT_RELEASE = 1;

    @NotNull
    private final HapticActuator actuator;

    @NotNull
    private final HapticSelector selector;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public HapticEngine(@NotNull HapticSelector hapticSelector, @NotNull HapticActuator hapticActuator) {
        a.s(hapticSelector, "selector");
        a.s(hapticActuator, "actuator");
        this.selector = hapticSelector;
        this.actuator = hapticActuator;
    }

    public final void performHaptic(int i2) {
        this.actuator.performHaptic(i2);
    }

    public final void performHapticForEvents(@NotNull List<? extends Event> list) {
        a.s(list, CrashEvent.f29806f);
        performHaptic(this.selector.getEffectConstant(list));
    }
}
