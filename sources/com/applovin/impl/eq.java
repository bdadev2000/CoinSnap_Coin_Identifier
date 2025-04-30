package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class eq {

    /* renamed from: a, reason: collision with root package name */
    private int f7480a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f7481c;

    /* renamed from: d, reason: collision with root package name */
    private jq f7482d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f7483e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f7484f = new HashMap();

    private eq() {
    }

    public static eq a(fs fsVar, eq eqVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        fs c9;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            if (eqVar == null) {
                try {
                    eqVar = new eq();
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastCompanionAd", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastCompanionAd", th);
                    return null;
                }
            }
            if (eqVar.f7480a == 0 && eqVar.b == 0) {
                int parseInt = StringUtils.parseInt((String) fsVar.a().get("width"));
                int parseInt2 = StringUtils.parseInt((String) fsVar.a().get("height"));
                if (parseInt > 0 && parseInt2 > 0) {
                    eqVar.f7480a = parseInt;
                    eqVar.b = parseInt2;
                }
            }
            eqVar.f7482d = jq.a(fsVar, eqVar.f7482d, kVar);
            if (eqVar.f7481c == null && (c9 = fsVar.c("CompanionClickThrough")) != null) {
                String d2 = c9.d();
                if (StringUtils.isValidString(d2)) {
                    eqVar.f7481c = Uri.parse(d2);
                }
            }
            nq.a(fsVar.a("CompanionClickTracking"), eqVar.f7483e, fqVar, kVar);
            nq.a(fsVar, eqVar.f7484f, fqVar, kVar);
            return eqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.f7481c;
    }

    public Map c() {
        return this.f7484f;
    }

    public jq d() {
        return this.f7482d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        if (this.f7480a != eqVar.f7480a || this.b != eqVar.b) {
            return false;
        }
        Uri uri = this.f7481c;
        if (uri == null ? eqVar.f7481c != null : !uri.equals(eqVar.f7481c)) {
            return false;
        }
        jq jqVar = this.f7482d;
        if (jqVar == null ? eqVar.f7482d != null : !jqVar.equals(eqVar.f7482d)) {
            return false;
        }
        Set set = this.f7483e;
        if (set == null ? eqVar.f7483e != null : !set.equals(eqVar.f7483e)) {
            return false;
        }
        Map map = this.f7484f;
        Map map2 = eqVar.f7484f;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10;
        int i11;
        int i12 = ((this.f7480a * 31) + this.b) * 31;
        Uri uri = this.f7481c;
        int i13 = 0;
        if (uri != null) {
            i9 = uri.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (i12 + i9) * 31;
        jq jqVar = this.f7482d;
        if (jqVar != null) {
            i10 = jqVar.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        Set set = this.f7483e;
        if (set != null) {
            i11 = set.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        Map map = this.f7484f;
        if (map != null) {
            i13 = map.hashCode();
        }
        return i16 + i13;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f7480a + ", height=" + this.b + ", destinationUri=" + this.f7481c + ", nonVideoResource=" + this.f7482d + ", clickTrackers=" + this.f7483e + ", eventTrackers=" + this.f7484f + '}';
    }

    public Set a() {
        return this.f7483e;
    }
}
