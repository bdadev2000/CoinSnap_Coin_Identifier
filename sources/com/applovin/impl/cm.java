package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.am;
import com.applovin.impl.bq;
import com.applovin.impl.e1;
import com.applovin.impl.jq;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class cm extends am {

    /* renamed from: r, reason: collision with root package name */
    private final bq f4107r;

    /* loaded from: classes.dex */
    public class a implements e1.a {
        final /* synthetic */ jq a;

        public a(jq jqVar) {
            this.a = jqVar;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                this.a.a(uri);
                cm.this.f4107r.b(true);
                return;
            }
            com.applovin.impl.sdk.t tVar = cm.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar = cm.this;
                cmVar.f9061c.b(cmVar.f9060b, "Failed to cache static companion ad");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements am.e {
        final /* synthetic */ jq a;

        public b(jq jqVar) {
            this.a = jqVar;
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            this.a.a(str);
            cm.this.f4107r.b(true);
        }
    }

    /* loaded from: classes.dex */
    public class c implements am.e {
        final /* synthetic */ jq a;

        public c(jq jqVar) {
            this.a = jqVar;
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            this.a.a(str);
            cm.this.f4107r.b(true);
        }
    }

    /* loaded from: classes.dex */
    public class d implements e1.a {
        final /* synthetic */ pq a;

        public d(pq pqVar) {
            this.a = pqVar;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.t tVar = cm.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    cm cmVar = cm.this;
                    cmVar.f9061c.a(cmVar.f9060b, "Video file successfully cached into: " + uri);
                }
                this.a.a(uri);
                return;
            }
            com.applovin.impl.sdk.t tVar2 = cm.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar2 = cm.this;
                cmVar2.f9061c.b(cmVar2.f9060b, "Failed to cache video file: " + this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements am.e {
        public e() {
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            if (cm.this.f4107r.isOpenMeasurementEnabled()) {
                str = cm.this.a.Y().a(str);
            }
            cm.this.f4107r.b(str);
            com.applovin.impl.sdk.t tVar = cm.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar = cm.this;
                cmVar.f9061c.a(cmVar.f9060b, "Finish caching HTML template " + cm.this.f4107r.g1() + " for ad #" + cm.this.f4107r.getAdIdNumber());
            }
        }
    }

    public cm(bq bqVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", bqVar, kVar, appLovinAdLoadListener);
        this.f4107r = bqVar;
    }

    private String d(String str) {
        String str2 = str;
        for (String str3 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.a.a(oj.f6670h5)), 1)) {
            if (!TextUtils.isEmpty(str3)) {
                if (this.f3761h.shouldCancelHtmlCachingIfShown() && this.f3761h.hasShown()) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f9061c.a(this.f9060b, "Cancelling HTML JavaScript caching due to ad being shown already");
                    }
                    this.f3762i.c();
                    return str;
                }
                Uri a10 = a(str3, Collections.emptyList(), false);
                if (a10 != null) {
                    str2 = str2.replace(str3, a10.toString());
                    this.f3761h.a(a10);
                    this.f3762i.b();
                } else {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f9061c.b(this.f9060b, "Failed to cache JavaScript resource: " + str3);
                    }
                    this.f3762i.a();
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
        if (this.f4107r.t1()) {
            eq e12 = this.f4107r.e1();
            if (e12 != null) {
                jq d10 = e12.d();
                if (d10 != null) {
                    Uri b3 = d10.b();
                    if (b3 != null) {
                        str = b3.toString();
                    } else {
                        str = "";
                    }
                    String a10 = d10.a();
                    if (!URLUtil.isValidUrl(str) && !StringUtils.isValidString(a10)) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f9061c.k(this.f9060b, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    if (d10.c() == jq.a.STATIC) {
                        if (com.applovin.impl.sdk.t.a()) {
                            a4.j.x("Caching static companion ad at ", str, "...", this.f9061c, this.f9060b);
                        }
                        Uri a11 = a(str, Collections.emptyList(), false);
                        if (a11 != null) {
                            d10.a(a11);
                            this.f4107r.b(true);
                            return;
                        } else {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f9061c.b(this.f9060b, "Failed to cache static companion ad");
                                return;
                            }
                            return;
                        }
                    }
                    if (d10.c() == jq.a.HTML) {
                        if (StringUtils.isValidString(str)) {
                            if (com.applovin.impl.sdk.t.a()) {
                                a4.j.x("Begin caching HTML companion ad. Fetching from ", str, "...", this.f9061c, this.f9060b);
                            }
                            String d11 = d(str, null, false);
                            if (StringUtils.isValidString(d11)) {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f9061c.a(this.f9060b, "HTML fetched. Caching HTML now...");
                                }
                                d10.a(a(d11, Collections.emptyList(), this.f4107r));
                                this.f4107r.b(true);
                                return;
                            }
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f9061c.b(this.f9060b, "Unable to load companion ad resources from " + str);
                                return;
                            }
                            return;
                        }
                        if (com.applovin.impl.sdk.t.a()) {
                            a4.j.v("Caching provided HTML for companion ad. No fetch required. HTML: ", a10, this.f9061c, this.f9060b);
                        }
                        if (((Boolean) this.a.a(oj.f6662g5)).booleanValue()) {
                            a10 = d(a10);
                        }
                        d10.a(a(a10, Collections.emptyList(), this.f4107r));
                        this.f4107r.b(true);
                        return;
                    }
                    if (d10.c() == jq.a.IFRAME && com.applovin.impl.sdk.t.a()) {
                        this.f9061c.a(this.f9060b, "Skip caching of iFrame resource...");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Companion ad caching disabled. Skipping...");
        }
    }

    private void n() {
        String g12;
        if (!l() && nq.a(this.f4107r)) {
            if (this.f4107r.h1() != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Begin caching HTML template. Fetching from " + this.f4107r.h1() + "...");
                }
                g12 = b(this.f4107r.h1().toString(), this.f4107r.X(), true);
            } else {
                g12 = this.f4107r.g1();
            }
            if (StringUtils.isValidString(g12)) {
                String a10 = a(g12, this.f4107r.X(), this.f3761h);
                if (this.f4107r.isOpenMeasurementEnabled()) {
                    a10 = this.a.Y().a(a10);
                }
                this.f4107r.b(a10);
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Finish caching HTML template " + this.f4107r.g1() + " for ad #" + this.f4107r.getAdIdNumber());
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Unable to load HTML template");
            }
        }
    }

    private void o() {
        pq p12;
        Uri d10;
        if (l()) {
            return;
        }
        if (this.f4107r.u1()) {
            if (this.f4107r.o1() != null && (p12 = this.f4107r.p1()) != null && (d10 = p12.d()) != null) {
                Uri c10 = c(d10.toString(), Collections.emptyList(), false);
                if (c10 != null) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f9061c.a(this.f9060b, "Video file successfully cached into: " + c10);
                    }
                    p12.a(c10);
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "Failed to cache video file: " + p12);
                    return;
                }
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Video caching disabled. Skipping...");
        }
    }

    private c1 p() {
        String str;
        if (!this.f4107r.t1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        eq e12 = this.f4107r.e1();
        if (e12 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        jq d10 = e12.d();
        if (d10 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri b3 = d10.b();
        if (b3 != null) {
            str = b3.toString();
        } else {
            str = "";
        }
        String str2 = str;
        String a10 = d10.a();
        if (!URLUtil.isValidUrl(str2) && !StringUtils.isValidString(a10)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.k(this.f9060b, "Companion ad does not have any resources attached. Skipping...");
            }
        } else {
            if (d10.c() == jq.a.STATIC) {
                if (com.applovin.impl.sdk.t.a()) {
                    a4.j.x("Caching static companion ad at ", str2, "...", this.f9061c, this.f9060b);
                }
                return new e1(str2, this.f4107r, Collections.emptyList(), false, this.f3762i, this.a, new a(d10));
            }
            if (d10.c() == jq.a.HTML) {
                if (StringUtils.isValidString(str2)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        a4.j.x("Begin caching HTML companion ad. Fetching from ", str2, "...", this.f9061c, this.f9060b);
                    }
                    String d11 = d(str2, null, false);
                    if (StringUtils.isValidString(d11)) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f9061c.a(this.f9060b, "HTML fetched. Caching HTML now...");
                        }
                        return a(d11, Collections.emptyList(), new b(d10));
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f9061c.b(this.f9060b, "Unable to load companion ad resources from " + str2);
                    }
                } else {
                    if (com.applovin.impl.sdk.t.a()) {
                        a4.j.v("Caching provided HTML for companion ad. No fetch required. HTML: ", a10, this.f9061c, this.f9060b);
                    }
                    return a(a10, Collections.emptyList(), new c(d10));
                }
            } else if (d10.c() == jq.a.IFRAME && com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Skip caching of iFrame resource...");
            }
        }
        return null;
    }

    @Override // com.applovin.impl.am
    public void f() {
        this.f4107r.getAdEventTracker().h();
        super.f();
    }

    public d1 q() {
        if (TextUtils.isEmpty(this.f4107r.g1())) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Unable to load HTML template");
                return null;
            }
            return null;
        }
        return a(this.f4107r.g1(), this.f4107r.X(), new e());
    }

    public e1 r() {
        pq p12;
        Uri d10;
        if (!this.f4107r.u1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f4107r.o1() == null || (p12 = this.f4107r.p1()) == null || (d10 = p12.d()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Caching video file " + p12 + " creative...");
        }
        return a(d10.toString(), Collections.emptyList(), false, (e1.a) new d(p12));
    }

    @Override // com.applovin.impl.am, java.lang.Runnable
    public void run() {
        String str;
        super.run();
        boolean G0 = this.f4107r.G0();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f9061c;
            String str2 = this.f9060b;
            StringBuilder sb2 = new StringBuilder("Begin caching for VAST ");
            if (G0) {
                str = "streaming ";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append("ad #");
            sb2.append(this.f3761h.getAdIdNumber());
            sb2.append("...");
            tVar.a(str2, sb2.toString());
        }
        if (G0) {
            if (((Boolean) this.a.a(oj.f6628c1)).booleanValue()) {
                if (!x3.f()) {
                    a(e());
                }
                if (this.f4107r.r1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    c1 p10 = p();
                    if (p10 != null) {
                        arrayList.add(p10);
                    }
                    d1 q10 = q();
                    if (q10 != null) {
                        arrayList.add(q10);
                    }
                    e1 r6 = r();
                    if (r6 != null) {
                        arrayList.add(r6);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f4107r.i1() == bq.c.COMPANION_AD) {
                        c1 p11 = p();
                        if (p11 != null) {
                            arrayList2.add(p11);
                        }
                        d1 q11 = q();
                        if (q11 != null) {
                            arrayList2.add(q11);
                        }
                        a(arrayList2);
                        f();
                        e1 r10 = r();
                        if (r10 != null) {
                            arrayList3.add(r10);
                        }
                        a(arrayList3);
                    } else {
                        e1 r11 = r();
                        if (r11 != null) {
                            arrayList2.add(r11);
                        }
                        a(arrayList2);
                        f();
                        c1 p12 = p();
                        if (p12 != null) {
                            arrayList3.add(p12);
                        }
                        d1 q12 = q();
                        if (q12 != null) {
                            arrayList3.add(q12);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.f4107r.r1()) {
                    f();
                }
                bq.c i12 = this.f4107r.i1();
                bq.c cVar = bq.c.COMPANION_AD;
                if (i12 == cVar) {
                    m();
                    n();
                    a(this.f4107r);
                } else {
                    o();
                }
                if (!this.f4107r.r1()) {
                    f();
                }
                if (this.f4107r.i1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.f4107r);
                }
            }
        } else if (((Boolean) this.a.a(oj.f6628c1)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!x3.f()) {
                arrayList4.addAll(e());
            }
            c1 p13 = p();
            if (p13 != null) {
                arrayList4.add(p13);
            }
            e1 r12 = r();
            if (r12 != null) {
                arrayList4.add(r12);
            }
            d1 q13 = q();
            if (q13 != null) {
                arrayList4.add(q13);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.f4107r);
            f();
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Finished caching VAST ad #" + this.f4107r.getAdIdNumber());
        }
        this.f4107r.s1();
        k();
    }

    @Override // com.applovin.impl.am
    public void a(int i10) {
        this.f4107r.getAdEventTracker().f();
        super.a(i10);
    }
}
