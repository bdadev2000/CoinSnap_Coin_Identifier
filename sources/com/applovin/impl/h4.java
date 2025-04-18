package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h4 {
    protected final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f5084b;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        IS_AL_GDPR
    }

    /* loaded from: classes.dex */
    public enum b {
        ALERT,
        EVENT,
        HAS_USER_CONSENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION,
        TERMS_FLOW
    }

    public h4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f5084b = jSONObject;
    }

    public static h4 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b c10 = c(JsonUtils.getString(jSONObject, "type", null));
        if (c10 == b.ALERT) {
            return new i4(jSONObject, kVar);
        }
        if (c10 == b.EVENT) {
            return new k4(jSONObject, kVar);
        }
        return new h4(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.f5084b, "id", null);
    }

    public b c() {
        return c(JsonUtils.getString(this.f5084b, "type", null));
    }

    public boolean d() {
        return JsonUtils.getBoolean(this.f5084b, "is_initial_state", Boolean.FALSE).booleanValue();
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if (NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("terms_flow".equalsIgnoreCase(str)) {
            return b.TERMS_FLOW;
        }
        if ("huc".equalsIgnoreCase(str)) {
            return b.HAS_USER_CONSENT;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException(vd.e.e("Invalid type provided: ", str));
    }

    public String b(String str) {
        String str2;
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f5084b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String obj = JsonUtils.getObjectAtIndex(jSONArray, i10, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(obj)) {
                if (this.a.y() != null) {
                    str2 = this.a.z().g().e();
                } else {
                    str2 = (String) this.a.x().F().get("app_name");
                }
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.k.a("THIS_APP"));
                }
            } else {
                arrayList.add(obj);
            }
        }
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    public a a() {
        return a(JsonUtils.getString(this.f5084b, "decision_type", null));
    }

    public String a(Boolean bool) {
        String string = JsonUtils.getString(this.f5084b, "destination_state_id", null);
        if (StringUtils.isValidString(string)) {
            return string;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getString(this.f5084b, "destination_state_id_true", null) : JsonUtils.getString(this.f5084b, "destination_state_id_false", null);
        }
        throw new IllegalStateException(vd.e.e("Decision needed for state: ", string));
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        return a.NONE;
    }
}
