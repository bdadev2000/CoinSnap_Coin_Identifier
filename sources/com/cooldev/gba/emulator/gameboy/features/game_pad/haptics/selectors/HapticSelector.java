package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors;

import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface HapticSelector {
    int getEffectConstant(@NotNull List<? extends Event> list);
}
