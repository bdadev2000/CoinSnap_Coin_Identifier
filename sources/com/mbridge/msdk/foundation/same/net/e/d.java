package com.mbridge.msdk.foundation.same.net.e;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.tracker.o;
import com.mbridge.msdk.tracker.t;
import com.mbridge.msdk.tracker.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class d {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    private final String P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;
    public String a;

    /* renamed from: aa, reason: collision with root package name */
    private String f13386aa;

    /* renamed from: ab, reason: collision with root package name */
    private String f13387ab;

    /* renamed from: ac, reason: collision with root package name */
    private String f13388ac;

    /* renamed from: ad, reason: collision with root package name */
    private String f13389ad;

    /* renamed from: ae, reason: collision with root package name */
    private boolean f13390ae;

    /* renamed from: af, reason: collision with root package name */
    private int f13391af;

    /* renamed from: b, reason: collision with root package name */
    public String f13392b;

    /* renamed from: c, reason: collision with root package name */
    public String f13393c;

    /* renamed from: d, reason: collision with root package name */
    public String f13394d;

    /* renamed from: e, reason: collision with root package name */
    public String f13395e;

    /* renamed from: f, reason: collision with root package name */
    public String f13396f;

    /* renamed from: g, reason: collision with root package name */
    public String f13397g;

    /* renamed from: h, reason: collision with root package name */
    public String f13398h;

    /* renamed from: i, reason: collision with root package name */
    public String f13399i;

    /* renamed from: j, reason: collision with root package name */
    public String f13400j;

    /* renamed from: k, reason: collision with root package name */
    public String f13401k;

    /* renamed from: l, reason: collision with root package name */
    public String f13402l;

    /* renamed from: m, reason: collision with root package name */
    public int f13403m;

    /* renamed from: n, reason: collision with root package name */
    public int f13404n;

    /* renamed from: o, reason: collision with root package name */
    public int f13405o;

    /* renamed from: p, reason: collision with root package name */
    public int f13406p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13407q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13408r;

    /* renamed from: s, reason: collision with root package name */
    public int f13409s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f13410t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f13411v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList<String> f13412w;

    /* renamed from: x, reason: collision with root package name */
    public String f13413x;

    /* renamed from: y, reason: collision with root package name */
    public String f13414y;

    /* renamed from: z, reason: collision with root package name */
    public String f13415z;

    /* loaded from: classes4.dex */
    public static class a {
        private static final d a = new d();
    }

    public static d f() {
        return a.a;
    }

    public final boolean a() {
        try {
            if (!this.f13408r) {
                ArrayList<String> arrayList = this.f13410t;
                if (arrayList != null && this.u <= arrayList.size() - 1) {
                    this.f13398h = this.f13410t.get(this.u);
                    b();
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f13412w;
                if (arrayList2 != null && this.f13411v <= arrayList2.size() - 1) {
                    if (!b(this.f13412w.get(this.f13411v))) {
                        this.f13402l = this.f13412w.get(this.f13411v);
                        c();
                    }
                    return true;
                }
            }
            if (this.f13407q) {
                this.u = 0;
                this.f13411v = 0;
            }
            return false;
        } catch (Throwable th2) {
            ad.a("RequestUrlUtil", th2.getMessage());
            return false;
        }
    }

    public final void b() {
        this.G = this.f13398h + this.Y;
        this.f13414y = this.f13398h + this.S;
        this.I = this.f13398h + this.Z;
        this.C = this.f13398h + this.V;
        this.K = this.f13398h + this.f13386aa;
    }

    public final void c() {
        this.H = this.f13402l + this.Y;
        this.f13415z = this.f13402l + this.S;
        this.J = this.f13402l + this.Z;
        this.D = this.f13402l + this.V;
        this.L = this.f13402l + this.f13386aa;
    }

    public final int d() {
        return this.f13391af;
    }

    public final void e() {
        boolean z10;
        HashMap<String, String> G;
        o oVar;
        g d10 = e.d(h.a());
        if (d10 != null) {
            com.mbridge.msdk.c.a n10 = d10.n();
            if (n10 != null) {
                this.f13401k = n10.f();
                this.f13405o = n10.g();
                this.f13397g = n10.e();
                this.F = this.f13397g + this.X;
            }
            com.mbridge.msdk.c.d C = d10.C();
            if (C != null) {
                this.f13400j = C.d();
                this.f13404n = C.e();
                this.f13395e = C.c();
                this.E = this.f13395e + this.W;
                com.mbridge.msdk.c.d C2 = d10.C();
                if (C2 != null && C2.a() != 1) {
                    int a10 = af.a().a("monitor", "type", af.a().a("t_r_t", 1));
                    if (a10 != 0 && a10 != 1) {
                        a10 = 0;
                    }
                    w.a a11 = new w.a().a(new com.mbridge.msdk.foundation.same.report.d()).a(new m());
                    if (a10 == 1) {
                        oVar = new o(new l((byte) 2), a.a.f13400j, a.a.f13404n);
                    } else {
                        oVar = new o(new com.mbridge.msdk.tracker.network.toolbox.h(), a.a.E, 0);
                    }
                    t.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), a11.a(a10, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 1)).a(), C2.b() * 1000, com.mbridge.msdk.foundation.same.report.c.a());
                }
            }
            if (d10.an() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f13408r = z10;
            this.f13409s = d10.an();
            this.f13390ae = !d10.y(2);
            if (d10.G() != null && d10.G().size() > 0 && (G = d10.G()) != null && G.size() > 0) {
                if (G.containsKey("v") && !TextUtils.isEmpty(G.get("v")) && b(G.get("v"))) {
                    this.f13394d = G.get("v");
                    this.M = this.f13394d + this.f13387ab;
                    this.N = this.f13394d + this.f13388ac;
                    this.O = this.f13394d + this.f13389ad;
                    this.A = this.f13394d + this.T;
                }
                if (G.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(G.get(CampaignEx.JSON_KEY_HB)) && b(G.get(CampaignEx.JSON_KEY_HB))) {
                    this.Q = G.get(CampaignEx.JSON_KEY_HB);
                    this.f13413x = this.Q + this.R;
                    this.B = this.Q + this.U;
                }
                if (G.containsKey("lg") && !TextUtils.isEmpty(G.get("lg"))) {
                    String str = G.get("lg");
                    if (b(str)) {
                        this.f13393c = str;
                    } else {
                        this.f13399i = str;
                    }
                }
                if (G.containsKey("lgt") && !TextUtils.isEmpty(G.get("lgt"))) {
                    String str2 = G.get("lgt");
                    if (b(str2)) {
                        String c10 = c(str2);
                        if (!TextUtils.isEmpty(c10)) {
                            this.f13399i = c10;
                        }
                    } else {
                        this.f13399i = str2;
                    }
                }
            }
            String y4 = d10.y();
            if (!TextUtils.isEmpty(y4)) {
                this.f13398h = y4;
                b();
                this.f13410t.add(0, y4);
            }
            String z11 = d10.z();
            if (!TextUtils.isEmpty(z11)) {
                this.f13402l = z11;
                c();
                this.f13412w.add(0, z11);
            }
        }
    }

    private d() {
        this.P = "RequestUrlUtil";
        this.a = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f13392b = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f13393c = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f13394d = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f13395e = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f13396f = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f13397g = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f13398h = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f13399i = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f13400j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f13401k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f13402l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f13403m = 9377;
        this.f13404n = 9377;
        this.f13405o = 9988;
        this.f13406p = 9377;
        this.f13407q = false;
        this.f13408r = false;
        this.f13409s = 1;
        this.f13410t = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.u = 0;
        this.f13411v = 0;
        this.f13412w = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.Q = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.R = "/bid";
        this.f13413x = this.Q + this.R;
        this.S = "/sdk/customid";
        this.f13414y = this.f13398h + this.S;
        this.f13415z = this.f13402l + this.S;
        this.T = "/image";
        this.A = this.f13394d + this.T;
        this.U = "/load";
        this.B = this.Q + this.U;
        this.V = "/mapping";
        this.C = this.f13398h + this.V;
        this.D = this.f13402l + this.V;
        this.W = "";
        this.E = this.f13397g + this.W;
        this.X = "/batchPaidEvent";
        this.F = this.f13397g + this.X;
        this.Y = "/setting";
        this.G = this.f13398h + this.Y;
        this.H = this.f13402l + this.Y;
        this.Z = "/rewardsetting";
        this.I = this.f13398h + this.Z;
        this.J = this.f13402l + this.Z;
        this.f13386aa = "/appwall/setting";
        this.K = this.f13398h + this.f13386aa;
        this.L = this.f13402l + this.f13386aa;
        this.f13387ab = "/openapi/ad/v3";
        this.M = this.f13394d + this.f13387ab;
        this.f13388ac = "/openapi/ad/v4";
        this.N = this.f13394d + this.f13388ac;
        this.f13389ad = "/openapi/ad/v5";
        this.O = this.f13394d + this.f13389ad;
        this.f13390ae = true;
        this.f13391af = 0;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th2) {
            ad.b("RequestUrlUtil", th2.getMessage());
            return "";
        }
    }

    public final String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return a(true, split[1]);
                }
                return a(true, "");
            }
        } catch (Exception e2) {
            ad.b("RequestUrlUtil", e2.getMessage());
        }
        return i10 % 2 == 0 ? this.O : this.M;
    }

    public final String a(boolean z10, String str) {
        if (z10) {
            if (this.B.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.B.replace(JsonUtils.EMPTY_JSON, str + "-");
            }
            return this.B.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.f13413x.replace(JsonUtils.EMPTY_JSON, "");
    }

    public final void a(int i10) {
        this.f13391af = i10;
    }

    public final String a(String str) {
        return a.a.a(str, 1);
    }
}
