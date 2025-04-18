package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b implements Serializable, Cloneable {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f13461b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f13462c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f13463d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.foundation.c.b f13464e;

    /* renamed from: f, reason: collision with root package name */
    private String f13465f;

    /* renamed from: g, reason: collision with root package name */
    private List<CampaignEx> f13466g;

    /* renamed from: h, reason: collision with root package name */
    private String f13467h;

    /* renamed from: i, reason: collision with root package name */
    private int f13468i;

    /* renamed from: j, reason: collision with root package name */
    private String f13469j;

    /* renamed from: k, reason: collision with root package name */
    private String f13470k;

    /* renamed from: l, reason: collision with root package name */
    private String f13471l;

    /* renamed from: m, reason: collision with root package name */
    private String f13472m;

    /* renamed from: n, reason: collision with root package name */
    private String f13473n;

    /* renamed from: o, reason: collision with root package name */
    private String f13474o;

    /* renamed from: p, reason: collision with root package name */
    private String f13475p;

    /* renamed from: q, reason: collision with root package name */
    private String f13476q;

    /* renamed from: r, reason: collision with root package name */
    private int f13477r;

    /* renamed from: s, reason: collision with root package name */
    private int f13478s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13479t;
    private boolean u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13480v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13481w;

    /* renamed from: x, reason: collision with root package name */
    private CampaignEx f13482x;

    /* renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f13483y;

    public b() {
        this.a = false;
        this.f13461b = new HashMap();
        this.f13462c = new HashMap();
        this.f13463d = new HashMap();
        this.f13465f = "";
        this.f13477r = -1;
        this.f13479t = false;
        this.f13480v = false;
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.f13477r;
    }

    public final String c() {
        return this.f13476q;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String d() {
        return this.f13475p;
    }

    public final List<CampaignEx> e() {
        return this.f13466g;
    }

    public final String f() {
        return this.f13465f;
    }

    public final CampaignEx g() {
        return this.f13482x;
    }

    public final List<CampaignEx> h() {
        return this.f13483y;
    }

    public final String i() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f13467h)) {
            return this.f13467h;
        }
        try {
            if (TextUtils.isEmpty(this.f13467h)) {
                String str = this.f13465f + this.f13476q;
                Map<String, Map<String, String>> map2 = this.f13461b;
                if (map2 != null && map2.containsKey(str) && (map = this.f13461b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f13467h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return this.f13467h;
    }

    public final int j() {
        return this.f13468i;
    }

    public final String k() {
        return this.f13470k;
    }

    public final String l() {
        return this.f13471l;
    }

    public final String m() {
        return this.f13473n;
    }

    public final int n() {
        return this.f13478s;
    }

    public final com.mbridge.msdk.foundation.c.b o() {
        return this.f13464e;
    }

    public final Map<String, Map<String, String>> p() {
        return this.f13461b;
    }

    public final Map<String, Map<String, String>> q() {
        return this.f13462c;
    }

    public final boolean r() {
        return this.u;
    }

    public final boolean s() {
        return this.f13480v;
    }

    public final String t() {
        return this.f13472m;
    }

    public final void a(boolean z10) {
        this.f13479t = z10;
    }

    public final void b(String str) {
        this.f13475p = str;
    }

    public final void c(String str) {
        this.f13465f = str;
    }

    public final void d(String str) {
        this.f13467h = str;
    }

    public final void e(String str) {
        this.f13469j = str;
    }

    public final void f(String str) {
        this.f13470k = str;
    }

    public final void g(String str) {
        this.f13471l = str;
    }

    public final void h(String str) {
        this.f13473n = str;
    }

    public final Map<String, String> j(String str) {
        int F;
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.foundation.c.b bVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d dVar = new d();
        try {
            this.f13476q = str;
            dVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(i())) {
                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, i());
            }
            int i10 = this.f13468i;
            if (i10 != 0) {
                dVar.a("adtp", Integer.valueOf(i10));
            }
            if (!TextUtils.isEmpty(this.f13474o)) {
                dVar.a(CampaignEx.JSON_KEY_HB, this.f13474o);
            }
            if (!TextUtils.isEmpty(this.f13469j)) {
                dVar.a("bid_tk", this.f13469j);
            }
            if (!TextUtils.isEmpty(str)) {
                dVar.a("key", str);
            }
            if (Arrays.asList(a.a).contains(str)) {
                dVar.a("from_cache", this.f13479t ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if ("2000047".contains(str) && (bVar2 = this.f13464e) != null) {
                dVar.a("type", Integer.valueOf(bVar2.f()));
                dVar.a("reason", bVar2.b());
                if (!TextUtils.isEmpty(bVar2.h())) {
                    dVar.a("reason_d", bVar2.h());
                    dVar.a("type_d", Integer.valueOf(bVar2.g()));
                }
            }
            if ("2000048".contains(str) && (bVar = this.f13464e) != null && !TextUtils.isEmpty(bVar.h())) {
                dVar.a("type", Integer.valueOf(bVar.g()));
                dVar.a("reason", bVar.h());
            }
            if ("2000126".equals(this.f13476q)) {
                String str2 = this.f13469j;
                g a = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (TextUtils.isEmpty(str2)) {
                    F = a.ap();
                } else {
                    F = a.F();
                }
                String a10 = com.mbridge.msdk.foundation.same.net.e.d.f().a(str2, F);
                String a11 = TextUtils.isEmpty(a10) ? "" : ao.a(a10);
                dVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.c.e.a().a(a11)));
                dVar.a("dns_hs", a11);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return dVar.a();
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f13465f + str;
            Map<String, Map<String, String>> map = this.f13461b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f13461b.remove(str2);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final long l(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f13463d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l10 = this.f13463d.get(str);
            return System.currentTimeMillis() - (l10 != null ? l10.longValue() : 0L);
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e2.printStackTrace();
            return 0L;
        }
    }

    public final void m(String str) {
        if (this.f13463d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f13463d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public final void n(String str) {
        this.f13472m = str;
    }

    public final void a(int i10) {
        this.f13477r = i10;
    }

    public final void b(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f13483y = list;
    }

    public final void c(int i10) {
        this.f13478s = i10;
    }

    public final void d(boolean z10) {
        this.f13481w = z10;
    }

    public final void a(String str) {
        this.f13476q = str;
    }

    public final void c(boolean z10) {
        this.f13480v = z10;
    }

    public final void a(List<CampaignEx> list) {
        this.f13466g = list;
    }

    public final void b(int i10) {
        this.f13468i = i10;
    }

    public final void a(CampaignEx campaignEx) {
        this.f13482x = campaignEx;
    }

    public final void b(boolean z10) {
        this.u = z10;
    }

    public final void a(String str, d dVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f13465f + str;
            Map<String, Map<String, String>> map2 = this.f13461b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f13461b.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f13461b.put(str2, dVar.a());
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public b(boolean z10) {
        this.a = false;
        this.f13461b = new HashMap();
        this.f13462c = new HashMap();
        this.f13463d = new HashMap();
        this.f13465f = "";
        this.f13477r = -1;
        this.f13479t = false;
        this.f13480v = false;
        this.a = z10;
    }

    public final void i(String str) {
        this.f13474o = str;
    }

    public final void a(String str, d dVar, int i10) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f13465f + "_" + i10 + "_" + str;
            Map<String, Map<String, String>> map2 = this.f13462c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f13462c.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f13462c.put(str2, dVar.a());
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        this.f13464e = bVar;
    }
}
