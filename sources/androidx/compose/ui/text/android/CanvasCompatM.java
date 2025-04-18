package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes.dex */
final class CanvasCompatM {

    /* renamed from: a, reason: collision with root package name */
    public static final CanvasCompatM f17065a = new Object();

    @DoNotInline
    public final void a(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, @NotNull Paint paint) {
        canvas.drawTextRun(charSequence, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    @DoNotInline
    public final void b(@NotNull Canvas canvas, @NotNull char[] cArr, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, @NotNull Paint paint) {
        canvas.drawTextRun(cArr, i2, i3, i4, i5, f2, f3, z2, paint);
    }
}
