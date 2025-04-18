package com.cooldev.gba.emulator.gameboy.features.app.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AppState {
    public static final int $stable = 0;
    private final int appUpdateMode;
    private final int numberCodePaywall;
    private final boolean shouldShowPurchase;

    public AppState() {
        this(false, 0, 0, 7, null);
    }

    public static /* synthetic */ AppState copy$default(AppState appState, boolean z2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = appState.shouldShowPurchase;
        }
        if ((i4 & 2) != 0) {
            i2 = appState.appUpdateMode;
        }
        if ((i4 & 4) != 0) {
            i3 = appState.numberCodePaywall;
        }
        return appState.copy(z2, i2, i3);
    }

    public final boolean component1() {
        return this.shouldShowPurchase;
    }

    public final int component2() {
        return this.appUpdateMode;
    }

    public final int component3() {
        return this.numberCodePaywall;
    }

    @NotNull
    public final AppState copy(boolean z2, int i2, int i3) {
        return new AppState(z2, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppState)) {
            return false;
        }
        AppState appState = (AppState) obj;
        return this.shouldShowPurchase == appState.shouldShowPurchase && this.appUpdateMode == appState.appUpdateMode && this.numberCodePaywall == appState.numberCodePaywall;
    }

    public final int getAppUpdateMode() {
        return this.appUpdateMode;
    }

    public final int getNumberCodePaywall() {
        return this.numberCodePaywall;
    }

    public final boolean getShouldShowPurchase() {
        return this.shouldShowPurchase;
    }

    public int hashCode() {
        return Integer.hashCode(this.numberCodePaywall) + d.c(this.appUpdateMode, Boolean.hashCode(this.shouldShowPurchase) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AppState(shouldShowPurchase=");
        sb.append(this.shouldShowPurchase);
        sb.append(", appUpdateMode=");
        sb.append(this.appUpdateMode);
        sb.append(", numberCodePaywall=");
        return d.o(sb, this.numberCodePaywall, ')');
    }

    public AppState(boolean z2, int i2, int i3) {
        this.shouldShowPurchase = z2;
        this.appUpdateMode = i2;
        this.numberCodePaywall = i3;
    }

    public /* synthetic */ AppState(boolean z2, int i2, int i3, int i4, k kVar) {
        this((i4 & 1) != 0 ? true : z2, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
