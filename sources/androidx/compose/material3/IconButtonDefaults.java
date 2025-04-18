package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred
/* loaded from: classes3.dex */
public final class IconButtonDefaults {
    public static BorderStroke a(boolean z2, Composer composer) {
        long b2;
        if (z2) {
            composer.J(1186104514);
            b2 = ((Color) composer.K(ContentColorKt.f8654a)).f14964a;
            composer.D();
        } else {
            composer.J(1186170420);
            b2 = Color.b(((Color) composer.K(ContentColorKt.f8654a)).f14964a, 0.12f);
            composer.D();
        }
        boolean d = composer.d(b2);
        Object u2 = composer.u();
        if (d || u2 == Composer.Companion.f13690a) {
            u2 = BorderStrokeKt.a(b2, OutlinedIconButtonTokens.f13462b);
            composer.o(u2);
        }
        return (BorderStroke) u2;
    }
}
