package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
final class ColorMatrixFilterHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final ColorMatrixFilterHelper f14967a = new Object();

    @DoNotInline
    @NotNull
    public final float[] a(@NotNull android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return colorMatrix.getArray();
    }
}
