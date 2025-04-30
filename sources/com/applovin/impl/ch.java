package com.applovin.impl;

import java.util.Map;

/* loaded from: classes.dex */
public class ch {

    /* renamed from: a, reason: collision with root package name */
    private final String f7086a;
    private Map b;

    private ch(String str, Map map) {
        this.f7086a = str;
        this.b = map;
    }

    public static ch a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f7086a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f7086a + "'params='" + this.b + "'}";
    }

    public Map a() {
        return this.b;
    }

    public static ch a(String str, Map map) {
        return new ch(str, map);
    }
}
