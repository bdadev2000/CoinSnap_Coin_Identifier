package com.applovin.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public class fh {

    /* renamed from: a, reason: collision with root package name */
    private final String f23919a;

    /* renamed from: b, reason: collision with root package name */
    private Map f23920b;

    private fh(String str, Map map) {
        this.f23919a = str;
        this.f23920b = map;
    }

    public Map a() {
        return this.f23920b;
    }

    public String b() {
        return this.f23919a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f23919a + "'params='" + this.f23920b + "'}";
    }

    public static fh a(String str) {
        return a(str, null);
    }

    public static fh a(String str, Map map) {
        return new fh(str, map);
    }
}
