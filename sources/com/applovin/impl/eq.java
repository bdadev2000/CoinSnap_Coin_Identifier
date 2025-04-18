package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class eq {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f4514b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f4515c;

    /* renamed from: d, reason: collision with root package name */
    private jq f4516d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f4517e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f4518f = new HashMap();

    private eq() {
    }

    public static eq a(fs fsVar, eq eqVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        fs c10;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            if (eqVar == null) {
                try {
                    eqVar = new eq();
                } catch (Throwable th2) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastCompanionAd", "Error occurred while initializing", th2);
                    }
                    kVar.B().a("VastCompanionAd", th2);
                    return null;
                }
            }
            if (eqVar.a == 0 && eqVar.f4514b == 0) {
                int parseInt = StringUtils.parseInt((String) fsVar.a().get("width"));
                int parseInt2 = StringUtils.parseInt((String) fsVar.a().get("height"));
                if (parseInt > 0 && parseInt2 > 0) {
                    eqVar.a = parseInt;
                    eqVar.f4514b = parseInt2;
                }
            }
            eqVar.f4516d = jq.a(fsVar, eqVar.f4516d, kVar);
            if (eqVar.f4515c == null && (c10 = fsVar.c("CompanionClickThrough")) != null) {
                String d10 = c10.d();
                if (StringUtils.isValidString(d10)) {
                    eqVar.f4515c = Uri.parse(d10);
                }
            }
            nq.a(fsVar.a("CompanionClickTracking"), eqVar.f4517e, fqVar, kVar);
            nq.a(fsVar, eqVar.f4518f, fqVar, kVar);
            return eqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.f4515c;
    }

    public Map c() {
        return this.f4518f;
    }

    public jq d() {
        return this.f4516d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        if (this.a != eqVar.a || this.f4514b != eqVar.f4514b) {
            return false;
        }
        Uri uri = this.f4515c;
        if (uri == null ? eqVar.f4515c != null : !uri.equals(eqVar.f4515c)) {
            return false;
        }
        jq jqVar = this.f4516d;
        if (jqVar == null ? eqVar.f4516d != null : !jqVar.equals(eqVar.f4516d)) {
            return false;
        }
        Set set = this.f4517e;
        if (set == null ? eqVar.f4517e != null : !set.equals(eqVar.f4517e)) {
            return false;
        }
        Map map = this.f4518f;
        Map map2 = eqVar.f4518f;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.a * 31) + this.f4514b) * 31;
        Uri uri = this.f4515c;
        int i14 = 0;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i13 + i10) * 31;
        jq jqVar = this.f4516d;
        if (jqVar != null) {
            i11 = jqVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        Set set = this.f4517e;
        if (set != null) {
            i12 = set.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        Map map = this.f4518f;
        if (map != null) {
            i14 = map.hashCode();
        }
        return i17 + i14;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.a + ", height=" + this.f4514b + ", destinationUri=" + this.f4515c + ", nonVideoResource=" + this.f4516d + ", clickTrackers=" + this.f4517e + ", eventTrackers=" + this.f4518f + AbstractJsonLexerKt.END_OBJ;
    }

    public Set a() {
        return this.f4517e;
    }
}
