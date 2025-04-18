package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_scan;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.BiasAlignment;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;

/* loaded from: classes4.dex */
public final class BodyScanGamesKt {
    @ComposableTarget
    @Composable
    public static final void BodyScanGames(@NotNull Modifier modifier, @Nullable Composer composer, int i2) {
        int i3;
        a.s(modifier, "modifier");
        ComposerImpl g2 = composer.g(27624172);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            MeasurePolicy e = BoxKt.e(Alignment.Companion.e, false);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, modifier);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, e, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, horizontal, g2, 54);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, companion);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a2, pVar);
            Updater.b(g2, Q2, pVar2);
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getScan(), g2, 6), null, PaddingKt.h(SizeKt.e(SizeKt.d(companion, 1.0f), 124), 35, 0.0f, 2), null, ContentScale.Companion.d, 0.0f, null, g2, 25016, 104);
            SpacerKt.a(SizeKt.e(companion, 45), g2);
            ButtonScanGamesKt.ButtonScanGames(g2, 0);
            SpacerKt.a(SizeKt.e(companion, 19), g2);
            TextKt.b("Or", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m36getText60d7_KjU(), TextUnitKt.b(14), new FontWeight(400), MyFonts.INSTANCE.getInter(), 0L, null, 3, TextUnitKt.b(20), 16613336), g2, 6, 0, 65534);
            SpacerKt.a(SizeKt.e(companion, 9), g2);
            DownloadGameKt.DownloadGame(g2, 0);
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BodyScanGamesKt$BodyScanGames$2(modifier, i2);
        }
    }
}
