package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbid.out.BidResponsed;

/* loaded from: classes4.dex */
public final class d {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14947b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14948c;

    /* renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.videocommon.d.c f14949d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14950e;

    public d(String str, String str2, boolean z10, com.mbridge.msdk.videocommon.d.c cVar, String str3) {
        this.a = str;
        this.f14947b = str2;
        this.f14948c = z10;
        this.f14949d = cVar;
        this.f14950e = str3;
    }

    public final e a(boolean z10, String str, int i10, String str2, String str3, String str4, String str5, boolean z11, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        String str6;
        String str7;
        String str8;
        String str9;
        String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().k() + com.mbridge.msdk.foundation.controller.c.m().b());
        if (z10) {
            i12 = 2;
        } else {
            i12 = 3;
        }
        com.mbridge.msdk.videocommon.d.c cVar = this.f14949d;
        if (cVar != null) {
            i13 = cVar.t();
            i14 = this.f14949d.u();
        } else {
            i13 = 0;
            i14 = 0;
        }
        String a = com.mbridge.msdk.foundation.same.a.b.a(this.f14947b, "reward");
        if (this.f14948c) {
            i15 = 287;
        } else {
            i15 = 94;
        }
        e eVar = new e();
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.APP_ID, k10);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f14947b);
        if (!TextUtils.isEmpty(this.a)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.a);
        }
        String str10 = "";
        if (com.mbridge.msdk.e.b.a()) {
            if (str4 == null) {
                str8 = "";
            } else {
                str8 = str4;
            }
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ttc_ids", str8);
            if (str3 == null) {
                str9 = "";
            } else {
                str9 = str3;
            }
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "install_ids", str9);
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "req_type", String.valueOf(i12));
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_num", String.valueOf(i13));
        if (this.f14948c) {
            i14 = 1;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "tnum", String.valueOf(i14));
        String str11 = "1";
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, e.f13418d, a);
        String str12 = e.f13419e;
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, str12, str6);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        String str13 = e.f13420f;
        if (str2 == null) {
            str7 = "";
        } else {
            str7 = str2;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, str13, str7);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_type", String.valueOf(i15));
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "offset", String.valueOf(i10));
        if (!TextUtils.isEmpty(str5)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, BidResponsed.KEY_TOKEN, str5);
        }
        if (this.f14948c) {
            if (i11 != com.mbridge.msdk.foundation.same.a.H && i11 != com.mbridge.msdk.foundation.same.a.G) {
                com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ivrwd", "0");
            } else {
                com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ivrwd", "1");
            }
        }
        com.mbridge.msdk.videocommon.d.c cVar2 = this.f14949d;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.k())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "u_stid", this.f14949d.k());
        }
        com.mbridge.msdk.videocommon.d.a b3 = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b3 != null && !TextUtils.isEmpty(b3.b())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "r_stid", b3.b());
        }
        if (!z11) {
            str11 = "0";
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "rw_plus", str11);
        String d10 = ai.d(this.f14947b);
        if (!TextUtils.isEmpty(d10)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "j", d10);
        }
        String str14 = this.f14950e;
        if (str14 != null) {
            str10 = str14;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str10);
        return eVar;
    }
}
