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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bq extends com.applovin.impl.sdk.ad.b {

    /* renamed from: l */
    private final String f3922l;

    /* renamed from: m */
    private final String f3923m;

    /* renamed from: n */
    private final kq f3924n;

    /* renamed from: o */
    private final long f3925o;

    /* renamed from: p */
    private final oq f3926p;

    /* renamed from: q */
    private final eq f3927q;

    /* renamed from: r */
    private final String f3928r;

    /* renamed from: s */
    private final dq f3929s;

    /* renamed from: t */
    private final og f3930t;
    private final Set u;

    /* renamed from: v */
    private final Set f3931v;

    /* loaded from: classes.dex */
    public static class b {
        private JSONObject a;

        /* renamed from: b */
        private JSONObject f3932b;

        /* renamed from: c */
        private com.applovin.impl.sdk.k f3933c;

        /* renamed from: d */
        private long f3934d;

        /* renamed from: e */
        private String f3935e;

        /* renamed from: f */
        private String f3936f;

        /* renamed from: g */
        private kq f3937g;

        /* renamed from: h */
        private oq f3938h;

        /* renamed from: i */
        private eq f3939i;

        /* renamed from: j */
        private dq f3940j;

        /* renamed from: k */
        private Set f3941k;

        /* renamed from: l */
        private Set f3942l;

        public b a(String str) {
            this.f3936f = str;
            return this;
        }

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f3932b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b b(Set set) {
            this.f3941k = set;
            return this;
        }

        public b a(dq dqVar) {
            this.f3940j = dqVar;
            return this;
        }

        public b b(String str) {
            this.f3935e = str;
            return this;
        }

        public b a(eq eqVar) {
            this.f3939i = eqVar;
            return this;
        }

        public b a(long j3) {
            this.f3934d = j3;
            return this;
        }

        public b a(Set set) {
            this.f3942l = set;
            return this;
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.f3933c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(kq kqVar) {
            this.f3937g = kqVar;
            return this;
        }

        public b a(oq oqVar) {
            this.f3938h = oqVar;
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
        super(bVar.a, bVar.f3932b, bVar.f3933c);
        this.f3922l = bVar.f3935e;
        this.f3924n = bVar.f3937g;
        this.f3923m = bVar.f3936f;
        this.f3926p = bVar.f3938h;
        this.f3927q = bVar.f3939i;
        this.f3929s = bVar.f3940j;
        this.u = bVar.f3941k;
        this.f3931v = bVar.f3942l;
        this.f3930t = new og(this);
        Uri s02 = s0();
        if (s02 != null) {
            this.f3928r = s02.toString();
        } else {
            this.f3928r = "";
        }
        this.f3925o = bVar.f3934d;
    }

    private Set a(c cVar, String[] strArr) {
        Map c10;
        eq eqVar;
        oq oqVar;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (oqVar = this.f3926p) != null) {
                c10 = oqVar.d();
            } else {
                c10 = (cVar != c.COMPANION_AD || (eqVar = this.f3927q) == null) ? null : eqVar.c();
            }
            HashSet hashSet = new HashSet();
            if (c10 != null && !c10.isEmpty()) {
                for (String str : strArr) {
                    if (c10.containsKey(str)) {
                        hashSet.addAll((Collection) c10.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    private Set f1() {
        eq eqVar = this.f3927q;
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
        oq oqVar = this.f3926p;
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
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new js(this, 7));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, j1(), Q(), Q0(), this.sdk);
        }
        return a10;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean F0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && j() != null;
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
        return this.f3928r;
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
        return this.f3927q;
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
        String str = this.f3922l;
        if (str == null ? bqVar.f3922l != null : !str.equals(bqVar.f3922l)) {
            return false;
        }
        String str2 = this.f3923m;
        if (str2 == null ? bqVar.f3923m != null : !str2.equals(bqVar.f3923m)) {
            return false;
        }
        kq kqVar = this.f3924n;
        if (kqVar == null ? bqVar.f3924n != null : !kqVar.equals(bqVar.f3924n)) {
            return false;
        }
        oq oqVar = this.f3926p;
        if (oqVar == null ? bqVar.f3926p != null : !oqVar.equals(bqVar.f3926p)) {
            return false;
        }
        eq eqVar = this.f3927q;
        if (eqVar == null ? bqVar.f3927q != null : !eqVar.equals(bqVar.f3927q)) {
            return false;
        }
        dq dqVar = this.f3929s;
        if (dqVar == null ? bqVar.f3929s != null : !dqVar.equals(bqVar.f3929s)) {
            return false;
        }
        Set set = this.u;
        if (set == null ? bqVar.u != null : !set.equals(bqVar.u)) {
            return false;
        }
        Set set2 = this.f3931v;
        Set set3 = bqVar.f3931v;
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
        return this.f3925o;
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
        List f10;
        oq oqVar = this.f3926p;
        if (oqVar == null || (f10 = oqVar.f()) == null || f10.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int hashCode = super.hashCode() * 31;
        String str = this.f3922l;
        int i17 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i18 = (hashCode + i10) * 31;
        String str2 = this.f3923m;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i19 = (i18 + i11) * 31;
        kq kqVar = this.f3924n;
        if (kqVar != null) {
            i12 = kqVar.hashCode();
        } else {
            i12 = 0;
        }
        int i20 = (i19 + i12) * 31;
        oq oqVar = this.f3926p;
        if (oqVar != null) {
            i13 = oqVar.hashCode();
        } else {
            i13 = 0;
        }
        int i21 = (i20 + i13) * 31;
        eq eqVar = this.f3927q;
        if (eqVar != null) {
            i14 = eqVar.hashCode();
        } else {
            i14 = 0;
        }
        int i22 = (i21 + i14) * 31;
        dq dqVar = this.f3929s;
        if (dqVar != null) {
            i15 = dqVar.hashCode();
        } else {
            i15 = 0;
        }
        int i23 = (i22 + i15) * 31;
        Set set = this.u;
        if (set != null) {
            i16 = set.hashCode();
        } else {
            i16 = 0;
        }
        int i24 = (i23 + i16) * 31;
        Set set2 = this.f3931v;
        if (set2 != null) {
            i17 = set2.hashCode();
        }
        return i24 + i17;
    }

    public c i1() {
        if ("companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad"))) {
            return c.COMPANION_AD;
        }
        return c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public boolean isOpenMeasurementEnabled() {
        if (getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f3929s != null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j() {
        oq oqVar = this.f3926p;
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
        oq oqVar = this.f3926p;
        if (oqVar != null) {
            return oqVar.e();
        }
        return null;
    }

    public long l1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public kq m1() {
        return this.f3924n;
    }

    public oq o1() {
        return this.f3926p;
    }

    public pq p1() {
        long j3;
        Long f10 = c4.f(this.sdk);
        oq oqVar = this.f3926p;
        if (f10 != null) {
            j3 = f10.longValue();
        } else {
            j3 = 0;
        }
        return oqVar.a(j3);
    }

    public boolean q1() {
        return k1() != null;
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
        return "VastAd{title='" + this.f3922l + "', adDescription='" + this.f3923m + "', systemInfo=" + this.f3924n + ", videoCreative=" + this.f3926p + ", companionAd=" + this.f3927q + ", adVerifications=" + this.f3929s + ", impressionTrackers=" + this.u + ", errorTrackers=" + this.f3931v + AbstractJsonLexerKt.END_OBJ;
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
        return this.f3929s;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public og getAdEventTracker() {
        return this.f3930t;
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
            return this.u;
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
            return this.f3931v;
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
