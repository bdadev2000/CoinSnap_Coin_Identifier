package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bq extends com.applovin.impl.sdk.ad.b {
    private final String l;
    private final String m;

    /* renamed from: n */
    private final kq f6904n;

    /* renamed from: o */
    private final long f6905o;

    /* renamed from: p */
    private final oq f6906p;

    /* renamed from: q */
    private final eq f6907q;

    /* renamed from: r */
    private final String f6908r;

    /* renamed from: s */
    private final dq f6909s;

    /* renamed from: t */
    private final og f6910t;

    /* renamed from: u */
    private final Set f6911u;

    /* renamed from: v */
    private final Set f6912v;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private JSONObject f6913a;
        private JSONObject b;

        /* renamed from: c */
        private com.applovin.impl.sdk.k f6914c;

        /* renamed from: d */
        private long f6915d;

        /* renamed from: e */
        private String f6916e;

        /* renamed from: f */
        private String f6917f;

        /* renamed from: g */
        private kq f6918g;

        /* renamed from: h */
        private oq f6919h;

        /* renamed from: i */
        private eq f6920i;

        /* renamed from: j */
        private dq f6921j;

        /* renamed from: k */
        private Set f6922k;
        private Set l;

        public b a(String str) {
            this.f6917f = str;
            return this;
        }

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6913a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b b(Set set) {
            this.f6922k = set;
            return this;
        }

        public b a(dq dqVar) {
            this.f6921j = dqVar;
            return this;
        }

        public b b(String str) {
            this.f6916e = str;
            return this;
        }

        public b a(eq eqVar) {
            this.f6920i = eqVar;
            return this;
        }

        public b a(long j7) {
            this.f6915d = j7;
            return this;
        }

        public b a(Set set) {
            this.l = set;
            return this;
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.f6914c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(kq kqVar) {
            this.f6918g = kqVar;
            return this;
        }

        public b a(oq oqVar) {
            this.f6919h = oqVar;
            return this;
        }

        public bq a() {
            return new bq(this);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        COMPANION_AD,
        VIDEO
    }

    /* loaded from: classes.dex */
    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private bq(b bVar) {
        super(bVar.f6913a, bVar.b, bVar.f6914c);
        this.l = bVar.f6916e;
        this.f6904n = bVar.f6918g;
        this.m = bVar.f6917f;
        this.f6906p = bVar.f6919h;
        this.f6907q = bVar.f6920i;
        this.f6909s = bVar.f6921j;
        this.f6911u = bVar.f6922k;
        this.f6912v = bVar.l;
        this.f6910t = new og(this);
        Uri s02 = s0();
        if (s02 != null) {
            this.f6908r = s02.toString();
        } else {
            this.f6908r = "";
        }
        this.f6905o = bVar.f6915d;
    }

    private Set a(c cVar, String[] strArr) {
        Map c9;
        eq eqVar;
        oq oqVar;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (oqVar = this.f6906p) != null) {
                c9 = oqVar.d();
            } else {
                c9 = (cVar != c.COMPANION_AD || (eqVar = this.f6907q) == null) ? null : eqVar.c();
            }
            HashSet hashSet = new HashSet();
            if (c9 != null && !c9.isEmpty()) {
                for (String str : strArr) {
                    if (c9.containsKey(str)) {
                        hashSet.addAll((Collection) c9.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    private Set f1() {
        eq eqVar = this.f6907q;
        if (eqVar != null) {
            return eqVar.a();
        }
        return Collections.emptySet();
    }

    private String j1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject == null) {
            return null;
        }
        return stringFromAdObject.replace("{CLCODE}", getClCode());
    }

    private Set n1() {
        oq oqVar = this.f6906p;
        if (oqVar != null) {
            return oqVar.a();
        }
        return Collections.emptySet();
    }

    public /* synthetic */ List w(ql qlVar) {
        return zp.a(qlVar.a("vimp_urls", new JSONObject()), getClCode(), null, j1(), Q(), Q0(), this.sdk);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List F() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new C(this, 7));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, j1(), Q(), Q0(), this.sdk);
        }
        return a6;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean F0() {
        if (getBooleanFromAdObject("video_clickable", Boolean.FALSE) && j() != null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean G0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void J0() {
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String P() {
        return this.f6908r;
    }

    public void b(String str) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public eq e1() {
        return this.f6907q;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq) || !super.equals(obj)) {
            return false;
        }
        bq bqVar = (bq) obj;
        String str = this.l;
        if (str == null ? bqVar.l != null : !str.equals(bqVar.l)) {
            return false;
        }
        String str2 = this.m;
        if (str2 == null ? bqVar.m != null : !str2.equals(bqVar.m)) {
            return false;
        }
        kq kqVar = this.f6904n;
        if (kqVar == null ? bqVar.f6904n != null : !kqVar.equals(bqVar.f6904n)) {
            return false;
        }
        oq oqVar = this.f6906p;
        if (oqVar == null ? bqVar.f6906p != null : !oqVar.equals(bqVar.f6906p)) {
            return false;
        }
        eq eqVar = this.f6907q;
        if (eqVar == null ? bqVar.f6907q != null : !eqVar.equals(bqVar.f6907q)) {
            return false;
        }
        dq dqVar = this.f6909s;
        if (dqVar == null ? bqVar.f6909s != null : !dqVar.equals(bqVar.f6909s)) {
            return false;
        }
        Set set = this.f6911u;
        if (set == null ? bqVar.f6911u != null : !set.equals(bqVar.f6911u)) {
            return false;
        }
        Set set2 = this.f6912v;
        Set set3 = bqVar.f6912v;
        if (set2 != null) {
            return set2.equals(set3);
        }
        if (set3 == null) {
            return true;
        }
        return false;
    }

    public String g1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f6905o;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    public Uri h1() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (!StringUtils.isValidString(stringFromAdObject)) {
            return null;
        }
        return Uri.parse(stringFromAdObject);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List f9;
        oq oqVar = this.f6906p;
        if (oqVar == null || (f9 = oqVar.f()) == null || f9.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int hashCode = super.hashCode() * 31;
        String str = this.l;
        int i16 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i17 = (hashCode + i9) * 31;
        String str2 = this.m;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i18 = (i17 + i10) * 31;
        kq kqVar = this.f6904n;
        if (kqVar != null) {
            i11 = kqVar.hashCode();
        } else {
            i11 = 0;
        }
        int i19 = (i18 + i11) * 31;
        oq oqVar = this.f6906p;
        if (oqVar != null) {
            i12 = oqVar.hashCode();
        } else {
            i12 = 0;
        }
        int i20 = (i19 + i12) * 31;
        eq eqVar = this.f6907q;
        if (eqVar != null) {
            i13 = eqVar.hashCode();
        } else {
            i13 = 0;
        }
        int i21 = (i20 + i13) * 31;
        dq dqVar = this.f6909s;
        if (dqVar != null) {
            i14 = dqVar.hashCode();
        } else {
            i14 = 0;
        }
        int i22 = (i21 + i14) * 31;
        Set set = this.f6911u;
        if (set != null) {
            i15 = set.hashCode();
        } else {
            i15 = 0;
        }
        int i23 = (i22 + i15) * 31;
        Set set2 = this.f6912v;
        if (set2 != null) {
            i16 = set2.hashCode();
        }
        return i23 + i16;
    }

    public c i1() {
        if ("companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad"))) {
            return c.COMPANION_AD;
        }
        return c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public boolean isOpenMeasurementEnabled() {
        if (getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f6909s != null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j() {
        oq oqVar = this.f6906p;
        if (oqVar != null) {
            return oqVar.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j0() {
        return j();
    }

    public hq k1() {
        oq oqVar = this.f6906p;
        if (oqVar != null) {
            return oqVar.e();
        }
        return null;
    }

    public long l1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public kq m1() {
        return this.f6904n;
    }

    public oq o1() {
        return this.f6906p;
    }

    public pq p1() {
        long j7;
        Long f9 = c4.f(this.sdk);
        oq oqVar = this.f6906p;
        if (f9 != null) {
            j7 = f9.longValue();
        } else {
            j7 = 0;
        }
        return oqVar.a(j7);
    }

    public boolean q1() {
        if (k1() != null) {
            return true;
        }
        return false;
    }

    public boolean r1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri s0() {
        pq p12 = p1();
        if (p12 != null) {
            return p12.d();
        }
        return null;
    }

    public void s1() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean t1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.l + "', adDescription='" + this.m + "', systemInfo=" + this.f6904n + ", videoCreative=" + this.f6906p + ", companionAd=" + this.f6907q + ", adVerifications=" + this.f6909s + ", impressionTrackers=" + this.f6911u + ", errorTrackers=" + this.f6912v + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    public dq d1() {
        return this.f6909s;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public og getAdEventTracker() {
        return this.f6910t;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.sdk.L().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f6911u;
        }
        if (dVar == d.VIDEO_CLICK) {
            return n1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return f1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return k1().a();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return k1().e();
        }
        if (dVar == d.ERROR) {
            return this.f6912v;
        }
        this.sdk.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.sdk.L().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }

    public /* synthetic */ bq(b bVar, a aVar) {
        this(bVar);
    }
}
