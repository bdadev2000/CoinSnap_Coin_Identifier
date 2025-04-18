package com.applovin.impl;

/* loaded from: classes.dex */
public class d4 {

    /* renamed from: c, reason: collision with root package name */
    public static int f4199c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f4200d = -100;

    /* renamed from: e, reason: collision with root package name */
    public static int f4201e = -200;

    /* renamed from: f, reason: collision with root package name */
    public static int f4202f = -300;
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4203b;

    public d4(int i10, String str) {
        this.a = i10;
        this.f4203b = str;
    }

    public int a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinConsentFlowErrorImpl{code=");
        sb2.append(this.a);
        sb2.append(", message='");
        return vd.e.h(sb2, this.f4203b, "'}");
    }
}
