package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes.dex */
public class PAGRewardItem {
    private final String Sg;
    private final int YFl;

    public PAGRewardItem(int i10, String str) {
        this.YFl = i10;
        this.Sg = str;
    }

    public int getRewardAmount() {
        return this.YFl;
    }

    public String getRewardName() {
        return this.Sg;
    }
}
