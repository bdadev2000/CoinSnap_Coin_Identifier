package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.AdView;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class BannerAdGameState {
    public static final int $stable = 8;

    @Nullable
    private final AdView adView;
    private final boolean bannerVisible;
    private final boolean isLoadingAd;

    public BannerAdGameState() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ BannerAdGameState copy$default(BannerAdGameState bannerAdGameState, boolean z2, AdView adView, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = bannerAdGameState.bannerVisible;
        }
        if ((i2 & 2) != 0) {
            adView = bannerAdGameState.adView;
        }
        if ((i2 & 4) != 0) {
            z3 = bannerAdGameState.isLoadingAd;
        }
        return bannerAdGameState.copy(z2, adView, z3);
    }

    public final boolean component1() {
        return this.bannerVisible;
    }

    @Nullable
    public final AdView component2() {
        return this.adView;
    }

    public final boolean component3() {
        return this.isLoadingAd;
    }

    @NotNull
    public final BannerAdGameState copy(boolean z2, @Nullable AdView adView, boolean z3) {
        return new BannerAdGameState(z2, adView, z3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdGameState)) {
            return false;
        }
        BannerAdGameState bannerAdGameState = (BannerAdGameState) obj;
        return this.bannerVisible == bannerAdGameState.bannerVisible && a.g(this.adView, bannerAdGameState.adView) && this.isLoadingAd == bannerAdGameState.isLoadingAd;
    }

    @Nullable
    public final AdView getAdView() {
        return this.adView;
    }

    public final boolean getBannerVisible() {
        return this.bannerVisible;
    }

    public final boolean getShouldShowBannerAd() {
        return this.bannerVisible && this.adView != null;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.bannerVisible) * 31;
        AdView adView = this.adView;
        return Boolean.hashCode(this.isLoadingAd) + ((hashCode + (adView == null ? 0 : adView.hashCode())) * 31);
    }

    public final boolean isLoadingAd() {
        return this.isLoadingAd;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BannerAdGameState(bannerVisible=");
        sb.append(this.bannerVisible);
        sb.append(", adView=");
        sb.append(this.adView);
        sb.append(", isLoadingAd=");
        return d.s(sb, this.isLoadingAd, ')');
    }

    public BannerAdGameState(boolean z2, @Nullable AdView adView, boolean z3) {
        this.bannerVisible = z2;
        this.adView = adView;
        this.isLoadingAd = z3;
    }

    public /* synthetic */ BannerAdGameState(boolean z2, AdView adView, boolean z3, int i2, k kVar) {
        this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? null : adView, (i2 & 4) != 0 ? false : z3);
    }
}
