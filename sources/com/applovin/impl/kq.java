package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;

/* loaded from: classes.dex */
public class kq {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f5777b;

    private kq() {
    }

    public static kq a(fs fsVar, kq kqVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar != null) {
            if (kVar != null) {
                if (kqVar == null) {
                    try {
                        kqVar = new kq();
                    } catch (Throwable th2) {
                        kVar.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            kVar.L().a("VastSystemInfo", "Error occurred while initializing", th2);
                        }
                        kVar.B().a("VastSystemInfo", th2);
                        return null;
                    }
                }
                if (!StringUtils.isValidString(kqVar.a)) {
                    String d10 = fsVar.d();
                    if (StringUtils.isValidString(d10)) {
                        kqVar.a = d10;
                    }
                }
                if (!StringUtils.isValidString(kqVar.f5777b)) {
                    String str = (String) fsVar.a().get("version");
                    if (StringUtils.isValidString(str)) {
                        kqVar.f5777b = str;
                    }
                }
                return kqVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        String str = this.a;
        if (str == null ? kqVar.a != null : !str.equals(kqVar.a)) {
            return false;
        }
        String str2 = this.f5777b;
        String str3 = kqVar.f5777b;
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
        String str2 = this.f5777b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastSystemInfo{name='");
        sb2.append(this.a);
        sb2.append("', version='");
        return vd.e.h(sb2, this.f5777b, "'}");
    }
}
