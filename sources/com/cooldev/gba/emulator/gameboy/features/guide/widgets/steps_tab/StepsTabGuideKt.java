package com.cooldev.gba.emulator.gameboy.features.guide.widgets.steps_tab;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class StepsTabGuideKt {
    @ComposableTarget
    @Composable
    public static final void StepsTabGuide(@Nullable Composer composer, int i2) {
        Modifier c2;
        ComposerImpl g2 = composer.g(1265031089);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            FillElement fillElement = SizeKt.f4107c;
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, fillElement);
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
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar);
            }
            Updater.b(g2, c3, ComposeUiNode.Companion.d);
            c2 = ColumnScopeInstance.f3837a.c(1.0f, true);
            float f2 = 16;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, 0, f2, 50);
            g2.J(1300200181);
            Object u2 = g2.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = new StepsTabGuideKt$StepsTabGuide$1$1$1("Hey, gamers! If your games are compressed in ZIP or RAR files, go ahead and unzip them first. To keep things organized, set up separate folders for each system using the following names: nes, snes, md, gb, gbc, gba, n64, sms, psp, nds, gg, atari2600, psx, fbneo, mame2003plus, pce, lynx, atari7800, scd, ngp, ngc, ws, wsc, dos, and 3ds. This way, everything stays neat, and you can easily find your games whenever you’re ready to dive in!");
                g2.o(u2);
            }
            g2.V(false);
            LazyDslKt.a(c2, null, paddingValuesImpl, false, null, null, null, false, (l) u2, g2, 100663680, 250);
            BottomStartDownloadKt.BottomStartDownload(g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new StepsTabGuideKt$StepsTabGuide$2(i2);
        }
    }
}
