package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n6 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6358b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6359c;

    public n6(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.f6358b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f6359c = zp.a(list);
        } else {
            this.f6359c = zp.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f6358b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.f6359c;
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
