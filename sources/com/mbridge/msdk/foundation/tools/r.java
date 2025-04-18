package com.mbridge.msdk.foundation.tools;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r {
    public static String a(int i10, int i11, int i12, int i13, int i14) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i10);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TtmlNode.LEFT, i11);
                jSONObject3.put(TtmlNode.RIGHT, i12);
                jSONObject3.put("top", i13);
                jSONObject3.put("bottom", i14);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            } catch (Exception e2) {
                ad.b("JSONUtils", e2.getMessage());
            }
        } catch (Throwable th2) {
            ad.b("JSONUtils", th2.getMessage());
            try {
                jSONObject.put("code", 1);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Fail");
            } catch (JSONException e10) {
                ad.b("JSONUtils", e10.getMessage());
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
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.optString(i10));
        }
        return arrayList;
    }
}
