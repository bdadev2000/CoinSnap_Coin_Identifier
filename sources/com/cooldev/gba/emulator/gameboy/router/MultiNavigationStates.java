package com.cooldev.gba.emulator.gameboy.router;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class MultiNavigationStates {
    public static final int $stable = 8;

    @NotNull
    private MultiNavigationAppState dashboardNavigation;

    @NotNull
    private MultiNavigationAppState rootNavigation;

    public MultiNavigationStates(@NotNull MultiNavigationAppState multiNavigationAppState, @NotNull MultiNavigationAppState multiNavigationAppState2) {
        a.s(multiNavigationAppState, "rootNavigation");
        a.s(multiNavigationAppState2, "dashboardNavigation");
        this.rootNavigation = multiNavigationAppState;
        this.dashboardNavigation = multiNavigationAppState2;
    }

    public static /* synthetic */ MultiNavigationStates copy$default(MultiNavigationStates multiNavigationStates, MultiNavigationAppState multiNavigationAppState, MultiNavigationAppState multiNavigationAppState2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            multiNavigationAppState = multiNavigationStates.rootNavigation;
        }
        if ((i2 & 2) != 0) {
            multiNavigationAppState2 = multiNavigationStates.dashboardNavigation;
        }
        return multiNavigationStates.copy(multiNavigationAppState, multiNavigationAppState2);
    }

    @NotNull
    public final MultiNavigationAppState component1() {
        return this.rootNavigation;
    }

    @NotNull
    public final MultiNavigationAppState component2() {
        return this.dashboardNavigation;
    }

    @NotNull
    public final MultiNavigationStates copy(@NotNull MultiNavigationAppState multiNavigationAppState, @NotNull MultiNavigationAppState multiNavigationAppState2) {
        a.s(multiNavigationAppState, "rootNavigation");
        a.s(multiNavigationAppState2, "dashboardNavigation");
        return new MultiNavigationStates(multiNavigationAppState, multiNavigationAppState2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiNavigationStates)) {
            return false;
        }
        MultiNavigationStates multiNavigationStates = (MultiNavigationStates) obj;
        return a.g(this.rootNavigation, multiNavigationStates.rootNavigation) && a.g(this.dashboardNavigation, multiNavigationStates.dashboardNavigation);
    }

    @NotNull
    public final MultiNavigationAppState getDashboardNavigation() {
        return this.dashboardNavigation;
    }

    @NotNull
    public final MultiNavigationAppState getRootNavigation() {
        return this.rootNavigation;
    }

    public int hashCode() {
        return this.dashboardNavigation.hashCode() + (this.rootNavigation.hashCode() * 31);
    }

    public final void setDashboardNavigation(@NotNull MultiNavigationAppState multiNavigationAppState) {
        a.s(multiNavigationAppState, "<set-?>");
        this.dashboardNavigation = multiNavigationAppState;
    }

    public final void setRootNavigation(@NotNull MultiNavigationAppState multiNavigationAppState) {
        a.s(multiNavigationAppState, "<set-?>");
        this.rootNavigation = multiNavigationAppState;
    }

    @NotNull
    public String toString() {
        return "MultiNavigationStates(rootNavigation=" + this.rootNavigation + ", dashboardNavigation=" + this.dashboardNavigation + ')';
    }
}
