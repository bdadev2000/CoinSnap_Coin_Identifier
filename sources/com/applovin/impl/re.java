package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class re {
    private static final Set b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final re f10488c = a("ar");

    /* renamed from: d, reason: collision with root package name */
    public static final re f10489d = a("ttdasi_ms");

    /* renamed from: a, reason: collision with root package name */
    private String f10490a;

    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Object mo0a(Object obj);
    }

    private re(String str) {
        this.f10490a = str;
    }

    public boolean a(Object obj) {
        return obj instanceof re;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        if (!reVar.a(this)) {
            return false;
        }
        String a6 = a();
        String a9 = reVar.a();
        if (a6 != null ? a6.equals(a9) : a9 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String a6 = a();
        if (a6 == null) {
            hashCode = 43;
        } else {
            hashCode = a6.hashCode();
        }
        return hashCode + 59;
    }

    public String toString() {
        return this.f10490a;
    }

    public String a() {
        return this.f10490a;
    }

    private static re a(String str) {
        Set set = b;
        if (!set.contains(str)) {
            set.add(str);
            return new re(str);
        }
        throw new IllegalArgumentException(AbstractC2914a.d("Key has already been used: ", str));
    }
}
