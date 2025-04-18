package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes2.dex */
public final class RatingDialogState {
    public static final int $stable = 0;
    private final int rating;

    public RatingDialogState() {
        this(0, 1, null);
    }

    public static /* synthetic */ RatingDialogState copy$default(RatingDialogState ratingDialogState, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = ratingDialogState.rating;
        }
        return ratingDialogState.copy(i2);
    }

    public final int component1() {
        return this.rating;
    }

    @NotNull
    public final RatingDialogState copy(int i2) {
        return new RatingDialogState(i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingDialogState) && this.rating == ((RatingDialogState) obj).rating;
    }

    public final int getRating() {
        return this.rating;
    }

    public int hashCode() {
        return Integer.hashCode(this.rating);
    }

    @NotNull
    public String toString() {
        return d.o(new StringBuilder("RatingDialogState(rating="), this.rating, ')');
    }

    public RatingDialogState(int i2) {
        this.rating = i2;
    }

    public /* synthetic */ RatingDialogState(int i2, int i3, k kVar) {
        this((i3 & 1) != 0 ? 5 : i2);
    }
}
