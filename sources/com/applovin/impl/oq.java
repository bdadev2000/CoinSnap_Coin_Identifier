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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class oq {

    /* renamed from: b */
    private List f6869b;

    /* renamed from: c */
    private int f6870c;

    /* renamed from: d */
    private Uri f6871d;

    /* renamed from: f */
    private hq f6873f;
    private List a = Collections.emptyList();

    /* renamed from: e */
    private final Set f6872e = new HashSet();

    /* renamed from: g */
    private final Map f6874g = new HashMap();

    private oq(fq fqVar) {
        this.f6869b = Collections.emptyList();
        this.f6869b = fqVar.f();
    }

    public static oq a(fs fsVar, oq oqVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        fs c10;
        hq a;
        List a10;
        fs c11;
        List a11;
        fs c12;
        int a12;
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
                } catch (Throwable th2) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastVideoCreative", "Error occurred while initializing", th2);
                    }
                    kVar.B().a("VastVideoCreative", th2);
                    return null;
                }
            }
            if (oqVar.f6870c == 0 && (c12 = fsVar.c("Duration")) != null && (a12 = a(c12.d(), kVar)) > 0) {
                oqVar.f6870c = a12;
            }
            fs c13 = fsVar.c("MediaFiles");
            if (c13 != null && (a11 = a(c13, kVar)) != null && a11.size() > 0) {
                List list = oqVar.a;
                if (list != null) {
                    a11.addAll(list);
                }
                oqVar.a = a11;
            }
            fs c14 = fsVar.c("VideoClicks");
            if (c14 != null) {
                if (oqVar.f6871d == null && (c11 = c14.c("ClickThrough")) != null) {
                    String d10 = c11.d();
                    if (StringUtils.isValidString(d10)) {
                        oqVar.f6871d = Uri.parse(d10);
                    }
                }
                nq.a(c14.a("ClickTracking"), oqVar.f6872e, fqVar, kVar);
            }
            fs c15 = fsVar.c("Icons");
            if (c15 != null && (a = hq.a((c10 = c15.c("Icon")), kVar)) != null) {
                fs c16 = c10.c("IconClicks");
                if (c16 != null && (a10 = c16.a("IconClickTracking")) != null) {
                    nq.a(a10, a.a, fqVar, kVar);
                }
                List a13 = c10.a("IconViewTracking");
                if (a13 != null) {
                    nq.a(a13, a.f5195b, fqVar, kVar);
                }
                oqVar.f6873f = a;
            }
            nq.a(fsVar, oqVar.f6874g, fqVar, kVar);
            return oqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public static /* synthetic */ int b(pq pqVar, pq pqVar2) {
        return a(pqVar, pqVar2);
    }

    public int c() {
        return this.f6870c;
    }

    public Map d() {
        return this.f6874g;
    }

    public hq e() {
        return this.f6873f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        if (this.f6870c != oqVar.f6870c) {
            return false;
        }
        List list = this.a;
        if (list == null ? oqVar.a != null : !list.equals(oqVar.a)) {
            return false;
        }
        Uri uri = this.f6871d;
        if (uri == null ? oqVar.f6871d != null : !uri.equals(oqVar.f6871d)) {
            return false;
        }
        Set set = this.f6872e;
        if (set == null ? oqVar.f6872e != null : !set.equals(oqVar.f6872e)) {
            return false;
        }
        Map map = this.f6874g;
        Map map2 = oqVar.f6874g;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public List f() {
        return this.a;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        List list = this.a;
        int i13 = 0;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = ((i10 * 31) + this.f6870c) * 31;
        Uri uri = this.f6871d;
        if (uri != null) {
            i11 = uri.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Set set = this.f6872e;
        if (set != null) {
            i12 = set.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        Map map = this.f6874g;
        if (map != null) {
            i13 = map.hashCode();
        }
        return i16 + i13;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.a + ", durationSeconds=" + this.f6870c + ", destinationUri=" + this.f6871d + ", clickTrackers=" + this.f6872e + ", eventTrackers=" + this.f6874g + ", industryIcon=" + this.f6873f + AbstractJsonLexerKt.END_OBJ;
    }

    public Uri b() {
        return this.f6871d;
    }

    public Set a() {
        return this.f6872e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public pq a(long j3) {
        List list = this.a;
        pq pqVar = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f6869b) {
            for (pq pqVar2 : this.a) {
                String b3 = pqVar2.b();
                if (StringUtils.isValidString(b3) && str.equalsIgnoreCase(b3)) {
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
            arrayList2 = this.a;
        }
        Collections.sort(arrayList2, new et(9));
        for (pq pqVar3 : arrayList2) {
            if (pqVar3.a() > j3) {
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
        List a = fsVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a.size());
        List<String> explode = CollectionUtils.explode((String) kVar.a(oj.S4));
        List<String> explode2 = CollectionUtils.explode((String) kVar.a(oj.R4));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            pq a10 = pq.a((fs) it.next(), kVar);
            if (a10 != null) {
                try {
                    String b3 = a10.b();
                    if (StringUtils.isValidString(b3) && !explode.contains(b3)) {
                        arrayList.add(a10);
                    } else {
                        if (((Boolean) kVar.a(oj.T4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a10.d().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a10);
                            }
                        }
                        kVar.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            kVar.L().k("VastVideoCreative", "Video file not supported: " + a10);
                        }
                    }
                } catch (Throwable th2) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastVideoCreative", "Failed to validate video file: " + a10, th2);
                    }
                }
            }
        }
        return arrayList;
    }
}
