package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class xp {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f12290a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12291c = a(qj.f10373i, (String) sj.a(qj.f10372h, (Object) null, com.applovin.impl.sdk.k.k()));

    /* renamed from: d, reason: collision with root package name */
    private final String f12292d;

    public xp(com.applovin.impl.sdk.k kVar) {
        this.f12290a = kVar;
        this.f12292d = a(qj.f10374j, (String) kVar.a(oj.f9762g));
        a(d());
    }

    private String d() {
        if (!((Boolean) this.f12290a.a(oj.f9678T3)).booleanValue()) {
            this.f12290a.c(qj.f10371g);
        }
        String str = (String) this.f12290a.a(qj.f10371g);
        if (StringUtils.isValidString(str)) {
            this.f12290a.L();
            if (com.applovin.impl.sdk.t.a()) {
                L.v("Using identifier (", str, ") from previous session", this.f12290a.L(), "AppLovinSdk");
            }
            return str;
        }
        return null;
    }

    public String a() {
        return this.f12292d;
    }

    public String b() {
        return this.f12291c;
    }

    public String c() {
        return this.b;
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        qj qjVar = qj.f10375k;
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
        if (((Boolean) this.f12290a.a(oj.f9678T3)).booleanValue()) {
            this.f12290a.b(qj.f10371g, str);
        }
        this.b = str;
        this.f12290a.o().b(str, a());
    }
}
