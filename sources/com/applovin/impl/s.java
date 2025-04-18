package com.applovin.impl;

import java.util.Map;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f26390a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26391b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f26392c;
    private final boolean d;

    public s(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f26391b;
    }

    public Map b() {
        return this.f26392c;
    }

    public String c() {
        return this.f26390a;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f26390a + "', backupUrl='" + this.f26391b + "', headers='" + this.f26392c + "', shouldFireInWebView='" + this.d + "'}";
    }

    public s(String str, String str2, Map map, boolean z2) {
        this.f26390a = str;
        this.f26391b = str2;
        this.f26392c = map;
        this.d = z2;
    }
}
