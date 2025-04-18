package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f23582a;

    public e5(JSONObject jSONObject) {
        this.f23582a = jSONObject;
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f23582a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f23582a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f23582a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f23582a, "referrer", null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f23582a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f23582a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f23582a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f23582a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f23582a, "url_bar_hiding_enabled", null);
    }
}
