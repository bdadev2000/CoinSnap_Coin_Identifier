package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class MotionEventVerifierApi29 {

    /* renamed from: a, reason: collision with root package name */
    public static final MotionEventVerifierApi29 f16532a = new Object();

    @DoNotInline
    public final boolean a(@NotNull MotionEvent motionEvent, int i2) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i2);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            rawY = motionEvent.getRawY(i2);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
