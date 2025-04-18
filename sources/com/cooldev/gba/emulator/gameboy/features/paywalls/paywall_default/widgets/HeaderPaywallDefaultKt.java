package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class HeaderPaywallDefaultKt {
    @ComposableTarget
    @Composable
    public static final void HeaderPaywallDefault(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-523783755);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier e = SizeKt.e(SizeKt.d(companion, 1.0f), 240);
            MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14664h, false);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, e);
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
            Updater.b(g2, e2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getPurchase(), g2, 6), null, BoxScopeInstance.f3816a.a(companion, Alignment.Companion.f14660b), null, ContentScale.Companion.f15724g, 0.0f, null, g2, 24632, 104);
            long b2 = TextUnitKt.b(48);
            long b3 = TextUnitKt.b(48);
            TextKt.b("Play Game\nWith Pro", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), b2, new FontWeight(400), MyFonts.INSTANCE.getDeterminationSans(), 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new HeaderPaywallDefaultKt$HeaderPaywallDefault$2(i2);
        }
    }
}
