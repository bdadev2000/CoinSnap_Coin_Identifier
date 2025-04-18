package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class InterstitialAdState {
    public static final int $stable = 8;
    private boolean isInterstitialAdShowing;
    private boolean loadingInterstitialAd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InterstitialAdState() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdState.<init>():void");
    }

    public static /* synthetic */ InterstitialAdState copy$default(InterstitialAdState interstitialAdState, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = interstitialAdState.isInterstitialAdShowing;
        }
        if ((i2 & 2) != 0) {
            z3 = interstitialAdState.loadingInterstitialAd;
        }
        return interstitialAdState.copy(z2, z3);
    }

    public final boolean component1() {
        return this.isInterstitialAdShowing;
    }

    public final boolean component2() {
        return this.loadingInterstitialAd;
    }

    @NotNull
    public final InterstitialAdState copy(boolean z2, boolean z3) {
        return new InterstitialAdState(z2, z3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterstitialAdState)) {
            return false;
        }
        InterstitialAdState interstitialAdState = (InterstitialAdState) obj;
        return this.isInterstitialAdShowing == interstitialAdState.isInterstitialAdShowing && this.loadingInterstitialAd == interstitialAdState.loadingInterstitialAd;
    }

    public final boolean getLoadingInterstitialAd() {
        return this.loadingInterstitialAd;
    }

    public int hashCode() {
        return Boolean.hashCode(this.loadingInterstitialAd) + (Boolean.hashCode(this.isInterstitialAdShowing) * 31);
    }

    public final boolean isInterstitialAdShowing() {
        return this.isInterstitialAdShowing;
    }

    public final void setInterstitialAdShowing(boolean z2) {
        this.isInterstitialAdShowing = z2;
    }

    public final void setLoadingInterstitialAd(boolean z2) {
        this.loadingInterstitialAd = z2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InterstitialAdState(isInterstitialAdShowing=");
        sb.append(this.isInterstitialAdShowing);
        sb.append(", loadingInterstitialAd=");
        return d.s(sb, this.loadingInterstitialAd, ')');
    }

    public InterstitialAdState(boolean z2, boolean z3) {
        this.isInterstitialAdShowing = z2;
        this.loadingInterstitialAd = z3;
    }

    public /* synthetic */ InterstitialAdState(boolean z2, boolean z3, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3);
    }
}
