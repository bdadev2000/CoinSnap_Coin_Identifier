package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class cq {

    /* renamed from: a, reason: collision with root package name */
    private final List f23370a;

    private cq(List list) {
        this.f23370a = list;
    }

    public List a() {
        return this.f23370a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cq) {
            return this.f23370a.equals(((cq) obj).f23370a);
        }
        return false;
    }

    public int hashCode() {
        return this.f23370a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f23370a + "'}";
    }

    public static cq a(es esVar, cq cqVar, eq eqVar, com.applovin.impl.sdk.j jVar) {
        List arrayList;
        try {
            if (cqVar != null) {
                arrayList = cqVar.a();
            } else {
                arrayList = new ArrayList();
            }
            Iterator it = esVar.a("Verification").iterator();
            while (it.hasNext()) {
                bq a2 = bq.a((es) it.next(), eqVar, jVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return new cq(arrayList);
        } catch (Throwable th) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            jVar.E().a("VastAdVerifications", th);
            return null;
        }
    }
}
