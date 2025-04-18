package androidx.compose.ui.text.font;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes3.dex */
public final class TypefaceHelperMethodsApi28 {

    /* renamed from: a, reason: collision with root package name */
    public static final TypefaceHelperMethodsApi28 f17285a = new Object();

    @DoNotInline
    @RequiresApi
    @NotNull
    public final android.graphics.Typeface a(@NotNull android.graphics.Typeface typeface, int i2, boolean z2) {
        android.graphics.Typeface create;
        create = android.graphics.Typeface.create(typeface, i2, z2);
        return create;
    }
}
