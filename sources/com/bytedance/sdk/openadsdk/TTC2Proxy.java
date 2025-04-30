package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.QR;
import com.bytedance.sdk.openadsdk.component.QR.zp;

/* loaded from: classes.dex */
public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void a(Context context) {
        zp.zp(context);
    }

    public static void load(Context context, AdSlot adSlot, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener, int i9) {
        adSlot.setDurationSlotType(3);
        QR.zp(context).zp(adSlot, pAGAppOpenAdLoadListener, i9);
    }
}
