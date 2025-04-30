package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9280a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9281c;

    public n6(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f9280a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f9281c = zp.a(list);
        } else {
            this.f9281c = zp.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f9280a;
    }

    public boolean c() {
        return this.f9281c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || zp.a(str2, str) != 1) {
            return str3 == null || zp.a(str3, str) != -1;
        }
        return false;
    }
}
