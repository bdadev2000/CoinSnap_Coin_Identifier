package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public final class h implements RewardItem {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13860c;

    public h(int i9, String str) {
        this.b = i9;
        this.f13860c = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        return this.f13860c;
    }
}
