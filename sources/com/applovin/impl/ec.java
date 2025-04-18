package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ec implements Comparable {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4438b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4439c;

    /* renamed from: d, reason: collision with root package name */
    private final fe f4440d;

    public ec(String str, String str2, boolean z10, fe feVar) {
        this.a = str;
        this.f4438b = str2;
        this.f4439c = z10;
        this.f4440d = feVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ec ecVar) {
        return this.f4438b.compareToIgnoreCase(ecVar.f4438b);
    }

    public List b() {
        List l10 = this.f4440d.l();
        if (l10 != null && !l10.isEmpty()) {
            return l10;
        }
        return Collections.singletonList(this.a);
    }

    public String c() {
        return this.a;
    }

    public fe d() {
        return this.f4440d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ec ecVar = (ec) obj;
        String str = this.a;
        if (str == null ? ecVar.a != null : !str.equals(ecVar.a)) {
            return false;
        }
        String str2 = this.f4438b;
        if (str2 == null ? ecVar.f4438b != null : !str2.equals(ecVar.f4438b)) {
            return false;
        }
        if (this.f4439c == ecVar.f4439c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f4438b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((i12 + i11) * 31) + (this.f4439c ? 1 : 0);
    }

    public String a() {
        return this.f4438b;
    }
}
