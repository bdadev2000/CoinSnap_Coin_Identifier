package com.mbridge.msdk.c;

import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {
    private String A;
    private int D;
    private int E;
    private int I;
    private String K;
    private int N;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f12400b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f12401c;

    /* renamed from: d, reason: collision with root package name */
    private int f12402d;

    /* renamed from: e, reason: collision with root package name */
    private int f12403e;

    /* renamed from: f, reason: collision with root package name */
    private int f12404f;

    /* renamed from: g, reason: collision with root package name */
    private int f12405g;

    /* renamed from: h, reason: collision with root package name */
    private int f12406h;

    /* renamed from: i, reason: collision with root package name */
    private int f12407i;

    /* renamed from: k, reason: collision with root package name */
    private long f12409k;

    /* renamed from: l, reason: collision with root package name */
    private long f12410l;

    /* renamed from: m, reason: collision with root package name */
    private int f12411m;

    /* renamed from: n, reason: collision with root package name */
    private int f12412n;

    /* renamed from: o, reason: collision with root package name */
    private int f12413o;

    /* renamed from: p, reason: collision with root package name */
    private long f12414p;

    /* renamed from: q, reason: collision with root package name */
    private long f12415q;

    /* renamed from: r, reason: collision with root package name */
    private int f12416r;

    /* renamed from: s, reason: collision with root package name */
    private String f12417s;

    /* renamed from: t, reason: collision with root package name */
    private int f12418t;
    private int u;

    /* renamed from: z, reason: collision with root package name */
    private String f12423z;
    private String a = "";

    /* renamed from: j, reason: collision with root package name */
    private int f12408j = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f12419v = 30;

    /* renamed from: w, reason: collision with root package name */
    private int f12420w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f12421x = 10;

    /* renamed from: y, reason: collision with root package name */
    private int f12422y = 60;
    private int B = 1;
    private String C = "";
    private int F = 100;
    private int G = 60;
    private int H = 5000;
    private int J = 1;
    private String L = "";
    private String M = "";

    public static k a(JSONObject jSONObject) {
        k kVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            k kVar2 = new k();
            try {
                ((c) kVar2).K = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                String optString = jSONObject.optString("ab_id");
                ((c) kVar2).a = optString;
                com.mbridge.msdk.foundation.controller.a.f13020b.put(((c) kVar2).K, optString);
                ((c) kVar2).L = jSONObject.optString("rid");
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i10)));
                    }
                    ((c) kVar2).f12400b = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i11)));
                    }
                    ((c) kVar2).f12401c = arrayList2;
                }
                ((c) kVar2).I = jSONObject.optInt("tpqn");
                ((c) kVar2).f12404f = jSONObject.optInt("aqn");
                ((c) kVar2).f12403e = jSONObject.optInt("acn");
                ((c) kVar2).N = jSONObject.optInt("wt");
                int i12 = 1;
                ((c) kVar2).f12420w = jSONObject.optInt("iscasf", 1);
                ((c) kVar2).H = jSONObject.optInt("spmxrt", 5000);
                ((c) kVar2).f12414p = jSONObject.optLong("current_time");
                ((c) kVar2).B = jSONObject.optInt("offset");
                ((c) kVar2).f12415q = jSONObject.optLong("dlct", 3600L);
                ((c) kVar2).f12405g = jSONObject.optInt("autoplay", 0);
                ((c) kVar2).f12416r = jSONObject.optInt("dlnet", 2);
                ((c) kVar2).A = jSONObject.optString("no_offer");
                ((c) kVar2).f12407i = jSONObject.optInt("cb_type");
                ((c) kVar2).f12410l = jSONObject.optLong("clct", 86400L);
                ((c) kVar2).f12409k = jSONObject.optLong("clcq", 300L);
                ((c) kVar2).F = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                ((c) kVar2).f12408j = jSONObject.optInt("cd_rate", 0);
                ((c) kVar2).f12412n = jSONObject.optInt(AppLovinEventTypes.USER_VIEWED_CONTENT, 1);
                ((c) kVar2).u = jSONObject.optInt("impt", 0);
                ((c) kVar2).f12418t = jSONObject.optInt("icon_type", 1);
                ((c) kVar2).f12423z = jSONObject.optString("no_ads_url", "");
                ((c) kVar2).E = jSONObject.optInt("playclosebtn_tm", -1);
                ((c) kVar2).D = jSONObject.optInt("play_ctdown", 0);
                ((c) kVar2).f12411m = jSONObject.optInt("close_alert", 0);
                ((c) kVar2).f12419v = jSONObject.optInt("intershowlimit", 30);
                ((c) kVar2).G = jSONObject.optInt("refreshFq", 60);
                ((c) kVar2).f12406h = jSONObject.optInt("closeBtn", 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i12 = optInt;
                }
                ((c) kVar2).J = i12;
                ((c) kVar2).C = jSONObject.optString("placementid", "");
                ((c) kVar2).f12421x = jSONObject.optInt("ltafemty", 10);
                ((c) kVar2).f12422y = jSONObject.optInt("ltorwc", 60);
                ((c) kVar2).M = jSONObject.optString("vtag", "");
                return kVar2;
            } catch (Exception e2) {
                e = e2;
                kVar = kVar2;
                e.printStackTrace();
                return kVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final List<Integer> b() {
        return this.f12400b;
    }

    public final List<Integer> c() {
        return this.f12401c;
    }

    public final int d() {
        return this.f12403e;
    }

    public final int e() {
        return this.f12404f;
    }

    public final int f() {
        return this.f12406h;
    }

    public final int g() {
        return this.f12408j;
    }

    public final int h() {
        return this.f12412n;
    }

    public final long i() {
        return this.f12414p;
    }

    public final long j() {
        return this.f12415q;
    }

    public final int k() {
        return this.f12416r;
    }

    public final int l() {
        return this.u;
    }

    public final int m() {
        return this.f12420w;
    }

    public final int n() {
        return this.f12421x;
    }

    public final int o() {
        return this.f12422y;
    }

    public final int p() {
        return this.F;
    }

    public final int q() {
        return this.G;
    }

    public final int r() {
        return this.H;
    }

    public final String s() {
        return this.L;
    }

    public final String t() {
        return this.M;
    }

    public String toString() {
        List<Integer> list = this.f12400b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f12400b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb2 = new StringBuilder("offset = ");
        sb2.append(this.B);
        sb2.append(" unitId = ");
        sb2.append(this.K);
        sb2.append(" fbPlacementId = ");
        return vd.e.h(sb2, this.f12417s, str);
    }

    public final int u() {
        return this.N;
    }

    public final int v() {
        return this.f12405g;
    }

    public final int w() {
        return this.B;
    }

    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f12400b;
            if (list != null && list.size() > 0) {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(list.get(i10));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f12401c;
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < size2; i11++) {
                    jSONArray2.put(list2.get(i11));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.I);
            jSONObject.put("aqn", this.f12404f);
            jSONObject.put("acn", this.f12403e);
            jSONObject.put("wt", this.N);
            jSONObject.put("current_time", this.f12414p);
            jSONObject.put("offset", this.B);
            jSONObject.put("dlct", this.f12415q);
            jSONObject.put("autoplay", this.f12405g);
            jSONObject.put("dlnet", this.f12416r);
            jSONObject.put("no_offer", this.A);
            jSONObject.put("cb_type", this.f12407i);
            jSONObject.put("clct", this.f12410l);
            jSONObject.put("clcq", this.f12409k);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.F);
            jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, this.f12412n);
            jSONObject.put("impt", this.u);
            jSONObject.put("icon_type", this.f12418t);
            jSONObject.put("no_ads_url", this.f12423z);
            jSONObject.put("playclosebtn_tm", this.E);
            jSONObject.put("play_ctdown", this.D);
            jSONObject.put("close_alert", this.f12411m);
            jSONObject.put("closeBtn", this.f12406h);
            jSONObject.put("refreshFq", this.G);
            jSONObject.put("countdown", this.f12413o);
            jSONObject.put("allowSkip", this.f12402d);
            jSONObject.put("tmorl", this.J);
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.K);
            jSONObject.put("placementid", this.C);
            jSONObject.put("ltafemty", this.f12421x);
            jSONObject.put("ltorwc", this.f12422y);
            jSONObject.put("vtag", this.M);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final void b(List<Integer> list) {
        this.f12401c = list;
    }

    public final void c(int i10) {
        this.f12403e = i10;
    }

    public final void d(int i10) {
        this.f12404f = i10;
    }

    public final void e(int i10) {
        this.f12408j = i10;
    }

    public final void f(int i10) {
        this.f12412n = i10;
    }

    public final void g(int i10) {
        this.f12413o = i10;
    }

    public final void h(int i10) {
        this.f12416r = i10;
    }

    public final void i(int i10) {
        this.u = i10;
    }

    public final void j(int i10) {
        this.f12421x = i10;
    }

    public final void k(int i10) {
        this.f12422y = i10;
    }

    public final void l(int i10) {
        this.F = i10;
    }

    public final void m(int i10) {
        this.G = i10;
    }

    public final void n(int i10) {
        this.I = i10;
    }

    public final void o(int i10) {
        this.N = i10;
    }

    public final void p(int i10) {
        this.B = i10;
    }

    public final void b(int i10) {
        this.f12402d = i10;
    }

    public final void b(String str) {
        this.K = str;
    }

    public final void a(int i10) {
        this.f12405g = i10;
    }

    public final String a() {
        return this.a;
    }

    public final void a(List<Integer> list) {
        this.f12400b = list;
    }

    public final void a(long j3) {
        this.f12415q = j3;
    }

    public final void a(String str) {
        this.C = str;
    }
}
