package com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AppOpenAdState {
    public static final int $stable = 8;
    private boolean isAppOpenAdShowing;

    public AppOpenAdState() {
        this(false, 1, null);
    }

    public static /* synthetic */ AppOpenAdState copy$default(AppOpenAdState appOpenAdState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = appOpenAdState.isAppOpenAdShowing;
        }
        return appOpenAdState.copy(z2);
    }

    public final boolean component1() {
        return this.isAppOpenAdShowing;
    }

    @NotNull
    public final AppOpenAdState copy(boolean z2) {
        return new AppOpenAdState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppOpenAdState) && this.isAppOpenAdShowing == ((AppOpenAdState) obj).isAppOpenAdShowing;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAppOpenAdShowing);
    }

    public final boolean isAppOpenAdShowing() {
        return this.isAppOpenAdShowing;
    }

    public final void setAppOpenAdShowing(boolean z2) {
        this.isAppOpenAdShowing = z2;
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("AppOpenAdState(isAppOpenAdShowing="), this.isAppOpenAdShowing, ')');
    }

    public AppOpenAdState(boolean z2) {
        this.isAppOpenAdShowing = z2;
    }

    public /* synthetic */ AppOpenAdState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
