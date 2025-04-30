package com.mbridge.msdk.foundation.same.net.e;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.L;
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

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public String f15801A;

    /* renamed from: B, reason: collision with root package name */
    public String f15802B;

    /* renamed from: C, reason: collision with root package name */
    public String f15803C;

    /* renamed from: D, reason: collision with root package name */
    public String f15804D;

    /* renamed from: E, reason: collision with root package name */
    public String f15805E;

    /* renamed from: F, reason: collision with root package name */
    public String f15806F;

    /* renamed from: G, reason: collision with root package name */
    public String f15807G;

    /* renamed from: H, reason: collision with root package name */
    public String f15808H;

    /* renamed from: I, reason: collision with root package name */
    public String f15809I;

    /* renamed from: J, reason: collision with root package name */
    public String f15810J;

    /* renamed from: K, reason: collision with root package name */
    public String f15811K;

    /* renamed from: L, reason: collision with root package name */
    public String f15812L;

    /* renamed from: M, reason: collision with root package name */
    public String f15813M;

    /* renamed from: N, reason: collision with root package name */
    public String f15814N;
    public String O;

    /* renamed from: P, reason: collision with root package name */
    private final String f15815P;

    /* renamed from: Q, reason: collision with root package name */
    private String f15816Q;

    /* renamed from: R, reason: collision with root package name */
    private String f15817R;

    /* renamed from: S, reason: collision with root package name */
    private String f15818S;

    /* renamed from: T, reason: collision with root package name */
    private String f15819T;

    /* renamed from: U, reason: collision with root package name */
    private String f15820U;

    /* renamed from: V, reason: collision with root package name */
    private String f15821V;

    /* renamed from: W, reason: collision with root package name */
    private String f15822W;

    /* renamed from: X, reason: collision with root package name */
    private String f15823X;

    /* renamed from: Y, reason: collision with root package name */
    private String f15824Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f15825Z;

    /* renamed from: a, reason: collision with root package name */
    public String f15826a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private boolean ae;
    private int af;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f15827c;

    /* renamed from: d, reason: collision with root package name */
    public String f15828d;

    /* renamed from: e, reason: collision with root package name */
    public String f15829e;

    /* renamed from: f, reason: collision with root package name */
    public String f15830f;

    /* renamed from: g, reason: collision with root package name */
    public String f15831g;

    /* renamed from: h, reason: collision with root package name */
    public String f15832h;

    /* renamed from: i, reason: collision with root package name */
    public String f15833i;

    /* renamed from: j, reason: collision with root package name */
    public String f15834j;

    /* renamed from: k, reason: collision with root package name */
    public String f15835k;
    public String l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f15836n;

    /* renamed from: o, reason: collision with root package name */
    public int f15837o;

    /* renamed from: p, reason: collision with root package name */
    public int f15838p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15839q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15840r;

    /* renamed from: s, reason: collision with root package name */
    public int f15841s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f15842t;

    /* renamed from: u, reason: collision with root package name */
    public int f15843u;

    /* renamed from: v, reason: collision with root package name */
    public int f15844v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList<String> f15845w;

    /* renamed from: x, reason: collision with root package name */
    public String f15846x;

    /* renamed from: y, reason: collision with root package name */
    public String f15847y;

    /* renamed from: z, reason: collision with root package name */
    public String f15848z;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f15849a = new d();
    }

    public static d f() {
        return a.f15849a;
    }

    public final boolean a() {
        try {
            if (!this.f15840r) {
                ArrayList<String> arrayList = this.f15842t;
                if (arrayList != null && this.f15843u <= arrayList.size() - 1) {
                    this.f15832h = this.f15842t.get(this.f15843u);
                    b();
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f15845w;
                if (arrayList2 != null && this.f15844v <= arrayList2.size() - 1) {
                    if (!b(this.f15845w.get(this.f15844v))) {
                        this.l = this.f15845w.get(this.f15844v);
                        c();
                    }
                    return true;
                }
            }
            if (this.f15839q) {
                this.f15843u = 0;
                this.f15844v = 0;
            }
            return false;
        } catch (Throwable th) {
            ad.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public final void b() {
        this.f15807G = this.f15832h + this.f15824Y;
        this.f15847y = this.f15832h + this.f15818S;
        this.f15809I = this.f15832h + this.f15825Z;
        this.f15803C = this.f15832h + this.f15821V;
        this.f15811K = this.f15832h + this.aa;
    }

    public final void c() {
        this.f15808H = this.l + this.f15824Y;
        this.f15848z = this.l + this.f15818S;
        this.f15810J = this.l + this.f15825Z;
        this.f15804D = this.l + this.f15821V;
        this.f15812L = this.l + this.aa;
    }

    public final int d() {
        return this.af;
    }

    public final void e() {
        boolean z8;
        HashMap<String, String> G3;
        o oVar;
        g f9 = L.f(h.a());
        if (f9 != null) {
            com.mbridge.msdk.c.a n2 = f9.n();
            if (n2 != null) {
                this.f15835k = n2.f();
                this.f15837o = n2.g();
                this.f15831g = n2.e();
                this.f15806F = this.f15831g + this.f15823X;
            }
            com.mbridge.msdk.c.d C8 = f9.C();
            if (C8 != null) {
                this.f15834j = C8.d();
                this.f15836n = C8.e();
                this.f15829e = C8.c();
                this.f15805E = this.f15829e + this.f15822W;
                com.mbridge.msdk.c.d C9 = f9.C();
                if (C9 != null && C9.a() != 1) {
                    int a6 = af.a().a("monitor", "type", af.a().a("t_r_t", 1));
                    if (a6 != 0 && a6 != 1) {
                        a6 = 0;
                    }
                    w.a a9 = new w.a().a(new com.mbridge.msdk.foundation.same.report.d()).a(new m());
                    if (a6 == 1) {
                        oVar = new o(new l((byte) 2), a.f15849a.f15834j, a.f15849a.f15836n);
                    } else {
                        oVar = new o(new com.mbridge.msdk.tracker.network.toolbox.h(), a.f15849a.f15805E, 0);
                    }
                    t.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), a9.a(a6, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 1)).a(), C9.b() * 1000, com.mbridge.msdk.foundation.same.report.c.a());
                }
            }
            if (f9.an() == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f15840r = z8;
            this.f15841s = f9.an();
            this.ae = !f9.y(2);
            if (f9.G() != null && f9.G().size() > 0 && (G3 = f9.G()) != null && G3.size() > 0) {
                if (G3.containsKey("v") && !TextUtils.isEmpty(G3.get("v")) && b(G3.get("v"))) {
                    this.f15828d = G3.get("v");
                    this.f15813M = this.f15828d + this.ab;
                    this.f15814N = this.f15828d + this.ac;
                    this.O = this.f15828d + this.ad;
                    this.f15801A = this.f15828d + this.f15819T;
                }
                if (G3.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(G3.get(CampaignEx.JSON_KEY_HB)) && b(G3.get(CampaignEx.JSON_KEY_HB))) {
                    this.f15816Q = G3.get(CampaignEx.JSON_KEY_HB);
                    this.f15846x = this.f15816Q + this.f15817R;
                    this.f15802B = this.f15816Q + this.f15820U;
                }
                if (G3.containsKey("lg") && !TextUtils.isEmpty(G3.get("lg"))) {
                    String str = G3.get("lg");
                    if (b(str)) {
                        this.f15827c = str;
                    } else {
                        this.f15833i = str;
                    }
                }
                if (G3.containsKey("lgt") && !TextUtils.isEmpty(G3.get("lgt"))) {
                    String str2 = G3.get("lgt");
                    if (b(str2)) {
                        String c9 = c(str2);
                        if (!TextUtils.isEmpty(c9)) {
                            this.f15833i = c9;
                        }
                    } else {
                        this.f15833i = str2;
                    }
                }
            }
            String y4 = f9.y();
            if (!TextUtils.isEmpty(y4)) {
                this.f15832h = y4;
                b();
                this.f15842t.add(0, y4);
            }
            String z9 = f9.z();
            if (!TextUtils.isEmpty(z9)) {
                this.l = z9;
                c();
                this.f15845w.add(0, z9);
            }
        }
    }

    private d() {
        this.f15815P = "RequestUrlUtil";
        this.f15826a = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.b = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f15827c = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f15828d = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f15829e = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f15830f = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f15831g = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f15832h = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f15833i = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f15834j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f15835k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.m = 9377;
        this.f15836n = 9377;
        this.f15837o = 9988;
        this.f15838p = 9377;
        this.f15839q = false;
        this.f15840r = false;
        this.f15841s = 1;
        this.f15842t = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f15843u = 0;
        this.f15844v = 0;
        this.f15845w = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f15816Q = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f15817R = "/bid";
        this.f15846x = this.f15816Q + this.f15817R;
        this.f15818S = "/sdk/customid";
        this.f15847y = this.f15832h + this.f15818S;
        this.f15848z = this.l + this.f15818S;
        this.f15819T = "/image";
        this.f15801A = this.f15828d + this.f15819T;
        this.f15820U = "/load";
        this.f15802B = this.f15816Q + this.f15820U;
        this.f15821V = "/mapping";
        this.f15803C = this.f15832h + this.f15821V;
        this.f15804D = this.l + this.f15821V;
        this.f15822W = "";
        this.f15805E = this.f15831g + this.f15822W;
        this.f15823X = "/batchPaidEvent";
        this.f15806F = this.f15831g + this.f15823X;
        this.f15824Y = "/setting";
        this.f15807G = this.f15832h + this.f15824Y;
        this.f15808H = this.l + this.f15824Y;
        this.f15825Z = "/rewardsetting";
        this.f15809I = this.f15832h + this.f15825Z;
        this.f15810J = this.l + this.f15825Z;
        this.aa = "/appwall/setting";
        this.f15811K = this.f15832h + this.aa;
        this.f15812L = this.l + this.aa;
        this.ab = "/openapi/ad/v3";
        this.f15813M = this.f15828d + this.ab;
        this.ac = "/openapi/ad/v4";
        this.f15814N = this.f15828d + this.ac;
        this.ad = "/openapi/ad/v5";
        this.O = this.f15828d + this.ad;
        this.ae = true;
        this.af = 0;
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
        } catch (Throwable th) {
            ad.b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    public final String a(String str, int i9) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return a(true, split[1]);
                }
                return a(true, "");
            }
        } catch (Exception e4) {
            ad.b("RequestUrlUtil", e4.getMessage());
        }
        return i9 % 2 == 0 ? this.O : this.f15813M;
    }

    public final String a(boolean z8, String str) {
        if (!z8) {
            return this.f15846x.replace(JsonUtils.EMPTY_JSON, "");
        }
        if (!this.f15802B.contains(JsonUtils.EMPTY_JSON) || TextUtils.isEmpty(str)) {
            return this.f15802B.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.f15802B.replace(JsonUtils.EMPTY_JSON, str + "-");
    }

    public final void a(int i9) {
        this.af = i9;
    }

    public final String a(String str) {
        return a.f15849a.a(str, 1);
    }
}
