package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class RewardInfo implements NoProGuard, Serializable {
    private boolean isCompleteView;
    private int rewardAlertStatus;
    private String rewardAmount;
    private String rewardName;

    public RewardInfo(boolean z8, int i9) {
        this.isCompleteView = z8;
        this.rewardAlertStatus = i9;
    }

    public int getRewardAlertStatus() {
        return this.rewardAlertStatus;
    }

    public String getRewardAmount() {
        return this.rewardAmount;
    }

    public String getRewardName() {
        return this.rewardName;
    }

    public boolean isCompleteView() {
        return this.isCompleteView;
    }

    public void setCompleteView(boolean z8) {
        this.isCompleteView = z8;
    }

    public void setRewardAlertStatus(int i9) {
        this.rewardAlertStatus = i9;
    }

    public void setRewardAmount(String str) {
        this.rewardAmount = str;
    }

    public void setRewardName(String str) {
        this.rewardName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardInfo{isCompleteView=");
        sb.append(this.isCompleteView);
        sb.append(", rewardName='");
        sb.append(this.rewardName);
        sb.append("', rewardAmount='");
        sb.append(this.rewardAmount);
        sb.append("', rewardAlertStatus=");
        return o.l(sb, this.rewardAlertStatus, '}');
    }

    public RewardInfo(boolean z8, String str, String str2) {
        this.isCompleteView = z8;
        this.rewardName = str;
        this.rewardAmount = str2;
    }

    public RewardInfo(boolean z8, String str, String str2, int i9) {
        this.isCompleteView = z8;
        this.rewardName = str;
        this.rewardAmount = str2;
        this.rewardAlertStatus = i9;
    }
}
