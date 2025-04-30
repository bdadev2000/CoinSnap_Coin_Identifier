package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f16033a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public String f16034c;

    /* renamed from: d, reason: collision with root package name */
    public String f16035d;

    /* renamed from: e, reason: collision with root package name */
    public String f16036e;

    /* renamed from: f, reason: collision with root package name */
    public String f16037f;

    /* renamed from: g, reason: collision with root package name */
    public String f16038g;

    /* renamed from: h, reason: collision with root package name */
    public String f16039h;

    /* renamed from: j, reason: collision with root package name */
    public String f16041j;

    /* renamed from: k, reason: collision with root package name */
    public String f16042k;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public String f16043n;

    /* renamed from: o, reason: collision with root package name */
    public String f16044o;

    /* renamed from: p, reason: collision with root package name */
    public String f16045p;

    /* renamed from: r, reason: collision with root package name */
    public String f16047r;

    /* renamed from: s, reason: collision with root package name */
    public String f16048s;

    /* renamed from: t, reason: collision with root package name */
    public String f16049t;

    /* renamed from: v, reason: collision with root package name */
    public String f16051v;

    /* renamed from: q, reason: collision with root package name */
    public String f16046q = "android";

    /* renamed from: i, reason: collision with root package name */
    public String f16040i = z.m();

    /* renamed from: u, reason: collision with root package name */
    public String f16050u = z.w();
    public String l = e.c();

    public c(Context context) {
        int l = z.l(context);
        this.f16043n = String.valueOf(l);
        this.f16044o = z.a(context, l);
        this.f16041j = z.f(context);
        this.f16036e = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f16035d = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f16049t = String.valueOf(ai.f(context));
        this.f16048s = String.valueOf(ai.e(context));
        this.f16047r = String.valueOf(ai.d(context));
        this.f16051v = com.mbridge.msdk.foundation.controller.c.m().i().toString();
        this.f16038g = z.x();
        this.m = ai.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f16045p = "landscape";
        } else {
            this.f16045p = "portrait";
        }
        this.f16037f = com.mbridge.msdk.foundation.same.a.f15673U;
        this.f16039h = com.mbridge.msdk.foundation.same.a.f15681g;
        this.f16042k = z.n();
        this.f16034c = e.d();
        this.f16033a = e.a();
        this.b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f16040i);
                jSONObject.put("system_version", this.f16050u);
                jSONObject.put("network_type", this.f16043n);
                jSONObject.put("network_type_str", this.f16044o);
                jSONObject.put("device_ua", this.f16041j);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.z());
                jSONObject.put("opensdk_ver", z.u() + "");
                jSONObject.put("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
                jSONObject.put("brand", this.f16038g);
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.f16033a);
                jSONObject.put("adid_limit_dev", this.b);
            }
            jSONObject.put("plantform", this.f16046q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.l);
                jSONObject.put("az_aid_info", this.f16034c);
            }
            jSONObject.put("appkey", this.f16036e);
            jSONObject.put("appId", this.f16035d);
            jSONObject.put("screen_width", this.f16049t);
            jSONObject.put("screen_height", this.f16048s);
            jSONObject.put("orientation", this.f16045p);
            jSONObject.put("scale", this.f16047r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f16037f);
            jSONObject.put(com.mbridge.msdk.foundation.controller.a.f15376a, this.f16039h);
            jSONObject.put("web_env", this.f16051v);
            jSONObject.put("f", this.f16042k);
            jSONObject.put("misk_spt", this.m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.f.e.f15852c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f16033a);
                jSONObject2.put("adid_limit_dev", this.b);
                jSONObject.put("dvi", x.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                jSONObject.put("dev_source", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }
}
