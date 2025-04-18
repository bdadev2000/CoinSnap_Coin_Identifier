package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class re {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f7354b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final re f7355c = a("ar");

    /* renamed from: d, reason: collision with root package name */
    public static final re f7356d = a("ttdasi_ms");
    private String a;

    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Object mo2a(Object obj);
    }

    private re(String str) {
        this.a = str;
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
        String a10 = a();
        String a11 = reVar.a();
        return a10 != null ? a10.equals(a11) : a11 == null;
    }

    public int hashCode() {
        String a10 = a();
        return (a10 == null ? 43 : a10.hashCode()) + 59;
    }

    public String toString() {
        return this.a;
    }

    public String a() {
        return this.a;
    }

    private static re a(String str) {
        Set set = f7354b;
        if (!set.contains(str)) {
            set.add(str);
            return new re(str);
        }
        throw new IllegalArgumentException(vd.e.e("Key has already been used: ", str));
    }
}
