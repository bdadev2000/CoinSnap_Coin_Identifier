package com.applovin.impl;

/* loaded from: classes.dex */
public class w0 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8641b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8642c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8643d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8644e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8645f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8646g;

    public w0(String str) {
        this(str, -1);
    }

    public boolean a(Object obj) {
        return obj instanceof w0;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f8641b;
    }

    public String d() {
        return this.f8644e;
    }

    public String e() {
        return this.f8642c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (!w0Var.a(this)) {
            return false;
        }
        String b3 = b();
        String b10 = w0Var.b();
        if (b3 != null ? !b3.equals(b10) : b10 != null) {
            return false;
        }
        String c10 = c();
        String c11 = w0Var.c();
        if (c10 != null ? !c10.equals(c11) : c11 != null) {
            return false;
        }
        String e2 = e();
        String e10 = w0Var.e();
        if (e2 != null ? !e2.equals(e10) : e10 != null) {
            return false;
        }
        String a = a();
        String a10 = w0Var.a();
        return a != null ? a.equals(a10) : a10 == null;
    }

    public int f() {
        return this.f8645f;
    }

    public boolean g() {
        return this.a.equals("applovin.com");
    }

    public boolean h() {
        return this.f8646g;
    }

    public int hashCode() {
        String b3 = b();
        int hashCode = b3 == null ? 43 : b3.hashCode();
        String c10 = c();
        int hashCode2 = ((hashCode + 59) * 59) + (c10 == null ? 43 : c10.hashCode());
        String e2 = e();
        int hashCode3 = (hashCode2 * 59) + (e2 == null ? 43 : e2.hashCode());
        String a = a();
        return (hashCode3 * 59) + (a != null ? a.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public w0(String str, int i10) {
        this.f8644e = str;
        this.f8645f = i10;
        String[] split = str.split(",");
        boolean z10 = split.length == 3 || split.length == 4;
        this.f8646g = z10;
        if (z10) {
            this.a = a(split[0]);
            this.f8641b = a(split[1]);
            this.f8642c = a(split[2]);
            this.f8643d = split.length == 4 ? a(split[3]) : "";
            return;
        }
        this.a = "";
        this.f8641b = "";
        this.f8642c = "";
        this.f8643d = "";
    }

    public String a() {
        return this.f8643d;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }
}
