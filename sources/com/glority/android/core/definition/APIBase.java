package com.glority.android.core.definition;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class APIBase {
    private final Date _created_at = new Date();
    protected Date _response_at;

    public Date messageCreatedAt() {
        return this._created_at;
    }

    public Date messageResponseAt() {
        return this._response_at;
    }

    protected Boolean parseBoolean(JSONObject jSONObject, String str) throws JSONException {
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (JSONException unused) {
            return Boolean.valueOf(jSONObject.getInt(str) > 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, Object> jsonObjectToMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next));
        }
        return hashMap;
    }
}
