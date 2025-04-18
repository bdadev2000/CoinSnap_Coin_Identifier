package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class jc implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f24663a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24664b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24665c;
    private final ke d;

    public jc(String str, String str2, boolean z2, ke keVar) {
        this.f24663a = str;
        this.f24664b = str2;
        this.f24665c = z2;
        this.d = keVar;
    }

    public String a() {
        return this.f24664b;
    }

    public List b() {
        List l2 = this.d.l();
        return (l2 == null || l2.isEmpty()) ? Collections.singletonList(this.f24663a) : l2;
    }

    public String c() {
        return this.f24663a;
    }

    public ke d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jc jcVar = (jc) obj;
        String str = this.f24663a;
        if (str == null ? jcVar.f24663a != null : !str.equals(jcVar.f24663a)) {
            return false;
        }
        String str2 = this.f24664b;
        if (str2 == null ? jcVar.f24664b == null : str2.equals(jcVar.f24664b)) {
            return this.f24665c == jcVar.f24665c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24663a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24664b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f24665c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jc jcVar) {
        return this.f24664b.compareToIgnoreCase(jcVar.f24664b);
    }
}
