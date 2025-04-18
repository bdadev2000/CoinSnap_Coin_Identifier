package com.cooldev.gba.emulator.gameboy.features.intro.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class BodyIntroKt {
    @ComposableTarget
    @Composable
    public static final void BodyIntro(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1682331374);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.f3774c;
            Modifier j2 = PaddingKt.j(SizeKt.f4107c, 0.0f, 21, 0.0f, 0.0f, 13);
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Top$1, horizontal, g2, 54);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, j2);
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
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            long j3 = Color.f14958c;
            long b2 = TextUnitKt.b(80);
            FontWeight fontWeight = FontWeight.f17264b;
            MyFonts myFonts = MyFonts.INSTANCE;
            TextKt.b("GAME BOY", null, j3, b2, null, fontWeight, myFonts.getDeterminationSans(), 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, g2, 1772934, 0, 130450);
            MyColors myColors = MyColors.INSTANCE;
            TextKt.b("EMULATOR", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Brush.Companion.a(f0.v(new Color(myColors.m13getText10d7_KjU()), new Color(myColors.m24getText20d7_KjU())), OffsetKt.a(0.0f, 0.0f), OffsetKt.a(0.0f, 120.0f), 8), TextUnitKt.b(50), fontWeight, myFonts.getDeterminationSans(), 3, TextUnitKt.b(48)), g2, 6, 0, 65534);
            TextKt.b("Come have fun!", null, myColors.m33getText30d7_KjU(), TextUnitKt.b(32), null, FontWeight.f17266f, myFonts.getNotoSans(), 0L, null, new TextAlign(3), TextUnitKt.b(48), 0, false, 0, 0, null, null, g2, 1772934, 6, 129426);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BodyIntroKt$BodyIntro$2(i2);
        }
    }
}
