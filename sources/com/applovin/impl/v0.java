package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class v0 {
    private final Map a;

    /* renamed from: b, reason: collision with root package name */
    private final List f8446b;

    public v0(Map map, List list) {
        this.a = map;
        this.f8446b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof v0;
    }

    public List b() {
        return this.f8446b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (!v0Var.a(this)) {
            return false;
        }
        Map a = a();
        Map a10 = v0Var.a();
        if (a != null ? !a.equals(a10) : a10 != null) {
            return false;
        }
        List b3 = b();
        List b10 = v0Var.b();
        return b3 != null ? b3.equals(b10) : b10 == null;
    }

    public int hashCode() {
        Map a = a();
        int hashCode = a == null ? 43 : a.hashCode();
        List b3 = b();
        return ((hashCode + 59) * 59) + (b3 != null ? b3.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.a;
    }
}
