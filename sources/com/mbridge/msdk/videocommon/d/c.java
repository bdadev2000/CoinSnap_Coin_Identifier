package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: H, reason: collision with root package name */
    private static g f19349H;

    /* renamed from: a, reason: collision with root package name */
    public static String f19350a;

    /* renamed from: F, reason: collision with root package name */
    private int f19356F;

    /* renamed from: I, reason: collision with root package name */
    private int f19358I;

    /* renamed from: W, reason: collision with root package name */
    private JSONArray f19371W;

    /* renamed from: X, reason: collision with root package name */
    private JSONObject f19372X;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f19373c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.b.b> f19374d;

    /* renamed from: e, reason: collision with root package name */
    private long f19375e;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<Integer> f19389u;

    /* renamed from: f, reason: collision with root package name */
    private int f19376f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f19377g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f19378h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f19379i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f19380j = 1;

    /* renamed from: k, reason: collision with root package name */
    private int f19381k = 1;
    private int l = 1;
    private int m = 5;

    /* renamed from: n, reason: collision with root package name */
    private int f19382n = 1;

    /* renamed from: o, reason: collision with root package name */
    private int f19383o = 3;

    /* renamed from: p, reason: collision with root package name */
    private int f19384p = 80;

    /* renamed from: q, reason: collision with root package name */
    private int f19385q = 100;

    /* renamed from: r, reason: collision with root package name */
    private int f19386r = 0;

    /* renamed from: s, reason: collision with root package name */
    private double f19387s = 1.0d;

    /* renamed from: t, reason: collision with root package name */
    private int f19388t = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f19390v = 3;

    /* renamed from: w, reason: collision with root package name */
    private int f19391w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f19392x = 100;

    /* renamed from: y, reason: collision with root package name */
    private int f19393y = 60;

    /* renamed from: z, reason: collision with root package name */
    private int f19394z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f19351A = 70;

    /* renamed from: B, reason: collision with root package name */
    private int f19352B = 0;

    /* renamed from: C, reason: collision with root package name */
    private int f19353C = -1;

    /* renamed from: D, reason: collision with root package name */
    private int f19354D = -1;

    /* renamed from: E, reason: collision with root package name */
    private int f19355E = -1;

    /* renamed from: G, reason: collision with root package name */
    private int f19357G = 20;

    /* renamed from: J, reason: collision with root package name */
    private int f19359J = 0;

    /* renamed from: K, reason: collision with root package name */
    private int f19360K = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f19361L = "";

    /* renamed from: M, reason: collision with root package name */
    private int f19362M = 1;

    /* renamed from: N, reason: collision with root package name */
    private String f19363N = "";
    private int O = 1;

    /* renamed from: P, reason: collision with root package name */
    private String f19364P = "Virtual Item";

    /* renamed from: Q, reason: collision with root package name */
    private String f19365Q = "";

    /* renamed from: R, reason: collision with root package name */
    private String f19366R = "";

    /* renamed from: S, reason: collision with root package name */
    private int f19367S = 0;

    /* renamed from: T, reason: collision with root package name */
    private int f19368T = 1;

    /* renamed from: U, reason: collision with root package name */
    private int f19369U = 60;

    /* renamed from: V, reason: collision with root package name */
    private String f19370V = "";

    private void y(int i9) {
        if (i9 <= 0) {
            this.f19362M = 1;
        } else {
            this.f19362M = i9;
        }
    }

    public final int A() {
        return this.f19390v;
    }

    public final Queue<Integer> B() {
        LinkedList linkedList;
        Exception e4;
        List<com.mbridge.msdk.videocommon.b.b> list;
        try {
            list = this.f19374d;
        } catch (Exception e9) {
            linkedList = null;
            e4 = e9;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i9 = 0; i9 < this.f19374d.size(); i9++) {
            try {
                linkedList.add(Integer.valueOf(this.f19374d.get(i9).b()));
            } catch (Exception e10) {
                e4 = e10;
                e4.printStackTrace();
                return linkedList;
            }
        }
        return linkedList;
    }

    public final int C() {
        return this.f19368T;
    }

    public final int D() {
        return this.f19369U;
    }

    public final JSONObject E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.b);
            jSONObject.put("callbackType", this.f19379i);
            List<com.mbridge.msdk.videocommon.b.b> list = this.f19374d;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.mbridge.msdk.videocommon.b.b bVar : this.f19374d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f19380j);
            jSONObject.put("acn", this.f19381k);
            jSONObject.put("vcn", this.l);
            jSONObject.put("offset", this.m);
            jSONObject.put("dlnet", this.f19382n);
            jSONObject.put("tv_start", this.f19383o);
            jSONObject.put("tv_end", this.f19384p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f19385q);
            jSONObject.put("endscreen_type", this.f19358I);
            jSONObject.put("daily_play_cap", this.f19352B);
            jSONObject.put("video_skip_time", this.f19353C);
            jSONObject.put("video_skip_result", this.f19354D);
            jSONObject.put("video_interactive_type", this.f19355E);
            jSONObject.put("orientation", this.f19394z);
            jSONObject.put("close_button_delay", this.f19356F);
            jSONObject.put("playclosebtn_tm", this.f19376f);
            jSONObject.put("play_ctdown", this.f19377g);
            jSONObject.put("close_alert", this.f19378h);
            jSONObject.put("rfpv", this.f19388t);
            jSONObject.put("vdcmp", this.f19387s);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f19389u;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f19389u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f19390v);
            jSONObject.put("tmorl", this.f19391w);
            jSONObject.put("placementid", this.f19373c);
            jSONObject.put("ltafemty", this.f19392x);
            jSONObject.put("ltorwc", this.f19393y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f19359J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f19360K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f19361L);
            jSONObject.put("amount", this.f19362M);
            jSONObject.put(RewardPlus.ICON, this.f19363N);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.O);
            jSONObject.put("name", this.f19364P);
            jSONObject.put("isDefault", this.f19367S);
            jSONObject.put("video_error_rule", this.f19368T);
            jSONObject.put("loadtmo", this.f19369U);
            jSONObject.put("vtag", this.f19370V);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    public final int F() {
        return this.f19351A;
    }

    public final JSONArray G() {
        return this.f19371W;
    }

    public final int a() {
        return this.f19392x;
    }

    public final int b() {
        return this.f19393y;
    }

    public final int c() {
        return this.f19394z;
    }

    public final int d() {
        return this.f19352B;
    }

    public final int e() {
        return this.f19353C;
    }

    public final int f() {
        return this.f19354D;
    }

    public final int g() {
        return this.f19355E;
    }

    public final int h() {
        return this.f19376f;
    }

    public final int i() {
        return this.f19378h;
    }

    public final String j() {
        return this.f19370V;
    }

    public final String k() {
        return this.f19365Q;
    }

    public final String l() {
        return this.f19366R;
    }

    public final int m() {
        return this.f19362M;
    }

    public final String n() {
        return this.f19364P;
    }

    public final int o() {
        return this.f19357G;
    }

    public final int p() {
        return this.f19356F;
    }

    public final int q() {
        return this.f19358I;
    }

    public final int r() {
        return this.f19385q;
    }

    public final int s() {
        return this.f19386r;
    }

    public final int t() {
        return this.f19380j;
    }

    public final int u() {
        return this.f19381k;
    }

    public final int v() {
        return this.m;
    }

    public final int w() {
        return this.f19382n;
    }

    public final long x() {
        return this.f19375e;
    }

    public final String z() {
        return this.f19373c;
    }

    public final void a(ArrayList<Integer> arrayList) {
        this.f19389u = arrayList;
    }

    public final void b(int i9) {
        this.f19352B = i9;
    }

    public final void c(int i9) {
        this.f19353C = i9;
    }

    public final void d(int i9) {
        this.f19354D = i9;
    }

    public final void e(int i9) {
        this.f19355E = i9;
    }

    public final void f(int i9) {
        this.f19356F = i9;
    }

    public final void g(int i9) {
        this.f19358I = i9;
    }

    public final void h(int i9) {
        this.f19383o = i9;
    }

    public final void i(int i9) {
        this.f19384p = i9;
    }

    public final void j(int i9) {
        this.f19385q = i9;
    }

    public final void k(int i9) {
        this.f19386r = i9;
    }

    public final void l(int i9) {
        this.f19380j = i9;
    }

    public final void m(int i9) {
        this.f19381k = i9;
    }

    public final void n(int i9) {
        this.l = i9;
    }

    public final void o(int i9) {
        this.m = i9;
    }

    public final void p(int i9) {
        this.f19382n = i9;
    }

    public final void q(int i9) {
        this.f19379i = i9;
    }

    public final void r(int i9) {
        this.f19391w = i9;
    }

    public final boolean s(int i9) {
        ArrayList<Integer> arrayList = this.f19389u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f19389u.contains(Integer.valueOf(i9));
    }

    public final void t(int i9) {
        this.f19390v = i9;
    }

    public final void u(int i9) {
        this.f19367S = i9;
    }

    public final void v(int i9) {
        this.f19368T = i9;
    }

    public final void w(int i9) {
        this.f19369U = i9;
    }

    public final void x(int i9) {
        this.f19351A = i9;
    }

    public static c c(String str) {
        JSONObject optJSONObject;
        if (f19349H == null) {
            f19349H = g.a(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("vtag", "");
                String optString2 = jSONObject.optString("rid", "");
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString3 = optJSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                if (TextUtils.isEmpty(optString3)) {
                    return null;
                }
                c cVar2 = new c();
                try {
                    cVar2.f19370V = optString;
                    cVar2.f19366R = optString2;
                    List<com.mbridge.msdk.videocommon.b.b> a6 = com.mbridge.msdk.videocommon.b.b.a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.b = optString3;
                    cVar2.f19374d = a6;
                    cVar2.f19379i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f19380j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f19381k = optInt2;
                    cVar2.l = optJSONObject.optInt("vcn", 5);
                    cVar2.m = optJSONObject.optInt("offset", 5);
                    cVar2.f19382n = optJSONObject.optInt("dlnet", 1);
                    cVar2.f19358I = optJSONObject.optInt("endscreen_type", 2);
                    cVar2.f19383o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f19384p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f19385q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f19386r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f19375e = jSONObject.optLong("current_time");
                    cVar2.f19394z = optJSONObject.optInt("orientation", 0);
                    cVar2.f19352B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.f19353C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.f19354D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.f19355E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.f19356F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f19376f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f19377g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f19378h = optJSONObject.optInt("close_alert", 0);
                    cVar2.f19357G = optJSONObject.optInt("rdrct", 20);
                    cVar2.f19351A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f19388t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f19387s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f19350a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (optJSONArray2 != null) {
                            for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i9)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        cVar2.f19389u = arrayList;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    cVar2.f19390v = optInt3 > 0 ? optInt3 : 3;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f19391w = optInt4;
                    cVar2.f19373c = optJSONObject.optString("placementid");
                    cVar2.f19392x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f19393y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.d(optJSONObject.optString("ab_id"));
                    cVar2.f19359J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.f19360K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.f19361L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.y(optJSONObject.optInt("amount", 1));
                    cVar2.f19363N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.O = optJSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                    cVar2.e(optJSONObject.optString("name", "Virtual Item"));
                    cVar2.f19368T = optJSONObject.optInt("video_error_rule", 1);
                    cVar2.f19369U = optJSONObject.optInt("loadtmo", 60);
                    cVar2.f19371W = optJSONObject.optJSONArray("local_cache_info");
                    try {
                        String optString4 = optJSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                        if (!TextUtils.isEmpty(optString4)) {
                            String a9 = x.a(optString4);
                            if (!TextUtils.isEmpty(a9)) {
                                cVar2.f19372X = new JSONObject(a9);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return cVar2;
                } catch (Exception e9) {
                    e = e9;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        return cVar;
    }

    private void d(String str) {
        this.f19365Q = str;
        com.mbridge.msdk.foundation.controller.a.b.put(this.b, str);
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f19364P = this.f19361L;
        } else {
            this.f19364P = str;
        }
    }

    public final void a(int i9) {
        this.f19394z = i9;
    }

    public final void b(String str) {
        this.f19373c = str;
    }

    public final int y() {
        return this.f19391w;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void a(List<com.mbridge.msdk.videocommon.b.b> list) {
        this.f19374d = list;
    }

    public static c a(JSONObject jSONObject) {
        c cVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            c cVar2 = new c();
            try {
                cVar2.f19374d = com.mbridge.msdk.videocommon.b.b.a(jSONObject.optJSONArray("adSourceList"));
                cVar2.f19379i = jSONObject.optInt("callbackType");
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                cVar2.f19380j = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                cVar2.f19381k = optInt2;
                cVar2.l = jSONObject.optInt("vcn", 5);
                cVar2.m = jSONObject.optInt("offset", 5);
                cVar2.f19382n = jSONObject.optInt("dlnet", 1);
                cVar2.f19358I = jSONObject.optInt("endscreen_type", 2);
                cVar2.f19383o = jSONObject.optInt("tv_start", 3);
                cVar2.f19384p = jSONObject.optInt("tv_end", 80);
                cVar2.f19385q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                cVar2.f19375e = jSONObject.optLong("current_time");
                cVar2.f19394z = jSONObject.optInt("orientation", 0);
                cVar2.f19352B = jSONObject.optInt("daily_play_cap", 0);
                cVar2.f19353C = jSONObject.optInt("video_skip_time", -1);
                cVar2.f19354D = jSONObject.optInt("video_skip_result", 2);
                cVar2.f19355E = jSONObject.optInt("video_interactive_type", -1);
                cVar2.f19356F = jSONObject.optInt("close_button_delay", 1);
                cVar2.f19376f = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f19377g = jSONObject.optInt("play_ctdown", 0);
                cVar2.f19378h = jSONObject.optInt("close_alert", 0);
                cVar2.f19357G = jSONObject.optInt("rdrct", 20);
                cVar2.f19388t = jSONObject.optInt("rfpv", -1);
                cVar2.f19387s = jSONObject.optDouble("vdcmp", 1.0d);
                cVar2.f19351A = jSONObject.optInt("load_global_timeout", 70);
                JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                try {
                    if (optJSONArray != null) {
                        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i9)));
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    cVar2.f19389u = arrayList;
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                cVar2.f19390v = jSONObject.optInt("atl_dyt", 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                if (optInt3 > 2 || optInt3 <= 0) {
                    optInt3 = 1;
                }
                cVar2.f19391w = optInt3;
                cVar2.f19373c = jSONObject.optString("placementid");
                cVar2.f19392x = jSONObject.optInt("ltafemty", 10);
                cVar2.f19393y = jSONObject.optInt("ltorwc", 60);
                cVar2.d(jSONObject.optString("ab_id"));
                cVar2.f19366R = jSONObject.optString("rid", "");
                cVar2.f19359J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                cVar2.f19360K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                cVar2.f19361L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                cVar2.y(jSONObject.optInt("amount", 1));
                cVar2.f19363N = jSONObject.optString(RewardPlus.ICON, "");
                cVar2.O = jSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                cVar2.e(jSONObject.optString("name", "Virtual Item"));
                cVar2.f19368T = jSONObject.optInt("video_error_rule", 1);
                cVar2.f19369U = jSONObject.optInt("loadtmo", 60);
                cVar2.f19370V = jSONObject.optString("vtag", "");
                cVar2.f19371W = jSONObject.optJSONArray("local_cache_info");
                try {
                    String optString = jSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                    if (!TextUtils.isEmpty(optString)) {
                        String a6 = x.a(optString);
                        if (!TextUtils.isEmpty(a6)) {
                            cVar2.f19372X = new JSONObject(a6);
                        }
                    }
                } catch (Exception unused) {
                }
                return cVar2;
            } catch (Exception e9) {
                e = e9;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }
}
