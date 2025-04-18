package com.bytedance.sdk.component.adexpress.dynamic.wN;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NjR {
    public static String Sg(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            if (str.indexOf(46) < 0) {
                str = str.concat(".png");
            }
            return a.m(str2, "static/images/", str);
        }
        return YFl.YFl(str);
    }

    public static void YFl(String str, JSONObject jSONObject) {
        JSONObject ZLB = com.bytedance.sdk.component.adexpress.Sg.ZLB(str);
        if (ZLB == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = ZLB.optJSONObject("values");
        if (optJSONObject == null) {
            return;
        }
        YFl(optJSONObject, jSONObject);
    }

    public static JSONObject YFl(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject ZLB = com.bytedance.sdk.component.adexpress.Sg.ZLB(str);
        if (ZLB == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return YFl(jSONObject2, ZLB.optJSONObject("themeValues"), jSONObject);
    }

    private static void YFl(JSONObject jSONObject, JSONObject jSONObject2) {
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

    public static JSONObject YFl(JSONObject... jSONObjectArr) {
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

    public static String YFl(String str) {
        JSONObject optJSONObject;
        JSONObject ZLB = com.bytedance.sdk.component.adexpress.Sg.ZLB(str);
        if (ZLB == null || (optJSONObject = ZLB.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(DataSchemeDataSource.SCHEME_DATA);
    }

    public static String YFl(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject ZLB = com.bytedance.sdk.component.adexpress.Sg.ZLB(str);
        if (ZLB == null || (optJSONObject = ZLB.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(str2);
    }

    public static JSONObject YFl(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }
}
