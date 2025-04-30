package com.bytedance.sdk.component.adexpress.dynamic.jU;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YW {
    public static String lMd(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            if (str.indexOf(46) < 0) {
                str = str.concat(".png");
            }
            return o.k(str2, "static/images/", str);
        }
        return zp.zp(str);
    }

    public static void zp(String str, JSONObject jSONObject) {
        JSONObject bX = com.bytedance.sdk.component.adexpress.lMd.bX(str);
        if (bX == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = bX.optJSONObject("values");
        if (optJSONObject == null) {
            return;
        }
        zp(optJSONObject, jSONObject);
    }

    public static JSONObject zp(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject bX = com.bytedance.sdk.component.adexpress.lMd.bX(str);
        if (bX == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return zp(jSONObject2, bX.optJSONObject("themeValues"), jSONObject);
    }

    private static void zp(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject zp(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String zp(String str) {
        JSONObject optJSONObject;
        JSONObject bX = com.bytedance.sdk.component.adexpress.lMd.bX(str);
        if (bX == null || (optJSONObject = bX.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(DataSchemeDataSource.SCHEME_DATA);
    }

    public static String zp(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject bX = com.bytedance.sdk.component.adexpress.lMd.bX(str);
        if (bX == null || (optJSONObject = bX.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(str2);
    }

    public static JSONObject zp(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }
}
