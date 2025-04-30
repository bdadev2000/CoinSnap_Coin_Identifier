package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class RCv {
    public static void zp(com.bytedance.sdk.openadsdk.core.model.woN won, Double d2) {
        if (won == null || won.zpV() == null) {
            return;
        }
        Map<String, Object> zpV = won.zpV();
        try {
            Object obj = won.zpV().get("sdk_bidding_type");
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str = (String) zpV.get("nurl");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (d2 != null) {
                    str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d2));
                }
                com.bytedance.sdk.openadsdk.core.KVG.KS().zp(str);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.tG.lMd("report Win error");
        }
    }

    public static void zp(com.bytedance.sdk.openadsdk.core.model.woN won, Double d2, String str, String str2) {
        if (won == null || won.zpV() == null) {
            return;
        }
        Map<String, Object> zpV = won.zpV();
        try {
            Object obj = won.zpV().get("sdk_bidding_type");
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str3 = (String) zpV.get("lurl");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (d2 != null) {
                    str3 = str3.replace("${AUCTION_PRICE}", String.valueOf(d2));
                }
                if (str != null) {
                    str3 = str3.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    str3 = str3.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.KVG.KS().zp(str3);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.tG.lMd("report Loss error");
        }
    }
}
