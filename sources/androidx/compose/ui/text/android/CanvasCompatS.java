package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes.dex */
final class CanvasCompatS {

    /* renamed from: a, reason: collision with root package name */
    public static final CanvasCompatS f17069a = new Object();

    @DoNotInline
    public final void a(@NotNull Canvas canvas, @NotNull int[] iArr, int i2, @NotNull float[] fArr, int i3, int i4, @NotNull Font font, @NotNull Paint paint) {
        canvas.drawGlyphs(iArr, i2, fArr, i3, i4, font, paint);
    }

    @DoNotInline
    public final void b(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull Rect rect, @Nullable Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    @DoNotInline
    public final void c(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull RectF rectF, @Nullable Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
