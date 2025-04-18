package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class Paint29 {
    @DoNotInline
    public static final void a(@NotNull Paint paint, @NotNull CharSequence charSequence, int i2, int i3, @NotNull Rect rect) {
        paint.getTextBounds(charSequence, i2, i3, rect);
    }
}
