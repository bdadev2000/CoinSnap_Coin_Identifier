package com.applovin.impl;

import java.util.Map;

/* renamed from: com.applovin.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0745s {

    /* renamed from: a, reason: collision with root package name */
    private final String f10538a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f10539c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10540d;

    public C0745s(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.b;
    }

    public Map b() {
        return this.f10539c;
    }

    public String c() {
        return this.f10538a;
    }

    public boolean d() {
        return this.f10540d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f10538a + "', backupUrl='" + this.b + "', headers='" + this.f10539c + "', shouldFireInWebView='" + this.f10540d + "'}";
    }

    public C0745s(String str, String str2, Map map, boolean z8) {
        this.f10538a = str;
        this.b = str2;
        this.f10539c = map;
        this.f10540d = z8;
    }
}
