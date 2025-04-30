package com.applovin.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0701g3 {
    private static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] a(byte[] bArr) {
        return yp.f12451a >= 27 ? bArr : yp.c(a(yp.a(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (yp.f12451a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(yp.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                if (i9 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K)));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return yp.c(sb.toString());
        } catch (JSONException e4) {
            kc.a("ClearKeyUtil", "Failed to adjust response data: " + yp.a(bArr), e4);
            return bArr;
        }
    }
}
