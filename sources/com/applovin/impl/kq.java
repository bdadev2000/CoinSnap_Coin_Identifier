package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class kq {

    /* renamed from: a, reason: collision with root package name */
    private String f8754a;
    private String b;

    private kq() {
    }

    public static kq a(fs fsVar, kq kqVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar != null) {
            if (kVar != null) {
                if (kqVar == null) {
                    try {
                        kqVar = new kq();
                    } catch (Throwable th) {
                        kVar.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            kVar.L().a("VastSystemInfo", "Error occurred while initializing", th);
                        }
                        kVar.B().a("VastSystemInfo", th);
                        return null;
                    }
                }
                if (!StringUtils.isValidString(kqVar.f8754a)) {
                    String d2 = fsVar.d();
                    if (StringUtils.isValidString(d2)) {
                        kqVar.f8754a = d2;
                    }
                }
                if (!StringUtils.isValidString(kqVar.b)) {
                    String str = (String) fsVar.a().get("version");
                    if (StringUtils.isValidString(str)) {
                        kqVar.b = str;
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
        String str = this.f8754a;
        if (str == null ? kqVar.f8754a != null : !str.equals(kqVar.f8754a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = kqVar.b;
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
        String str = this.f8754a;
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
        StringBuilder sb = new StringBuilder("VastSystemInfo{name='");
        sb.append(this.f8754a);
        sb.append("', version='");
        return AbstractC2914a.h(sb, this.b, "'}");
    }
}
