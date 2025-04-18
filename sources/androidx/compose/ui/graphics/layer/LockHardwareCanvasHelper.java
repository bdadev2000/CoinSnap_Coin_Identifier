package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes.dex */
final class LockHardwareCanvasHelper {
    @DoNotInline
    @NotNull
    public final Canvas a(@NotNull Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
