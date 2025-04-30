package com.applovin.impl;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class iq {

    /* renamed from: a, reason: collision with root package name */
    private final String f8339a;
    private final String b;

    private iq(String str, String str2) {
        this.f8339a = str;
        this.b = str2;
    }

    public static iq a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            try {
                return new iq((String) fsVar.a().get("apiFramework"), fsVar.d());
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastJavaScriptResource", "Error occurred while initializing", th);
                }
                kVar.B().a("VastJavaScriptResource", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iq iqVar = (iq) obj;
        String str = this.f8339a;
        if (str == null ? iqVar.f8339a != null : !str.equals(iqVar.f8339a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = iqVar.b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        String str = this.f8339a;
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
        return i11 + i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb.append(this.f8339a);
        sb.append("', javascriptResourceUrl='");
        return AbstractC2914a.h(sb, this.b, "'}");
    }

    public String a() {
        return this.f8339a;
    }
}
