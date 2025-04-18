package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.safedk.android.analytics.events.CrashEvent;
import e0.u;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p0.a;
import y0.m;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SimpleHapticSelector implements HapticSelector {
    public static final int $stable = 0;

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.selectors.HapticSelector
    public int getEffectConstant(@NotNull List<? extends Event> list) {
        Object obj;
        a.s(list, CrashEvent.f29806f);
        Iterator it = m.P(u.z0(list), SimpleHapticSelector$getEffectConstant$1.INSTANCE).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Number) obj).intValue() == 2) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
