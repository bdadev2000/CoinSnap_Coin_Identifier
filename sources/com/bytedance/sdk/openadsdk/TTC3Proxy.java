package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.KS.lMd;
import com.bytedance.sdk.openadsdk.component.reward.COT;
import com.bytedance.sdk.openadsdk.component.reward.QR;
import com.bytedance.sdk.openadsdk.component.reward.dT;
import com.bytedance.sdk.openadsdk.component.reward.vDp;

/* loaded from: classes.dex */
public class TTC3Proxy {
    public static void a(Context context) {
        try {
            vDp.zp(context).zp();
        } catch (Throwable unused) {
        }
        try {
            COT.zp(context).zp();
        } catch (Throwable unused2) {
        }
    }

    public static void loadFull(Context context, AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        adSlot.setDurationSlotType(8);
        COT.zp(context).zp(adSlot, new lMd(pAGInterstitialAdLoadListener));
    }

    public static void loadReward(Context context, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        adSlot.setDurationSlotType(7);
        vDp.zp(context).zp(adSlot, new QR(pAGRewardedAdLoadListener));
    }

    public static void verityPlayable(String str, int i9, String str2, String str3, String str4) {
        dT.zp(str, i9, str2, str3, str4);
    }
}
