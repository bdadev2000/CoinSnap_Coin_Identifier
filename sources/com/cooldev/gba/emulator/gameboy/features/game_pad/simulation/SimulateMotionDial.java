package com.cooldev.gba.emulator.gameboy.features.game_pad.simulation;

import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface SimulateMotionDial extends Dial {
    boolean clearSimulatedMotion(int i2, @NotNull List<Event> list);

    boolean simulateMotion(int i2, float f2, float f3, @NotNull List<Event> list);
}
