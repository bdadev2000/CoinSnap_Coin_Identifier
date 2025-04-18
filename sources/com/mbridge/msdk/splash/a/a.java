package com.mbridge.msdk.splash.a;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.e;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public String f15067e;

    /* renamed from: f, reason: collision with root package name */
    public String f15068f;

    /* renamed from: g, reason: collision with root package name */
    public String f15069g;

    /* renamed from: h, reason: collision with root package name */
    public String f15070h;

    /* renamed from: i, reason: collision with root package name */
    public String f15071i;

    /* renamed from: j, reason: collision with root package name */
    public String f15072j;

    /* renamed from: k, reason: collision with root package name */
    public String f15073k;

    /* renamed from: l, reason: collision with root package name */
    public String f15074l;

    /* renamed from: m, reason: collision with root package name */
    public String f15075m;

    /* renamed from: n, reason: collision with root package name */
    public String f15076n;

    /* renamed from: o, reason: collision with root package name */
    public String f15077o;

    /* renamed from: p, reason: collision with root package name */
    public int f15078p;

    /* renamed from: q, reason: collision with root package name */
    public int f15079q;

    /* renamed from: c, reason: collision with root package name */
    public String f15065c = "android";
    public String a = z.m();

    /* renamed from: b, reason: collision with root package name */
    public String f15064b = z.w();

    /* renamed from: d, reason: collision with root package name */
    public String f15066d = e.c();

    public a(Context context) {
        int l10 = z.l(context);
        this.f15067e = String.valueOf(l10);
        this.f15068f = z.a(context, l10);
        this.f15069g = z.f(context);
        this.f15070h = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f15071i = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f15072j = String.valueOf(ai.f(context));
        this.f15073k = String.valueOf(ai.e(context));
        this.f15075m = String.valueOf(ai.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f15074l = "landscape";
        } else {
            this.f15074l = "portrait";
        }
        this.f15076n = z.n();
        this.f15077o = e.d();
        this.f15078p = e.a();
        this.f15079q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? 1 : 0;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.a);
                jSONObject.put("system_version", this.f15064b);
                jSONObject.put("network_type", this.f15067e);
                jSONObject.put("network_type_str", this.f15068f);
                jSONObject.put("device_ua", this.f15069g);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.z());
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.f15078p);
                jSONObject.put("adid_limit_dev", this.f15079q);
            }
            jSONObject.put("plantform", this.f15065c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f15066d);
                jSONObject.put("az_aid_info", this.f15077o);
            }
            jSONObject.put("appkey", this.f15070h);
            jSONObject.put("appId", this.f15071i);
            jSONObject.put("screen_width", this.f15072j);
            jSONObject.put("screen_height", this.f15073k);
            jSONObject.put("orientation", this.f15074l);
            jSONObject.put("scale", this.f15075m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put("f", this.f15076n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e2) {
            ad.b("BaseDeviceInfo", e2.getMessage());
        }
        return jSONObject;
    }
}
