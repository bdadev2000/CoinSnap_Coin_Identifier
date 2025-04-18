package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5990b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 >= 0) {
            this.a = str;
            this.f5990b = i10;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f5990b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.a;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxReward{amount=");
        sb2.append(this.f5990b);
        sb2.append(", label=");
        return vd.e.h(sb2, this.a, "}");
    }
}
