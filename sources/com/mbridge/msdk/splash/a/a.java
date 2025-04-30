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

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public String f17754e;

    /* renamed from: f, reason: collision with root package name */
    public String f17755f;

    /* renamed from: g, reason: collision with root package name */
    public String f17756g;

    /* renamed from: h, reason: collision with root package name */
    public String f17757h;

    /* renamed from: i, reason: collision with root package name */
    public String f17758i;

    /* renamed from: j, reason: collision with root package name */
    public String f17759j;

    /* renamed from: k, reason: collision with root package name */
    public String f17760k;
    public String l;
    public String m;

    /* renamed from: n, reason: collision with root package name */
    public String f17761n;

    /* renamed from: o, reason: collision with root package name */
    public String f17762o;

    /* renamed from: p, reason: collision with root package name */
    public int f17763p;

    /* renamed from: q, reason: collision with root package name */
    public int f17764q;

    /* renamed from: c, reason: collision with root package name */
    public String f17752c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f17751a = z.m();
    public String b = z.w();

    /* renamed from: d, reason: collision with root package name */
    public String f17753d = e.c();

    public a(Context context) {
        int l = z.l(context);
        this.f17754e = String.valueOf(l);
        this.f17755f = z.a(context, l);
        this.f17756g = z.f(context);
        this.f17757h = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f17758i = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f17759j = String.valueOf(ai.f(context));
        this.f17760k = String.valueOf(ai.e(context));
        this.m = String.valueOf(ai.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.l = "landscape";
        } else {
            this.l = "portrait";
        }
        this.f17761n = z.n();
        this.f17762o = e.d();
        this.f17763p = e.a();
        this.f17764q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? 1 : 0;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f17751a);
                jSONObject.put("system_version", this.b);
                jSONObject.put("network_type", this.f17754e);
                jSONObject.put("network_type_str", this.f17755f);
                jSONObject.put("device_ua", this.f17756g);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.z());
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.f17763p);
                jSONObject.put("adid_limit_dev", this.f17764q);
            }
            jSONObject.put("plantform", this.f17752c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f17753d);
                jSONObject.put("az_aid_info", this.f17762o);
            }
            jSONObject.put("appkey", this.f17757h);
            jSONObject.put("appId", this.f17758i);
            jSONObject.put("screen_width", this.f17759j);
            jSONObject.put("screen_height", this.f17760k);
            jSONObject.put("orientation", this.l);
            jSONObject.put("scale", this.m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put("f", this.f17761n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e4) {
            ad.b("BaseDeviceInfo", e4.getMessage());
        }
        return jSONObject;
    }
}
