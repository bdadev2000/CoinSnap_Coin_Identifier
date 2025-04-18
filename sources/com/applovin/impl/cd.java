package com.applovin.impl;

import android.graphics.Color;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cd {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f23268a;

    public cd(JSONObject jSONObject) {
        this.f23268a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public int a() {
        String string = JsonUtils.getString(this.f23268a, "background_color", null);
        if (string != null) {
            return Color.parseColor(string);
        }
        return -16777216;
    }

    public long b() {
        return JsonUtils.getLong(this.f23268a, "close_button_delay_ms", 3000L);
    }

    public int c() {
        return JsonUtils.getInt(this.f23268a, "close_button_extended_touch_area_size", 10);
    }

    public int d() {
        return JsonUtils.getInt(this.f23268a, "close_button_h_margin", 5);
    }

    public int e() {
        return JsonUtils.getInt(this.f23268a, "close_button_size", 30);
    }

    public int f() {
        return JsonUtils.getInt(this.f23268a, "close_button_top_margin", 20);
    }
}
