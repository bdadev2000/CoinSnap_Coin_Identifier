package com.cooldev.gba.emulator.gameboy.features.paywalls.utils;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SubscriptionPeriod {
    public static final int $stable = 0;
    private final int days;
    private final int months;
    private final int weeks;
    private final int years;

    public SubscriptionPeriod(int i2, int i3, int i4, int i5) {
        this.years = i2;
        this.months = i3;
        this.weeks = i4;
        this.days = i5;
    }

    public static /* synthetic */ SubscriptionPeriod copy$default(SubscriptionPeriod subscriptionPeriod, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = subscriptionPeriod.years;
        }
        if ((i6 & 2) != 0) {
            i3 = subscriptionPeriod.months;
        }
        if ((i6 & 4) != 0) {
            i4 = subscriptionPeriod.weeks;
        }
        if ((i6 & 8) != 0) {
            i5 = subscriptionPeriod.days;
        }
        return subscriptionPeriod.copy(i2, i3, i4, i5);
    }

    public final int component1() {
        return this.years;
    }

    public final int component2() {
        return this.months;
    }

    public final int component3() {
        return this.weeks;
    }

    public final int component4() {
        return this.days;
    }

    @NotNull
    public final SubscriptionPeriod copy(int i2, int i3, int i4, int i5) {
        return new SubscriptionPeriod(i2, i3, i4, i5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPeriod)) {
            return false;
        }
        SubscriptionPeriod subscriptionPeriod = (SubscriptionPeriod) obj;
        return this.years == subscriptionPeriod.years && this.months == subscriptionPeriod.months && this.weeks == subscriptionPeriod.weeks && this.days == subscriptionPeriod.days;
    }

    public final int getDays() {
        return this.days;
    }

    public final int getMonths() {
        return this.months;
    }

    public final int getWeeks() {
        return this.weeks;
    }

    public final int getYears() {
        return this.years;
    }

    public int hashCode() {
        return Integer.hashCode(this.days) + d.c(this.weeks, d.c(this.months, Integer.hashCode(this.years) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionPeriod(years=");
        sb.append(this.years);
        sb.append(", months=");
        sb.append(this.months);
        sb.append(", weeks=");
        sb.append(this.weeks);
        sb.append(", days=");
        return d.o(sb, this.days, ')');
    }
}
