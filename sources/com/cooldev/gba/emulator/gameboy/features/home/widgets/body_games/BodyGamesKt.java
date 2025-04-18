package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes.dex */
public final class BodyGamesKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnrememberedMutableInteractionSource", "UnusedBoxWithConstraintsScope"})
    public static final void BodyGames(@NotNull Modifier modifier, @NotNull FocusManager focusManager, @Nullable SoftwareKeyboardController softwareKeyboardController, @Nullable Composer composer, int i2) {
        a.s(modifier, "modifier");
        a.s(focusManager, "focusManager");
        ComposerImpl g2 = composer.g(698447915);
        g2.t(414512006);
        Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
        g2.t(1274527078);
        g2.V(false);
        g2.t(511388516);
        boolean I = g2.I(null) | g2.I(currentKoinScope);
        Object u2 = g2.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = t.g(HomeViewModel.class, currentKoinScope, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        HomeViewModel homeViewModel = (HomeViewModel) u2;
        BoxWithConstraintsKt.a(SuspendingPointerInputFilterKt.b(modifier, b0.f30125a, new BodyGamesKt$BodyGames$1(homeViewModel, null)), null, false, ComposableLambdaKt.c(1621858817, new BodyGamesKt$BodyGames$2((HomeState) SnapshotStateKt.b(homeViewModel.getState(), g2, 8).getValue(), focusManager, softwareKeyboardController, homeViewModel), g2), g2, 3072, 6);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BodyGamesKt$BodyGames$3(modifier, focusManager, softwareKeyboardController, i2);
        }
    }
}
