package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8391a;
    private final JSONObject b;

    /* loaded from: classes.dex */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private j4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f8391a = kVar;
        this.b = jSONObject;
    }

    public static j4 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, CampaignEx.JSON_KEY_TITLE, (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && kVar.t().i() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && kVar.t().h() == null) {
            return null;
        }
        return new j4(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.b, NotificationCompat.CATEGORY_EVENT, null);
    }

    public a c() {
        String string = JsonUtils.getString(this.b, TtmlNode.TAG_STYLE, null);
        if ("default".equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        if (!"destructive".equalsIgnoreCase(string) && !"cancel".equalsIgnoreCase(string)) {
            return a.NEUTRAL;
        }
        return a.NEGATIVE;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.b, CampaignEx.JSON_KEY_TITLE, (JSONObject) null);
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, "key", ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + "destinationStateId=" + a() + "event=" + b() + "}";
    }

    public String a() {
        return JsonUtils.getString(this.b, "destination_state_id", null);
    }
}
