package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class we {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f27718b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final we f27719c = a("ar");
    public static final we d = a("ttdasi_ms");

    /* renamed from: a, reason: collision with root package name */
    private String f27720a;

    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        Object mo8a(Object obj);
    }

    private we(String str) {
        this.f27720a = str;
    }

    public String a() {
        return this.f27720a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (!weVar.a(this)) {
            return false;
        }
        String a2 = a();
        String a3 = weVar.a();
        return a2 != null ? a2.equals(a3) : a3 == null;
    }

    public int hashCode() {
        String a2 = a();
        return (a2 == null ? 43 : a2.hashCode()) + 59;
    }

    public String toString() {
        return this.f27720a;
    }

    public boolean a(Object obj) {
        return obj instanceof we;
    }

    private static we a(String str) {
        Set set = f27718b;
        if (!set.contains(str)) {
            set.add(str);
            return new we(str);
        }
        throw new IllegalArgumentException(androidx.compose.ui.platform.j.b("Key has already been used: ", str));
    }
}
