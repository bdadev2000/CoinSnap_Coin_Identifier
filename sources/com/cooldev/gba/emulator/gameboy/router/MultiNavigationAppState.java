package com.cooldev.gba.emulator.gameboy.router;

import android.annotation.SuppressLint;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilderKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Iterator;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import y0.j;
import z0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class MultiNavigationAppState {
    public static final int $stable = 8;
    private final long debounceDelay;

    @NotNull
    private NavHostController getNavController;

    @NotNull
    private String getStartDestination;
    private long lastNavigationTime;

    @NotNull
    private NavHostController navController;

    public MultiNavigationAppState(@NotNull NavHostController navHostController, @Nullable String str) {
        a.s(navHostController, "navController");
        this.navController = navHostController;
        this.debounceDelay = 200L;
        a.p(str);
        this.getStartDestination = str;
        this.getNavController = this.navController;
    }

    private final void executeWithDebounce(q0.a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastNavigationTime >= this.debounceDelay) {
            this.lastNavigationTime = currentTimeMillis;
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCurrentRoute() {
        NavDestination navDestination;
        String str;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) getGetNavController().f20349g.j();
        return (navBackStackEntry == null || (navDestination = navBackStackEntry.f20328b) == null || (str = navDestination.f20437i) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTargetRoute() {
        NavDestination navDestination;
        String str;
        NavBackStackEntry i2 = getGetNavController().i();
        return (i2 == null || (navDestination = i2.f20328b) == null || (str = navDestination.f20437i) == null) ? "" : str;
    }

    @NotNull
    public final NavHostController getGetNavController() {
        return this.navController;
    }

    @NotNull
    public final String getGetStartDestination() {
        return this.getStartDestination;
    }

    @Composable
    public final boolean isRouteActive(@NotNull String str, @Nullable Composer composer, int i2) {
        a.s(str, "route");
        composer.J(1459649957);
        j destination = MultiNavigationAppStateKt.getDestination(this.navController, composer, 8);
        boolean z2 = false;
        if (destination != null) {
            Iterator it = destination.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (m.S0(((NavDestination) it.next()).f20437i, str, false)) {
                    z2 = true;
                    break;
                }
            }
        }
        composer.D();
        return z2;
    }

    public final void navigateAndClearStack(@NotNull String str) {
        a.s(str, "route");
        if (a.g(getCurrentRoute(), str)) {
            return;
        }
        NavHostController getNavController = getGetNavController();
        MultiNavigationAppState$navigateAndClearStack$1 multiNavigationAppState$navigateAndClearStack$1 = new MultiNavigationAppState$navigateAndClearStack$1(this);
        getNavController.getClass();
        NavController.m(getNavController, str, NavOptionsBuilderKt.a(multiNavigationAppState$navigateAndClearStack$1), 4);
    }

    public final void navigateTo(@NotNull String str) {
        a.s(str, "route");
        if (a.g(getCurrentRoute(), str)) {
            return;
        }
        NavController.m(getGetNavController(), str, null, 6);
    }

    public final void navigateWithStateRestore(@NotNull String str) {
        a.s(str, "route");
        NavHostController getNavController = getGetNavController();
        MultiNavigationAppState$navigateWithStateRestore$1 multiNavigationAppState$navigateWithStateRestore$1 = new MultiNavigationAppState$navigateWithStateRestore$1(this);
        getNavController.getClass();
        NavController.m(getNavController, str, NavOptionsBuilderKt.a(multiNavigationAppState$navigateWithStateRestore$1), 4);
    }

    public final void pop() {
        executeWithDebounce(new MultiNavigationAppState$pop$1(this));
    }

    public final void popWithData(@NotNull String str, @Nullable Object obj) {
        a.s(str, SDKConstants.PARAM_KEY);
        executeWithDebounce(new MultiNavigationAppState$popWithData$1(this, str, obj));
    }

    @SuppressLint({"RestrictedApi"})
    public final void printBackStack() {
        System.out.println((Object) "--------------------");
        Iterator it = ((Iterable) this.navController.f20351i.f30313a.getValue()).iterator();
        while (it.hasNext()) {
            System.out.println((Object) (" screen : " + ((NavBackStackEntry) it.next()).f20328b.f20437i));
        }
        System.out.println((Object) "--------------------");
    }

    public final void setNavController(@NotNull NavHostController navHostController) {
        a.s(navHostController, "newNavController");
        this.navController = navHostController;
    }

    public final void setStartDestination(@NotNull String str) {
        a.s(str, "route");
        this.getStartDestination = str;
    }

    public /* synthetic */ MultiNavigationAppState(NavHostController navHostController, String str, int i2, k kVar) {
        this(navHostController, (i2 & 2) != 0 ? null : str);
    }
}
