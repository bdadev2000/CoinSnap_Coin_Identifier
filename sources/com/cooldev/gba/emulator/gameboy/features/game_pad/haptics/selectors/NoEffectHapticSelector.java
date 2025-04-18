package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class NoEffectHapticSelector implements HapticSelector {
    public static final int $stable = 0;

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors.HapticSelector
    public int getEffectConstant(@NotNull List<? extends Event> list) {
        a.s(list, CrashEvent.f29806f);
        return 0;
    }
}
