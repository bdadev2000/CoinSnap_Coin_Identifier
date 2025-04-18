package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class wp {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f27779a;

    /* renamed from: b, reason: collision with root package name */
    private String f27780b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27781c = a(uj.f27334i, (String) vj.a(uj.f27333h, (Object) null, com.applovin.impl.sdk.j.l()));
    private final String d;

    public wp(com.applovin.impl.sdk.j jVar) {
        this.f27779a = jVar;
        this.d = a(uj.f27335j, (String) jVar.a(sj.f26917g));
        a(d());
    }

    private String d() {
        if (!((Boolean) this.f27779a.a(sj.Z3)).booleanValue()) {
            this.f27779a.c(uj.f27332g);
        }
        String str = (String) this.f27779a.a(uj.f27332g);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f27779a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f27779a.J().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f27781c;
    }

    public String c() {
        return this.f27780b;
    }

    public static String a(com.applovin.impl.sdk.j jVar) {
        uj ujVar = uj.f27336k;
        String str = (String) jVar.a(ujVar);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        jVar.b(ujVar, valueOf);
        return valueOf;
    }

    private String a(uj ujVar, String str) {
        String str2 = (String) vj.a(ujVar, (Object) null, com.applovin.impl.sdk.j.l());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        vj.b(ujVar, str, com.applovin.impl.sdk.j.l());
        return str;
    }

    public void a(String str) {
        if (((Boolean) this.f27779a.a(sj.Z3)).booleanValue()) {
            this.f27779a.b(uj.f27332g, str);
        }
        this.f27780b = str;
        this.f27779a.p().b(str, a());
    }
}
