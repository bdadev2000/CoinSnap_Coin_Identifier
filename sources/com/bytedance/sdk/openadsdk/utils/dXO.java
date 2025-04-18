package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;

/* loaded from: classes.dex */
public class dXO {
    public static void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, Double d10) {
        if (wwa == null || wwa.AfY() == null) {
            return;
        }
        Map<String, Object> AfY = wwa.AfY();
        try {
            Object obj = wwa.AfY().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str = (String) AfY.get("nurl");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (d10 != null) {
                    str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d10));
                }
                com.bytedance.sdk.openadsdk.core.lG.tN().YFl(str);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.YoT.Sg("report Win error");
        }
    }

    public static void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, Double d10, String str, String str2) {
        if (wwa == null || wwa.AfY() == null) {
            return;
        }
        Map<String, Object> AfY = wwa.AfY();
        try {
            Object obj = wwa.AfY().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str3 = (String) AfY.get("lurl");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (d10 != null) {
                    str3 = str3.replace("${AUCTION_PRICE}", String.valueOf(d10));
                }
                if (str != null) {
                    str3 = str3.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    str3 = str3.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.lG.tN().YFl(str3);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.YoT.Sg("report Loss error");
        }
    }
}
