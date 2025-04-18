package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class SurfaceVerificationHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final SurfaceVerificationHelper f15254a = new Object();

    @DoNotInline
    @NotNull
    public final Canvas a(@NotNull Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
