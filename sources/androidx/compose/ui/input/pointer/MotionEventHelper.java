package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.OffsetKt;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class MotionEventHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final MotionEventHelper f15561a = new Object();

    @DoNotInline
    public final long a(@NotNull MotionEvent motionEvent, int i2) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i2);
        rawY = motionEvent.getRawY(i2);
        return OffsetKt.a(rawX, rawY);
    }
}
