package com.applovin.impl;

import java.util.Map;

/* loaded from: classes.dex */
public class ch {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private Map f4101b;

    private ch(String str, Map map) {
        this.a = str;
        this.f4101b = map;
    }

    public static ch a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "PendingReward{result='" + this.a + "'params='" + this.f4101b + "'}";
    }

    public Map a() {
        return this.f4101b;
    }

    public static ch a(String str, Map map) {
        return new ch(str, map);
    }
}
