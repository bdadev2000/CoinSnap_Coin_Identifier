package com.applovin.impl;

/* loaded from: classes.dex */
public class iq {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5374b;

    private iq(String str, String str2) {
        this.a = str;
        this.f5374b = str2;
    }

    public static iq a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            try {
                return new iq((String) fsVar.a().get("apiFramework"), fsVar.d());
            } catch (Throwable th2) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastJavaScriptResource", "Error occurred while initializing", th2);
                }
                kVar.B().a("VastJavaScriptResource", th2);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.f5374b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iq iqVar = (iq) obj;
        String str = this.a;
        if (str == null ? iqVar.a != null : !str.equals(iqVar.a)) {
            return false;
        }
        String str2 = this.f5374b;
        String str3 = iqVar.f5374b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
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
        String str2 = this.f5374b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb2.append(this.a);
        sb2.append("', javascriptResourceUrl='");
        return vd.e.h(sb2, this.f5374b, "'}");
    }

    public String a() {
        return this.a;
    }
}
