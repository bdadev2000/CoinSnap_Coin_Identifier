package com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameROMWebsite;
import com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class SiteTabGuideKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void HeaderTitle(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-57682704);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            MyColors myColors = MyColors.INSTANCE;
            int e = builder.e(new SpanStyle(myColors.m23getText190d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                builder.c("*Disclaimer:");
                builder.d(e);
                builder.c("The websites listed below are user-recommended. We are not affiliated with their content and do not take responsibility for any issues or copyright concerns that may arise from downloads. Please proceed at your own discretion.");
                AnnotatedString f2 = builder.f();
                long b2 = TextUnitKt.b(12);
                long b3 = TextUnitKt.b(16);
                FontFamily inter = MyFonts.INSTANCE.getInter();
                TextKt.c(f2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(myColors.m29getText250d7_KjU(), b2, new FontWeight(400), inter, 0L, null, 5, b3, 16613336), g2, 0, 0, 131070);
            } catch (Throwable th) {
                builder.d(e);
                throw th;
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SiteTabGuideKt$HeaderTitle$1(i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void SiteTabGuide(@Nullable Composer composer, int i2) {
        Modifier c2;
        ComposerImpl g2 = composer.g(998858511);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            float f2 = 16;
            float m229calculateGridHeightghNngFA = UtilsKt.m229calculateGridHeightghNngFA(GameROMWebsite.getEntries().size(), Opcodes.INVOKESTATIC, f2, 2);
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
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, 0, f2, 50);
            g2.J(-585698397);
            boolean b2 = g2.b(m229calculateGridHeightghNngFA);
            Object u2 = g2.u();
            if (b2 || u2 == Composer.Companion.f13690a) {
                u2 = new SiteTabGuideKt$SiteTabGuide$1$1$1(m229calculateGridHeightghNngFA);
                g2.o(u2);
            }
            g2.V(false);
            LazyDslKt.a(c2, null, paddingValuesImpl, false, null, null, null, false, (l) u2, g2, 384, 250);
            BottomWarningKt.BottomWarning(g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SiteTabGuideKt$SiteTabGuide$2(i2);
        }
    }
}
