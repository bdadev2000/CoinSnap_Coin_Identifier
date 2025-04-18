package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class StaticLayoutFactory26 {
    @DoNotInline
    public static final void a(@NotNull StaticLayout.Builder builder, int i2) {
        builder.setJustificationMode(i2);
    }
}
