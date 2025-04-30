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

/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    private final int f17344c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17345d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17346e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17347f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17348g;

    /* renamed from: h, reason: collision with root package name */
    private int f17349h;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f17343a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f17350i = false;
    private final Context b = com.mbridge.msdk.foundation.controller.c.m().c();

    public d(int i9, String str, String str2, boolean z8, String str3) {
        this.f17344c = i9;
        this.f17345d = str;
        this.f17346e = str2;
        this.f17347f = z8;
        this.f17348g = str3;
    }

    public final void a(boolean z8) {
        this.f17350i = z8;
    }

    public final int b() {
        return this.f17344c;
    }

    public final String c() {
        return this.f17345d;
    }

    public final String d() {
        return this.f17346e;
    }

    public final String e() {
        return this.f17348g;
    }

    public final Map<String, String> f() {
        int i9;
        int i10;
        int i11;
        Map<String, String> a6 = a();
        if (a6 != null) {
            this.f17343a.putAll(a6);
        }
        e eVar = new e(this.f17343a);
        if (com.mbridge.msdk.e.b.a()) {
            eVar.a("gp_version", j.c(this.b));
        }
        String str = "1";
        eVar.a("version_flag", "1");
        int i12 = 1;
        if (com.mbridge.msdk.e.b.a()) {
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.c(true);
        }
        eVar.a("misk_spt", String.valueOf(ai.a()));
        String c9 = ai.c();
        if (!TextUtils.isEmpty(c9)) {
            eVar.a("misk_spt_det", c9);
        }
        String str2 = this.f17346e;
        if (str2 != null) {
            CustomInfoManager customInfoManager = CustomInfoManager.getInstance();
            if (this.f17347f) {
                i11 = 7;
            } else {
                i11 = 8;
            }
            String customInfoByUnitId = customInfoManager.getCustomInfoByUnitId(str2, i11);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            k d2 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
            if (d2 != null && !TextUtils.isEmpty(d2.a())) {
                eVar.a("u_stid", d2.a());
            }
        }
        String a9 = com.mbridge.msdk.foundation.same.a.b.a(this.f17346e, "reward");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f17346e);
        if (!TextUtils.isEmpty(this.f17345d)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f17345d);
        }
        com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17346e);
        if (a10 != null) {
            i9 = a10.t();
            i10 = a10.u();
        } else {
            i9 = 0;
            i10 = 0;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_num", String.valueOf(i9));
        if (this.f17344c != 287) {
            i12 = i10;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "tnum", String.valueOf(i12));
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, e.f15853d, a9);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        String str3 = e.f15855f;
        String str4 = MBridgeGlobalCommon.SESSION_ID;
        if (str4 == null) {
            str4 = "";
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, str3, str4);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_type", String.valueOf(this.f17344c));
        if (!TextUtils.isEmpty(this.f17348g)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, BidResponsed.KEY_TOKEN, this.f17348g);
        }
        if (this.f17344c == 287) {
            int i13 = this.f17349h;
            if (i13 != com.mbridge.msdk.foundation.same.a.f15661H && i13 != com.mbridge.msdk.foundation.same.a.f15660G) {
                com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ivrwd", "0");
            } else {
                com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ivrwd", "1");
            }
        }
        if (a10 != null && !TextUtils.isEmpty(a10.k())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "u_stid", a10.k());
        }
        com.mbridge.msdk.videocommon.d.a b = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b != null && !TextUtils.isEmpty(b.b())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "r_stid", b.b());
        }
        if (!this.f17350i) {
            str = "0";
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "rw_plus", str);
        String d9 = ai.d(this.f17346e);
        if (!TextUtils.isEmpty(d9)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "j", d9);
        }
        f.a(eVar, this.b);
        f.a(eVar);
        f.c(eVar);
        f.e(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final void a(int i9) {
        this.f17349h = i9;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str) || !com.mbridge.msdk.e.b.a()) {
            return;
        }
        this.f17343a.put("install_ids", str);
    }

    public final void c(String str) {
        if (!TextUtils.isEmpty(str) && com.mbridge.msdk.e.b.a() && com.mbridge.msdk.e.b.a()) {
            this.f17343a.put("ttc_ids", str);
        }
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17343a.put(e.f15855f, str);
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17343a.put(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17343a.put(e.f15854e, str);
    }

    public final void b(int i9) {
        this.f17343a.put("offset", String.valueOf(i9));
    }

    public final void c(int i9) {
        this.f17343a.put("req_type", String.valueOf(i9));
    }
}
