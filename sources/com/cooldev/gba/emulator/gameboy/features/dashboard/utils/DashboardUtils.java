package com.cooldev.gba.emulator.gameboy.features.dashboard.utils;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class DashboardUtils {
    public static final int $stable = 0;

    @NotNull
    public static final DashboardUtils INSTANCE = new DashboardUtils();

    private DashboardUtils() {
    }

    private static final NavBackStackEntry shouldShowBottomBar$lambda$0(State<NavBackStackEntry> state) {
        return (NavBackStackEntry) state.getValue();
    }

    @Composable
    public final boolean shouldShowBottomBar(@Nullable Composer composer, int i2) {
        composer.J(784444584);
        NavBackStackEntry shouldShowBottomBar$lambda$0 = shouldShowBottomBar$lambda$0(SnapshotStateKt.a(MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().getGetNavController().E, null, null, composer, 48, 2));
        boolean shouldShowBottomBar = shouldShowBottomBar(shouldShowBottomBar$lambda$0 != null ? shouldShowBottomBar$lambda$0.f20328b : null);
        composer.D();
        return shouldShowBottomBar;
    }

    private final boolean shouldShowBottomBar(NavDestination navDestination) {
        String str = navDestination != null ? navDestination.f20437i : null;
        if (a.g(str, RouterName.HOME)) {
            return true;
        }
        return a.g(str, RouterName.THEME);
    }
}
