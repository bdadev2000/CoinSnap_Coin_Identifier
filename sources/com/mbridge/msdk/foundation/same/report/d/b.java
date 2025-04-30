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

/* loaded from: classes3.dex */
public final class b implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15898a;
    private Map<String, Map<String, String>> b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f15899c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f15900d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.foundation.c.b f15901e;

    /* renamed from: f, reason: collision with root package name */
    private String f15902f;

    /* renamed from: g, reason: collision with root package name */
    private List<CampaignEx> f15903g;

    /* renamed from: h, reason: collision with root package name */
    private String f15904h;

    /* renamed from: i, reason: collision with root package name */
    private int f15905i;

    /* renamed from: j, reason: collision with root package name */
    private String f15906j;

    /* renamed from: k, reason: collision with root package name */
    private String f15907k;
    private String l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private String f15908n;

    /* renamed from: o, reason: collision with root package name */
    private String f15909o;

    /* renamed from: p, reason: collision with root package name */
    private String f15910p;

    /* renamed from: q, reason: collision with root package name */
    private String f15911q;

    /* renamed from: r, reason: collision with root package name */
    private int f15912r;

    /* renamed from: s, reason: collision with root package name */
    private int f15913s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15914t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f15915u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f15916v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15917w;

    /* renamed from: x, reason: collision with root package name */
    private CampaignEx f15918x;

    /* renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f15919y;

    public b() {
        this.f15898a = false;
        this.b = new HashMap();
        this.f15899c = new HashMap();
        this.f15900d = new HashMap();
        this.f15902f = "";
        this.f15912r = -1;
        this.f15914t = false;
        this.f15916v = false;
    }

    public final boolean a() {
        return this.f15898a;
    }

    public final int b() {
        return this.f15912r;
    }

    public final String c() {
        return this.f15911q;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String d() {
        return this.f15910p;
    }

    public final List<CampaignEx> e() {
        return this.f15903g;
    }

    public final String f() {
        return this.f15902f;
    }

    public final CampaignEx g() {
        return this.f15918x;
    }

    public final List<CampaignEx> h() {
        return this.f15919y;
    }

    public final String i() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f15904h)) {
            return this.f15904h;
        }
        try {
            if (TextUtils.isEmpty(this.f15904h)) {
                String str = this.f15902f + this.f15911q;
                Map<String, Map<String, String>> map2 = this.b;
                if (map2 != null && map2.containsKey(str) && (map = this.b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f15904h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
        return this.f15904h;
    }

    public final int j() {
        return this.f15905i;
    }

    public final String k() {
        return this.f15907k;
    }

    public final String l() {
        return this.l;
    }

    public final String m() {
        return this.f15908n;
    }

    public final int n() {
        return this.f15913s;
    }

    public final com.mbridge.msdk.foundation.c.b o() {
        return this.f15901e;
    }

    public final Map<String, Map<String, String>> p() {
        return this.b;
    }

    public final Map<String, Map<String, String>> q() {
        return this.f15899c;
    }

    public final boolean r() {
        return this.f15915u;
    }

    public final boolean s() {
        return this.f15916v;
    }

    public final String t() {
        return this.m;
    }

    public final void a(boolean z8) {
        this.f15914t = z8;
    }

    public final void b(String str) {
        this.f15910p = str;
    }

    public final void c(String str) {
        this.f15902f = str;
    }

    public final void d(String str) {
        this.f15904h = str;
    }

    public final void e(String str) {
        this.f15906j = str;
    }

    public final void f(String str) {
        this.f15907k = str;
    }

    public final void g(String str) {
        this.l = str;
    }

    public final void h(String str) {
        this.f15908n = str;
    }

    public final Map<String, String> j(String str) {
        int F4;
        String a6;
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.foundation.c.b bVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d dVar = new d();
        try {
            this.f15911q = str;
            dVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(i())) {
                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, i());
            }
            int i9 = this.f15905i;
            if (i9 != 0) {
                dVar.a("adtp", Integer.valueOf(i9));
            }
            if (!TextUtils.isEmpty(this.f15909o)) {
                dVar.a(CampaignEx.JSON_KEY_HB, this.f15909o);
            }
            if (!TextUtils.isEmpty(this.f15906j)) {
                dVar.a("bid_tk", this.f15906j);
            }
            if (!TextUtils.isEmpty(str)) {
                dVar.a("key", str);
            }
            if (Arrays.asList(a.f15888a).contains(str)) {
                dVar.a("from_cache", this.f15914t ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if ("2000047".contains(str) && (bVar2 = this.f15901e) != null) {
                dVar.a("type", Integer.valueOf(bVar2.f()));
                dVar.a("reason", bVar2.b());
                if (!TextUtils.isEmpty(bVar2.h())) {
                    dVar.a("reason_d", bVar2.h());
                    dVar.a("type_d", Integer.valueOf(bVar2.g()));
                }
            }
            if ("2000048".contains(str) && (bVar = this.f15901e) != null && !TextUtils.isEmpty(bVar.h())) {
                dVar.a("type", Integer.valueOf(bVar.g()));
                dVar.a("reason", bVar.h());
            }
            if ("2000126".equals(this.f15911q)) {
                String str2 = this.f15906j;
                g a9 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (TextUtils.isEmpty(str2)) {
                    F4 = a9.ap();
                } else {
                    F4 = a9.F();
                }
                String a10 = com.mbridge.msdk.foundation.same.net.e.d.f().a(str2, F4);
                if (TextUtils.isEmpty(a10)) {
                    a6 = "";
                } else {
                    a6 = ao.a(a10);
                }
                dVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.c.e.a().a(a6)));
                dVar.a("dns_hs", a6);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
        return dVar.a();
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f15902f + str;
            Map<String, Map<String, String>> map = this.b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.b.remove(str2);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public final long l(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f15900d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l = this.f15900d.get(str);
            return System.currentTimeMillis() - (l != null ? l.longValue() : 0L);
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e4.printStackTrace();
            return 0L;
        }
    }

    public final void m(String str) {
        if (this.f15900d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f15900d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public final void n(String str) {
        this.m = str;
    }

    public final void a(int i9) {
        this.f15912r = i9;
    }

    public final void b(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f15919y = list;
    }

    public final void c(int i9) {
        this.f15913s = i9;
    }

    public final void d(boolean z8) {
        this.f15917w = z8;
    }

    public final void a(String str) {
        this.f15911q = str;
    }

    public final void c(boolean z8) {
        this.f15916v = z8;
    }

    public final void a(List<CampaignEx> list) {
        this.f15903g = list;
    }

    public final void b(int i9) {
        this.f15905i = i9;
    }

    public final void a(CampaignEx campaignEx) {
        this.f15918x = campaignEx;
    }

    public final void b(boolean z8) {
        this.f15915u = z8;
    }

    public final void a(String str, d dVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f15902f + str;
            Map<String, Map<String, String>> map2 = this.b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.b.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.b.put(str2, dVar.a());
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public b(boolean z8) {
        this.f15898a = false;
        this.b = new HashMap();
        this.f15899c = new HashMap();
        this.f15900d = new HashMap();
        this.f15902f = "";
        this.f15912r = -1;
        this.f15914t = false;
        this.f15916v = false;
        this.f15898a = z8;
    }

    public final void i(String str) {
        this.f15909o = str;
    }

    public final void a(String str, d dVar, int i9) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f15902f + "_" + i9 + "_" + str;
            Map<String, Map<String, String>> map2 = this.f15899c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f15899c.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f15899c.put(str2, dVar.a());
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        this.f15901e = bVar;
    }
}
