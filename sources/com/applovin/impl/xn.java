package com.applovin.impl;

import com.applovin.impl.l0;
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
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9067b;

    /* renamed from: c, reason: collision with root package name */
    private List f9068c;

    public xn(com.applovin.impl.sdk.k kVar) {
        boolean z10;
        this.a = kVar;
        qj qjVar = qj.J;
        if (!((Boolean) kVar.a(qjVar, Boolean.FALSE)).booleanValue() && !t0.a(com.applovin.impl.sdk.k.k()).a("applovin.sdk.is_test_environment") && !AppLovinSdkUtils.isEmulator()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f9067b = z10;
        kVar.c(qjVar);
    }

    private void e() {
        com.applovin.impl.sdk.h o10 = this.a.o();
        if (this.f9067b) {
            o10.b(this.f9068c);
        } else {
            o10.a(this.f9068c);
        }
    }

    public void a() {
        this.a.b(qj.J, Boolean.TRUE);
    }

    public List b() {
        return this.f9068c;
    }

    public boolean c() {
        return this.f9067b;
    }

    public boolean d() {
        List list = this.f9068c;
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
        if (list == null && this.f9068c == null) {
            return;
        }
        if (list == null || !list.equals(this.f9068c)) {
            this.f9068c = list;
            e();
        }
    }

    public void a(JSONObject jSONObject) {
        boolean L;
        String a;
        if (this.f9067b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        String str = null;
        if (this.a.y() != null) {
            com.applovin.impl.sdk.n z10 = this.a.z();
            L = z10.G();
            l0.a d10 = z10.d();
            a = d10 != null ? d10.a() : null;
            n.c h10 = z10.h();
            if (h10 != null) {
                str = h10.a();
            }
        } else {
            com.applovin.impl.sdk.l x10 = this.a.x();
            L = x10.L();
            a = x10.f().a();
            l.b B = x10.B();
            if (B != null) {
                str = B.a;
            }
        }
        this.f9067b = L || JsonUtils.containsCaseInsensitiveString(a, jSONArray) || JsonUtils.containsCaseInsensitiveString(str, jSONArray);
    }
}
