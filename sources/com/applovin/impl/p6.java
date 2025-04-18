package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25970a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25971b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25972c;

    public p6(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f25970a = JsonUtils.getString(jSONObject, "name", "");
        this.f25971b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f25972c = yp.a(list);
        } else {
            this.f25972c = yp.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f25971b;
    }

    public String b() {
        return this.f25970a;
    }

    public boolean c() {
        return this.f25972c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || yp.a(str2, str) != 1) {
            return str3 == null || yp.a(str3, str) != -1;
        }
        return false;
    }
}
