package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f13590b;

    /* renamed from: c, reason: collision with root package name */
    public String f13591c;

    /* renamed from: d, reason: collision with root package name */
    public String f13592d;

    /* renamed from: e, reason: collision with root package name */
    public String f13593e;

    /* renamed from: f, reason: collision with root package name */
    public String f13594f;

    /* renamed from: g, reason: collision with root package name */
    public String f13595g;

    /* renamed from: h, reason: collision with root package name */
    public String f13596h;

    /* renamed from: j, reason: collision with root package name */
    public String f13598j;

    /* renamed from: k, reason: collision with root package name */
    public String f13599k;

    /* renamed from: m, reason: collision with root package name */
    public int f13601m;

    /* renamed from: n, reason: collision with root package name */
    public String f13602n;

    /* renamed from: o, reason: collision with root package name */
    public String f13603o;

    /* renamed from: p, reason: collision with root package name */
    public String f13604p;

    /* renamed from: r, reason: collision with root package name */
    public String f13606r;

    /* renamed from: s, reason: collision with root package name */
    public String f13607s;

    /* renamed from: t, reason: collision with root package name */
    public String f13608t;

    /* renamed from: v, reason: collision with root package name */
    public String f13609v;

    /* renamed from: q, reason: collision with root package name */
    public String f13605q = "android";

    /* renamed from: i, reason: collision with root package name */
    public String f13597i = z.m();
    public String u = z.w();

    /* renamed from: l, reason: collision with root package name */
    public String f13600l = e.c();

    public c(Context context) {
        int l10 = z.l(context);
        this.f13602n = String.valueOf(l10);
        this.f13603o = z.a(context, l10);
        this.f13598j = z.f(context);
        this.f13593e = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f13592d = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f13608t = String.valueOf(ai.f(context));
        this.f13607s = String.valueOf(ai.e(context));
        this.f13606r = String.valueOf(ai.d(context));
        this.f13609v = com.mbridge.msdk.foundation.controller.c.m().i().toString();
        this.f13595g = z.x();
        this.f13601m = ai.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f13604p = "landscape";
        } else {
            this.f13604p = "portrait";
        }
        this.f13594f = com.mbridge.msdk.foundation.same.a.U;
        this.f13596h = com.mbridge.msdk.foundation.same.a.f13276g;
        this.f13599k = z.n();
        this.f13591c = e.d();
        this.a = e.a();
        this.f13590b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f13597i);
                jSONObject.put("system_version", this.u);
                jSONObject.put("network_type", this.f13602n);
                jSONObject.put("network_type_str", this.f13603o);
                jSONObject.put("device_ua", this.f13598j);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.z());
                jSONObject.put("opensdk_ver", z.u() + "");
                jSONObject.put("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
                jSONObject.put("brand", this.f13595g);
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.a);
                jSONObject.put("adid_limit_dev", this.f13590b);
            }
            jSONObject.put("plantform", this.f13605q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f13600l);
                jSONObject.put("az_aid_info", this.f13591c);
            }
            jSONObject.put("appkey", this.f13593e);
            jSONObject.put("appId", this.f13592d);
            jSONObject.put("screen_width", this.f13608t);
            jSONObject.put("screen_height", this.f13607s);
            jSONObject.put("orientation", this.f13604p);
            jSONObject.put("scale", this.f13606r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f13594f);
            jSONObject.put(com.mbridge.msdk.foundation.controller.a.a, this.f13596h);
            jSONObject.put("web_env", this.f13609v);
            jSONObject.put("f", this.f13599k);
            jSONObject.put("misk_spt", this.f13601m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.f.e.f13417c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.a);
                jSONObject2.put("adid_limit_dev", this.f13590b);
                jSONObject.put("dvi", x.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                jSONObject.put("dev_source", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
