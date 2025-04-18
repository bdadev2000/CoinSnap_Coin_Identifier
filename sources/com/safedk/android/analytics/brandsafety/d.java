package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    private static final String f29644j = "AdInfoKey";

    /* renamed from: a, reason: collision with root package name */
    String f29645a;

    /* renamed from: b, reason: collision with root package name */
    String f29646b;

    /* renamed from: c, reason: collision with root package name */
    String f29647c;
    String d;
    String e;

    /* renamed from: f, reason: collision with root package name */
    BrandSafetyUtils.AdType f29648f;

    /* renamed from: g, reason: collision with root package name */
    String f29649g = null;

    /* renamed from: h, reason: collision with root package name */
    String f29650h = null;

    /* renamed from: i, reason: collision with root package name */
    boolean f29651i = false;

    public d(String str, String str2, String str3, String str4, String str5, BrandSafetyUtils.AdType adType) {
        this.f29645a = str;
        this.f29646b = str2;
        this.f29647c = str3;
        this.d = str4;
        this.e = str5;
        this.f29648f = adType;
    }

    private boolean a(BrandSafetyUtils.AdType adType) {
        return (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC) ? false : true;
    }

    public boolean equals(Object o2) {
        Logger.d(f29644j, "equals started with this: " + this + " and that: " + o2);
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        d dVar = (d) o2;
        boolean equals = this.f29645a.equals(dVar.f29645a);
        boolean z2 = this.f29646b != null && this.f29646b.equals(dVar.f29646b);
        boolean z3 = equals && this.d.equals(dVar.d) && ((this.e != null && this.e.equals(dVar.e)) || (this.e == null && dVar.e == null));
        if (this.f29647c != null) {
            z3 &= this.f29647c.equals(dVar.f29647c);
            String a2 = CreativeInfoManager.a(this.d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
            if (a2 != null && a2.contains(this.e) && !a(this.f29648f)) {
                Logger.d(f29644j, "not using placement id - equals result is: " + z3);
                return z3;
            }
        }
        return z3 && z2;
    }

    public int hashCode() {
        int hashCode = this.f29645a.hashCode() * this.d.hashCode();
        String a2 = CreativeInfoManager.a(this.d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        if (a(this.f29648f) || this.e == null || a2 == null || !a2.contains(this.e)) {
            hashCode *= this.f29646b.hashCode();
        }
        if (this.f29647c != null) {
            return hashCode * this.f29647c.hashCode();
        }
        return hashCode;
    }

    public String toString() {
        return "AdInfoKey{adUnitId=" + this.f29645a + ", placementId=" + this.f29646b + ", eventId=" + com.safedk.android.utils.k.b((Object) this.f29647c) + ", sdk=" + this.d + ", maxNetwork=" + com.safedk.android.utils.k.b((Object) this.e) + "}";
    }

    public String a() {
        return (this.f29645a != null ? this.f29645a : "") + "_" + (this.f29646b != null ? this.f29646b : "") + "_" + (this.f29647c != null ? this.f29647c : "") + "_" + (this.d != null ? this.d : "");
    }

    public boolean a(d dVar, CreativeInfo creativeInfo) {
        if (!dVar.equals(this)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f29646b)) {
            creativeInfo.h(dVar.f29646b);
            this.f29646b = dVar.f29646b;
        }
        return true;
    }
}
