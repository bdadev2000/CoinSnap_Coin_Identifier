package com.mbridge.msdk.newreward.function.g;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.same.net.f.f;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.j;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.CustomInfoManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    private final int f14712c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14713d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14714e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14715f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14716g;

    /* renamed from: h, reason: collision with root package name */
    private int f14717h;
    private final Map<String, String> a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f14718i = false;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14711b = com.mbridge.msdk.foundation.controller.c.m().c();

    public d(int i10, String str, String str2, boolean z10, String str3) {
        this.f14712c = i10;
        this.f14713d = str;
        this.f14714e = str2;
        this.f14715f = z10;
        this.f14716g = str3;
    }

    public final void a(boolean z10) {
        this.f14718i = z10;
    }

    public final int b() {
        return this.f14712c;
    }

    public final String c() {
        return this.f14713d;
    }

    public final String d() {
        return this.f14714e;
    }

    public final String e() {
        return this.f14716g;
    }

    public final Map<String, String> f() {
        int i10;
        int i11;
        int i12;
        Map<String, String> a = a();
        if (a != null) {
            this.a.putAll(a);
        }
        e eVar = new e(this.a);
        if (com.mbridge.msdk.e.b.a()) {
            eVar.a("gp_version", j.c(this.f14711b));
        }
        String str = "1";
        eVar.a("version_flag", "1");
        int i13 = 1;
        if (com.mbridge.msdk.e.b.a()) {
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.c(true);
        }
        eVar.a("misk_spt", String.valueOf(ai.a()));
        String c10 = ai.c();
        if (!TextUtils.isEmpty(c10)) {
            eVar.a("misk_spt_det", c10);
        }
        String str2 = this.f14714e;
        if (str2 != null) {
            CustomInfoManager customInfoManager = CustomInfoManager.getInstance();
            if (this.f14715f) {
                i12 = 7;
            } else {
                i12 = 8;
            }
            String customInfoByUnitId = customInfoManager.getCustomInfoByUnitId(str2, i12);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            k d10 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
            if (d10 != null && !TextUtils.isEmpty(d10.a())) {
                eVar.a("u_stid", d10.a());
            }
        }
        String a10 = com.mbridge.msdk.foundation.same.a.b.a(this.f14714e, "reward");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f14714e);
        if (!TextUtils.isEmpty(this.f14713d)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f14713d);
        }
        com.mbridge.msdk.videocommon.d.c a11 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f14714e);
        if (a11 != null) {
            i10 = a11.t();
            i11 = a11.u();
        } else {
            i10 = 0;
            i11 = 0;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_num", String.valueOf(i10));
        if (this.f14712c != 287) {
            i13 = i11;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "tnum", String.valueOf(i13));
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, e.f13418d, a10);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        String str3 = e.f13420f;
        String str4 = MBridgeGlobalCommon.SESSION_ID;
        if (str4 == null) {
            str4 = "";
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, str3, str4);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_type", String.valueOf(this.f14712c));
        if (!TextUtils.isEmpty(this.f14716g)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, BidResponsed.KEY_TOKEN, this.f14716g);
        }
        if (this.f14712c == 287) {
            int i14 = this.f14717h;
            if (i14 != com.mbridge.msdk.foundation.same.a.H && i14 != com.mbridge.msdk.foundation.same.a.G) {
                com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ivrwd", "0");
            } else {
                com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ivrwd", "1");
            }
        }
        if (a11 != null && !TextUtils.isEmpty(a11.k())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "u_stid", a11.k());
        }
        com.mbridge.msdk.videocommon.d.a b3 = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b3 != null && !TextUtils.isEmpty(b3.b())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "r_stid", b3.b());
        }
        if (!this.f14718i) {
            str = "0";
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "rw_plus", str);
        String d11 = ai.d(this.f14714e);
        if (!TextUtils.isEmpty(d11)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "j", d11);
        }
        f.a(eVar, this.f14711b);
        f.a(eVar);
        f.c(eVar);
        f.e(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final void a(int i10) {
        this.f14717h = i10;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str) || !com.mbridge.msdk.e.b.a()) {
            return;
        }
        this.a.put("install_ids", str);
    }

    public final void c(String str) {
        if (!TextUtils.isEmpty(str) && com.mbridge.msdk.e.b.a() && com.mbridge.msdk.e.b.a()) {
            this.a.put("ttc_ids", str);
        }
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.put(e.f13420f, str);
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.put(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.put(e.f13419e, str);
    }

    public final void b(int i10) {
        this.a.put("offset", String.valueOf(i10));
    }

    public final void c(int i10) {
        this.a.put("req_type", String.valueOf(i10));
    }
}
