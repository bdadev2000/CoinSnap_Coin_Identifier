package com.mbridge.msdk.splash.a.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {
    private static final String a = "a";

    public static CampaignEx a(String str, CampaignEx campaignEx) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject campaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(campaignToJsonObject);
                if (parseCampaignWithBackData == null) {
                    parseCampaignWithBackData = campaignEx;
                }
                if (!TextUtils.isEmpty(str)) {
                    String optString = campaignToJsonObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                    if (!TextUtils.isEmpty(optString)) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                    }
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f13279j);
                    if (optJSONObject != null) {
                        String string = optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f13277h);
                        String string2 = optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f13278i);
                        if (TextUtils.isEmpty(string)) {
                            string = "-999";
                        }
                        int parseInt = Integer.parseInt(string);
                        if (TextUtils.isEmpty(string2)) {
                            string2 = "-999";
                        }
                        int parseInt2 = Integer.parseInt(string2);
                        str2 = parseInt != -999 ? String.valueOf(ai.a(c.m().c(), parseInt)) : "-999";
                        str3 = parseInt2 != -999 ? String.valueOf(ai.a(c.m().c(), parseInt2)) : "-999";
                    } else {
                        str2 = "-999";
                        str3 = str2;
                    }
                    parseCampaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(parseCampaignWithBackData.getClickURL(), str2, str3));
                    String noticeUrl = parseCampaignWithBackData.getNoticeUrl();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb2 = new StringBuilder();
                        while (keys.hasNext()) {
                            sb2.append("&");
                            String next = keys.next();
                            String optString2 = optJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.f13277h.equals(next) || com.mbridge.msdk.foundation.same.a.f13278i.equals(next)) {
                                if (TextUtils.isEmpty(optString2)) {
                                    optString2 = "-999";
                                }
                                int parseInt3 = Integer.parseInt(optString2);
                                optString2 = parseInt3 != -999 ? String.valueOf(ai.a(c.m().c(), parseInt3)) : "-999";
                            }
                            sb2.append(next);
                            sb2.append("=");
                            sb2.append(optString2);
                        }
                        parseCampaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb2));
                    }
                }
                return parseCampaignWithBackData;
            } catch (Throwable unused) {
                return campaignEx;
            }
        }
        try {
            JSONObject campaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    campaignToJsonObject2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
            } catch (Exception e2) {
                ad.b(a, e2.getMessage());
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                campaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx parseCampaignWithBackData2 = CampaignEx.parseCampaignWithBackData(campaignToJsonObject2);
            String optString3 = campaignToJsonObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (!TextUtils.isEmpty(optString3)) {
                parseCampaignWithBackData2.setCampaignUnitId(optString3);
            }
            return parseCampaignWithBackData2;
        } catch (JSONException e10) {
            ad.b(a, e10.getMessage());
            return campaignEx;
        }
    }

    public static String a(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (i10 == 4) {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13277h, -999);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13278i, -999);
            } else {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13277h, ai.b(c.m().c(), f10));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13278i, ai.b(c.m().c(), f11));
            }
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13282m, i10);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13280k, c.m().c().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13281l, ai.d(c.m().c()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f13279j, jSONObject2);
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
        }
        return jSONObject.toString();
    }
}
