package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes4.dex */
public final class FontWeightAdjustmentHelperApi31 {

    /* renamed from: a, reason: collision with root package name */
    public static final FontWeightAdjustmentHelperApi31 f17275a = new Object();

    @DoNotInline
    @RequiresApi
    public final int a(@NotNull Context context) {
        int i2;
        i2 = context.getResources().getConfiguration().fontWeightAdjustment;
        return i2;
    }
}
