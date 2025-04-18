package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.aq;
import com.applovin.impl.bm;
import com.applovin.impl.f1;
import com.applovin.impl.iq;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class dm extends bm {

    /* renamed from: r, reason: collision with root package name */
    private final aq f23500r;

    /* loaded from: classes.dex */
    public class a implements f1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ iq f23501a;

        public a(iq iqVar) {
            this.f23501a = iqVar;
        }

        @Override // com.applovin.impl.f1.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f23501a.a(uri);
                dm.this.f23500r.b(true);
                return;
            }
            com.applovin.impl.sdk.n nVar = dm.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                dm dmVar = dm.this;
                dmVar.f28218c.b(dmVar.f28217b, "Failed to cache static companion ad");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements bm.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ iq f23503a;

        public b(iq iqVar) {
            this.f23503a = iqVar;
        }

        @Override // com.applovin.impl.bm.e
        public void a(String str) {
            this.f23503a.a(str);
            dm.this.f23500r.b(true);
        }
    }

    /* loaded from: classes.dex */
    public class c implements bm.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ iq f23505a;

        public c(iq iqVar) {
            this.f23505a = iqVar;
        }

        @Override // com.applovin.impl.bm.e
        public void a(String str) {
            this.f23505a.a(str);
            dm.this.f23500r.b(true);
        }
    }

    /* loaded from: classes.dex */
    public class d implements f1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ oq f23507a;

        public d(oq oqVar) {
            this.f23507a = oqVar;
        }

        @Override // com.applovin.impl.f1.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.n nVar = dm.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    dm dmVar = dm.this;
                    dmVar.f28218c.a(dmVar.f28217b, "Video file successfully cached into: " + uri);
                }
                this.f23507a.a(uri);
                return;
            }
            com.applovin.impl.sdk.n nVar2 = dm.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                dm dmVar2 = dm.this;
                dmVar2.f28218c.b(dmVar2.f28217b, "Failed to cache video file: " + this.f23507a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements bm.e {
        public e() {
        }

        @Override // com.applovin.impl.bm.e
        public void a(String str) {
            if (dm.this.f23500r.isOpenMeasurementEnabled()) {
                str = dm.this.f28216a.W().a(str);
            }
            dm.this.f23500r.b(str);
            com.applovin.impl.sdk.n nVar = dm.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                dm dmVar = dm.this;
                dmVar.f28218c.a(dmVar.f28217b, "Finish caching HTML template " + dm.this.f23500r.l1() + " for ad #" + dm.this.f23500r.getAdIdNumber());
            }
        }
    }

    public dm(aq aqVar, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aqVar, jVar, appLovinAdLoadListener);
        this.f23500r = aqVar;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f28216a.a(sj.m5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri a2 = a(str2, Collections.emptyList(), false);
                if (a2 != null) {
                    str = str.replace(str2, a2.toString());
                    this.f23123h.a(a2);
                    this.f23124i.d();
                } else {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f28218c.b(this.f28217b, "Failed to cache JavaScript resource: " + str2);
                    }
                    this.f23124i.c();
                }
            }
        }
        return str;
    }

    private void m() {
        if (l()) {
            return;
        }
        if (!this.f23500r.y1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        dq j12 = this.f23500r.j1();
        if (j12 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        iq d2 = j12.d();
        if (d2 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri b2 = d2.b();
        String uri = b2 != null ? b2.toString() : "";
        String a2 = d2.a();
        if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(a2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.k(this.f28217b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (d2.c() == iq.a.STATIC) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Caching static companion ad at " + uri + "...");
            }
            Uri a3 = a(uri, Collections.emptyList(), false);
            if (a3 != null) {
                d2.a(a3);
                this.f23500r.b(true);
                return;
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (d2.c() != iq.a.HTML) {
            if (d2.c() == iq.a.IFRAME && com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(uri)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Caching provided HTML for companion ad. No fetch required. HTML: ", a2, this.f28218c, this.f28217b);
            }
            if (((Boolean) this.f28216a.a(sj.k5)).booleanValue()) {
                a2 = d(a2);
            }
            d2.a(a(a2, Collections.emptyList(), this.f23500r));
            this.f23500r.b(true);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Begin caching HTML companion ad. Fetching from " + uri + "...");
        }
        String d3 = d(uri, null, false);
        if (StringUtils.isValidString(d3)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "HTML fetched. Caching HTML now...");
            }
            d2.a(a(d3, Collections.emptyList(), this.f23500r));
            this.f23500r.b(true);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Unable to load companion ad resources from " + uri);
        }
    }

    private void n() {
        String l12;
        if (l() || !mq.a(this.f23500r)) {
            return;
        }
        if (this.f23500r.m1() != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Begin caching HTML template. Fetching from " + this.f23500r.m1() + "...");
            }
            l12 = b(this.f23500r.m1().toString(), this.f23500r.X(), true);
        } else {
            l12 = this.f23500r.l1();
        }
        if (!StringUtils.isValidString(l12)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String a2 = a(l12, this.f23500r.X(), this.f23123h);
        if (this.f23500r.isOpenMeasurementEnabled()) {
            a2 = this.f28216a.W().a(a2);
        }
        this.f23500r.b(a2);
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Finish caching HTML template " + this.f23500r.l1() + " for ad #" + this.f23500r.getAdIdNumber());
        }
    }

    private void o() {
        oq u1;
        Uri d2;
        if (l()) {
            return;
        }
        if (!this.f23500r.z1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.f23500r.t1() == null || (u1 = this.f23500r.u1()) == null || (d2 = u1.d()) == null) {
            return;
        }
        Uri c2 = c(d2.toString(), Collections.emptyList(), false);
        if (c2 != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Video file successfully cached into: " + c2);
            }
            u1.a(c2);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Failed to cache video file: " + u1);
        }
    }

    private d1 p() {
        if (!this.f23500r.y1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        dq j12 = this.f23500r.j1();
        if (j12 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        iq d2 = j12.d();
        if (d2 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri b2 = d2.b();
        String uri = b2 != null ? b2.toString() : "";
        String a2 = d2.a();
        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(a2)) {
            if (d2.c() == iq.a.STATIC) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, "Caching static companion ad at " + uri + "...");
                }
                return new f1(uri, this.f23500r, Collections.emptyList(), false, this.f23124i, this.f28216a, new a(d2));
            }
            if (d2.c() == iq.a.HTML) {
                if (!StringUtils.isValidString(uri)) {
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.adview.t.v("Caching provided HTML for companion ad. No fetch required. HTML: ", a2, this.f28218c, this.f28217b);
                    }
                    return a(a2, Collections.emptyList(), new c(d2));
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, "Begin caching HTML companion ad. Fetching from " + uri + "...");
                }
                String d3 = d(uri, null, false);
                if (StringUtils.isValidString(d3)) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f28218c.a(this.f28217b, "HTML fetched. Caching HTML now...");
                    }
                    return a(d3, Collections.emptyList(), new b(d2));
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "Unable to load companion ad resources from " + uri);
                }
            } else if (d2.c() == iq.a.IFRAME && com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Skip caching of iFrame resource...");
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.k(this.f28217b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.bm
    public void f() {
        this.f23500r.getAdEventTracker().h();
        super.f();
    }

    public e1 q() {
        if (!TextUtils.isEmpty(this.f23500r.l1())) {
            return a(this.f23500r.l1(), this.f23500r.X(), new e());
        }
        if (!com.applovin.impl.sdk.n.a()) {
            return null;
        }
        this.f28218c.a(this.f28217b, "Unable to load HTML template");
        return null;
    }

    public f1 r() {
        oq u1;
        Uri d2;
        if (!this.f23500r.z1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f23500r.t1() == null || (u1 = this.f23500r.u1()) == null || (d2 = u1.d()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Caching video file " + u1 + " creative...");
        }
        return a(d2.toString(), Collections.emptyList(), false, (f1.a) new d(u1));
    }

    @Override // com.applovin.impl.bm, java.lang.Runnable
    public void run() {
        super.run();
        boolean I0 = this.f23500r.I0();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f28218c;
            String str = this.f28217b;
            StringBuilder sb = new StringBuilder("Begin caching for VAST ");
            sb.append(I0 ? "streaming " : "");
            sb.append("ad #");
            sb.append(this.f23123h.getAdIdNumber());
            sb.append("...");
            nVar.a(str, sb.toString());
        }
        if (I0) {
            if (((Boolean) this.f28216a.a(sj.f26909c1)).booleanValue()) {
                if (!z3.f()) {
                    a(e());
                }
                if (this.f23500r.w1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    d1 p2 = p();
                    if (p2 != null) {
                        arrayList.add(p2);
                    }
                    e1 q2 = q();
                    if (q2 != null) {
                        arrayList.add(q2);
                    }
                    f1 r2 = r();
                    if (r2 != null) {
                        arrayList.add(r2);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f23500r.n1() == aq.c.COMPANION_AD) {
                        d1 p3 = p();
                        if (p3 != null) {
                            arrayList2.add(p3);
                        }
                        e1 q3 = q();
                        if (q3 != null) {
                            arrayList2.add(q3);
                        }
                        a(arrayList2);
                        f();
                        f1 r3 = r();
                        if (r3 != null) {
                            arrayList3.add(r3);
                        }
                        a(arrayList3);
                    } else {
                        f1 r4 = r();
                        if (r4 != null) {
                            arrayList2.add(r4);
                        }
                        a(arrayList2);
                        f();
                        d1 p4 = p();
                        if (p4 != null) {
                            arrayList3.add(p4);
                        }
                        e1 q4 = q();
                        if (q4 != null) {
                            arrayList3.add(q4);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.f23500r.w1()) {
                    f();
                }
                aq.c n12 = this.f23500r.n1();
                aq.c cVar = aq.c.COMPANION_AD;
                if (n12 == cVar) {
                    m();
                    n();
                    a(this.f23500r);
                } else {
                    o();
                }
                if (!this.f23500r.w1()) {
                    f();
                }
                if (this.f23500r.n1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.f23500r);
                }
            }
        } else if (((Boolean) this.f28216a.a(sj.f26909c1)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!z3.f()) {
                arrayList4.addAll(e());
            }
            d1 p5 = p();
            if (p5 != null) {
                arrayList4.add(p5);
            }
            f1 r5 = r();
            if (r5 != null) {
                arrayList4.add(r5);
            }
            e1 q5 = q();
            if (q5 != null) {
                arrayList4.add(q5);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.f23500r);
            f();
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Finished caching VAST ad #" + this.f23500r.getAdIdNumber());
        }
        this.f23500r.x1();
        k();
    }

    @Override // com.applovin.impl.bm
    public void a(int i2) {
        this.f23500r.getAdEventTracker().f();
        super.a(i2);
    }
}
