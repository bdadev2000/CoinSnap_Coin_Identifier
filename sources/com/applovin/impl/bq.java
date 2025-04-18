package com.applovin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class bq {

    /* renamed from: a, reason: collision with root package name */
    private final String f23160a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23161b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23162c;
    private final Set d;

    private bq(String str, List list, String str2, Set set) {
        this.f23160a = str;
        this.f23161b = list;
        this.f23162c = str2;
        this.d = set;
    }

    public Set a() {
        return this.d;
    }

    public List b() {
        return this.f23161b;
    }

    public String c() {
        return this.f23160a;
    }

    public String d() {
        return this.f23162c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bq bqVar = (bq) obj;
        String str = this.f23160a;
        if (str == null ? bqVar.f23160a != null : !str.equals(bqVar.f23160a)) {
            return false;
        }
        List list = this.f23161b;
        if (list == null ? bqVar.f23161b != null : !list.equals(bqVar.f23161b)) {
            return false;
        }
        String str2 = this.f23162c;
        if (str2 == null ? bqVar.f23162c != null : !str2.equals(bqVar.f23162c)) {
            return false;
        }
        Set set = this.d;
        Set set2 = bqVar.d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f23160a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f23161b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f23162c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f23160a + "'javascriptResources='" + this.f23161b + "'verificationParameters='" + this.f23162c + "'errorEventTrackers='" + this.d + "'}";
    }

    public static bq a(es esVar, eq eqVar, com.applovin.impl.sdk.j jVar) {
        try {
            String str = (String) esVar.a().get("vendor");
            es b2 = esVar.b("VerificationParameters");
            String d = b2 != null ? b2.d() : null;
            List a2 = esVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a2.size());
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                hq a3 = hq.a((es) it.next(), jVar);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            HashMap hashMap = new HashMap();
            mq.a(esVar, hashMap, eqVar, jVar);
            return new bq(str, arrayList, d, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().a("VastAdVerification", "Error occurred while initializing", th);
            }
            jVar.E().a("VastAdVerification", th);
            return null;
        }
    }
}
