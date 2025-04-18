package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class dq {
    private final List a;

    private dq(List list) {
        this.a = list;
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
                cq a = cq.a((fs) it.next(), fqVar, kVar);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return new dq(arrayList);
        } catch (Throwable th2) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("VastAdVerifications", "Error occurred while initializing", th2);
            }
            kVar.B().a("VastAdVerifications", th2);
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
        return this.a.equals(((dq) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.a + "'}";
    }

    public List a() {
        return this.a;
    }
}
