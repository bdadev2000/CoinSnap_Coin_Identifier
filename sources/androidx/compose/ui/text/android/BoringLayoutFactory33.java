package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.activity.e;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes4.dex */
public final class BoringLayoutFactory33 {
    @DoNotInline
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i2, @NotNull Layout.Alignment alignment, float f2, float f3, @NotNull BoringLayout.Metrics metrics, boolean z2, boolean z3, @Nullable TextUtils.TruncateAt truncateAt, int i3) {
        return e.g(charSequence, textPaint, i2, alignment, f2, f3, metrics, z2, truncateAt, i3, z3);
    }

    @DoNotInline
    @Nullable
    public static final BoringLayout.Metrics b(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        BoringLayout.Metrics isBoring;
        isBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
        return isBoring;
    }

    @DoNotInline
    public static final boolean c(@NotNull BoringLayout boringLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
