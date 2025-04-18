package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PurchasePageState {
    public static final int $stable = 0;

    @NotNull
    private final String storeDescription;

    public PurchasePageState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurchasePageState copy$default(PurchasePageState purchasePageState, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = purchasePageState.storeDescription;
        }
        return purchasePageState.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.storeDescription;
    }

    @NotNull
    public final PurchasePageState copy(@NotNull String str) {
        a.s(str, "storeDescription");
        return new PurchasePageState(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchasePageState) && a.g(this.storeDescription, ((PurchasePageState) obj).storeDescription);
    }

    @NotNull
    public final String getStoreDescription() {
        return this.storeDescription;
    }

    public int hashCode() {
        return this.storeDescription.hashCode();
    }

    @NotNull
    public String toString() {
        return d.q(new StringBuilder("PurchasePageState(storeDescription="), this.storeDescription, ')');
    }

    public PurchasePageState(@NotNull String str) {
        a.s(str, "storeDescription");
        this.storeDescription = str;
    }

    public /* synthetic */ PurchasePageState(String str, int i2, k kVar) {
        this((i2 & 1) != 0 ? "" : str);
    }
}
