package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class nq {

    /* renamed from: b */
    private List f25782b;

    /* renamed from: c */
    private int f25783c;
    private Uri d;

    /* renamed from: f */
    private gq f25784f;

    /* renamed from: a */
    private List f25781a = Collections.emptyList();
    private final Set e = new HashSet();

    /* renamed from: g */
    private final Map f25785g = new HashMap();

    private nq(eq eqVar) {
        this.f25782b = Collections.emptyList();
        this.f25782b = eqVar.f();
    }

    public Set a() {
        return this.e;
    }

    public int c() {
        return this.f25783c;
    }

    public Map d() {
        return this.f25785g;
    }

    public gq e() {
        return this.f25784f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj;
        if (this.f25783c != nqVar.f25783c) {
            return false;
        }
        List list = this.f25781a;
        if (list == null ? nqVar.f25781a != null : !list.equals(nqVar.f25781a)) {
            return false;
        }
        Uri uri = this.d;
        if (uri == null ? nqVar.d != null : !uri.equals(nqVar.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? nqVar.e != null : !set.equals(nqVar.e)) {
            return false;
        }
        Map map = this.f25785g;
        Map map2 = nqVar.f25785g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public List f() {
        return this.f25781a;
    }

    public int hashCode() {
        List list = this.f25781a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f25783c) * 31;
        Uri uri = this.d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f25785g;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f25781a + ", durationSeconds=" + this.f25783c + ", destinationUri=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f25785g + ", industryIcon=" + this.f25784f + '}';
    }

    public static nq a(es esVar, nq nqVar, eq eqVar, com.applovin.impl.sdk.j jVar) {
        es c2;
        gq a2;
        List a3;
        es c3;
        List a4;
        es c4;
        int a5;
        if (esVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (eqVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (jVar != null) {
            if (nqVar == null) {
                try {
                    nqVar = new nq(eqVar);
                } catch (Throwable th) {
                    jVar.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.J().a("VastVideoCreative", "Error occurred while initializing", th);
                    }
                    jVar.E().a("VastVideoCreative", th);
                    return null;
                }
            }
            if (nqVar.f25783c == 0 && (c4 = esVar.c("Duration")) != null && (a5 = a(c4.d(), jVar)) > 0) {
                nqVar.f25783c = a5;
            }
            es c5 = esVar.c("MediaFiles");
            if (c5 != null && (a4 = a(c5, jVar)) != null && a4.size() > 0) {
                List list = nqVar.f25781a;
                if (list != null) {
                    a4.addAll(list);
                }
                nqVar.f25781a = a4;
            }
            es c6 = esVar.c("VideoClicks");
            if (c6 != null) {
                if (nqVar.d == null && (c3 = c6.c("ClickThrough")) != null) {
                    String d = c3.d();
                    if (StringUtils.isValidString(d)) {
                        nqVar.d = Uri.parse(d);
                    }
                }
                mq.a(c6.a("ClickTracking"), nqVar.e, eqVar, jVar);
            }
            es c7 = esVar.c("Icons");
            if (c7 != null && (a2 = gq.a((c2 = c7.c("Icon")), jVar)) != null) {
                es c8 = c2.c("IconClicks");
                if (c8 != null && (a3 = c8.a("IconClickTracking")) != null) {
                    mq.a(a3, a2.f24163a, eqVar, jVar);
                }
                List a6 = c2.a("IconViewTracking");
                if (a6 != null) {
                    mq.a(a6, a2.f24164b, eqVar, jVar);
                }
                nqVar.f25784f = a2;
            }
            mq.a(esVar, nqVar.f25785g, eqVar, jVar);
            return nqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public oq a(long j2) {
        List list = this.f25781a;
        oq oqVar = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f25782b) {
            for (oq oqVar2 : this.f25781a) {
                String b2 = oqVar2.b();
                if (StringUtils.isValidString(b2) && str.equalsIgnoreCase(b2)) {
                    arrayList.add(oqVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList<oq> arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = this.f25781a;
        }
        Collections.sort(arrayList2, new ns(9));
        for (oq oqVar3 : arrayList2) {
            if (oqVar3.a() > j2) {
                break;
            }
            oqVar = oqVar3;
        }
        return oqVar != null ? oqVar : (oq) arrayList2.get(0);
    }

    public static /* synthetic */ int a(oq oqVar, oq oqVar2) {
        return Long.compare(oqVar.a(), oqVar2.a());
    }

    private static int a(String str, com.applovin.impl.sdk.j jVar) {
        try {
            if (CollectionUtils.explode(str, CertificateUtil.DELIMITER).size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(es esVar, com.applovin.impl.sdk.j jVar) {
        List a2 = esVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a2.size());
        List<String> explode = CollectionUtils.explode((String) jVar.a(sj.W4));
        List<String> explode2 = CollectionUtils.explode((String) jVar.a(sj.V4));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            oq a3 = oq.a((es) it.next(), jVar);
            if (a3 != null) {
                try {
                    String b2 = a3.b();
                    if (StringUtils.isValidString(b2) && !explode.contains(b2)) {
                        arrayList.add(a3);
                    } else {
                        if (((Boolean) jVar.a(sj.X4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a3.d().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a3);
                            }
                        }
                        jVar.J();
                        if (com.applovin.impl.sdk.n.a()) {
                            jVar.J().k("VastVideoCreative", "Video file not supported: " + a3);
                        }
                    }
                } catch (Throwable th) {
                    jVar.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.J().a("VastVideoCreative", "Failed to validate video file: " + a3, th);
                    }
                }
            }
        }
        return arrayList;
    }
}
