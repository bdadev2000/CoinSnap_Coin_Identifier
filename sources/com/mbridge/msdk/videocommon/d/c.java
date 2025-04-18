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

/* loaded from: classes4.dex */
public final class c {
    private static g H;
    public static String a;
    private int F;
    private int I;
    private JSONArray W;
    private JSONObject X;

    /* renamed from: b, reason: collision with root package name */
    private String f16361b;

    /* renamed from: c, reason: collision with root package name */
    private String f16362c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.b.b> f16363d;

    /* renamed from: e, reason: collision with root package name */
    private long f16364e;
    private ArrayList<Integer> u;

    /* renamed from: f, reason: collision with root package name */
    private int f16365f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f16366g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f16367h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f16368i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f16369j = 1;

    /* renamed from: k, reason: collision with root package name */
    private int f16370k = 1;

    /* renamed from: l, reason: collision with root package name */
    private int f16371l = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f16372m = 5;

    /* renamed from: n, reason: collision with root package name */
    private int f16373n = 1;

    /* renamed from: o, reason: collision with root package name */
    private int f16374o = 3;

    /* renamed from: p, reason: collision with root package name */
    private int f16375p = 80;

    /* renamed from: q, reason: collision with root package name */
    private int f16376q = 100;

    /* renamed from: r, reason: collision with root package name */
    private int f16377r = 0;

    /* renamed from: s, reason: collision with root package name */
    private double f16378s = 1.0d;

    /* renamed from: t, reason: collision with root package name */
    private int f16379t = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f16380v = 3;

    /* renamed from: w, reason: collision with root package name */
    private int f16381w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f16382x = 100;

    /* renamed from: y, reason: collision with root package name */
    private int f16383y = 60;

    /* renamed from: z, reason: collision with root package name */
    private int f16384z = 0;
    private int A = 70;
    private int B = 0;
    private int C = -1;
    private int D = -1;
    private int E = -1;
    private int G = 20;
    private int J = 0;
    private int K = 1;
    private String L = "";
    private int M = 1;
    private String N = "";
    private int O = 1;
    private String P = "Virtual Item";
    private String Q = "";
    private String R = "";
    private int S = 0;
    private int T = 1;
    private int U = 60;
    private String V = "";

    private void y(int i10) {
        if (i10 <= 0) {
            this.M = 1;
        } else {
            this.M = i10;
        }
    }

    public final int A() {
        return this.f16380v;
    }

    public final Queue<Integer> B() {
        LinkedList linkedList;
        Exception e2;
        List<com.mbridge.msdk.videocommon.b.b> list;
        try {
            list = this.f16363d;
        } catch (Exception e10) {
            linkedList = null;
            e2 = e10;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i10 = 0; i10 < this.f16363d.size(); i10++) {
            try {
                linkedList.add(Integer.valueOf(this.f16363d.get(i10).b()));
            } catch (Exception e11) {
                e2 = e11;
                e2.printStackTrace();
                return linkedList;
            }
        }
        return linkedList;
    }

    public final int C() {
        return this.T;
    }

    public final int D() {
        return this.U;
    }

    public final JSONObject E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f16361b);
            jSONObject.put("callbackType", this.f16368i);
            List<com.mbridge.msdk.videocommon.b.b> list = this.f16363d;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.mbridge.msdk.videocommon.b.b bVar : this.f16363d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f16369j);
            jSONObject.put("acn", this.f16370k);
            jSONObject.put("vcn", this.f16371l);
            jSONObject.put("offset", this.f16372m);
            jSONObject.put("dlnet", this.f16373n);
            jSONObject.put("tv_start", this.f16374o);
            jSONObject.put("tv_end", this.f16375p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f16376q);
            jSONObject.put("endscreen_type", this.I);
            jSONObject.put("daily_play_cap", this.B);
            jSONObject.put("video_skip_time", this.C);
            jSONObject.put("video_skip_result", this.D);
            jSONObject.put("video_interactive_type", this.E);
            jSONObject.put("orientation", this.f16384z);
            jSONObject.put("close_button_delay", this.F);
            jSONObject.put("playclosebtn_tm", this.f16365f);
            jSONObject.put("play_ctdown", this.f16366g);
            jSONObject.put("close_alert", this.f16367h);
            jSONObject.put("rfpv", this.f16379t);
            jSONObject.put("vdcmp", this.f16378s);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.u;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f16380v);
            jSONObject.put("tmorl", this.f16381w);
            jSONObject.put("placementid", this.f16362c);
            jSONObject.put("ltafemty", this.f16382x);
            jSONObject.put("ltorwc", this.f16383y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.L);
            jSONObject.put("amount", this.M);
            jSONObject.put(RewardPlus.ICON, this.N);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.O);
            jSONObject.put("name", this.P);
            jSONObject.put("isDefault", this.S);
            jSONObject.put("video_error_rule", this.T);
            jSONObject.put("loadtmo", this.U);
            jSONObject.put("vtag", this.V);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final int F() {
        return this.A;
    }

    public final JSONArray G() {
        return this.W;
    }

    public final int a() {
        return this.f16382x;
    }

    public final int b() {
        return this.f16383y;
    }

    public final int c() {
        return this.f16384z;
    }

    public final int d() {
        return this.B;
    }

    public final int e() {
        return this.C;
    }

    public final int f() {
        return this.D;
    }

    public final int g() {
        return this.E;
    }

    public final int h() {
        return this.f16365f;
    }

    public final int i() {
        return this.f16367h;
    }

    public final String j() {
        return this.V;
    }

    public final String k() {
        return this.Q;
    }

    public final String l() {
        return this.R;
    }

    public final int m() {
        return this.M;
    }

    public final String n() {
        return this.P;
    }

    public final int o() {
        return this.G;
    }

    public final int p() {
        return this.F;
    }

    public final int q() {
        return this.I;
    }

    public final int r() {
        return this.f16376q;
    }

    public final int s() {
        return this.f16377r;
    }

    public final int t() {
        return this.f16369j;
    }

    public final int u() {
        return this.f16370k;
    }

    public final int v() {
        return this.f16372m;
    }

    public final int w() {
        return this.f16373n;
    }

    public final long x() {
        return this.f16364e;
    }

    public final String z() {
        return this.f16362c;
    }

    public final void a(ArrayList<Integer> arrayList) {
        this.u = arrayList;
    }

    public final void b(int i10) {
        this.B = i10;
    }

    public final void c(int i10) {
        this.C = i10;
    }

    public final void d(int i10) {
        this.D = i10;
    }

    public final void e(int i10) {
        this.E = i10;
    }

    public final void f(int i10) {
        this.F = i10;
    }

    public final void g(int i10) {
        this.I = i10;
    }

    public final void h(int i10) {
        this.f16374o = i10;
    }

    public final void i(int i10) {
        this.f16375p = i10;
    }

    public final void j(int i10) {
        this.f16376q = i10;
    }

    public final void k(int i10) {
        this.f16377r = i10;
    }

    public final void l(int i10) {
        this.f16369j = i10;
    }

    public final void m(int i10) {
        this.f16370k = i10;
    }

    public final void n(int i10) {
        this.f16371l = i10;
    }

    public final void o(int i10) {
        this.f16372m = i10;
    }

    public final void p(int i10) {
        this.f16373n = i10;
    }

    public final void q(int i10) {
        this.f16368i = i10;
    }

    public final void r(int i10) {
        this.f16381w = i10;
    }

    public final boolean s(int i10) {
        ArrayList<Integer> arrayList = this.u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.u.contains(Integer.valueOf(i10));
    }

    public final void t(int i10) {
        this.f16380v = i10;
    }

    public final void u(int i10) {
        this.S = i10;
    }

    public final void v(int i10) {
        this.T = i10;
    }

    public final void w(int i10) {
        this.U = i10;
    }

    public final void x(int i10) {
        this.A = i10;
    }

    public static c c(String str) {
        JSONObject optJSONObject;
        if (H == null) {
            H = g.a(com.mbridge.msdk.foundation.controller.c.m().c());
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
                    cVar2.V = optString;
                    cVar2.R = optString2;
                    List<com.mbridge.msdk.videocommon.b.b> a10 = com.mbridge.msdk.videocommon.b.b.a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.f16361b = optString3;
                    cVar2.f16363d = a10;
                    cVar2.f16368i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f16369j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f16370k = optInt2;
                    cVar2.f16371l = optJSONObject.optInt("vcn", 5);
                    cVar2.f16372m = optJSONObject.optInt("offset", 5);
                    cVar2.f16373n = optJSONObject.optInt("dlnet", 1);
                    cVar2.I = optJSONObject.optInt("endscreen_type", 2);
                    cVar2.f16374o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f16375p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f16376q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f16377r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f16364e = jSONObject.optLong("current_time");
                    cVar2.f16384z = optJSONObject.optInt("orientation", 0);
                    cVar2.B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f16365f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f16366g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f16367h = optJSONObject.optInt("close_alert", 0);
                    cVar2.G = optJSONObject.optInt("rdrct", 20);
                    cVar2.A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f16379t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f16378s = optJSONObject.optDouble("vdcmp", 1.0d);
                    a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (optJSONArray2 != null) {
                            for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i10)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        cVar2.u = arrayList;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    cVar2.f16380v = optInt3 > 0 ? optInt3 : 3;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f16381w = optInt4;
                    cVar2.f16362c = optJSONObject.optString("placementid");
                    cVar2.f16382x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f16383y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.d(optJSONObject.optString("ab_id"));
                    cVar2.J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.y(optJSONObject.optInt("amount", 1));
                    cVar2.N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.O = optJSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                    cVar2.e(optJSONObject.optString("name", "Virtual Item"));
                    cVar2.T = optJSONObject.optInt("video_error_rule", 1);
                    cVar2.U = optJSONObject.optInt("loadtmo", 60);
                    cVar2.W = optJSONObject.optJSONArray("local_cache_info");
                    try {
                        String optString4 = optJSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                        if (!TextUtils.isEmpty(optString4)) {
                            String a11 = x.a(optString4);
                            if (!TextUtils.isEmpty(a11)) {
                                cVar2.X = new JSONObject(a11);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return cVar2;
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return cVar;
    }

    private void d(String str) {
        this.Q = str;
        com.mbridge.msdk.foundation.controller.a.f13020b.put(this.f16361b, str);
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.P = this.L;
        } else {
            this.P = str;
        }
    }

    public final void a(int i10) {
        this.f16384z = i10;
    }

    public final void b(String str) {
        this.f16362c = str;
    }

    public final int y() {
        return this.f16381w;
    }

    public final void a(String str) {
        this.f16361b = str;
    }

    public final void a(List<com.mbridge.msdk.videocommon.b.b> list) {
        this.f16363d = list;
    }

    public static c a(JSONObject jSONObject) {
        c cVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            c cVar2 = new c();
            try {
                cVar2.f16363d = com.mbridge.msdk.videocommon.b.b.a(jSONObject.optJSONArray("adSourceList"));
                cVar2.f16368i = jSONObject.optInt("callbackType");
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                cVar2.f16369j = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                cVar2.f16370k = optInt2;
                cVar2.f16371l = jSONObject.optInt("vcn", 5);
                cVar2.f16372m = jSONObject.optInt("offset", 5);
                cVar2.f16373n = jSONObject.optInt("dlnet", 1);
                cVar2.I = jSONObject.optInt("endscreen_type", 2);
                cVar2.f16374o = jSONObject.optInt("tv_start", 3);
                cVar2.f16375p = jSONObject.optInt("tv_end", 80);
                cVar2.f16376q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                cVar2.f16364e = jSONObject.optLong("current_time");
                cVar2.f16384z = jSONObject.optInt("orientation", 0);
                cVar2.B = jSONObject.optInt("daily_play_cap", 0);
                cVar2.C = jSONObject.optInt("video_skip_time", -1);
                cVar2.D = jSONObject.optInt("video_skip_result", 2);
                cVar2.E = jSONObject.optInt("video_interactive_type", -1);
                cVar2.F = jSONObject.optInt("close_button_delay", 1);
                cVar2.f16365f = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f16366g = jSONObject.optInt("play_ctdown", 0);
                cVar2.f16367h = jSONObject.optInt("close_alert", 0);
                cVar2.G = jSONObject.optInt("rdrct", 20);
                cVar2.f16379t = jSONObject.optInt("rfpv", -1);
                cVar2.f16378s = jSONObject.optDouble("vdcmp", 1.0d);
                cVar2.A = jSONObject.optInt("load_global_timeout", 70);
                JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                try {
                    if (optJSONArray != null) {
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i10)));
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    cVar2.u = arrayList;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                cVar2.f16380v = jSONObject.optInt("atl_dyt", 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                if (optInt3 > 2 || optInt3 <= 0) {
                    optInt3 = 1;
                }
                cVar2.f16381w = optInt3;
                cVar2.f16362c = jSONObject.optString("placementid");
                cVar2.f16382x = jSONObject.optInt("ltafemty", 10);
                cVar2.f16383y = jSONObject.optInt("ltorwc", 60);
                cVar2.d(jSONObject.optString("ab_id"));
                cVar2.R = jSONObject.optString("rid", "");
                cVar2.J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                cVar2.K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                cVar2.L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                cVar2.y(jSONObject.optInt("amount", 1));
                cVar2.N = jSONObject.optString(RewardPlus.ICON, "");
                cVar2.O = jSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                cVar2.e(jSONObject.optString("name", "Virtual Item"));
                cVar2.T = jSONObject.optInt("video_error_rule", 1);
                cVar2.U = jSONObject.optInt("loadtmo", 60);
                cVar2.V = jSONObject.optString("vtag", "");
                cVar2.W = jSONObject.optJSONArray("local_cache_info");
                try {
                    String optString = jSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                    if (!TextUtils.isEmpty(optString)) {
                        String a10 = x.a(optString);
                        if (!TextUtils.isEmpty(a10)) {
                            cVar2.X = new JSONObject(a10);
                        }
                    }
                } catch (Exception unused) {
                }
                return cVar2;
            } catch (Exception e10) {
                e = e10;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
