package com.applovin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class cq {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final List f4136b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4137c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f4138d;

    private cq(String str, List list, String str2, Set set) {
        this.a = str;
        this.f4136b = list;
        this.f4137c = str2;
        this.f4138d = set;
    }

    public static cq a(fs fsVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) fsVar.a().get("vendor");
            fs b3 = fsVar.b("VerificationParameters");
            String d10 = b3 != null ? b3.d() : null;
            List a = fsVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a.size());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                iq a10 = iq.a((fs) it.next(), kVar);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            HashMap hashMap = new HashMap();
            nq.a(fsVar, hashMap, fqVar, kVar);
            return new cq(str, arrayList, d10, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th2) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("VastAdVerification", "Error occurred while initializing", th2);
            }
            kVar.B().a("VastAdVerification", th2);
            return null;
        }
    }

    public List b() {
        return this.f4136b;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.f4137c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cq cqVar = (cq) obj;
        String str = this.a;
        if (str == null ? cqVar.a != null : !str.equals(cqVar.a)) {
            return false;
        }
        List list = this.f4136b;
        if (list == null ? cqVar.f4136b != null : !list.equals(cqVar.f4136b)) {
            return false;
        }
        String str2 = this.f4137c;
        if (str2 == null ? cqVar.f4137c != null : !str2.equals(cqVar.f4137c)) {
            return false;
        }
        Set set = this.f4138d;
        Set set2 = cqVar.f4138d;
        if (set != null) {
            return set.equals(set2);
        }
        if (set2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        String str = this.a;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        List list = this.f4136b;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str2 = this.f4137c;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        Set set = this.f4138d;
        if (set != null) {
            i13 = set.hashCode();
        }
        return i16 + i13;
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.a + "'javascriptResources='" + this.f4136b + "'verificationParameters='" + this.f4137c + "'errorEventTrackers='" + this.f4138d + "'}";
    }

    public Set a() {
        return this.f4138d;
    }
}
