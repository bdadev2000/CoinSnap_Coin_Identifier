package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AdvancedHapticSelector implements HapticSelector {
    public static final int $stable = 0;

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors.HapticSelector
    public int getEffectConstant(@NotNull List<? extends Event> list) {
        Object obj;
        a.s(list, CrashEvent.f29806f);
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int haptic = ((Event) next).getHaptic();
                do {
                    Object next2 = it.next();
                    int haptic2 = ((Event) next2).getHaptic();
                    if (haptic < haptic2) {
                        next = next2;
                        haptic = haptic2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Event event = (Event) obj;
        if (event != null) {
            return event.getHaptic();
        }
        return 0;
    }
}
