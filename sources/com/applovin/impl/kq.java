package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class kq {

    /* renamed from: a, reason: collision with root package name */
    private String f24937a;

    /* renamed from: b, reason: collision with root package name */
    private String f24938b;

    /* renamed from: c, reason: collision with root package name */
    private String f24939c;
    private long d = -1;
    private int e = -1;

    private kq() {
    }

    public String a() {
        return this.f24938b;
    }

    public String b() {
        return this.f24939c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        if (this.d != kqVar.d || this.e != kqVar.e) {
            return false;
        }
        String str = this.f24937a;
        if (str == null ? kqVar.f24937a != null : !str.equals(kqVar.f24937a)) {
            return false;
        }
        String str2 = this.f24938b;
        if (str2 == null ? kqVar.f24938b == null : str2.equals(kqVar.f24938b)) {
            return this.f24939c.equals(kqVar.f24939c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24937a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24938b;
        int b2 = androidx.compose.foundation.text.input.a.b(this.f24939c, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        long j2 = this.d;
        return ((b2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastTracker{identifier='");
        sb.append(this.f24937a);
        sb.append("', event='");
        sb.append(this.f24938b);
        sb.append("', uriString='");
        sb.append(this.f24939c);
        sb.append("', offsetSeconds=");
        sb.append(this.d);
        sb.append(", offsetPercent=");
        return android.support.v4.media.d.o(sb, this.e, '}');
    }

    public boolean a(long j2, int i2) {
        long j3 = this.d;
        boolean z2 = j3 >= 0;
        boolean z3 = j2 >= j3;
        int i3 = this.e;
        return (z2 && z3) || ((i3 >= 0) && (i2 >= i3));
    }

    public static kq a(es esVar, eq eqVar, com.applovin.impl.sdk.j jVar) {
        List<String> explode;
        int size;
        long seconds;
        if (esVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            try {
                String d = esVar.d();
                if (StringUtils.isValidString(d)) {
                    kq kqVar = new kq();
                    kqVar.f24939c = d;
                    kqVar.f24937a = (String) esVar.a().get("id");
                    kqVar.f24938b = (String) esVar.a().get(MaxEvent.f29810a);
                    kqVar.e = a(kqVar.a(), eqVar);
                    String str = (String) esVar.a().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            kqVar.e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(CertificateUtil.DELIMITER) && (size = (explode = CollectionUtils.explode(trim, CertificateUtil.DELIMITER)).size()) > 0) {
                            int i2 = size - 1;
                            long j2 = 0;
                            for (int i3 = i2; i3 >= 0; i3--) {
                                String str2 = explode.get(i3);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i3 == i2) {
                                        seconds = parseInt;
                                    } else if (i3 == size - 2) {
                                        seconds = TimeUnit.MINUTES.toSeconds(parseInt);
                                    } else if (i3 == size - 3) {
                                        seconds = TimeUnit.HOURS.toSeconds(parseInt);
                                    }
                                    j2 += seconds;
                                }
                            }
                            kqVar.d = j2;
                            kqVar.e = -1;
                        }
                    }
                    return kqVar;
                }
                jVar.J();
                if (!com.applovin.impl.sdk.n.a()) {
                    return null;
                }
                jVar.J().b("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (Throwable th) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("VastTracker", "Error occurred while initializing", th);
                }
                jVar.E().a("VastTracker", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    private static int a(String str, eq eqVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (eqVar != null) {
            return eqVar.g();
        }
        return 95;
    }
}
