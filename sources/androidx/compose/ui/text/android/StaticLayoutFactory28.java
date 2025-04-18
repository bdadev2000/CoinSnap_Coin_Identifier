package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class StaticLayoutFactory28 {
    @DoNotInline
    public static final void a(@NotNull StaticLayout.Builder builder, boolean z2) {
        builder.setUseLineSpacingFromFallbacks(z2);
    }
}
