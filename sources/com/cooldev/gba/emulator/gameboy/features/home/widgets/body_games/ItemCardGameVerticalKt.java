package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
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
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.utils.GameUtils;
import d0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p0.a;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class ItemCardGameVerticalKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnrememberedMutableInteractionSource"})
    public static final void ItemCardGameVertical(@NotNull Game game, @Nullable Composer composer, int i2) {
        a.s(game, "data");
        ComposerImpl g2 = composer.g(-661956233);
        g2.t(414512006);
        Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
        g2.t(1274527078);
        g2.V(false);
        g2.t(511388516);
        boolean I = g2.I(null) | g2.I(currentKoinScope);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (I || u2 == composer$Companion$Empty$1) {
            u2 = t.g(HomeViewModel.class, currentKoinScope, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        HomeViewModel homeViewModel = (HomeViewModel) u2;
        Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
        String id = game.getId();
        g2.J(930747540);
        boolean I2 = g2.I(id);
        Object u3 = g2.u();
        if (I2 || u3 == composer$Companion$Empty$1) {
            u3 = GameUtils.INSTANCE.getGameSubtitle(context, game);
            g2.o(u3);
        }
        String str = (String) u3;
        g2.V(false);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier debouncedClickable$default = DebounceExtensionsKt.debouncedClickable$default(companion, false, 0L, new ItemCardGameVerticalKt$ItemCardGameVertical$1(homeViewModel, game), 3, null);
        MeasurePolicy e = BoxKt.e(Alignment.Companion.e, false);
        int i3 = g2.P;
        PersistentCompositionLocalMap Q = g2.Q();
        Modifier c2 = ComposedModifierKt.c(g2, debouncedClickable$default);
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
        Updater.b(g2, c2, pVar4);
        RowMeasurePolicy a2 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14667k, g2, 54);
        int i4 = g2.P;
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
        if (g2.O || !a.g(g2.u(), Integer.valueOf(i4))) {
            d.x(i4, g2, i4, pVar3);
        }
        Updater.b(g2, c3, pVar4);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
        PreviewImageCardKt.PreviewImageCard(game, Orientation.f3394a, g2, 56);
        float f2 = 8;
        float f3 = 0;
        Modifier i5 = PaddingKt.i(rowScopeInstance.a(companion, 1.0f, true), f2, f3, f2, f3);
        MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14659a, false);
        int i6 = g2.P;
        PersistentCompositionLocalMap Q3 = g2.Q();
        Modifier c4 = ComposedModifierKt.c(g2, i5);
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
        Updater.b(g2, c4, pVar4);
        ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
        int i7 = g2.P;
        PersistentCompositionLocalMap Q4 = g2.Q();
        Modifier c5 = ComposedModifierKt.c(g2, companion);
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
        Updater.b(g2, c5, pVar4);
        Title(game.getTitle(), g2, 0);
        SpacerKt.a(SizeKt.e(companion, 2), g2);
        SubTitle(str, g2, 0);
        g2.V(true);
        g2.V(true);
        MenuIconButton(game, g2, 8);
        g2.V(true);
        g2.V(true);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemCardGameVerticalKt$ItemCardGameVertical$3(game, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void MenuIconButton(Game game, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1504813944);
        Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (y2 || u2 == composer$Companion$Empty$1) {
            u2 = t.g(HomeViewModel.class, q2, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        HomeViewModel homeViewModel = (HomeViewModel) u2;
        g2.J(1057690729);
        Object u3 = g2.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = SnapshotStateKt.f(new Offset(0L), StructuralEqualityPolicy.f14078a);
            g2.o(u3);
        }
        MutableState mutableState = (MutableState) u3;
        g2.V(false);
        Painter a2 = PainterResources_androidKt.a(MyImages.INSTANCE.getIcMore(), g2, 6);
        ContentScale$Companion$FillBounds$1 contentScale$Companion$FillBounds$1 = ContentScale.Companion.f15724g;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        g2.J(1057698939);
        Object u4 = g2.u();
        if (u4 == composer$Companion$Empty$1) {
            u4 = new ItemCardGameVerticalKt$MenuIconButton$1$1(mutableState);
            g2.o(u4);
        }
        g2.V(false);
        float f2 = 24;
        ImageKt.a(a2, null, SizeKt.e(SizeKt.r(SuspendingPointerInputFilterKt.b(OnGloballyPositionedModifierKt.a(companion, (l) u4), b0.f30125a, new ItemCardGameVerticalKt$MenuIconButton$2(homeViewModel, game, mutableState, null)), f2), f2), null, contentScale$Companion$FillBounds$1, 0.0f, null, g2, 24632, 104);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemCardGameVerticalKt$MenuIconButton$3(game, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MenuIconButton$lambda$6(MutableState<Offset> mutableState) {
        return ((Offset) mutableState.getValue()).f14913a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MenuIconButton$lambda$7(MutableState<Offset> mutableState, long j2) {
        mutableState.setValue(new Offset(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void SubTitle(String str, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(1540380713);
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
            Z.d = new ItemCardGameVerticalKt$SubTitle$1(str, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void Title(String str, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-1701706779);
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
            Z.d = new ItemCardGameVerticalKt$Title$1(str, i2);
        }
    }
}
