package com.cooldev.gba.emulator.gameboy.router;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import y0.j;

/* loaded from: classes4.dex */
public final class MultiNavigationAppStateKt {
    public static MultiNavigationStates LocalNavigationState;

    @Composable
    @Nullable
    public static final j getDestination(@NotNull NavHostController navHostController, @Nullable Composer composer, int i2) {
        a.s(navHostController, "<this>");
        composer.J(-1453566822);
        NavBackStackEntry destination$lambda$1 = getDestination$lambda$1(SnapshotStateKt.a(navHostController.E, null, null, composer, 48, 2));
        j jVar = null;
        NavDestination navDestination = destination$lambda$1 != null ? destination$lambda$1.f20328b : null;
        if (navDestination != null) {
            int i3 = NavDestination.f20430k;
            jVar = NavDestination.Companion.c(navDestination);
        }
        composer.D();
        return jVar;
    }

    private static final NavBackStackEntry getDestination$lambda$1(State<NavBackStackEntry> state) {
        return (NavBackStackEntry) state.getValue();
    }

    @NotNull
    public static final MultiNavigationStates getLocalNavigationState() {
        MultiNavigationStates multiNavigationStates = LocalNavigationState;
        if (multiNavigationStates != null) {
            return multiNavigationStates;
        }
        a.B0("LocalNavigationState");
        throw null;
    }

    @Composable
    @NotNull
    public static final MultiNavigationAppState rememberMultiNavigationAppState(@NotNull String str, @Nullable NavHostController navHostController, @Nullable Composer composer, int i2, int i3) {
        a.s(str, "startDestination");
        composer.J(1654089137);
        if ((i3 & 2) != 0) {
            navHostController = NavHostControllerKt.b(new Navigator[0], composer);
        }
        composer.J(-455710773);
        boolean I = composer.I(navHostController) | ((((i2 & 14) ^ 6) > 4 && composer.I(str)) || (i2 & 6) == 4);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new MultiNavigationAppState(navHostController, str);
            composer.o(u2);
        }
        MultiNavigationAppState multiNavigationAppState = (MultiNavigationAppState) u2;
        composer.D();
        composer.D();
        return multiNavigationAppState;
    }

    public static final void setLocalNavigationState(@NotNull MultiNavigationStates multiNavigationStates) {
        a.s(multiNavigationStates, "<set-?>");
        LocalNavigationState = multiNavigationStates;
    }
}
