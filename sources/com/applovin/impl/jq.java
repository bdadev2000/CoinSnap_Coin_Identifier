package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;

/* loaded from: classes.dex */
public class jq {

    /* renamed from: a, reason: collision with root package name */
    private String f24737a;

    /* renamed from: b, reason: collision with root package name */
    private String f24738b;

    private jq() {
    }

    public static jq a(es esVar, jq jqVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (jqVar == null) {
            try {
                jqVar = new jq();
            } catch (Throwable th) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("VastSystemInfo", "Error occurred while initializing", th);
                }
                jVar.E().a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(jqVar.f24737a)) {
            String d = esVar.d();
            if (StringUtils.isValidString(d)) {
                jqVar.f24737a = d;
            }
        }
        if (!StringUtils.isValidString(jqVar.f24738b)) {
            String str = (String) esVar.a().get("version");
            if (StringUtils.isValidString(str)) {
                jqVar.f24738b = str;
            }
        }
        return jqVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return false;
        }
        jq jqVar = (jq) obj;
        String str = this.f24737a;
        if (str == null ? jqVar.f24737a != null : !str.equals(jqVar.f24737a)) {
            return false;
        }
        String str2 = this.f24738b;
        String str3 = jqVar.f24738b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f24737a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24738b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastSystemInfo{name='");
        sb.append(this.f24737a);
        sb.append("', version='");
        return android.support.v4.media.d.r(sb, this.f24738b, "'}");
    }
}
