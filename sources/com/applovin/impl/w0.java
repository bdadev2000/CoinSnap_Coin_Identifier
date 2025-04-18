package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27655a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27656b;

    public w0(Map map, List list) {
        this.f27655a = map;
        this.f27656b = list;
    }

    public Map a() {
        return this.f27655a;
    }

    public List b() {
        return this.f27656b;
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
        Map a2 = a();
        Map a3 = w0Var.a();
        if (a2 != null ? !a2.equals(a3) : a3 != null) {
            return false;
        }
        List b2 = b();
        List b3 = w0Var.b();
        return b2 != null ? b2.equals(b3) : b3 == null;
    }

    public int hashCode() {
        Map a2 = a();
        int hashCode = a2 == null ? 43 : a2.hashCode();
        List b2 = b();
        return ((hashCode + 59) * 59) + (b2 != null ? b2.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public boolean a(Object obj) {
        return obj instanceof w0;
    }
}
