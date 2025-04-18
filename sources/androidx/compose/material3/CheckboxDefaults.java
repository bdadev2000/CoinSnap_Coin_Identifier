package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred
/* loaded from: classes4.dex */
public final class CheckboxDefaults {
    public static CheckboxColors a(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        CheckboxColors checkboxColors = a2.f8512d0;
        if (checkboxColors != null) {
            return checkboxColors;
        }
        long e = ColorSchemeKt.e(a2, CheckboxTokens.f13221c);
        long j2 = Color.f14961h;
        ColorSchemeKeyTokens colorSchemeKeyTokens = CheckboxTokens.f13219a;
        long e2 = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = CheckboxTokens.f13220b;
        CheckboxColors checkboxColors2 = new CheckboxColors(e, j2, e2, j2, Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens2), 0.38f), j2, Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens2), 0.38f), ColorSchemeKt.e(a2, colorSchemeKeyTokens), ColorSchemeKt.e(a2, CheckboxTokens.f13222f), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens2), 0.38f), Color.b(ColorSchemeKt.e(a2, CheckboxTokens.e), 0.38f), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens2), 0.38f));
        a2.f8512d0 = checkboxColors2;
        return checkboxColors2;
    }
}
