package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
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
public class oq {
    private List b;

    /* renamed from: c */
    private int f9956c;

    /* renamed from: d */
    private Uri f9957d;

    /* renamed from: f */
    private hq f9959f;

    /* renamed from: a */
    private List f9955a = Collections.emptyList();

    /* renamed from: e */
    private final Set f9958e = new HashSet();

    /* renamed from: g */
    private final Map f9960g = new HashMap();

    private oq(fq fqVar) {
        this.b = Collections.emptyList();
        this.b = fqVar.f();
    }

    public static oq a(fs fsVar, oq oqVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        fs c9;
        hq a6;
        List a9;
        fs c10;
        List a10;
        fs c11;
        int a11;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (fqVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (kVar != null) {
            if (oqVar == null) {
                try {
                    oqVar = new oq(fqVar);
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastVideoCreative", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastVideoCreative", th);
                    return null;
                }
            }
            if (oqVar.f9956c == 0 && (c11 = fsVar.c("Duration")) != null && (a11 = a(c11.d(), kVar)) > 0) {
                oqVar.f9956c = a11;
            }
            fs c12 = fsVar.c("MediaFiles");
            if (c12 != null && (a10 = a(c12, kVar)) != null && a10.size() > 0) {
                List list = oqVar.f9955a;
                if (list != null) {
                    a10.addAll(list);
                }
                oqVar.f9955a = a10;
            }
            fs c13 = fsVar.c("VideoClicks");
            if (c13 != null) {
                if (oqVar.f9957d == null && (c10 = c13.c("ClickThrough")) != null) {
                    String d2 = c10.d();
                    if (StringUtils.isValidString(d2)) {
                        oqVar.f9957d = Uri.parse(d2);
                    }
                }
                nq.a(c13.a("ClickTracking"), oqVar.f9958e, fqVar, kVar);
            }
            fs c14 = fsVar.c("Icons");
            if (c14 != null && (a6 = hq.a((c9 = c14.c("Icon")), kVar)) != null) {
                fs c15 = c9.c("IconClicks");
                if (c15 != null && (a9 = c15.a("IconClickTracking")) != null) {
                    nq.a(a9, a6.f8173a, fqVar, kVar);
                }
                List a12 = c9.a("IconViewTracking");
                if (a12 != null) {
                    nq.a(a12, a6.b, fqVar, kVar);
                }
                oqVar.f9959f = a6;
            }
            nq.a(fsVar, oqVar.f9960g, fqVar, kVar);
            return oqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public int c() {
        return this.f9956c;
    }

    public Map d() {
        return this.f9960g;
    }

    public hq e() {
        return this.f9959f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        if (this.f9956c != oqVar.f9956c) {
            return false;
        }
        List list = this.f9955a;
        if (list == null ? oqVar.f9955a != null : !list.equals(oqVar.f9955a)) {
            return false;
        }
        Uri uri = this.f9957d;
        if (uri == null ? oqVar.f9957d != null : !uri.equals(oqVar.f9957d)) {
            return false;
        }
        Set set = this.f9958e;
        if (set == null ? oqVar.f9958e != null : !set.equals(oqVar.f9958e)) {
            return false;
        }
        Map map = this.f9960g;
        Map map2 = oqVar.f9960g;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public List f() {
        return this.f9955a;
    }

    public int hashCode() {
        int i9;
        int i10;
        int i11;
        List list = this.f9955a;
        int i12 = 0;
        if (list != null) {
            i9 = list.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = ((i9 * 31) + this.f9956c) * 31;
        Uri uri = this.f9957d;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        Set set = this.f9958e;
        if (set != null) {
            i11 = set.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Map map = this.f9960g;
        if (map != null) {
            i12 = map.hashCode();
        }
        return i15 + i12;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f9955a + ", durationSeconds=" + this.f9956c + ", destinationUri=" + this.f9957d + ", clickTrackers=" + this.f9958e + ", eventTrackers=" + this.f9960g + ", industryIcon=" + this.f9959f + '}';
    }

    public Uri b() {
        return this.f9957d;
    }

    public Set a() {
        return this.f9958e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public pq a(long j7) {
        List list = this.f9955a;
        pq pqVar = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.b) {
            for (pq pqVar2 : this.f9955a) {
                String b = pqVar2.b();
                if (StringUtils.isValidString(b) && str.equalsIgnoreCase(b)) {
                    arrayList.add(pqVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList<pq> arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = this.f9955a;
        }
        Collections.sort(arrayList2, new X(9));
        for (pq pqVar3 : arrayList2) {
            if (pqVar3.a() > j7) {
                break;
            }
            pqVar = pqVar3;
        }
        return pqVar != null ? pqVar : (pq) arrayList2.get(0);
    }

    public static /* synthetic */ int a(pq pqVar, pq pqVar2) {
        return Long.compare(pqVar.a(), pqVar2.a());
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            if (CollectionUtils.explode(str, ":").size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        List a6 = fsVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a6.size());
        List<String> explode = CollectionUtils.explode((String) kVar.a(oj.f9673S4));
        List<String> explode2 = CollectionUtils.explode((String) kVar.a(oj.R4));
        Iterator it = a6.iterator();
        while (it.hasNext()) {
            pq a9 = pq.a((fs) it.next(), kVar);
            if (a9 != null) {
                try {
                    String b = a9.b();
                    if (StringUtils.isValidString(b) && !explode.contains(b)) {
                        arrayList.add(a9);
                    } else {
                        if (((Boolean) kVar.a(oj.f9679T4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a9.d().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a9);
                            }
                        }
                        kVar.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            kVar.L().k("VastVideoCreative", "Video file not supported: " + a9);
                        }
                    }
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastVideoCreative", "Failed to validate video file: " + a9, th);
                    }
                }
            }
        }
        return arrayList;
    }
}
