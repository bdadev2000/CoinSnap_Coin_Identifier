package com.mbridge.msdk.foundation.same;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar);
    }

    public static long a(long j7, long j9) {
        return j7 >= 0 ? j7 : j9;
    }

    public static String a(List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null && campaignEx.getCreativeId() != 0) {
                arrayList.add(campaignEx);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                CampaignEx campaignEx2 = (CampaignEx) arrayList.get(i9);
                if (campaignEx2 != null) {
                    long creativeId = campaignEx2.getCreativeId();
                    if (i9 == arrayList.size() - 1) {
                        sb.append(creativeId);
                    } else {
                        sb.append(creativeId);
                        sb.append(",");
                    }
                }
            } catch (Exception e4) {
                ad.b("SameCommon", "getCreativeID", e4);
            }
        }
        return sb.toString();
    }

    public static boolean a(Context context, CampaignEx campaignEx) {
        if (context != null && campaignEx != null) {
            boolean c9 = ai.c(context, campaignEx.getPackageName());
            if (ai.c(campaignEx) || campaignEx.getWtick() == 1 || !c9) {
                return true;
            }
        }
        return false;
    }

    public static void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.d.b bVar, a aVar) {
        if (campaignEx == null || aVar == null) {
            return;
        }
        if (bVar == null) {
            try {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                    return;
                }
                return;
            }
        }
        boolean c9 = ai.c(campaignEx);
        int d2 = ai.d(context, campaignEx.getPackageName());
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a(BidResponsedEx.KEY_CID, campaignEx.getId());
        dVar.a(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
        dVar.a(CampaignEx.JSON_KEY_RETARGET_OFFER, Integer.valueOf(campaignEx.getRetarget_offer()));
        dVar.a("ind", Integer.valueOf(d2));
        dVar.a("stage", 1);
        if (c9) {
            if (d2 != 1) {
                bVar.a("m_campaign_filtered", dVar);
                aVar.a("m_campaign_filtered", bVar);
            }
            bVar.a("m_campaign_ind_retarget", dVar);
            aVar.a("m_campaign_ind_retarget", bVar);
            return;
        }
        if (d2 == 1) {
            bVar.a("m_campaign_filtered", dVar);
            aVar.a("m_campaign_filtered", bVar);
        }
        bVar.a("m_campaign_ind_unretarget", dVar);
        aVar.a("m_campaign_ind_unretarget", bVar);
    }

    public static JSONObject a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                String str3 = "";
                if (split.length == 2) {
                    String str4 = split[0];
                    if (!TextUtils.isEmpty(str4)) {
                        String str5 = split[1];
                        if (str5 != null) {
                            str3 = str5;
                        }
                        jSONObject.put(str4, str3);
                    }
                } else if (split.length == 1) {
                    String str6 = split[0];
                    if (!TextUtils.isEmpty(str6)) {
                        jSONObject.put(str6, "");
                    }
                }
            }
            return jSONObject;
        } catch (Exception e4) {
            ad.a("SameCommon", "coverReportMessage", e4);
            return null;
        } catch (Throwable th) {
            ad.a("SameCommon", "coverReportMessage", th);
            return null;
        }
    }
}
