package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.concurrent.TimeUnit;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class lq {

    /* renamed from: a, reason: collision with root package name */
    private String f8868a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f8869c;

    /* renamed from: d, reason: collision with root package name */
    private long f8870d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f8871e = -1;

    private lq() {
    }

    public static lq a(fs fsVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        List<String> explode;
        int size;
        long seconds;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            try {
                String d2 = fsVar.d();
                if (StringUtils.isValidString(d2)) {
                    lq lqVar = new lq();
                    lqVar.f8869c = d2;
                    lqVar.f8868a = (String) fsVar.a().get("id");
                    lqVar.b = (String) fsVar.a().get(NotificationCompat.CATEGORY_EVENT);
                    lqVar.f8871e = a(lqVar.a(), fqVar);
                    String str = (String) fsVar.a().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            lqVar.f8871e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = (explode = CollectionUtils.explode(trim, ":")).size()) > 0) {
                            int i9 = size - 1;
                            long j7 = 0;
                            for (int i10 = i9; i10 >= 0; i10--) {
                                String str2 = explode.get(i10);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i10 == i9) {
                                        seconds = parseInt;
                                    } else if (i10 == size - 2) {
                                        seconds = TimeUnit.MINUTES.toSeconds(parseInt);
                                    } else if (i10 == size - 3) {
                                        seconds = TimeUnit.HOURS.toSeconds(parseInt);
                                    }
                                    j7 += seconds;
                                }
                            }
                            lqVar.f8870d = j7;
                            lqVar.f8871e = -1;
                        }
                    }
                    return lqVar;
                }
                kVar.L();
                if (!com.applovin.impl.sdk.t.a()) {
                    return null;
                }
                kVar.L().b("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastTracker", "Error occurred while initializing", th);
                }
                kVar.B().a("VastTracker", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.f8869c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        if (this.f8870d != lqVar.f8870d || this.f8871e != lqVar.f8871e) {
            return false;
        }
        String str = this.f8868a;
        if (str == null ? lqVar.f8868a != null : !str.equals(lqVar.f8868a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? lqVar.b != null : !str2.equals(lqVar.b)) {
            return false;
        }
        return this.f8869c.equals(lqVar.f8869c);
    }

    public int hashCode() {
        int i9;
        String str = this.f8868a;
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
        int b = AbstractC2914a.b((i11 + i10) * 31, 31, this.f8869c);
        long j7 = this.f8870d;
        return ((b + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f8871e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastTracker{identifier='");
        sb.append(this.f8868a);
        sb.append("', event='");
        sb.append(this.b);
        sb.append("', uriString='");
        sb.append(this.f8869c);
        sb.append("', offsetSeconds=");
        sb.append(this.f8870d);
        sb.append(", offsetPercent=");
        return com.mbridge.msdk.foundation.entity.o.l(sb, this.f8871e, '}');
    }

    public String a() {
        return this.b;
    }

    public boolean a(long j7, int i9) {
        long j9 = this.f8870d;
        boolean z8 = j9 >= 0;
        boolean z9 = j7 >= j9;
        int i10 = this.f8871e;
        return (z8 && z9) || ((i10 >= 0) && (i9 >= i10));
    }

    private static int a(String str, fq fqVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equalsIgnoreCase(str)) {
            return -1;
        }
        if (fqVar != null) {
            return fqVar.g();
        }
        return 95;
    }
}
