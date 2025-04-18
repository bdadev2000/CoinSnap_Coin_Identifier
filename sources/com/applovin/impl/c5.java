package com.applovin.impl;

import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c5 {
    private final JSONObject a;

    public c5(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    private Integer a(String str) {
        if (str == null) {
            return null;
        }
        try {
            int identifier = com.applovin.impl.sdk.k.k().getResources().getIdentifier(str, "anim", "android");
            if (identifier != 0) {
                return Integer.valueOf(identifier);
            }
            return null;
        } catch (Exception e2) {
            com.applovin.impl.sdk.t.b("CustomTabsSettings", "Failed to get animation resource ID for: ".concat(str), e2);
            return null;
        }
    }

    public String b() {
        return JsonUtils.getString(this.a, "digital_asset_link_url", null);
    }

    public Integer c() {
        return a(JsonUtils.getString(this.a, "end_enter_animation", null));
    }

    public Integer d() {
        return a(JsonUtils.getString(this.a, "end_exit_animation", null));
    }

    public Boolean e() {
        return JsonUtils.getBoolean(this.a, "instant_apps_enabled", null);
    }

    public String f() {
        return JsonUtils.getString(this.a, Constants.REFERRER, null);
    }

    public Integer g() {
        return JsonUtils.getInteger(this.a, "session_url_relation", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.a, "share_state", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.a, "should_show_title", null);
    }

    public Integer j() {
        return a(JsonUtils.getString(this.a, "start_enter_animation", null));
    }

    public Integer k() {
        return a(JsonUtils.getString(this.a, "start_exit_animation", null));
    }

    public Integer l() {
        return JsonUtils.getInteger(this.a, "toolbar_color", null);
    }

    public Boolean m() {
        return JsonUtils.getBoolean(this.a, "url_bar_hiding_enabled", null);
    }

    public Integer a() {
        return JsonUtils.getInteger(this.a, "dark_mode_toolbar_color", null);
    }
}
