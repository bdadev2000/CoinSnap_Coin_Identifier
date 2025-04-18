package com.applovin.impl;

/* loaded from: classes2.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27817a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27818b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27819c;
    private final String d;
    private final String e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27820f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f27821g;

    public x0(String str) {
        this(str, -1);
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f27817a;
    }

    public String c() {
        return this.f27818b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f27819c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (!x0Var.a(this)) {
            return false;
        }
        String b2 = b();
        String b3 = x0Var.b();
        if (b2 != null ? !b2.equals(b3) : b3 != null) {
            return false;
        }
        String c2 = c();
        String c3 = x0Var.c();
        if (c2 != null ? !c2.equals(c3) : c3 != null) {
            return false;
        }
        String e = e();
        String e2 = x0Var.e();
        if (e != null ? !e.equals(e2) : e2 != null) {
            return false;
        }
        String a2 = a();
        String a3 = x0Var.a();
        return a2 != null ? a2.equals(a3) : a3 == null;
    }

    public int f() {
        return this.f27820f;
    }

    public boolean g() {
        return this.f27817a.equals("applovin.com");
    }

    public boolean h() {
        return this.f27821g;
    }

    public int hashCode() {
        String b2 = b();
        int hashCode = b2 == null ? 43 : b2.hashCode();
        String c2 = c();
        int hashCode2 = ((hashCode + 59) * 59) + (c2 == null ? 43 : c2.hashCode());
        String e = e();
        int hashCode3 = (hashCode2 * 59) + (e == null ? 43 : e.hashCode());
        String a2 = a();
        return (hashCode3 * 59) + (a2 != null ? a2.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public x0(String str, int i2) {
        this.e = str;
        this.f27820f = i2;
        String[] split = str.split(",");
        boolean z2 = split.length == 3 || split.length == 4;
        this.f27821g = z2;
        if (z2) {
            this.f27817a = a(split[0]);
            this.f27818b = a(split[1]);
            this.f27819c = a(split[2]);
            this.d = split.length == 4 ? a(split[3]) : "";
            return;
        }
        this.f27817a = "";
        this.f27818b = "";
        this.f27819c = "";
        this.d = "";
    }

    public boolean a(Object obj) {
        return obj instanceof x0;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }
}
