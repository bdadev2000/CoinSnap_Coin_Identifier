package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class dq {

    /* renamed from: a, reason: collision with root package name */
    private final List f7361a;

    private dq(List list) {
        this.f7361a = list;
    }

    public static dq a(fs fsVar, dq dqVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        List arrayList;
        try {
            if (dqVar != null) {
                arrayList = dqVar.a();
            } else {
                arrayList = new ArrayList();
            }
            Iterator it = fsVar.a("Verification").iterator();
            while (it.hasNext()) {
                cq a6 = cq.a((fs) it.next(), fqVar, kVar);
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
            return new dq(arrayList);
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            kVar.B().a("VastAdVerifications", th);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        return this.f7361a.equals(((dq) obj).f7361a);
    }

    public int hashCode() {
        return this.f7361a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f7361a + "'}";
    }

    public List a() {
        return this.f7361a;
    }
}
