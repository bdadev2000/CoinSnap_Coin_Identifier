package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class lq {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f5905b;

    /* renamed from: c, reason: collision with root package name */
    private String f5906c;

    /* renamed from: d, reason: collision with root package name */
    private long f5907d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f5908e = -1;

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
                String d10 = fsVar.d();
                if (StringUtils.isValidString(d10)) {
                    lq lqVar = new lq();
                    lqVar.f5906c = d10;
                    lqVar.a = (String) fsVar.a().get("id");
                    lqVar.f5905b = (String) fsVar.a().get(NotificationCompat.CATEGORY_EVENT);
                    lqVar.f5908e = a(lqVar.a(), fqVar);
                    String str = (String) fsVar.a().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            lqVar.f5908e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = (explode = CollectionUtils.explode(trim, ":")).size()) > 0) {
                            int i10 = size - 1;
                            long j3 = 0;
                            for (int i11 = i10; i11 >= 0; i11--) {
                                String str2 = explode.get(i11);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i11 == i10) {
                                        seconds = parseInt;
                                    } else if (i11 == size - 2) {
                                        seconds = TimeUnit.MINUTES.toSeconds(parseInt);
                                    } else if (i11 == size - 3) {
                                        seconds = TimeUnit.HOURS.toSeconds(parseInt);
                                    }
                                    j3 += seconds;
                                }
                            }
                            lqVar.f5907d = j3;
                            lqVar.f5908e = -1;
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
            } catch (Throwable th2) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastTracker", "Error occurred while initializing", th2);
                }
                kVar.B().a("VastTracker", th2);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.f5906c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        if (this.f5907d != lqVar.f5907d || this.f5908e != lqVar.f5908e) {
            return false;
        }
        String str = this.a;
        if (str == null ? lqVar.a != null : !str.equals(lqVar.a)) {
            return false;
        }
        String str2 = this.f5905b;
        if (str2 == null ? lqVar.f5905b != null : !str2.equals(lqVar.f5905b)) {
            return false;
        }
        return this.f5906c.equals(lqVar.f5906c);
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
        String str2 = this.f5905b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        int c10 = vd.e.c(this.f5906c, (i12 + i11) * 31, 31);
        long j3 = this.f5907d;
        return ((c10 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f5908e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastTracker{identifier='");
        sb2.append(this.a);
        sb2.append("', event='");
        sb2.append(this.f5905b);
        sb2.append("', uriString='");
        sb2.append(this.f5906c);
        sb2.append("', offsetSeconds=");
        sb2.append(this.f5907d);
        sb2.append(", offsetPercent=");
        return a4.j.i(sb2, this.f5908e, AbstractJsonLexerKt.END_OBJ);
    }

    public String a() {
        return this.f5905b;
    }

    public boolean a(long j3, int i10) {
        long j10 = this.f5907d;
        boolean z10 = j10 >= 0;
        boolean z11 = j3 >= j10;
        int i11 = this.f5908e;
        boolean z12 = i11 >= 0;
        boolean z13 = i10 >= i11;
        if (z10 && z11) {
            return true;
        }
        return z12 && z13;
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
