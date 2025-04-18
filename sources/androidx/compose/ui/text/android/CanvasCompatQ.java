package androidx.compose.ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes.dex */
final class CanvasCompatQ {

    /* renamed from: a, reason: collision with root package name */
    public static final CanvasCompatQ f17067a = new Object();

    @DoNotInline
    public final void a(@NotNull Canvas canvas) {
        canvas.disableZ();
    }

    @DoNotInline
    public final void b(@NotNull Canvas canvas, int i2, @NotNull BlendMode blendMode) {
        canvas.drawColor(i2, blendMode);
    }

    @DoNotInline
    public final void c(@NotNull Canvas canvas, long j2) {
        canvas.drawColor(j2);
    }

    @DoNotInline
    public final void d(@NotNull Canvas canvas, long j2, @NotNull BlendMode blendMode) {
        canvas.drawColor(j2, blendMode);
    }

    @DoNotInline
    public final void e(@NotNull Canvas canvas, @NotNull RectF rectF, float f2, float f3, @NotNull RectF rectF2, float f4, float f5, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f2, f3, rectF2, f4, f5, paint);
    }

    @DoNotInline
    public final void f(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull float[] fArr, @NotNull RectF rectF2, @NotNull float[] fArr2, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @DoNotInline
    public final void g(@NotNull Canvas canvas, @NotNull RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    @DoNotInline
    public final void h(@NotNull Canvas canvas, @NotNull MeasuredText measuredText, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, @NotNull Paint paint) {
        canvas.drawTextRun(measuredText, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    @DoNotInline
    public final void i(@NotNull Canvas canvas) {
        canvas.enableZ();
    }
}
