package com.mbridge.msdk.c;

import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    private String f14678A;

    /* renamed from: D, reason: collision with root package name */
    private int f14681D;

    /* renamed from: E, reason: collision with root package name */
    private int f14682E;

    /* renamed from: I, reason: collision with root package name */
    private int f14686I;

    /* renamed from: K, reason: collision with root package name */
    private String f14688K;

    /* renamed from: N, reason: collision with root package name */
    private int f14691N;
    private List<Integer> b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f14693c;

    /* renamed from: d, reason: collision with root package name */
    private int f14694d;

    /* renamed from: e, reason: collision with root package name */
    private int f14695e;

    /* renamed from: f, reason: collision with root package name */
    private int f14696f;

    /* renamed from: g, reason: collision with root package name */
    private int f14697g;

    /* renamed from: h, reason: collision with root package name */
    private int f14698h;

    /* renamed from: i, reason: collision with root package name */
    private int f14699i;

    /* renamed from: k, reason: collision with root package name */
    private long f14701k;
    private long l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private int f14702n;

    /* renamed from: o, reason: collision with root package name */
    private int f14703o;

    /* renamed from: p, reason: collision with root package name */
    private long f14704p;

    /* renamed from: q, reason: collision with root package name */
    private long f14705q;

    /* renamed from: r, reason: collision with root package name */
    private int f14706r;

    /* renamed from: s, reason: collision with root package name */
    private String f14707s;

    /* renamed from: t, reason: collision with root package name */
    private int f14708t;

    /* renamed from: u, reason: collision with root package name */
    private int f14709u;

    /* renamed from: z, reason: collision with root package name */
    private String f14714z;

    /* renamed from: a, reason: collision with root package name */
    private String f14692a = "";

    /* renamed from: j, reason: collision with root package name */
    private int f14700j = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f14710v = 30;

    /* renamed from: w, reason: collision with root package name */
    private int f14711w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f14712x = 10;

    /* renamed from: y, reason: collision with root package name */
    private int f14713y = 60;

    /* renamed from: B, reason: collision with root package name */
    private int f14679B = 1;

    /* renamed from: C, reason: collision with root package name */
    private String f14680C = "";

    /* renamed from: F, reason: collision with root package name */
    private int f14683F = 100;

    /* renamed from: G, reason: collision with root package name */
    private int f14684G = 60;

    /* renamed from: H, reason: collision with root package name */
    private int f14685H = 5000;

    /* renamed from: J, reason: collision with root package name */
    private int f14687J = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f14689L = "";

    /* renamed from: M, reason: collision with root package name */
    private String f14690M = "";

    public static k a(JSONObject jSONObject) {
        k kVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            k kVar2 = new k();
            try {
                ((c) kVar2).f14688K = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                String optString = jSONObject.optString("ab_id");
                ((c) kVar2).f14692a = optString;
                com.mbridge.msdk.foundation.controller.a.b.put(((c) kVar2).f14688K, optString);
                ((c) kVar2).f14689L = jSONObject.optString("rid");
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i9)));
                    }
                    ((c) kVar2).b = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i10)));
                    }
                    ((c) kVar2).f14693c = arrayList2;
                }
                ((c) kVar2).f14686I = jSONObject.optInt("tpqn");
                ((c) kVar2).f14696f = jSONObject.optInt("aqn");
                ((c) kVar2).f14695e = jSONObject.optInt("acn");
                ((c) kVar2).f14691N = jSONObject.optInt("wt");
                int i11 = 1;
                ((c) kVar2).f14711w = jSONObject.optInt("iscasf", 1);
                ((c) kVar2).f14685H = jSONObject.optInt("spmxrt", 5000);
                ((c) kVar2).f14704p = jSONObject.optLong("current_time");
                ((c) kVar2).f14679B = jSONObject.optInt("offset");
                ((c) kVar2).f14705q = jSONObject.optLong("dlct", 3600L);
                ((c) kVar2).f14697g = jSONObject.optInt("autoplay", 0);
                ((c) kVar2).f14706r = jSONObject.optInt("dlnet", 2);
                ((c) kVar2).f14678A = jSONObject.optString("no_offer");
                ((c) kVar2).f14699i = jSONObject.optInt("cb_type");
                ((c) kVar2).l = jSONObject.optLong("clct", 86400L);
                ((c) kVar2).f14701k = jSONObject.optLong("clcq", 300L);
                ((c) kVar2).f14683F = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                ((c) kVar2).f14700j = jSONObject.optInt("cd_rate", 0);
                ((c) kVar2).f14702n = jSONObject.optInt(AppLovinEventTypes.USER_VIEWED_CONTENT, 1);
                ((c) kVar2).f14709u = jSONObject.optInt("impt", 0);
                ((c) kVar2).f14708t = jSONObject.optInt("icon_type", 1);
                ((c) kVar2).f14714z = jSONObject.optString("no_ads_url", "");
                ((c) kVar2).f14682E = jSONObject.optInt("playclosebtn_tm", -1);
                ((c) kVar2).f14681D = jSONObject.optInt("play_ctdown", 0);
                ((c) kVar2).m = jSONObject.optInt("close_alert", 0);
                ((c) kVar2).f14710v = jSONObject.optInt("intershowlimit", 30);
                ((c) kVar2).f14684G = jSONObject.optInt("refreshFq", 60);
                ((c) kVar2).f14698h = jSONObject.optInt("closeBtn", 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i11 = optInt;
                }
                ((c) kVar2).f14687J = i11;
                ((c) kVar2).f14680C = jSONObject.optString("placementid", "");
                ((c) kVar2).f14712x = jSONObject.optInt("ltafemty", 10);
                ((c) kVar2).f14713y = jSONObject.optInt("ltorwc", 60);
                ((c) kVar2).f14690M = jSONObject.optString("vtag", "");
                return kVar2;
            } catch (Exception e4) {
                e = e4;
                kVar = kVar2;
                e.printStackTrace();
                return kVar;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final List<Integer> b() {
        return this.b;
    }

    public final List<Integer> c() {
        return this.f14693c;
    }

    public final int d() {
        return this.f14695e;
    }

    public final int e() {
        return this.f14696f;
    }

    public final int f() {
        return this.f14698h;
    }

    public final int g() {
        return this.f14700j;
    }

    public final int h() {
        return this.f14702n;
    }

    public final long i() {
        return this.f14704p;
    }

    public final long j() {
        return this.f14705q;
    }

    public final int k() {
        return this.f14706r;
    }

    public final int l() {
        return this.f14709u;
    }

    public final int m() {
        return this.f14711w;
    }

    public final int n() {
        return this.f14712x;
    }

    public final int o() {
        return this.f14713y;
    }

    public final int p() {
        return this.f14683F;
    }

    public final int q() {
        return this.f14684G;
    }

    public final int r() {
        return this.f14685H;
    }

    public final String s() {
        return this.f14689L;
    }

    public final String t() {
        return this.f14690M;
    }

    public String toString() {
        List<Integer> list = this.b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb = new StringBuilder("offset = ");
        sb.append(this.f14679B);
        sb.append(" unitId = ");
        sb.append(this.f14688K);
        sb.append(" fbPlacementId = ");
        return AbstractC2914a.h(sb, this.f14707s, str);
    }

    public final int u() {
        return this.f14691N;
    }

    public final int v() {
        return this.f14697g;
    }

    public final int w() {
        return this.f14679B;
    }

    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.b;
            if (list != null && list.size() > 0) {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i9 = 0; i9 < size; i9++) {
                    jSONArray.put(list.get(i9));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f14693c;
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i10 = 0; i10 < size2; i10++) {
                    jSONArray2.put(list2.get(i10));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f14686I);
            jSONObject.put("aqn", this.f14696f);
            jSONObject.put("acn", this.f14695e);
            jSONObject.put("wt", this.f14691N);
            jSONObject.put("current_time", this.f14704p);
            jSONObject.put("offset", this.f14679B);
            jSONObject.put("dlct", this.f14705q);
            jSONObject.put("autoplay", this.f14697g);
            jSONObject.put("dlnet", this.f14706r);
            jSONObject.put("no_offer", this.f14678A);
            jSONObject.put("cb_type", this.f14699i);
            jSONObject.put("clct", this.l);
            jSONObject.put("clcq", this.f14701k);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f14683F);
            jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, this.f14702n);
            jSONObject.put("impt", this.f14709u);
            jSONObject.put("icon_type", this.f14708t);
            jSONObject.put("no_ads_url", this.f14714z);
            jSONObject.put("playclosebtn_tm", this.f14682E);
            jSONObject.put("play_ctdown", this.f14681D);
            jSONObject.put("close_alert", this.m);
            jSONObject.put("closeBtn", this.f14698h);
            jSONObject.put("refreshFq", this.f14684G);
            jSONObject.put("countdown", this.f14703o);
            jSONObject.put("allowSkip", this.f14694d);
            jSONObject.put("tmorl", this.f14687J);
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f14688K);
            jSONObject.put("placementid", this.f14680C);
            jSONObject.put("ltafemty", this.f14712x);
            jSONObject.put("ltorwc", this.f14713y);
            jSONObject.put("vtag", this.f14690M);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    public final void b(List<Integer> list) {
        this.f14693c = list;
    }

    public final void c(int i9) {
        this.f14695e = i9;
    }

    public final void d(int i9) {
        this.f14696f = i9;
    }

    public final void e(int i9) {
        this.f14700j = i9;
    }

    public final void f(int i9) {
        this.f14702n = i9;
    }

    public final void g(int i9) {
        this.f14703o = i9;
    }

    public final void h(int i9) {
        this.f14706r = i9;
    }

    public final void i(int i9) {
        this.f14709u = i9;
    }

    public final void j(int i9) {
        this.f14712x = i9;
    }

    public final void k(int i9) {
        this.f14713y = i9;
    }

    public final void l(int i9) {
        this.f14683F = i9;
    }

    public final void m(int i9) {
        this.f14684G = i9;
    }

    public final void n(int i9) {
        this.f14686I = i9;
    }

    public final void o(int i9) {
        this.f14691N = i9;
    }

    public final void p(int i9) {
        this.f14679B = i9;
    }

    public final void b(int i9) {
        this.f14694d = i9;
    }

    public final void b(String str) {
        this.f14688K = str;
    }

    public final void a(int i9) {
        this.f14697g = i9;
    }

    public final String a() {
        return this.f14692a;
    }

    public final void a(List<Integer> list) {
        this.b = list;
    }

    public final void a(long j7) {
        this.f14705q = j7;
    }

    public final void a(String str) {
        this.f14680C = str;
    }
}
