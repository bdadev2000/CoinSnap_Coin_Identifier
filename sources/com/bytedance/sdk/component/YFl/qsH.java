package com.bytedance.sdk.component.YFl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class qsH {
    private YoT YFl;

    private qsH(YoT yoT) {
        this.YFl = yoT;
    }

    public static qsH YFl(YoT yoT) {
        return new qsH(yoT);
    }

    public <T> T YFl(String str, Type type) throws JSONException {
        YFl(str);
        if (!type.equals(JSONObject.class) && (!(type instanceof Class) || !JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) this.YFl.YFl(str, type);
        }
        return (T) new JSONObject(str);
    }

    public <T> String YFl(T t5) {
        String obj;
        if (t5 == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t5 instanceof JSONObject) && !(t5 instanceof JSONArray)) {
            obj = this.YFl.YFl(t5);
        } else {
            obj = t5.toString();
        }
        YFl(obj);
        return obj;
    }

    private static void YFl(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        NjR.YFl(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
