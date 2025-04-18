package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import q0.p;

/* loaded from: classes4.dex */
public final class SpacerKt {
    public static final void a(Modifier modifier, Composer composer) {
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f4118a;
        int E = composer.E();
        Modifier c2 = ComposedModifierKt.c(composer, modifier);
        PersistentCompositionLocalMap m2 = composer.m();
        ComposeUiNode.h8.getClass();
        q0.a aVar = ComposeUiNode.Companion.f15895b;
        if (!(composer.j() instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        composer.z();
        if (composer.e()) {
            composer.B(aVar);
        } else {
            composer.n();
        }
        Updater.b(composer, spacerMeasurePolicy, ComposeUiNode.Companion.f15898g);
        Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
        Updater.b(composer, c2, ComposeUiNode.Companion.d);
        p pVar = ComposeUiNode.Companion.f15900i;
        if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
            d.w(E, composer, E, pVar);
        }
        composer.p();
    }
}
