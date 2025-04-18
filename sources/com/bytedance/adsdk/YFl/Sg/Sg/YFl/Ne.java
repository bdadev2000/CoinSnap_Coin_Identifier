package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public class Ne implements com.bytedance.adsdk.YFl.Sg.Sg.YFl {
    private final String YFl;

    public Ne(String str) {
        this.YFl = str;
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public String Sg() {
        return this.YFl;
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        Object YFl;
        if (map == null || map.size() <= 0 || (YFl = YFl(this.YFl, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return YFl;
    }

    public String toString() {
        return e.h(new StringBuilder("VariableNode [literals="), this.YFl, "]");
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public com.bytedance.adsdk.YFl.Sg.AlY.wN YFl() {
        return com.bytedance.adsdk.YFl.Sg.AlY.vc.VARIABLE;
    }

    public Object YFl(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return YFl(str.split("\\."), 0, jSONObject);
    }

    private Object YFl(String[] strArr, int i10, JSONObject jSONObject) {
        Object opt;
        if (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
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
            if (i10 == strArr.length - 1) {
                return opt;
            }
            if (opt instanceof String) {
                try {
                    return YFl(strArr, i10 + 1, new JSONObject((String) opt));
                } catch (JSONException unused2) {
                    return opt;
                }
            }
            if (opt instanceof JSONObject) {
                return YFl(strArr, i10 + 1, (JSONObject) opt);
            }
        }
        return null;
    }
}
