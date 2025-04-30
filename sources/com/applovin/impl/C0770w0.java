package com.applovin.impl;

/* renamed from: com.applovin.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0770w0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f11849a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11850c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11851d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11852e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11853f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f11854g;

    public C0770w0(String str) {
        this(str, -1);
    }

    public boolean a(Object obj) {
        return obj instanceof C0770w0;
    }

    public String b() {
        return this.f11849a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f11852e;
    }

    public String e() {
        return this.f11850c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0770w0)) {
            return false;
        }
        C0770w0 c0770w0 = (C0770w0) obj;
        if (!c0770w0.a(this)) {
            return false;
        }
        String b = b();
        String b8 = c0770w0.b();
        if (b != null ? !b.equals(b8) : b8 != null) {
            return false;
        }
        String c9 = c();
        String c10 = c0770w0.c();
        if (c9 != null ? !c9.equals(c10) : c10 != null) {
            return false;
        }
        String e4 = e();
        String e9 = c0770w0.e();
        if (e4 != null ? !e4.equals(e9) : e9 != null) {
            return false;
        }
        String a6 = a();
        String a9 = c0770w0.a();
        if (a6 != null ? a6.equals(a9) : a9 == null) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f11853f;
    }

    public boolean g() {
        return this.f11849a.equals("applovin.com");
    }

    public boolean h() {
        return this.f11854g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String b = b();
        int i9 = 43;
        if (b == null) {
            hashCode = 43;
        } else {
            hashCode = b.hashCode();
        }
        String c9 = c();
        int i10 = (hashCode + 59) * 59;
        if (c9 == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = c9.hashCode();
        }
        int i11 = i10 + hashCode2;
        String e4 = e();
        int i12 = i11 * 59;
        if (e4 == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = e4.hashCode();
        }
        int i13 = i12 + hashCode3;
        String a6 = a();
        int i14 = i13 * 59;
        if (a6 != null) {
            i9 = a6.hashCode();
        }
        return i14 + i9;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public C0770w0(String str, int i9) {
        this.f11852e = str;
        this.f11853f = i9;
        String[] split = str.split(",");
        boolean z8 = split.length == 3 || split.length == 4;
        this.f11854g = z8;
        if (z8) {
            this.f11849a = a(split[0]);
            this.b = a(split[1]);
            this.f11850c = a(split[2]);
            this.f11851d = split.length == 4 ? a(split[3]) : "";
            return;
        }
        this.f11849a = "";
        this.b = "";
        this.f11850c = "";
        this.f11851d = "";
    }

    public String a() {
        return this.f11851d;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }
}
