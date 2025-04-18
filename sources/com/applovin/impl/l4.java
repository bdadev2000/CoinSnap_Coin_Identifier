package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.safedk.android.analytics.events.MaxEvent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f24978a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f24979b;

    /* loaded from: classes.dex */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private l4(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f24978a = jVar;
        this.f24979b = jSONObject;
    }

    public static l4 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), SDKConstants.PARAM_KEY, null);
        if ("TOS".equalsIgnoreCase(string) && jVar.u().i() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && jVar.u().h() == null) {
            return null;
        }
        return new l4(jSONObject, jVar);
    }

    public String b() {
        return JsonUtils.getString(this.f24979b, MaxEvent.f29810a, null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f24979b, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, null);
        return "default".equalsIgnoreCase(string) ? a.POSITIVE : ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f24979b, "title", (JSONObject) null);
        return com.applovin.impl.sdk.j.a(JsonUtils.getString(jSONObject, SDKConstants.PARAM_KEY, ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + "destinationStateId=" + a() + "event=" + b() + "}";
    }

    public String a() {
        return JsonUtils.getString(this.f24979b, "destination_state_id", null);
    }
}
