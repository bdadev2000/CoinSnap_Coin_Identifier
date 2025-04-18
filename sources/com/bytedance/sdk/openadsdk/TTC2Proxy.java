package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.DSW;
import com.bytedance.sdk.openadsdk.component.DSW.YFl;

/* loaded from: classes.dex */
public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void a(Context context) {
        YFl.YFl(context);
    }

    public static void load(Context context, AdSlot adSlot, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener, int i10) {
        adSlot.setDurationSlotType(3);
        DSW.YFl(context).YFl(adSlot, pAGAppOpenAdLoadListener, i10);
    }
}
