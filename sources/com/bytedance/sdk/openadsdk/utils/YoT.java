package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.nc;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class YoT implements com.bytedance.sdk.openadsdk.oem.YFl {
    private static com.bytedance.sdk.openadsdk.component.reward.YFl.YFl Sg;
    private static final YoT YFl = new YoT();
    private static boolean tN;

    public static void Sg() {
        tN = true;
    }

    public static void YFl(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        com.bytedance.sdk.openadsdk.core.model.wXo AXS = yFl.Sg.AXS();
        if (AXS == null || !AXS.YFl()) {
            return;
        }
        Sg = yFl;
        IPMiBroadcastReceiver YFl2 = IPMiBroadcastReceiver.YFl(yFl.BPI);
        if (YFl2 != null) {
            YFl2.YFl(YFl);
        }
    }

    public static void YFl() {
        if (Sg == null) {
            return;
        }
        Sg = null;
        IPMiBroadcastReceiver YFl2 = IPMiBroadcastReceiver.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl());
        if (YFl2 != null) {
            YFl2.YFl();
        }
        tN = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.YFl
    public void YFl(String str, final int i10) {
        com.bytedance.sdk.openadsdk.core.model.tN in;
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = Sg;
        if (yFl == null || (in = yFl.Sg.in()) == null) {
            return;
        }
        String tN2 = in.tN();
        if (TextUtils.isEmpty(tN2) || !tN2.equals(str)) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.YoT.1
            @Override // java.lang.Runnable
            public void run() {
                int i11;
                boolean z10;
                if (YoT.Sg != null && (i11 = i10) > 0 && i11 <= 5) {
                    boolean z11 = true;
                    if (i11 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (YoT.tN) {
                        YoT.Sg.ZU.AlY();
                        HashMap hashMap = new HashMap();
                        hashMap.put("click_scence", 4);
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(CampaignEx.JSON_NATIVE_VIDEO_CLICK, YoT.Sg.Sg, new nc.YFl().YFl(), YoT.Sg.wN, true, (Map<String, Object>) hashMap, 1);
                    } else {
                        z11 = z10;
                    }
                    if (z11) {
                        YoT.YFl();
                    }
                }
            }
        });
    }
}
