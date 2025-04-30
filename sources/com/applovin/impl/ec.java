package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ec implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f7410a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7411c;

    /* renamed from: d, reason: collision with root package name */
    private final fe f7412d;

    public ec(String str, String str2, boolean z8, fe feVar) {
        this.f7410a = str;
        this.b = str2;
        this.f7411c = z8;
        this.f7412d = feVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ec ecVar) {
        return this.b.compareToIgnoreCase(ecVar.b);
    }

    public List b() {
        List l = this.f7412d.l();
        if (l != null && !l.isEmpty()) {
            return l;
        }
        return Collections.singletonList(this.f7410a);
    }

    public String c() {
        return this.f7410a;
    }

    public fe d() {
        return this.f7412d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ec ecVar = (ec) obj;
        String str = this.f7410a;
        if (str == null ? ecVar.f7410a != null : !str.equals(ecVar.f7410a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? ecVar.b != null : !str2.equals(ecVar.b)) {
            return false;
        }
        if (this.f7411c == ecVar.f7411c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        String str = this.f7410a;
        int i10 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = i9 * 31;
        String str2 = this.b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((i11 + i10) * 31) + (this.f7411c ? 1 : 0);
    }

    public String a() {
        return this.b;
    }
}
