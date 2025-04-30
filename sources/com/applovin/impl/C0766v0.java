package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0766v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11653a;
    private final List b;

    public C0766v0(Map map, List list) {
        this.f11653a = map;
        this.b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof C0766v0;
    }

    public List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0766v0)) {
            return false;
        }
        C0766v0 c0766v0 = (C0766v0) obj;
        if (!c0766v0.a(this)) {
            return false;
        }
        Map a6 = a();
        Map a9 = c0766v0.a();
        if (a6 != null ? !a6.equals(a9) : a9 != null) {
            return false;
        }
        List b = b();
        List b8 = c0766v0.b();
        if (b != null ? b.equals(b8) : b8 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Map a6 = a();
        int i9 = 43;
        if (a6 == null) {
            hashCode = 43;
        } else {
            hashCode = a6.hashCode();
        }
        List b = b();
        int i10 = (hashCode + 59) * 59;
        if (b != null) {
            i9 = b.hashCode();
        }
        return i10 + i9;
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.f11653a;
    }
}
