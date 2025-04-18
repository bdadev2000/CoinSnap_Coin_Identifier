package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* loaded from: classes4.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f25278a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25279b;

    private MaxRewardImpl(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f25278a = str;
        this.f25279b = i2;
    }

    public static MaxReward create(int i2, String str) {
        return new MaxRewardImpl(i2, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f25279b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f25278a;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxReward{amount=");
        sb.append(this.f25279b);
        sb.append(", label=");
        return android.support.v4.media.d.r(sb, this.f25278a, "}");
    }
}
