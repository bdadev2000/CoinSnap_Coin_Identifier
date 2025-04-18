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

/* loaded from: classes3.dex */
public class aq extends com.applovin.impl.sdk.ad.b {

    /* renamed from: l */
    private final String f22923l;

    /* renamed from: m */
    private final String f22924m;

    /* renamed from: n */
    private final jq f22925n;

    /* renamed from: o */
    private final long f22926o;

    /* renamed from: p */
    private final nq f22927p;

    /* renamed from: q */
    private final dq f22928q;

    /* renamed from: r */
    private final String f22929r;

    /* renamed from: s */
    private final cq f22930s;

    /* renamed from: t */
    private final sg f22931t;

    /* renamed from: u */
    private final Set f22932u;

    /* renamed from: v */
    private final Set f22933v;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private JSONObject f22934a;

        /* renamed from: b */
        private JSONObject f22935b;

        /* renamed from: c */
        private com.applovin.impl.sdk.j f22936c;
        private long d;
        private String e;

        /* renamed from: f */
        private String f22937f;

        /* renamed from: g */
        private jq f22938g;

        /* renamed from: h */
        private nq f22939h;

        /* renamed from: i */
        private dq f22940i;

        /* renamed from: j */
        private cq f22941j;

        /* renamed from: k */
        private Set f22942k;

        /* renamed from: l */
        private Set f22943l;

        public b a(long j2) {
            this.d = j2;
            return this;
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b a(cq cqVar) {
            this.f22941j = cqVar;
            return this;
        }

        public b b(Set set) {
            this.f22942k = set;
            return this;
        }

        public b a(dq dqVar) {
            this.f22940i = dqVar;
            return this;
        }

        public b a(jq jqVar) {
            this.f22938g = jqVar;
            return this;
        }

        public b b(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No full ad response specified.");
            }
            this.f22935b = jSONObject;
            return this;
        }

        public b a(nq nqVar) {
            this.f22939h = nqVar;
            return this;
        }

        public b a(String str) {
            this.f22937f = str;
            return this;
        }

        public b a(Set set) {
            this.f22943l = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No ad object specified.");
            }
            this.f22934a = jSONObject;
            return this;
        }

        public b a(com.applovin.impl.sdk.j jVar) {
            if (jVar == null) {
                throw new IllegalArgumentException("No sdk specified.");
            }
            this.f22936c = jVar;
            return this;
        }

        public aq a() {
            return new aq(this);
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        COMPANION_AD,
        VIDEO
    }

    /* loaded from: classes3.dex */
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

    private aq(b bVar) {
        super(bVar.f22934a, bVar.f22935b, bVar.f22936c);
        this.f22923l = bVar.e;
        this.f22925n = bVar.f22938g;
        this.f22924m = bVar.f22937f;
        this.f22927p = bVar.f22939h;
        this.f22928q = bVar.f22940i;
        this.f22930s = bVar.f22941j;
        this.f22932u = bVar.f22942k;
        this.f22933v = bVar.f22943l;
        this.f22931t = new sg(this);
        Uri t02 = t0();
        if (t02 != null) {
            this.f22929r = t02.toString();
        } else {
            this.f22929r = "";
        }
        this.f22926o = bVar.d;
    }

    private Set a(c cVar, String[] strArr) {
        Map c2;
        dq dqVar;
        nq nqVar;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (nqVar = this.f22927p) != null) {
                c2 = nqVar.d();
            } else {
                c2 = (cVar != c.COMPANION_AD || (dqVar = this.f22928q) == null) ? null : dqVar.c();
            }
            HashSet hashSet = new HashSet();
            if (c2 != null && !c2.isEmpty()) {
                for (String str : strArr) {
                    if (c2.containsKey(str)) {
                        hashSet.addAll((Collection) c2.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    private Set k1() {
        dq dqVar = this.f22928q;
        return dqVar != null ? dqVar.a() : Collections.emptySet();
    }

    private String o1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set s1() {
        nq nqVar = this.f22927p;
        return nqVar != null ? nqVar.a() : Collections.emptySet();
    }

    public /* synthetic */ List w(tl tlVar) {
        return yp.a(tlVar.a("vimp_urls", new JSONObject()), getClCode(), null, o1(), Q(), T0(), this.sdk);
    }

    public boolean A1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean B1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean C1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List E() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new is(this, 5));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, o1(), Q(), T0(), this.sdk);
        }
        return a2;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean H0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && i() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean I0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void L0() {
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String P() {
        return this.f22929r;
    }

    public void b(String str) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq) || !super.equals(obj)) {
            return false;
        }
        aq aqVar = (aq) obj;
        String str = this.f22923l;
        if (str == null ? aqVar.f22923l != null : !str.equals(aqVar.f22923l)) {
            return false;
        }
        String str2 = this.f22924m;
        if (str2 == null ? aqVar.f22924m != null : !str2.equals(aqVar.f22924m)) {
            return false;
        }
        jq jqVar = this.f22925n;
        if (jqVar == null ? aqVar.f22925n != null : !jqVar.equals(aqVar.f22925n)) {
            return false;
        }
        nq nqVar = this.f22927p;
        if (nqVar == null ? aqVar.f22927p != null : !nqVar.equals(aqVar.f22927p)) {
            return false;
        }
        dq dqVar = this.f22928q;
        if (dqVar == null ? aqVar.f22928q != null : !dqVar.equals(aqVar.f22928q)) {
            return false;
        }
        cq cqVar = this.f22930s;
        if (cqVar == null ? aqVar.f22930s != null : !cqVar.equals(aqVar.f22930s)) {
            return false;
        }
        Set set = this.f22932u;
        if (set == null ? aqVar.f22932u != null : !set.equals(aqVar.f22932u)) {
            return false;
        }
        Set set2 = this.f22933v;
        Set set3 = aqVar.f22933v;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public sg getAdEventTracker() {
        return this.f22931t;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f22926o;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List f2;
        nq nqVar = this.f22927p;
        return (nqVar == null || (f2 = nqVar.f()) == null || f2.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f22923l;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22924m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        jq jqVar = this.f22925n;
        int hashCode4 = (hashCode3 + (jqVar != null ? jqVar.hashCode() : 0)) * 31;
        nq nqVar = this.f22927p;
        int hashCode5 = (hashCode4 + (nqVar != null ? nqVar.hashCode() : 0)) * 31;
        dq dqVar = this.f22928q;
        int hashCode6 = (hashCode5 + (dqVar != null ? dqVar.hashCode() : 0)) * 31;
        cq cqVar = this.f22930s;
        int hashCode7 = (hashCode6 + (cqVar != null ? cqVar.hashCode() : 0)) * 31;
        Set set = this.f22932u;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f22933v;
        return hashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri i() {
        nq nqVar = this.f22927p;
        if (nqVar != null) {
            return nqVar.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f22930s != null;
    }

    public dq j1() {
        return this.f22928q;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri k0() {
        return i();
    }

    public String l1() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri m1() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public c n1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    public gq p1() {
        nq nqVar = this.f22927p;
        if (nqVar != null) {
            return nqVar.e();
        }
        return null;
    }

    public long q1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public jq r1() {
        return this.f22925n;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri t0() {
        oq u1 = u1();
        if (u1 != null) {
            return u1.d();
        }
        return null;
    }

    public nq t1() {
        return this.f22927p;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f22923l + "', adDescription='" + this.f22924m + "', systemInfo=" + this.f22925n + ", videoCreative=" + this.f22927p + ", companionAd=" + this.f22928q + ", adVerifications=" + this.f22930s + ", impressionTrackers=" + this.f22932u + ", errorTrackers=" + this.f22933v + '}';
    }

    public oq u1() {
        Long f2 = e4.f(this.sdk);
        return this.f22927p.a(f2 != null ? f2.longValue() : 0L);
    }

    public boolean v1() {
        return p1() != null;
    }

    public boolean w1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void x1() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean y1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean z1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public cq i1() {
        return this.f22930s;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public /* synthetic */ aq(b bVar, a aVar) {
        this(bVar);
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.J().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f22932u;
        }
        if (dVar == d.VIDEO_CLICK) {
            return s1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return k1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return p1().a();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return p1().e();
        }
        if (dVar == d.ERROR) {
            return this.f22933v;
        }
        this.sdk.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.J().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }
}
