package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.widgets.search.SearchKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes2.dex */
public final class SearchGamesKt {
    @ComposableTarget
    @Composable
    public static final void SearchGames(@NotNull Modifier modifier, @NotNull FocusManager focusManager, @Nullable SoftwareKeyboardController softwareKeyboardController, @Nullable Composer composer, int i2) {
        a.s(modifier, "modifier");
        a.s(focusManager, "focusManager");
        ComposerImpl g2 = composer.g(1058206891);
        g2.t(414512006);
        Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
        g2.t(1274527078);
        g2.V(false);
        g2.t(511388516);
        boolean I = g2.I(null) | g2.I(currentKoinScope);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (I || u2 == composer$Companion$Empty$1) {
            u2 = t.g(UserGuideViewModel.class, currentKoinScope, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        UserGuideViewModel userGuideViewModel = (UserGuideViewModel) u2;
        Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
        Object u3 = g2.u();
        if (y2 || u3 == composer$Companion$Empty$1) {
            u3 = t.g(HomeViewModel.class, q2, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        HomeViewModel homeViewModel = (HomeViewModel) u3;
        HomeState homeState = (HomeState) SnapshotStateKt.b(homeViewModel.getState(), g2, 8).getValue();
        g2.J(-1090391521);
        Object u4 = g2.u();
        if (u4 == composer$Companion$Empty$1) {
            u4 = new FocusRequester();
            g2.o(u4);
        }
        g2.V(false);
        SearchKt.m408Search4VtiKLc(SizeKt.d(modifier, 1.0f), (FocusRequester) u4, homeState.getSearchText(), new SearchGamesKt$SearchGames$1(focusManager, softwareKeyboardController), new SearchGamesKt$SearchGames$2(homeViewModel), null, false, "Search", !userGuideViewModel.getDataRemote(), 0L, 0, g2, 12582960, 0, 1632);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SearchGamesKt$SearchGames$3(modifier, focusManager, softwareKeyboardController, i2);
        }
    }
}
