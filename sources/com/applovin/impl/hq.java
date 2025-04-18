package com.applovin.impl;

/* loaded from: classes.dex */
public class hq {

    /* renamed from: a, reason: collision with root package name */
    private final String f24350a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24351b;

    private hq(String str, String str2) {
        this.f24350a = str;
        this.f24351b = str2;
    }

    public String a() {
        return this.f24350a;
    }

    public String b() {
        return this.f24351b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hq hqVar = (hq) obj;
        String str = this.f24350a;
        if (str == null ? hqVar.f24350a != null : !str.equals(hqVar.f24350a)) {
            return false;
        }
        String str2 = this.f24351b;
        String str3 = hqVar.f24351b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f24350a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24351b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb.append(this.f24350a);
        sb.append("', javascriptResourceUrl='");
        return android.support.v4.media.d.r(sb, this.f24351b, "'}");
    }

    public static hq a(es esVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            try {
                return new hq((String) esVar.a().get("apiFramework"), esVar.d());
            } catch (Throwable th) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("VastJavaScriptResource", "Error occurred while initializing", th);
                }
                jVar.E().a("VastJavaScriptResource", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }
}
