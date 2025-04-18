package com.google.ads.mediation.applovin;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes2.dex */
public final class AppLovinRewardItem implements RewardItem {
    public static final String KEY_AMOUNT = "amount";
    public static final String KEY_CURRENCY = "currency";
    private final int amount;
    private final String type;

    public AppLovinRewardItem(int i2, String str) {
        this.amount = i2;
        this.type = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.amount;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @NonNull
    public String getType() {
        return this.type;
    }
}
