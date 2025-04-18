package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class TypedArrayApi26ImplKt {
    @DoNotInline
    @NotNull
    public static final Typeface a(@NotNull TypedArray typedArray, @StyleableRes int i2) {
        Typeface font = typedArray.getFont(i2);
        p0.a.p(font);
        return font;
    }
}
