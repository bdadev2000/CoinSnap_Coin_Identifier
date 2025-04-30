package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.C0689e1;
import com.applovin.impl.am;
import com.applovin.impl.bq;
import com.applovin.impl.jq;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class cm extends am {

    /* renamed from: r, reason: collision with root package name */
    private final bq f7092r;

    /* loaded from: classes.dex */
    public class a implements C0689e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ jq f7093a;

        public a(jq jqVar) {
            this.f7093a = jqVar;
        }

        @Override // com.applovin.impl.C0689e1.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f7093a.a(uri);
                cm.this.f7092r.b(true);
                return;
            }
            com.applovin.impl.sdk.t tVar = cm.this.f12279c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar = cm.this;
                cmVar.f12279c.b(cmVar.b, "Failed to cache static companion ad");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements am.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ jq f7094a;

        public b(jq jqVar) {
            this.f7094a = jqVar;
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            this.f7094a.a(str);
            cm.this.f7092r.b(true);
        }
    }

    /* loaded from: classes.dex */
    public class c implements am.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ jq f7095a;

        public c(jq jqVar) {
            this.f7095a = jqVar;
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            this.f7095a.a(str);
            cm.this.f7092r.b(true);
        }
    }

    /* loaded from: classes.dex */
    public class d implements C0689e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pq f7096a;

        public d(pq pqVar) {
            this.f7096a = pqVar;
        }

        @Override // com.applovin.impl.C0689e1.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.t tVar = cm.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    cm cmVar = cm.this;
                    cmVar.f12279c.a(cmVar.b, "Video file successfully cached into: " + uri);
                }
                this.f7096a.a(uri);
                return;
            }
            com.applovin.impl.sdk.t tVar2 = cm.this.f12279c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar2 = cm.this;
                cmVar2.f12279c.b(cmVar2.b, "Failed to cache video file: " + this.f7096a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements am.e {
        public e() {
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            if (cm.this.f7092r.isOpenMeasurementEnabled()) {
                str = cm.this.f12278a.Y().a(str);
            }
            cm.this.f7092r.b(str);
            com.applovin.impl.sdk.t tVar = cm.this.f12279c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar = cm.this;
                cmVar.f12279c.a(cmVar.b, "Finish caching HTML template " + cm.this.f7092r.g1() + " for ad #" + cm.this.f7092r.getAdIdNumber());
            }
        }
    }

    public cm(bq bqVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", bqVar, kVar, appLovinAdLoadListener);
        this.f7092r = bqVar;
    }

    private String d(String str) {
        String str2 = str;
        for (String str3 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f12278a.a(oj.f9775h5)), 1)) {
            if (!TextUtils.isEmpty(str3)) {
                if (this.f6754h.shouldCancelHtmlCachingIfShown() && this.f6754h.hasShown()) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f12279c.a(this.b, "Cancelling HTML JavaScript caching due to ad being shown already");
                    }
                    this.f6755i.c();
                    return str;
                }
                Uri a6 = a(str3, Collections.emptyList(), false);
                if (a6 != null) {
                    str2 = str2.replace(str3, a6.toString());
                    this.f6754h.a(a6);
                    this.f6755i.b();
                } else {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f12279c.b(this.b, "Failed to cache JavaScript resource: " + str3);
                    }
                    this.f6755i.a();
                }
            }
        }
        return str2;
    }

    private void m() {
        String str;
        if (l()) {
            return;
        }
        if (this.f7092r.t1()) {
            eq e12 = this.f7092r.e1();
            if (e12 != null) {
                jq d2 = e12.d();
                if (d2 != null) {
                    Uri b8 = d2.b();
                    if (b8 != null) {
                        str = b8.toString();
                    } else {
                        str = "";
                    }
                    String a6 = d2.a();
                    if (!URLUtil.isValidUrl(str) && !StringUtils.isValidString(a6)) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f12279c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    if (d2.c() == jq.a.STATIC) {
                        if (com.applovin.impl.sdk.t.a()) {
                            L.v("Caching static companion ad at ", str, "...", this.f12279c, this.b);
                        }
                        Uri a9 = a(str, Collections.emptyList(), false);
                        if (a9 != null) {
                            d2.a(a9);
                            this.f7092r.b(true);
                            return;
                        } else {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f12279c.b(this.b, "Failed to cache static companion ad");
                                return;
                            }
                            return;
                        }
                    }
                    if (d2.c() == jq.a.HTML) {
                        if (StringUtils.isValidString(str)) {
                            if (com.applovin.impl.sdk.t.a()) {
                                L.v("Begin caching HTML companion ad. Fetching from ", str, "...", this.f12279c, this.b);
                            }
                            String d9 = d(str, null, false);
                            if (StringUtils.isValidString(d9)) {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f12279c.a(this.b, "HTML fetched. Caching HTML now...");
                                }
                                d2.a(a(d9, Collections.emptyList(), this.f7092r));
                                this.f7092r.b(true);
                                return;
                            }
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f12279c.b(this.b, "Unable to load companion ad resources from " + str);
                                return;
                            }
                            return;
                        }
                        if (com.applovin.impl.sdk.t.a()) {
                            Q7.n0.s("Caching provided HTML for companion ad. No fetch required. HTML: ", a6, this.f12279c, this.b);
                        }
                        if (((Boolean) this.f12278a.a(oj.f9768g5)).booleanValue()) {
                            a6 = d(a6);
                        }
                        d2.a(a(a6, Collections.emptyList(), this.f7092r));
                        this.f7092r.b(true);
                        return;
                    }
                    if (d2.c() == jq.a.IFRAME && com.applovin.impl.sdk.t.a()) {
                        this.f12279c.a(this.b, "Skip caching of iFrame resource...");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Companion ad caching disabled. Skipping...");
        }
    }

    private void n() {
        String g12;
        if (!l() && nq.a(this.f7092r)) {
            if (this.f7092r.h1() != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Begin caching HTML template. Fetching from " + this.f7092r.h1() + "...");
                }
                g12 = b(this.f7092r.h1().toString(), this.f7092r.X(), true);
            } else {
                g12 = this.f7092r.g1();
            }
            if (StringUtils.isValidString(g12)) {
                String a6 = a(g12, this.f7092r.X(), this.f6754h);
                if (this.f7092r.isOpenMeasurementEnabled()) {
                    a6 = this.f12278a.Y().a(a6);
                }
                this.f7092r.b(a6);
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Finish caching HTML template " + this.f7092r.g1() + " for ad #" + this.f7092r.getAdIdNumber());
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Unable to load HTML template");
            }
        }
    }

    private void o() {
        pq p12;
        Uri d2;
        if (l()) {
            return;
        }
        if (this.f7092r.u1()) {
            if (this.f7092r.o1() != null && (p12 = this.f7092r.p1()) != null && (d2 = p12.d()) != null) {
                Uri c9 = c(d2.toString(), Collections.emptyList(), false);
                if (c9 != null) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f12279c.a(this.b, "Video file successfully cached into: " + c9);
                    }
                    p12.a(c9);
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "Failed to cache video file: " + p12);
                    return;
                }
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Video caching disabled. Skipping...");
        }
    }

    private AbstractCallableC0679c1 p() {
        String str;
        if (!this.f7092r.t1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        eq e12 = this.f7092r.e1();
        if (e12 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        jq d2 = e12.d();
        if (d2 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri b8 = d2.b();
        if (b8 != null) {
            str = b8.toString();
        } else {
            str = "";
        }
        String str2 = str;
        String a6 = d2.a();
        if (!URLUtil.isValidUrl(str2) && !StringUtils.isValidString(a6)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
            }
        } else {
            if (d2.c() == jq.a.STATIC) {
                if (com.applovin.impl.sdk.t.a()) {
                    L.v("Caching static companion ad at ", str2, "...", this.f12279c, this.b);
                }
                return new C0689e1(str2, this.f7092r, Collections.emptyList(), false, this.f6755i, this.f12278a, new a(d2));
            }
            if (d2.c() == jq.a.HTML) {
                if (StringUtils.isValidString(str2)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        L.v("Begin caching HTML companion ad. Fetching from ", str2, "...", this.f12279c, this.b);
                    }
                    String d9 = d(str2, null, false);
                    if (StringUtils.isValidString(d9)) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f12279c.a(this.b, "HTML fetched. Caching HTML now...");
                        }
                        return a(d9, Collections.emptyList(), new b(d2));
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f12279c.b(this.b, "Unable to load companion ad resources from " + str2);
                    }
                } else {
                    if (com.applovin.impl.sdk.t.a()) {
                        Q7.n0.s("Caching provided HTML for companion ad. No fetch required. HTML: ", a6, this.f12279c, this.b);
                    }
                    return a(a6, Collections.emptyList(), new c(d2));
                }
            } else if (d2.c() == jq.a.IFRAME && com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Skip caching of iFrame resource...");
            }
        }
        return null;
    }

    @Override // com.applovin.impl.am
    public void f() {
        this.f7092r.getAdEventTracker().h();
        super.f();
    }

    public C0684d1 q() {
        if (TextUtils.isEmpty(this.f7092r.g1())) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Unable to load HTML template");
                return null;
            }
            return null;
        }
        return a(this.f7092r.g1(), this.f7092r.X(), new e());
    }

    public C0689e1 r() {
        pq p12;
        Uri d2;
        if (!this.f7092r.u1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f7092r.o1() == null || (p12 = this.f7092r.p1()) == null || (d2 = p12.d()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Caching video file " + p12 + " creative...");
        }
        return a(d2.toString(), Collections.emptyList(), false, (C0689e1.a) new d(p12));
    }

    @Override // com.applovin.impl.am, java.lang.Runnable
    public void run() {
        String str;
        super.run();
        boolean G02 = this.f7092r.G0();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f12279c;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder("Begin caching for VAST ");
            if (G02) {
                str = "streaming ";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append("ad #");
            sb.append(this.f6754h.getAdIdNumber());
            sb.append("...");
            tVar.a(str2, sb.toString());
        }
        if (G02) {
            if (((Boolean) this.f12278a.a(oj.f9736c1)).booleanValue()) {
                if (!x3.f()) {
                    a(e());
                }
                if (this.f7092r.r1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    AbstractCallableC0679c1 p2 = p();
                    if (p2 != null) {
                        arrayList.add(p2);
                    }
                    C0684d1 q9 = q();
                    if (q9 != null) {
                        arrayList.add(q9);
                    }
                    C0689e1 r9 = r();
                    if (r9 != null) {
                        arrayList.add(r9);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f7092r.i1() == bq.c.COMPANION_AD) {
                        AbstractCallableC0679c1 p7 = p();
                        if (p7 != null) {
                            arrayList2.add(p7);
                        }
                        C0684d1 q10 = q();
                        if (q10 != null) {
                            arrayList2.add(q10);
                        }
                        a(arrayList2);
                        f();
                        C0689e1 r10 = r();
                        if (r10 != null) {
                            arrayList3.add(r10);
                        }
                        a(arrayList3);
                    } else {
                        C0689e1 r11 = r();
                        if (r11 != null) {
                            arrayList2.add(r11);
                        }
                        a(arrayList2);
                        f();
                        AbstractCallableC0679c1 p9 = p();
                        if (p9 != null) {
                            arrayList3.add(p9);
                        }
                        C0684d1 q11 = q();
                        if (q11 != null) {
                            arrayList3.add(q11);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.f7092r.r1()) {
                    f();
                }
                bq.c i12 = this.f7092r.i1();
                bq.c cVar = bq.c.COMPANION_AD;
                if (i12 == cVar) {
                    m();
                    n();
                    a(this.f7092r);
                } else {
                    o();
                }
                if (!this.f7092r.r1()) {
                    f();
                }
                if (this.f7092r.i1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.f7092r);
                }
            }
        } else if (((Boolean) this.f12278a.a(oj.f9736c1)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!x3.f()) {
                arrayList4.addAll(e());
            }
            AbstractCallableC0679c1 p10 = p();
            if (p10 != null) {
                arrayList4.add(p10);
            }
            C0689e1 r12 = r();
            if (r12 != null) {
                arrayList4.add(r12);
            }
            C0684d1 q12 = q();
            if (q12 != null) {
                arrayList4.add(q12);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.f7092r);
            f();
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Finished caching VAST ad #" + this.f7092r.getAdIdNumber());
        }
        this.f7092r.s1();
        k();
    }

    @Override // com.applovin.impl.am
    public void a(int i9) {
        this.f7092r.getAdEventTracker().f();
        super.a(i9);
    }
}
