package com.cooldev.gba.emulator.gameboy.features.guide.widgets.steps_tab;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameDownloadStep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class ItemStepKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void BoxNumber(int i2, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(316509173);
        if ((i3 & 14) == 0) {
            i4 = (g2.c(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Modifier a2 = ClipKt.a(SizeKt.n(PaddingKt.f(Modifier.Companion.f14687a, 1), 24), RoundedCornerShapeKt.f5392a);
            MyColors myColors = MyColors.INSTANCE;
            Modifier a3 = BackgroundKt.a(a2, myColors.m36getText60d7_KjU(), RectangleShapeKt.f15014a);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.e, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a3);
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
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            TextKt.b(String.valueOf(i2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m25getText200d7_KjU(), TextUnitKt.b(20), new FontWeight(400), MyFonts.INSTANCE.getDeterminationSans(), 0L, null, 3, TextUnitKt.b(24), 16613336), g2, 0, 0, 65534);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemStepKt$BoxNumber$2(i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void Description(String str, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-831154349);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            composerImpl = g2;
            long b2 = TextUnitKt.b(14);
            long b3 = TextUnitKt.b(20);
            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), b2, new FontWeight(400), MyFonts.INSTANCE.getInter(), 0L, null, 0, b3, 16646104), composerImpl, i3 & 14, 0, 65534);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new ItemStepKt$Description$1(str, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ImageBanner(int i2, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-1806971160);
        if ((i3 & 14) == 0) {
            i4 = (g2.c(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            ImageKt.a(PainterResources_androidKt.a(i2, g2, i4 & 14), null, SizeKt.d(Modifier.Companion.f14687a, 1.0f), null, ContentScale.Companion.d, 0.0f, null, g2, 25016, 104);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemStepKt$ImageBanner$1(i2, i3);
        }
    }

    @ComposableTarget
    @Composable
    public static final void ItemStep(@NotNull GameDownloadStep gameDownloadStep, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(gameDownloadStep, "data");
        ComposerImpl g2 = composer.g(1894463369);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(gameDownloadStep) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14669m;
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.f3774c;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = 8;
            Modifier h2 = PaddingKt.h(companion, 0.0f, f2, 1);
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Top$1, horizontal, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
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
            Updater.b(g2, a2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            RowMeasurePolicy a3 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14667k, g2, 48);
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
            Updater.b(g2, a3, pVar);
            Updater.b(g2, Q2, pVar2);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            BoxNumber(gameDownloadStep.ordinal() + 1, g2, 0);
            SpacerKt.a(SizeKt.r(companion, 12), g2);
            Title(gameDownloadStep.getTitle(), g2, 0);
            g2.V(true);
            SpacerKt.a(SizeKt.e(companion, f2), g2);
            ImageBanner(gameDownloadStep.getImage(), g2, 0);
            SpacerKt.a(SizeKt.e(companion, f2), g2);
            Description(gameDownloadStep.getDescription(), g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemStepKt$ItemStep$2(gameDownloadStep, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void Title(String str, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(1300174327);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            composerImpl = g2;
            TextKt.b(str, null, MyColors.INSTANCE.m36getText60d7_KjU(), 0L, null, new FontWeight(400), null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, TextUnitKt.b(20), null, MyFonts.INSTANCE.getDeterminationSans(), 0L, null, 0, TextUnitKt.b(24), 16646109), composerImpl, (i3 & 14) | 196992, 0, 65498);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new ItemStepKt$Title$1(str, i2);
        }
    }
}
