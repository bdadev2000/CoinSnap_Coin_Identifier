package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f8947a;
    private final int b;

    private MaxRewardImpl(int i9, String str) {
        if (i9 >= 0) {
            this.f8947a = str;
            this.b = i9;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i9, String str) {
        return new MaxRewardImpl(i9, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f8947a;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxReward{amount=");
        sb.append(this.b);
        sb.append(", label=");
        return AbstractC2914a.h(sb, this.f8947a, "}");
    }
}
