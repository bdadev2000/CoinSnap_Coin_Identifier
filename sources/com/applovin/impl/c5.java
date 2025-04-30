package com.applovin.impl;

import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f6957a;

    public c5(JSONObject jSONObject) {
        this.f6957a = jSONObject;
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
        } catch (Exception e4) {
            com.applovin.impl.sdk.t.b("CustomTabsSettings", "Failed to get animation resource ID for: ".concat(str), e4);
            return null;
        }
    }

    public String b() {
        return JsonUtils.getString(this.f6957a, "digital_asset_link_url", null);
    }

    public Integer c() {
        return a(JsonUtils.getString(this.f6957a, "end_enter_animation", null));
    }

    public Integer d() {
        return a(JsonUtils.getString(this.f6957a, "end_exit_animation", null));
    }

    public Boolean e() {
        return JsonUtils.getBoolean(this.f6957a, "instant_apps_enabled", null);
    }

    public String f() {
        return JsonUtils.getString(this.f6957a, Constants.REFERRER, null);
    }

    public Integer g() {
        return JsonUtils.getInteger(this.f6957a, "session_url_relation", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f6957a, "share_state", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f6957a, "should_show_title", null);
    }

    public Integer j() {
        return a(JsonUtils.getString(this.f6957a, "start_enter_animation", null));
    }

    public Integer k() {
        return a(JsonUtils.getString(this.f6957a, "start_exit_animation", null));
    }

    public Integer l() {
        return JsonUtils.getInteger(this.f6957a, "toolbar_color", null);
    }

    public Boolean m() {
        return JsonUtils.getBoolean(this.f6957a, "url_bar_hiding_enabled", null);
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f6957a, "dark_mode_toolbar_color", null);
    }
}
