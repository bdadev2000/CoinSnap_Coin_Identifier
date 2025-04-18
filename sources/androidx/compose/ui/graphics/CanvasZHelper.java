package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes.dex */
final class CanvasZHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final CanvasZHelper f14956a = new Object();

    @DoNotInline
    public final void a(@NotNull android.graphics.Canvas canvas, boolean z2) {
        if (z2) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
