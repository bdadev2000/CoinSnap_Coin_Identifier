package com.bytedance.sdk.openadsdk.YFl;

import android.text.TextUtils;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.settings.YoT;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes.dex */
public class YFl {
    public static boolean YFl(PAGLoadListener pAGLoadListener) {
        if (YoT.YFl()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    public static void YFl(final qsH qsh, final PAGLoadListener pAGLoadListener, AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                if (!pDU.wN()) {
                    com.bytedance.sdk.component.utils.YoT.YFl("AdLoadBaseManager", "please exec TTAdSdk.init before load ad");
                    PAGLoadListener pAGLoadListener2 = PAGLoadListener.this;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                mn.AlY(qsh);
            }
        };
        if (pDU.wN()) {
            runnable.run();
        } else {
            pDU.Sg().post(runnable);
        }
    }

    public static void YFl(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!pDU.wN() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID) != null) {
            builder.setCreativeId(extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID).toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean YFl(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
