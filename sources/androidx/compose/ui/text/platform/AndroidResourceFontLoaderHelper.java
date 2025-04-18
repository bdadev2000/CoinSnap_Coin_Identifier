package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import d0.a;
import org.jetbrains.annotations.NotNull;

@a
@RequiresApi
/* loaded from: classes3.dex */
final class AndroidResourceFontLoaderHelper {
    @DoNotInline
    @RequiresApi
    @NotNull
    public final Typeface a(@NotNull Context context, int i2) {
        return context.getResources().getFont(i2);
    }
}
