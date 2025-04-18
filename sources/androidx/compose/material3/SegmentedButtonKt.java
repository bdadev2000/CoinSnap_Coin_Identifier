package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import q0.p;

/* loaded from: classes.dex */
public final class SegmentedButtonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11096a = 8;

    public static final void a(p pVar, p pVar2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1464121570);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            BiasAlignment biasAlignment = Alignment.Companion.e;
            Modifier e = PaddingKt.e(Modifier.Companion.f14687a, ButtonDefaults.f8038b);
            MeasurePolicy e2 = BoxKt.e(biasAlignment, false);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, e);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            float f2 = OutlinedSegmentedButtonTokens.f13463a;
            TextKt.a(TypographyKt.a(TypographyKeyTokens.f13649j, g2), ComposableLambdaKt.c(1420592651, new SegmentedButtonKt$SegmentedButtonContent$1$1(pVar, pVar2), g2), g2, 48);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SegmentedButtonKt$SegmentedButtonContent$2(pVar, pVar2, i2);
        }
    }

    public static final MutableIntState b(MutableInteractionSource mutableInteractionSource, Composer composer) {
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = SnapshotIntStateKt.a(0);
            composer.o(u2);
        }
        MutableIntState mutableIntState = (MutableIntState) u2;
        boolean I = composer.I(mutableInteractionSource);
        Object u3 = composer.u();
        if (I || u3 == composer$Companion$Empty$1) {
            u3 = new SegmentedButtonKt$interactionCountAsState$1$1(mutableInteractionSource, mutableIntState, null);
            composer.o(u3);
        }
        EffectsKt.f(mutableInteractionSource, (p) u3, composer);
        return mutableIntState;
    }
}
