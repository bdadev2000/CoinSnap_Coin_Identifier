package com.applovin.impl;

import com.applovin.impl.AbstractC0719l0;
import com.applovin.impl.sdk.C0756h;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xn {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f12285a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private List f12286c;

    public xn(com.applovin.impl.sdk.k kVar) {
        boolean z8;
        this.f12285a = kVar;
        qj qjVar = qj.f10361J;
        if (!((Boolean) kVar.a(qjVar, Boolean.FALSE)).booleanValue() && !C0758t0.a(com.applovin.impl.sdk.k.k()).a("applovin.sdk.is_test_environment") && !AppLovinSdkUtils.isEmulator()) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.b = z8;
        kVar.c(qjVar);
    }

    private void e() {
        C0756h o3 = this.f12285a.o();
        if (this.b) {
            o3.b(this.f12286c);
        } else {
            o3.a(this.f12286c);
        }
    }

    public void a() {
        this.f12285a.b(qj.f10361J, Boolean.TRUE);
    }

    public List b() {
        return this.f12286c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        List list = this.f12286c;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public void a(List list) {
        if (list == null && this.f12286c == null) {
            return;
        }
        if (list == null || !list.equals(this.f12286c)) {
            this.f12286c = list;
            e();
        }
    }

    public void a(JSONObject jSONObject) {
        boolean L8;
        String a6;
        if (this.b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        String str = null;
        if (this.f12285a.y() != null) {
            com.applovin.impl.sdk.n z8 = this.f12285a.z();
            L8 = z8.G();
            AbstractC0719l0.a d2 = z8.d();
            a6 = d2 != null ? d2.a() : null;
            n.c h6 = z8.h();
            if (h6 != null) {
                str = h6.a();
            }
        } else {
            com.applovin.impl.sdk.l x9 = this.f12285a.x();
            L8 = x9.L();
            a6 = x9.f().a();
            l.b B5 = x9.B();
            if (B5 != null) {
                str = B5.f10926a;
            }
        }
        this.b = L8 || JsonUtils.containsCaseInsensitiveString(a6, jSONArray) || JsonUtils.containsCaseInsensitiveString(str, jSONArray);
    }
}
