package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class dq {

    /* renamed from: a, reason: collision with root package name */
    private int f23529a;

    /* renamed from: b, reason: collision with root package name */
    private int f23530b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f23531c;
    private iq d;
    private final Set e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f23532f = new HashMap();

    private dq() {
    }

    public Set a() {
        return this.e;
    }

    public Uri b() {
        return this.f23531c;
    }

    public Map c() {
        return this.f23532f;
    }

    public iq d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj;
        if (this.f23529a != dqVar.f23529a || this.f23530b != dqVar.f23530b) {
            return false;
        }
        Uri uri = this.f23531c;
        if (uri == null ? dqVar.f23531c != null : !uri.equals(dqVar.f23531c)) {
            return false;
        }
        iq iqVar = this.d;
        if (iqVar == null ? dqVar.d != null : !iqVar.equals(dqVar.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? dqVar.e != null : !set.equals(dqVar.e)) {
            return false;
        }
        Map map = this.f23532f;
        Map map2 = dqVar.f23532f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i2 = ((this.f23529a * 31) + this.f23530b) * 31;
        Uri uri = this.f23531c;
        int hashCode = (i2 + (uri != null ? uri.hashCode() : 0)) * 31;
        iq iqVar = this.d;
        int hashCode2 = (hashCode + (iqVar != null ? iqVar.hashCode() : 0)) * 31;
        Set set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f23532f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f23529a + ", height=" + this.f23530b + ", destinationUri=" + this.f23531c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f23532f + '}';
    }

    public static dq a(es esVar, dq dqVar, eq eqVar, com.applovin.impl.sdk.j jVar) {
        es c2;
        if (esVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            if (dqVar == null) {
                try {
                    dqVar = new dq();
                } catch (Throwable th) {
                    jVar.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.J().a("VastCompanionAd", "Error occurred while initializing", th);
                    }
                    jVar.E().a("VastCompanionAd", th);
                    return null;
                }
            }
            if (dqVar.f23529a == 0 && dqVar.f23530b == 0) {
                int parseInt = StringUtils.parseInt((String) esVar.a().get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
                int parseInt2 = StringUtils.parseInt((String) esVar.a().get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
                if (parseInt > 0 && parseInt2 > 0) {
                    dqVar.f23529a = parseInt;
                    dqVar.f23530b = parseInt2;
                }
            }
            dqVar.d = iq.a(esVar, dqVar.d, jVar);
            if (dqVar.f23531c == null && (c2 = esVar.c("CompanionClickThrough")) != null) {
                String d = c2.d();
                if (StringUtils.isValidString(d)) {
                    dqVar.f23531c = Uri.parse(d);
                }
            }
            mq.a(esVar.a("CompanionClickTracking"), dqVar.e, eqVar, jVar);
            mq.a(esVar, dqVar.f23532f, eqVar, jVar);
            return dqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }
}
