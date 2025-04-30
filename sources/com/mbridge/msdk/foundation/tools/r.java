package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r {
    public static String a(int i9, int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i9);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TtmlNode.LEFT, i10);
                jSONObject3.put(TtmlNode.RIGHT, i11);
                jSONObject3.put("top", i12);
                jSONObject3.put("bottom", i13);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            } catch (Exception e4) {
                ad.b("JSONUtils", e4.getMessage());
            }
        } catch (Throwable th) {
            ad.b("JSONUtils", th.getMessage());
            try {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Fail");
            } catch (JSONException e9) {
                ad.b("JSONUtils", e9.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i9 = 0; i9 < length; i9++) {
            arrayList.add(jSONArray.optString(i9));
        }
        return arrayList;
    }
}
