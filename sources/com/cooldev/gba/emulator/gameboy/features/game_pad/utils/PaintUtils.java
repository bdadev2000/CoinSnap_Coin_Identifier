package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.u;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PaintUtils {
    public static final int $stable = 0;

    @NotNull
    public static final PaintUtils INSTANCE = new PaintUtils();

    private PaintUtils() {
    }

    public final float convertDpToPixel(float f2, @NotNull Context context) {
        a.s(context, "context");
        return (context.getResources().getDisplayMetrics().densityDpi / Opcodes.IF_ICMPNE) * f2;
    }

    @NotNull
    public final RectF mergeRectangles(@NotNull Iterable<? extends RectF> iterable) {
        a.s(iterable, "rectangles");
        RectF rectF = (RectF) u.D0(iterable);
        Iterator it = u.B0(iterable, 1).iterator();
        while (it.hasNext()) {
            rectF.union((RectF) it.next());
        }
        return rectF;
    }

    @NotNull
    public final Rect roundToInt(@NotNull RectF rectF) {
        a.s(rectF, "<this>");
        return new Rect(a.t0(rectF.left), a.t0(rectF.top), a.t0(rectF.right), a.t0(rectF.bottom));
    }

    @NotNull
    public final RectF scale(@NotNull RectF rectF, float f2) {
        a.s(rectF, "<this>");
        return new RectF(rectF.left * f2, rectF.top * f2, rectF.right * f2, rectF.bottom * f2);
    }

    @NotNull
    public final RectF scaleCentered(@NotNull RectF rectF, float f2) {
        a.s(rectF, "<this>");
        float width = rectF.width() * f2;
        float height = rectF.height() * f2;
        float width2 = (rectF.width() - width) * 0.5f;
        float height2 = (rectF.height() - height) * 0.5f;
        return new RectF(rectF.left + width2, rectF.top + height2, rectF.right - width2, rectF.bottom - height2);
    }
}
