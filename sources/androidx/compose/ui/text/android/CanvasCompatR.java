package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes.dex */
final class CanvasCompatR {

    /* renamed from: a, reason: collision with root package name */
    public static final CanvasCompatR f17068a = new Object();

    @DoNotInline
    public final boolean a(@NotNull Canvas canvas, float f2, float f3, float f4, float f5) {
        boolean quickReject;
        quickReject = canvas.quickReject(f2, f3, f4, f5);
        return quickReject;
    }

    @DoNotInline
    public final boolean b(@NotNull Canvas canvas, @NotNull Path path) {
        boolean quickReject;
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    @DoNotInline
    public final boolean c(@NotNull Canvas canvas, @NotNull RectF rectF) {
        boolean quickReject;
        quickReject = canvas.quickReject(rectF);
        return quickReject;
    }
}
