package com.applovin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class cq {

    /* renamed from: a, reason: collision with root package name */
    private final String f7126a;
    private final List b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7127c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f7128d;

    private cq(String str, List list, String str2, Set set) {
        this.f7126a = str;
        this.b = list;
        this.f7127c = str2;
        this.f7128d = set;
    }

    public static cq a(fs fsVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) fsVar.a().get("vendor");
            fs b = fsVar.b("VerificationParameters");
            String d2 = b != null ? b.d() : null;
            List a6 = fsVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a6.size());
            Iterator it = a6.iterator();
            while (it.hasNext()) {
                iq a9 = iq.a((fs) it.next(), kVar);
                if (a9 != null) {
                    arrayList.add(a9);
                }
            }
            HashMap hashMap = new HashMap();
            nq.a(fsVar, hashMap, fqVar, kVar);
            return new cq(str, arrayList, d2, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("VastAdVerification", "Error occurred while initializing", th);
            }
            kVar.B().a("VastAdVerification", th);
            return null;
        }
    }

    public List b() {
        return this.b;
    }

    public String c() {
        return this.f7126a;
    }

    public String d() {
        return this.f7127c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cq cqVar = (cq) obj;
        String str = this.f7126a;
        if (str == null ? cqVar.f7126a != null : !str.equals(cqVar.f7126a)) {
            return false;
        }
        List list = this.b;
        if (list == null ? cqVar.b != null : !list.equals(cqVar.b)) {
            return false;
        }
        String str2 = this.f7127c;
        if (str2 == null ? cqVar.f7127c != null : !str2.equals(cqVar.f7127c)) {
            return false;
        }
        Set set = this.f7128d;
        Set set2 = cqVar.f7128d;
        if (set != null) {
            return set.equals(set2);
        }
        if (set2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10;
        int i11;
        String str = this.f7126a;
        int i12 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = i9 * 31;
        List list = this.b;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str2 = this.f7127c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Set set = this.f7128d;
        if (set != null) {
            i12 = set.hashCode();
        }
        return i15 + i12;
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f7126a + "'javascriptResources='" + this.b + "'verificationParameters='" + this.f7127c + "'errorEventTrackers='" + this.f7128d + "'}";
    }

    public Set a() {
        return this.f7128d;
    }
}
