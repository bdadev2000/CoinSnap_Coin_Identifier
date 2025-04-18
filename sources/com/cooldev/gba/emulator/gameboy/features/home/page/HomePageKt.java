package com.cooldev.gba.emulator.gameboy.features.home.page;

import android.annotation.SuppressLint;
import android.support.v4.media.d;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import b1.d0;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.effects.SetSystemBarsColorKt;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.dialogs.remove_game_dialog.RemoveGameDialogKt;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class HomePageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter", "NoCollectCallFound"})
    public static final void HomePage(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1164422099);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            SetSystemBarsColorKt.m41SetSystemBarsColorek8zF_U(Color.f14961h, g2, 6);
            FocusManager focusManager = (FocusManager) g2.K(CompositionLocalsKt.f16435g);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) g2.K(CompositionLocalsKt.f16442n);
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
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(UserGuideViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            UserGuideViewModel userGuideViewModel = (UserGuideViewModel) u3;
            MutableState b2 = SnapshotStateKt.b(userGuideViewModel.getGuideState(), g2, 8);
            HomeState homeState = (HomeState) SnapshotStateKt.b(homeViewModel.getState(), g2, 8).getValue();
            Density density = (Density) g2.K(CompositionLocalsKt.f16434f);
            g2.J(813851526);
            Object u4 = g2.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = SnapshotStateKt.f(new Dp(0), StructuralEqualityPolicy.f14078a);
                g2.o(u4);
            }
            MutableState mutableState = (MutableState) u4;
            g2.V(false);
            Object u5 = g2.u();
            if (u5 == composer$Companion$Empty$1) {
                u5 = d.h(EffectsKt.g(g2), g2);
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u5).f13774a;
            BackHandlerKt.a(false, HomePageKt$HomePage$1.INSTANCE, g2, 48, 1);
            PredictiveBackHandlerKt.a(false, new HomePageKt$HomePage$2(null), g2, 70, 0);
            LogEventScreen(g2, 0);
            b0 b0Var = b0.f30125a;
            EffectsKt.f(b0Var, new HomePageKt$HomePage$3(homeViewModel, null), g2);
            EffectsKt.f(homeState.getRecentGames(), new HomePageKt$HomePage$4(homeState, null), g2);
            RemoveGameDialogKt.RemoveGameDialog(homeState.isDialogRemoveGameVisible(), new HomePageKt$HomePage$5(homeViewModel), new HomePageKt$HomePage$6(homeViewModel), g2, 0);
            ScaffoldKt.a(SuspendingPointerInputFilterKt.b(Modifier.Companion.f14687a, b0Var, new HomePageKt$HomePage$7(focusManager, softwareKeyboardController, null)), null, null, null, null, 0, MyColors.INSTANCE.m25getText200d7_KjU(), 0L, null, ComposableLambdaKt.c(-1629916510, new HomePageKt$HomePage$8(density, userGuideViewModel, b2, homeViewModel, homeState, mutableState, focusManager, softwareKeyboardController, d0Var), g2), g2, 806879232, 446);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new HomePageKt$HomePage$9(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float HomePage$lambda$1(MutableState<Dp> mutableState) {
        return ((Dp) mutableState.getValue()).f17486a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomePage$lambda$2(MutableState<Dp> mutableState, float f2) {
        mutableState.setValue(new Dp(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void LogEventScreen(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(679028255);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            EffectsKt.f(b0.f30125a, new HomePageKt$LogEventScreen$1(null), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new HomePageKt$LogEventScreen$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void PopupOfferReward1(Modifier modifier, a aVar, a aVar2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1720356838);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.w(aVar2) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 731) == 146 && g2.i()) {
            g2.A();
        } else {
            EffectsKt.f(b0.f30125a, new HomePageKt$PopupOfferReward1$1(null), g2);
            Modifier e = SizeKt.e(SizeKt.r(modifier, 153), Opcodes.FCMPG);
            BiasAlignment biasAlignment = Alignment.Companion.f14659a;
            MeasurePolicy e2 = BoxKt.e(biasAlignment, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, e);
            ComposeUiNode.h8.getClass();
            a aVar3 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar3);
            } else {
                g2.n();
            }
            Updater.b(g2, e2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            MyImages myImages = MyImages.INSTANCE;
            Painter a2 = PainterResources_androidKt.a(myImages.getRewardHome(), g2, 6);
            ContentScale$Companion$FillBounds$1 contentScale$Companion$FillBounds$1 = ContentScale.Companion.f15724g;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            FillElement fillElement = SizeKt.f4107c;
            g2.J(1677504245);
            boolean z2 = (i4 & 896) == 256;
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (z2 || u2 == composer$Companion$Empty$1) {
                u2 = new HomePageKt$PopupOfferReward1$2$1$1(aVar2);
                g2.o(u2);
            }
            g2.V(false);
            ImageKt.a(a2, null, ClickableKt.c(fillElement, false, null, (a) u2, 7), null, contentScale$Companion$FillBounds$1, 0.0f, null, g2, 24632, 104);
            Painter a3 = PainterResources_androidKt.a(myImages.getIcClose(), g2, 6);
            Modifier a4 = boxScopeInstance.a(SizeKt.n(PaddingKt.j(companion, 21, 4, 0.0f, 0.0f, 12), 11), biasAlignment);
            g2.J(1677514807);
            boolean z3 = (i4 & 112) == 32;
            Object u3 = g2.u();
            if (z3 || u3 == composer$Companion$Empty$1) {
                u3 = new HomePageKt$PopupOfferReward1$2$2$1(aVar);
                g2.o(u3);
            }
            g2.V(false);
            ImageKt.a(a3, null, ClickableKt.c(a4, false, null, (a) u3, 7), null, null, 0.0f, null, g2, 56, 120);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new HomePageKt$PopupOfferReward1$3(modifier, aVar, aVar2, i2);
        }
    }
}
