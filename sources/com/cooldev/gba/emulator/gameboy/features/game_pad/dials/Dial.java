package com.cooldev.gba.emulator.gameboy.features.game_pad.dials;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.cooldev.gba.emulator.gameboy.features.game_pad.accessibility.AccessibilityBox;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.Sector;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface Dial {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void measure$default(Dial dial, RectF rectF, Sector sector, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measure");
            }
            if ((i2 & 2) != 0) {
                sector = null;
            }
            dial.measure(rectF, sector);
        }
    }

    @NotNull
    List<AccessibilityBox> accessibilityBoxes();

    void draw(@NotNull Canvas canvas);

    @NotNull
    RectF drawingBox();

    boolean gesture(float f2, float f3, @NotNull GestureType gestureType, @NotNull List<Event> list);

    void measure(@NotNull RectF rectF, @Nullable Sector sector);

    boolean touch(@NotNull List<TouchUtils.FingerPosition> list, @NotNull List<Event> list2);

    @NotNull
    Set<Integer> trackedPointersIds();
}
