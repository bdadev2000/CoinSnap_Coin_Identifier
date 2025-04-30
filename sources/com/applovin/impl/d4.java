package com.applovin.impl;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class d4 {

    /* renamed from: c, reason: collision with root package name */
    public static int f7174c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f7175d = -100;

    /* renamed from: e, reason: collision with root package name */
    public static int f7176e = -200;

    /* renamed from: f, reason: collision with root package name */
    public static int f7177f = -300;

    /* renamed from: a, reason: collision with root package name */
    private final int f7178a;
    private final String b;

    public d4(int i9, String str) {
        this.f7178a = i9;
        this.b = str;
    }

    public int a() {
        return this.f7178a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinConsentFlowErrorImpl{code=");
        sb.append(this.f7178a);
        sb.append(", message='");
        return AbstractC2914a.h(sb, this.b, "'}");
    }
}
