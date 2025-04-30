package com.mbridge.msdk.splash.a.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17765a = "a";

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
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f15684j);
                    if (optJSONObject == null) {
                        str2 = "-999";
                        str3 = str2;
                    } else {
                        String string = optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f15682h);
                        String string2 = optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f15683i);
                        if (TextUtils.isEmpty(string)) {
                            string = "-999";
                        }
                        int parseInt = Integer.parseInt(string);
                        if (TextUtils.isEmpty(string2)) {
                            string2 = "-999";
                        }
                        int parseInt2 = Integer.parseInt(string2);
                        if (parseInt == -999) {
                            str2 = "-999";
                        } else {
                            str2 = String.valueOf(ai.a(c.m().c(), parseInt));
                        }
                        if (parseInt2 == -999) {
                            str3 = "-999";
                        } else {
                            str3 = String.valueOf(ai.a(c.m().c(), parseInt2));
                        }
                    }
                    parseCampaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(parseCampaignWithBackData.getClickURL(), str2, str3));
                    String noticeUrl = parseCampaignWithBackData.getNoticeUrl();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (keys.hasNext()) {
                            sb.append("&");
                            String next = keys.next();
                            String optString2 = optJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.f15682h.equals(next) || com.mbridge.msdk.foundation.same.a.f15683i.equals(next)) {
                                if (TextUtils.isEmpty(optString2)) {
                                    optString2 = "-999";
                                }
                                int parseInt3 = Integer.parseInt(optString2);
                                if (parseInt3 == -999) {
                                    optString2 = "-999";
                                } else {
                                    optString2 = String.valueOf(ai.a(c.m().c(), parseInt3));
                                }
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(optString2);
                        }
                        parseCampaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb));
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
            } catch (Exception e4) {
                ad.b(f17765a, e4.getMessage());
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
        } catch (JSONException e9) {
            ad.b(f17765a, e9.getMessage());
            return campaignEx;
        }
    }

    public static String a(int i9, float f9, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (i9 == 4) {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15682h, -999);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15683i, -999);
            } else {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15682h, ai.b(c.m().c(), f9));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15683i, ai.b(c.m().c(), f10));
            }
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.m, i9);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15685k, c.m().c().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, ai.d(c.m().c()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f15684j, jSONObject2);
        } catch (Exception e4) {
            ad.b(f17765a, e4.getMessage());
        }
        return jSONObject.toString();
    }
}
