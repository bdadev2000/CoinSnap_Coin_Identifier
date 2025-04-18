package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class xp {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private String f9072b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9073c = a(qj.f7228i, (String) sj.a(qj.f7227h, (Object) null, com.applovin.impl.sdk.k.k()));

    /* renamed from: d, reason: collision with root package name */
    private final String f9074d;

    public xp(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f9074d = a(qj.f7229j, (String) kVar.a(oj.f6656g));
        a(d());
    }

    private String d() {
        if (!((Boolean) this.a.a(oj.T3)).booleanValue()) {
            this.a.c(qj.f7226g);
        }
        String str = (String) this.a.a(qj.f7226g);
        if (StringUtils.isValidString(str)) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.x("Using identifier (", str, ") from previous session", this.a.L(), "AppLovinSdk");
            }
            return str;
        }
        return null;
    }

    public String a() {
        return this.f9074d;
    }

    public String b() {
        return this.f9073c;
    }

    public String c() {
        return this.f9072b;
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        qj qjVar = qj.f7230k;
        String str = (String) kVar.a(qjVar);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(qjVar, valueOf);
        return valueOf;
    }

    private String a(qj qjVar, String str) {
        String str2 = (String) sj.a(qjVar, (Object) null, com.applovin.impl.sdk.k.k());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        sj.b(qjVar, str, com.applovin.impl.sdk.k.k());
        return str;
    }

    public void a(String str) {
        if (((Boolean) this.a.a(oj.T3)).booleanValue()) {
            this.a.b(qj.f7226g, str);
        }
        this.f9072b = str;
        this.a.o().b(str, a());
    }
}
