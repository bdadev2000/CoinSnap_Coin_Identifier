package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_empty;

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
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1;
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

/* loaded from: classes.dex */
public final class BodyEmptyGameKt {
    @ComposableTarget
    @Composable
    public static final void BodyEmptyGames(@NotNull Modifier modifier, @Nullable Composer composer, int i2) {
        int i3;
        a.s(modifier, "modifier");
        ComposerImpl g2 = composer.g(-996884191);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            float f2 = 79;
            Modifier j2 = PaddingKt.j(modifier.T0(SizeKt.f4107c), 0.0f, f2, 0.0f, 0.0f, 13);
            BiasAlignment biasAlignment = Alignment.Companion.e;
            MeasurePolicy e = BoxKt.e(biasAlignment, false);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, j2);
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
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            Painter a2 = PainterResources_androidKt.a(MyImages.INSTANCE.getEmptyPage(), g2, 6);
            ContentScale$Companion$FillWidth$1 contentScale$Companion$FillWidth$1 = ContentScale.Companion.d;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            ImageKt.a(a2, null, boxScopeInstance.a(SizeKt.e(SizeKt.d(companion, 1.0f), 477), Alignment.Companion.f14660b), null, contentScale$Companion$FillWidth$1, 0.0f, null, g2, 24632, 104);
            TextKt.b("There no game match with your search\nPlease try again", PaddingKt.j(boxScopeInstance.a(companion, biasAlignment), 0.0f, f2, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), TextUnitKt.b(16), new FontWeight(com.safedk.android.internal.d.f29936c), MyFonts.INSTANCE.getInter(), 0L, null, 3, TextUnitKt.b(28), 16613336), g2, 6, 0, 65532);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BodyEmptyGameKt$BodyEmptyGames$2(modifier, i2);
        }
    }
}
