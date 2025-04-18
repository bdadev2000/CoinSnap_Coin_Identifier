package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j4 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f24588a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f24589b;

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

    public j4(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f24588a = jVar;
        this.f24589b = jSONObject;
    }

    public static j4 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        b c2 = c(JsonUtils.getString(jSONObject, "type", null));
        if (c2 == b.ALERT) {
            return new k4(jSONObject, jVar);
        }
        if (c2 == b.EVENT) {
            return new m4(jSONObject, jVar);
        }
        return new j4(jSONObject, jVar);
    }

    public String b() {
        return JsonUtils.getString(this.f24589b, "id", null);
    }

    public b c() {
        return c(JsonUtils.getString(this.f24589b, "type", null));
    }

    public boolean d() {
        return JsonUtils.getBoolean(this.f24589b, "is_initial_state", Boolean.FALSE).booleanValue();
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if (MaxEvent.f29810a.equalsIgnoreCase(str)) {
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
        throw new IllegalArgumentException(androidx.compose.ui.platform.j.b("Invalid type provided: ", str));
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f24589b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String obj = JsonUtils.getObjectAtIndex(jSONArray, i2, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(obj)) {
                String str2 = (String) this.f24588a.y().F().get(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.j.a("THIS_APP"));
                }
            } else {
                arrayList.add(obj);
            }
        }
        return com.applovin.impl.sdk.j.a(JsonUtils.getString(jSONObject, SDKConstants.PARAM_KEY, null), arrayList);
    }

    public a a() {
        return a(JsonUtils.getString(this.f24589b, "decision_type", null));
    }

    public String a(Boolean bool) {
        String string = JsonUtils.getString(this.f24589b, "destination_state_id", null);
        if (StringUtils.isValidString(string)) {
            return string;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getString(this.f24589b, "destination_state_id_true", null) : JsonUtils.getString(this.f24589b, "destination_state_id_false", null);
        }
        throw new IllegalStateException(androidx.compose.ui.platform.j.b("Decision needed for state: ", string));
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        return a.NONE;
    }
}
