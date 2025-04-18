package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes3.dex */
final class Api28Impl {
    @DoNotInline
    @NotNull
    public final TypefaceSpan a(@NotNull Typeface typeface) {
        return new TypefaceSpan(typeface);
    }
}
