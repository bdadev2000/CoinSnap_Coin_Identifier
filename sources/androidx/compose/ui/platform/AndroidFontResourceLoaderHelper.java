package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes3.dex */
final class AndroidFontResourceLoaderHelper {
    @DoNotInline
    @RequiresApi
    @NotNull
    public final Typeface a(@NotNull Context context, int i2) {
        return context.getResources().getFont(i2);
    }
}
