package com.cooldev.gba.emulator.gameboy.features.view_all.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.utils.GameUtils;
import com.cooldev.gba.emulator.gameboy.features.home.utils.TextDrawable;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import d0.b0;
import g.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q.h;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class ItemCardGameGridViewKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnrememberedMutableInteractionSource"})
    public static final void ItemCardGameGridView(@NotNull Game game, @NotNull ViewAllViewModel viewAllViewModel, @Nullable Composer composer, int i2) {
        Modifier c2;
        a.s(game, "data");
        a.s(viewAllViewModel, "viewAllViewModel");
        ComposerImpl g2 = composer.g(-283734713);
        Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
        String id = game.getId();
        g2.J(1694957341);
        boolean I = g2.I(id);
        Object u2 = g2.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = GameUtils.INSTANCE.getGameSubtitle(context, game);
            g2.o(u2);
        }
        String str = (String) u2;
        g2.V(false);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        float f2 = 8;
        Modifier debouncedClickable$default = DebounceExtensionsKt.debouncedClickable$default(BackgroundKt.a(ClipKt.a(SizeKt.e(SizeKt.r(companion, 156), 250), RoundedCornerShapeKt.b(f2)), MyColors.INSTANCE.m37getText70d7_KjU(), RectangleShapeKt.f15014a), false, 0L, new ItemCardGameGridViewKt$ItemCardGameGridView$1(viewAllViewModel, game), 3, null);
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14660b, false);
        int i3 = g2.P;
        PersistentCompositionLocalMap Q = g2.Q();
        Modifier c3 = ComposedModifierKt.c(g2, debouncedClickable$default);
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
        if (g2.O || !a.g(g2.u(), Integer.valueOf(i3))) {
            d.x(i3, g2, i3, pVar3);
        }
        p pVar4 = ComposeUiNode.Companion.d;
        Updater.b(g2, c3, pVar4);
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14669m;
        Arrangement$Top$1 arrangement$Top$1 = Arrangement.f3774c;
        ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Top$1, horizontal, g2, 54);
        int i4 = g2.P;
        PersistentCompositionLocalMap Q2 = g2.Q();
        Modifier c4 = ComposedModifierKt.c(g2, companion);
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
        if (g2.O || !a.g(g2.u(), Integer.valueOf(i4))) {
            d.x(i4, g2, i4, pVar3);
        }
        Updater.b(g2, c4, pVar4);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3837a;
        PreviewImage(game, g2, 8);
        c2 = ColumnScopeInstance.f3837a.c(1.0f, true);
        Modifier i5 = PaddingKt.i(c2, f2, f2, f2, 4);
        MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14659a, false);
        int i6 = g2.P;
        PersistentCompositionLocalMap Q3 = g2.Q();
        Modifier c5 = ComposedModifierKt.c(g2, i5);
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
        Updater.b(g2, e2, pVar);
        Updater.b(g2, Q3, pVar2);
        if (g2.O || !a.g(g2.u(), Integer.valueOf(i6))) {
            d.x(i6, g2, i6, pVar3);
        }
        Updater.b(g2, c5, pVar4);
        ColumnMeasurePolicy a3 = ColumnKt.a(arrangement$Top$1, horizontal, g2, 0);
        int i7 = g2.P;
        PersistentCompositionLocalMap Q4 = g2.Q();
        Modifier c6 = ComposedModifierKt.c(g2, companion);
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
        Updater.b(g2, Q4, pVar2);
        if (g2.O || !a.g(g2.u(), Integer.valueOf(i7))) {
            d.x(i7, g2, i7, pVar3);
        }
        Updater.b(g2, c6, pVar4);
        Title(game.getTitle(), g2, 0);
        SpacerKt.a(SizeKt.e(companion, 2), g2);
        SubTitle(str, g2, 0);
        MenuIconButton(columnScopeInstance.a(companion, Alignment.Companion.f14671o), game, viewAllViewModel, g2, 576);
        g2.V(true);
        g2.V(true);
        g2.V(true);
        g2.V(true);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemCardGameGridViewKt$ItemCardGameGridView$3(game, viewAllViewModel, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void MenuIconButton(Modifier modifier, Game game, ViewAllViewModel viewAllViewModel, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1244340430);
        g2.J(224800349);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = SnapshotStateKt.f(new Offset(0L), StructuralEqualityPolicy.f14078a);
            g2.o(u2);
        }
        MutableState mutableState = (MutableState) u2;
        g2.V(false);
        Painter a2 = PainterResources_androidKt.a(MyImages.INSTANCE.getIcMore(), g2, 6);
        ContentScale$Companion$FillBounds$1 contentScale$Companion$FillBounds$1 = ContentScale.Companion.f15724g;
        float f2 = 24;
        Modifier e = SizeKt.e(SizeKt.r(modifier, f2), f2);
        g2.J(224810255);
        Object u3 = g2.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = new ItemCardGameGridViewKt$MenuIconButton$1$1(mutableState);
            g2.o(u3);
        }
        g2.V(false);
        ImageKt.a(a2, null, SuspendingPointerInputFilterKt.b(OnGloballyPositionedModifierKt.a(e, (l) u3), b0.f30125a, new ItemCardGameGridViewKt$MenuIconButton$2(viewAllViewModel, game, mutableState, null)), null, contentScale$Companion$FillBounds$1, 0.0f, null, g2, 24632, 104);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemCardGameGridViewKt$MenuIconButton$3(modifier, game, viewAllViewModel, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MenuIconButton$lambda$7(MutableState<Offset> mutableState) {
        return ((Offset) mutableState.getValue()).f14913a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MenuIconButton$lambda$8(MutableState<Offset> mutableState, long j2) {
        mutableState.setValue(new Offset(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void PreviewImage(Game game, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(112881366);
        g2.J(-876711320);
        boolean I = g2.I(game);
        Object u2 = g2.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = GameUtils.INSTANCE.getFallbackDrawable(game);
            g2.o(u2);
        }
        g2.V(false);
        Painter rememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter((TextDrawable) u2, g2, 8);
        h hVar = new h((Context) g2.K(AndroidCompositionLocals_androidKt.f16325b));
        hVar.f31271c = game.getCoverFrontUrl();
        float f2 = 8;
        g0.a(hVar.a(), game.getTitle(), ClipKt.a(SizeKt.e(SizeKt.d(Modifier.Companion.f14687a, 1.0f), 156), RoundedCornerShapeKt.c(f2, f2)), null, rememberDrawablePainter, rememberDrawablePainter, g2, 294920, 64456);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemCardGameGridViewKt$PreviewImage$1(game, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void SubTitle(String str, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(124227548);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            long b2 = TextUnitKt.b(10);
            long b3 = TextUnitKt.b(14);
            composerImpl = g2;
            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, new TextAlign(5), 0L, 2, false, 1, 0, null, new TextStyle(MyColors.INSTANCE.m21getText170d7_KjU(), b2, new FontWeight(400), MyFonts.INSTANCE.getInter(), 0L, null, 0, b3, 16646104), composerImpl, i3 & 14, 3120, 54782);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new ItemCardGameGridViewKt$SubTitle$1(str, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void Title(String str, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(1672830880);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            long b2 = TextUnitKt.b(14);
            long b3 = TextUnitKt.b(20);
            composerImpl = g2;
            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, new TextAlign(5), 0L, 2, false, 2, 0, null, new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), b2, new FontWeight(com.safedk.android.internal.d.f29936c), MyFonts.INSTANCE.getInter(), 0L, null, 0, b3, 16646104), composerImpl, i3 & 14, 3120, 54782);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new ItemCardGameGridViewKt$Title$1(str, i2);
        }
    }
}
