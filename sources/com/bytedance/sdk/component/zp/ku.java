package com.bytedance.sdk.component.zp;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ku {
    private vDp zp;

    private ku(vDp vdp) {
        this.zp = vdp;
    }

    public static ku zp(vDp vdp) {
        return new ku(vdp);
    }

    public <T> T zp(String str, Type type) throws JSONException {
        zp(str);
        if (!type.equals(JSONObject.class) && (!(type instanceof Class) || !JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) this.zp.zp(str, type);
        }
        return (T) new JSONObject(str);
    }

    public <T> String zp(T t9) {
        String obj;
        if (t9 == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t9 instanceof JSONObject) && !(t9 instanceof JSONArray)) {
            obj = this.zp.zp(t9);
        } else {
            obj = t9.toString();
        }
        zp(obj);
        return obj;
    }

    private static void zp(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        YW.zp(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
