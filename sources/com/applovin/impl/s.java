package com.applovin.impl;

import java.util.Map;

/* loaded from: classes.dex */
public class s {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7413b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f7414c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7415d;

    public s(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f7413b;
    }

    public Map b() {
        return this.f7414c;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.f7415d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.a + "', backupUrl='" + this.f7413b + "', headers='" + this.f7414c + "', shouldFireInWebView='" + this.f7415d + "'}";
    }

    public s(String str, String str2, Map map, boolean z10) {
        this.a = str;
        this.f7413b = str2;
        this.f7414c = map;
        this.f7415d = z10;
    }
}
