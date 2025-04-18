package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import okio.Utf8;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class HeaderPaywallYearlyNonTrialKt {
    @ComposableTarget
    @Composable
    public static final void HeaderPaywallYearlyNonTrial(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1945712881);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            g2.J(961202436);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotIntStateKt.a(30);
                g2.o(u2);
            }
            MutableIntState mutableIntState = (MutableIntState) u2;
            g2.V(false);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            int e = builder.e(new SpanStyle(0L, TextUnitKt.b(39), null, null, null, null, null, 0L, null, null, null, 0L, null, null, Utf8.REPLACEMENT_CODE_POINT));
            try {
                builder.c("PRO MEMBER");
                builder.d(e);
                builder.c("\nEnjoy legendary games");
                AnnotatedString f2 = builder.f();
                Modifier.Companion companion = Modifier.Companion.f14687a;
                Modifier e2 = SizeKt.e(SizeKt.d(companion, 1.0f), 247);
                MeasurePolicy e3 = BoxKt.e(Alignment.Companion.f14664h, false);
                int i3 = g2.P;
                PersistentCompositionLocalMap Q = g2.Q();
                Modifier c2 = ComposedModifierKt.c(g2, e2);
                ComposeUiNode.h8.getClass();
                a aVar = ComposeUiNode.Companion.f15895b;
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
                Updater.b(g2, e3, ComposeUiNode.Companion.f15898g);
                Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
                p pVar = ComposeUiNode.Companion.f15900i;
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                    d.x(i3, g2, i3, pVar);
                }
                Updater.b(g2, c2, ComposeUiNode.Companion.d);
                ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getPaywall2(), g2, 6), null, BoxScopeInstance.f3816a.a(companion, Alignment.Companion.f14660b), null, ContentScale.Companion.e, 0.0f, null, g2, 24632, 104);
                long b2 = TextUnitKt.b(mutableIntState.g());
                long b3 = TextUnitKt.b(40);
                TextStyle textStyle = new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), b2, new FontWeight(400), MyFonts.INSTANCE.getDeterminationSans(), 0L, null, 3, b3, 16613336);
                Modifier h2 = PaddingKt.h(companion, 17, 0.0f, 2);
                g2.J(1108534709);
                Object u3 = g2.u();
                if (u3 == composer$Companion$Empty$1) {
                    u3 = new HeaderPaywallYearlyNonTrialKt$HeaderPaywallYearlyNonTrial$1$1$1(20, mutableIntState);
                    g2.o(u3);
                }
                g2.V(false);
                TextKt.c(f2, h2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, (l) u3, textStyle, g2, 48, 1575936, 57340);
                g2.V(true);
            } catch (Throwable th) {
                builder.d(e);
                throw th;
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new HeaderPaywallYearlyNonTrialKt$HeaderPaywallYearlyNonTrial$2(i2);
        }
    }
}
