package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes3.dex */
public final class i implements RewardItem {

    /* renamed from: b, reason: collision with root package name */
    public final int f11456b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11457c;

    public i(int i10, String str) {
        this.f11456b = i10;
        this.f11457c = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return this.f11456b;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        return this.f11457c;
    }
}
