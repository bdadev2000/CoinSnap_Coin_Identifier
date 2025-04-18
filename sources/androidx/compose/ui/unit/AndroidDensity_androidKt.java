package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* loaded from: classes4.dex */
public final class AndroidDensity_androidKt {
    public static final Density a(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter a2 = FontScaleConverterFactory.a(f2);
        if (a2 == null) {
            a2 = new LinearFontScaleConverter(f2);
        }
        return new DensityWithConverter(f3, f2, a2);
    }
}
