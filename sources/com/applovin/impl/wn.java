package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class wn {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f27773a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27774b;

    /* renamed from: c, reason: collision with root package name */
    private List f27775c;

    public wn(com.applovin.impl.sdk.j jVar) {
        this.f27773a = jVar;
        uj ujVar = uj.I;
        this.f27774b = ((Boolean) jVar.a(ujVar, Boolean.FALSE)).booleanValue() || t0.a(com.applovin.impl.sdk.j.l()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || jVar.y().L();
        jVar.c(ujVar);
    }

    private void e() {
        com.applovin.impl.sdk.g p2 = this.f27773a.p();
        if (this.f27774b) {
            p2.b(this.f27775c);
        } else {
            p2.a(this.f27775c);
        }
    }

    public void a() {
        this.f27773a.b(uj.I, Boolean.TRUE);
    }

    public List b() {
        return this.f27775c;
    }

    public boolean c() {
        return this.f27774b;
    }

    public boolean d() {
        List list = this.f27775c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public void a(List list) {
        if (list == null && this.f27775c == null) {
            return;
        }
        if (list == null || !list.equals(this.f27775c)) {
            this.f27775c = list;
            e();
        }
    }

    public void a(JSONObject jSONObject) {
        if (this.f27774b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.k y2 = this.f27773a.y();
        boolean L = y2.L();
        String a2 = y2.f().a();
        k.b B = y2.B();
        this.f27774b = L || JsonUtils.containsCaseInsensitiveString(a2, jSONArray) || JsonUtils.containsCaseInsensitiveString(B != null ? B.f26698a : null, jSONArray);
    }
}
