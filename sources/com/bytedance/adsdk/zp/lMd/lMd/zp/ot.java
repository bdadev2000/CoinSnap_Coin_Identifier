package com.bytedance.adsdk.zp.lMd.lMd.zp;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class ot implements com.bytedance.adsdk.zp.lMd.lMd.zp {
    private final String zp;

    public ot(String str) {
        this.zp = str;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public String lMd() {
        return this.zp;
    }

    public String toString() {
        return AbstractC2914a.h(new StringBuilder("VariableNode [literals="), this.zp, "]");
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        Object zp;
        if (map == null || map.size() <= 0 || (zp = zp(this.zp, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return zp;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public com.bytedance.adsdk.zp.lMd.jU.COT zp() {
        return com.bytedance.adsdk.zp.lMd.jU.HWF.VARIABLE;
    }

    public Object zp(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return zp(str.split("\\."), 0, jSONObject);
    }

    private Object zp(String[] strArr, int i9, JSONObject jSONObject) {
        Object opt;
        if (strArr != null && strArr.length > 0 && i9 < strArr.length && jSONObject != null) {
            String str = strArr[i9];
            int indexOf = str.indexOf("[");
            int indexOf2 = str.indexOf("]");
            if (indexOf >= 0 && indexOf2 >= 0 && indexOf <= indexOf2) {
                String substring = str.substring(0, indexOf);
                try {
                    int parseInt = Integer.parseInt(str.substring(indexOf + 1, indexOf2));
                    Object opt2 = jSONObject.opt(substring);
                    opt = opt2 instanceof JSONArray ? ((JSONArray) opt2).opt(parseInt) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                opt = jSONObject.opt(str);
            }
            if (i9 == strArr.length - 1) {
                return opt;
            }
            if (opt instanceof String) {
                try {
                    return zp(strArr, i9 + 1, new JSONObject((String) opt));
                } catch (JSONException unused2) {
                    return opt;
                }
            }
            if (opt instanceof JSONObject) {
                return zp(strArr, i9 + 1, (JSONObject) opt);
            }
        }
        return null;
    }
}
