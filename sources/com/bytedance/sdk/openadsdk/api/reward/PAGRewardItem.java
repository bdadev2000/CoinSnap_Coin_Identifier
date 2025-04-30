package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes.dex */
public class PAGRewardItem {
    private final String lMd;
    private final int zp;

    public PAGRewardItem(int i9, String str) {
        this.zp = i9;
        this.lMd = str;
    }

    public int getRewardAmount() {
        return this.zp;
    }

    public String getRewardName() {
        return this.lMd;
    }
}
