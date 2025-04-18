package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class TimePickerDefaults {
    public static TimePickerColors a(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        TimePickerColors timePickerColors = a2.f8548w0;
        if (timePickerColors != null) {
            return timePickerColors;
        }
        float f2 = TimePickerTokens.f13562a;
        TimePickerColors timePickerColors2 = new TimePickerColors(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13286v), ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13278n), ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13285u), ColorSchemeKt.e(a2, TimePickerTokens.f13567h), ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13270f), ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13273i), ColorSchemeKt.e(a2, TimePickerTokens.f13569j), Color.f14961h, ColorSchemeKt.e(a2, TimePickerTokens.f13570k), ColorSchemeKt.e(a2, TimePickerTokens.f13571l), ColorSchemeKt.e(a2, TimePickerTokens.f13578s), ColorSchemeKt.e(a2, TimePickerTokens.f13580u), ColorSchemeKt.e(a2, TimePickerTokens.f13579t), ColorSchemeKt.e(a2, TimePickerTokens.f13581v));
        a2.f8548w0 = timePickerColors2;
        return timePickerColors2;
    }
}
