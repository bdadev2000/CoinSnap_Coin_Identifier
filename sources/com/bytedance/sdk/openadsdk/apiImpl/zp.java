package com.bytedance.sdk.openadsdk.apiImpl;

import android.text.TextUtils;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.settings.Bj;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes.dex */
public class zp {
    public static boolean zp(PAGLoadListener pAGLoadListener) {
        if (Bj.zp()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    public static void zp(final ku kuVar, final PAGLoadListener pAGLoadListener, AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.zp.1
            @Override // java.lang.Runnable
            public void run() {
                if (!tG.COT()) {
                    com.bytedance.sdk.component.utils.tG.zp("AdLoadBaseManager", "please exec TTAdSdk.init before load ad");
                    PAGLoadListener pAGLoadListener2 = PAGLoadListener.this;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                QUv.jU(kuVar);
            }
        };
        if (tG.COT()) {
            runnable.run();
        } else {
            tG.lMd().post(runnable);
        }
    }

    public static void zp(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!tG.COT() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
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

    public static boolean zp(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
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
