package com.google.accompanist.drawablepainter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import b1.f0;
import d0.h;
import d0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes.dex */
public final class DrawablePainterKt {

    @NotNull
    private static final h MAIN_HANDLER$delegate = f0.s(i.f30133c, DrawablePainterKt$MAIN_HANDLER$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getIntrinsicSize(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        return SizeKt.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler getMAIN_HANDLER() {
        return (Handler) MAIN_HANDLER$delegate.getValue();
    }

    @Composable
    @NotNull
    public static final Painter rememberDrawablePainter(@Nullable Drawable drawable, @Nullable Composer composer, int i2) {
        Object drawablePainter;
        composer.t(1756822313);
        composer.t(-1791785024);
        boolean I = composer.I(drawable);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            if (drawable == null) {
                u2 = EmptyPainter.INSTANCE;
            } else {
                if (drawable instanceof ColorDrawable) {
                    drawablePainter = new ColorPainter(ColorKt.b(((ColorDrawable) drawable).getColor()));
                } else {
                    Drawable mutate = drawable.mutate();
                    a.r(mutate, "mutate(...)");
                    drawablePainter = new DrawablePainter(mutate);
                }
                u2 = drawablePainter;
            }
            composer.o(u2);
        }
        Painter painter = (Painter) u2;
        composer.H();
        composer.H();
        return painter;
    }
}
