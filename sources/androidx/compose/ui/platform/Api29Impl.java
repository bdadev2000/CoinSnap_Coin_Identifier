package androidx.compose.ui.platform;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes.dex */
public final class Api29Impl {
    @DoNotInline
    public final int a(@NotNull android.view.accessibility.AccessibilityManager accessibilityManager, int i2, int i3) {
        return accessibilityManager.getRecommendedTimeoutMillis(i2, i3);
    }
}
