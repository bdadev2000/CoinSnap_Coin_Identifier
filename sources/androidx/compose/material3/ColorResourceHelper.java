package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.ColorKt;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes3.dex */
final class ColorResourceHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final ColorResourceHelper f8505a = new Object();

    @DoNotInline
    public final long a(@NotNull Context context, @ColorRes int i2) {
        return ColorKt.b(context.getResources().getColor(i2, context.getTheme()));
    }
}
