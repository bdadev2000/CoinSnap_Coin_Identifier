package com.cooldev.gba.emulator.gameboy.features.game_pad.simulation;

import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface SimulateKeyDial extends Dial {
    boolean clearSimulateKeyPress(int i2, @NotNull List<Event> list);

    boolean simulateKeyPress(int i2, boolean z2, @NotNull List<Event> list);
}
