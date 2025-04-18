package androidx.compose.ui.platform;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class AndroidViewConfigurationApi34 {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidViewConfigurationApi34 f16395a = new Object();

    @DoNotInline
    public final float a(@NotNull android.view.ViewConfiguration viewConfiguration) {
        int scaledHandwritingGestureLineMargin;
        scaledHandwritingGestureLineMargin = viewConfiguration.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    @DoNotInline
    public final float b(@NotNull android.view.ViewConfiguration viewConfiguration) {
        int scaledHandwritingSlop;
        scaledHandwritingSlop = viewConfiguration.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }
}
