package com.applovin.impl;

/* loaded from: classes3.dex */
public class f4 {

    /* renamed from: c, reason: collision with root package name */
    public static int f23811c = -1;
    public static int d = -100;
    public static int e = -200;

    /* renamed from: f, reason: collision with root package name */
    public static int f23812f = -300;

    /* renamed from: a, reason: collision with root package name */
    private final int f23813a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23814b;

    public f4(int i2, String str) {
        this.f23813a = i2;
        this.f23814b = str;
    }

    public int a() {
        return this.f23813a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinConsentFlowErrorImpl{code=");
        sb.append(this.f23813a);
        sb.append(", message='");
        return android.support.v4.media.d.r(sb, this.f23814b, "'}");
    }
}
