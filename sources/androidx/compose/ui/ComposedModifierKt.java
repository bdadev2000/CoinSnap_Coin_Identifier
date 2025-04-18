package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import q0.q;

/* loaded from: classes2.dex */
public final class ComposedModifierKt {
    public static final Modifier a(Modifier modifier, q qVar) {
        return modifier.T0(new ComposedModifier(qVar));
    }

    public static final Modifier b(Composer composer, Modifier modifier) {
        if (modifier.D(ComposedModifierKt$materializeImpl$1.f14683a)) {
            return modifier;
        }
        composer.t(1219399079);
        Modifier modifier2 = (Modifier) modifier.G(Modifier.Companion.f14687a, new ComposedModifierKt$materializeImpl$result$1(composer));
        composer.H();
        return modifier2;
    }

    public static final Modifier c(Composer composer, Modifier modifier) {
        composer.J(439770924);
        Modifier b2 = b(composer, modifier);
        composer.D();
        return b2;
    }
}
