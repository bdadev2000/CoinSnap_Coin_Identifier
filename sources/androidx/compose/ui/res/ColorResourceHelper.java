package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.ColorKt;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class ColorResourceHelper {
    @DoNotInline
    public final long a(@NotNull Context context, @ColorRes int i2) {
        return ColorKt.b(context.getResources().getColor(i2, context.getTheme()));
    }
}
