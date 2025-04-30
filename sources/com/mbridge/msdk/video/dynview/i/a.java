package com.mbridge.msdk.video.dynview.i;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes3.dex */
public final class a {
    public static String a(Context context, int i9) {
        String str;
        if (i9 == 1) {
            str = "_por";
        } else {
            str = "_land";
        }
        String s5 = z.s(context);
        if (s5.startsWith("zh")) {
            if (!s5.contains("TW") && !s5.contains("HK")) {
                return "mbridge_reward_two_title_zh";
            }
            return "mbridge_reward_two_title_zh_trad";
        }
        if (s5.startsWith("ja")) {
            return "mbridge_reward_two_title_japan".concat(str);
        }
        if (s5.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany".concat(str);
        }
        if (s5.startsWith("ko")) {
            return "mbridge_reward_two_title_korea".concat(str);
        }
        if (s5.startsWith("fr")) {
            return "mbridge_reward_two_title_france".concat(str);
        }
        if (s5.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia".concat(str);
        }
        if (s5.startsWith("ru")) {
            return "mbridge_reward_two_title_russian".concat(str);
        }
        return "mbridge_reward_two_title_en".concat(str);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter("alecfc");
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
            return "";
        }
    }

    public static int a(CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
            int f9 = campaignEx.getRewardTemplateMode().f();
            if (f9 == 302 || f9 == 802 || f9 == 902) {
                return -3;
            }
            if (f9 == 904) {
                return !a(campaignEx.getRewardTemplateMode().e()) ? -1 : -3;
            }
        }
        return 100;
    }
}
