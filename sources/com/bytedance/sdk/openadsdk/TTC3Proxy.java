package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.DSW;
import com.bytedance.sdk.openadsdk.component.reward.YoT;
import com.bytedance.sdk.openadsdk.component.reward.nc;
import com.bytedance.sdk.openadsdk.component.reward.wN;
import com.bytedance.sdk.openadsdk.component.tN.Sg;

/* loaded from: classes.dex */
public class TTC3Proxy {
    public static void a(Context context) {
        try {
            YoT.YFl(context).YFl();
        } catch (Throwable unused) {
        }
        try {
            wN.YFl(context).YFl();
        } catch (Throwable unused2) {
        }
    }

    public static void loadFull(Context context, AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        adSlot.setDurationSlotType(8);
        wN.YFl(context).YFl(adSlot, new Sg(pAGInterstitialAdLoadListener));
    }

    public static void loadReward(Context context, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        adSlot.setDurationSlotType(7);
        YoT.YFl(context).YFl(adSlot, new DSW(pAGRewardedAdLoadListener));
    }

    public static void verityPlayable(String str, int i10, String str2, String str3, String str4) {
        nc.YFl(str, i10, str2, str3, str4);
    }
}
