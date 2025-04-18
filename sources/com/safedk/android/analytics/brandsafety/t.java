package com.safedk.android.analytics.brandsafety;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private String f29767a;

    /* renamed from: b, reason: collision with root package name */
    private String f29768b;

    /* renamed from: c, reason: collision with root package name */
    private long f29769c;

    public String a() {
        return this.f29768b;
    }

    public void a(String str) {
        this.f29768b = str;
    }

    public long b() {
        return this.f29769c;
    }

    public void a(long j2) {
        this.f29769c = j2;
    }

    private t() {
        this.f29769c = 0L;
    }

    public t(String str, String str2, long j2) {
        this.f29769c = 0L;
        this.f29767a = str;
        this.f29768b = str2;
        this.f29769c = j2;
    }

    public String c() {
        return a(this.f29767a, this.f29769c);
    }

    public static String a(String str, long j2) {
        return str + "_" + j2;
    }
}
