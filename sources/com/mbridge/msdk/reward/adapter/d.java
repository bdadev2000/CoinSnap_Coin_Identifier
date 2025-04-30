package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbid.out.BidResponsed;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f17581a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17582c;

    /* renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.videocommon.d.c f17583d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17584e;

    public d(String str, String str2, boolean z8, com.mbridge.msdk.videocommon.d.c cVar, String str3) {
        this.f17581a = str;
        this.b = str2;
        this.f17582c = z8;
        this.f17583d = cVar;
        this.f17584e = str3;
    }

    public final e a(boolean z8, String str, int i9, String str2, String str3, String str4, String str5, boolean z9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String str6;
        String str7;
        String str8;
        String str9;
        String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().k() + com.mbridge.msdk.foundation.controller.c.m().b());
        if (z8) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        com.mbridge.msdk.videocommon.d.c cVar = this.f17583d;
        if (cVar != null) {
            i12 = cVar.t();
            i13 = this.f17583d.u();
        } else {
            i12 = 0;
            i13 = 0;
        }
        String a6 = com.mbridge.msdk.foundation.same.a.b.a(this.b, "reward");
        if (this.f17582c) {
            i14 = 287;
        } else {
            i14 = 94;
        }
        e eVar = new e();
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.APP_ID, k6);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
        if (!TextUtils.isEmpty(this.f17581a)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f17581a);
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
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "req_type", String.valueOf(i11));
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_num", String.valueOf(i12));
        if (this.f17582c) {
            i13 = 1;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "tnum", String.valueOf(i13));
        String str11 = "1";
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, e.f15853d, a6);
        String str12 = e.f15854e;
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, str12, str6);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        String str13 = e.f15855f;
        if (str2 == null) {
            str7 = "";
        } else {
            str7 = str2;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, str13, str7);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_type", String.valueOf(i14));
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "offset", String.valueOf(i9));
        if (!TextUtils.isEmpty(str5)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, BidResponsed.KEY_TOKEN, str5);
        }
        if (this.f17582c) {
            if (i10 != com.mbridge.msdk.foundation.same.a.f15661H && i10 != com.mbridge.msdk.foundation.same.a.f15660G) {
                com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ivrwd", "0");
            } else {
                com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ivrwd", "1");
            }
        }
        com.mbridge.msdk.videocommon.d.c cVar2 = this.f17583d;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.k())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "u_stid", this.f17583d.k());
        }
        com.mbridge.msdk.videocommon.d.a b = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b != null && !TextUtils.isEmpty(b.b())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "r_stid", b.b());
        }
        if (!z9) {
            str11 = "0";
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "rw_plus", str11);
        String d2 = ai.d(this.b);
        if (!TextUtils.isEmpty(d2)) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "j", d2);
        }
        String str14 = this.f17584e;
        if (str14 != null) {
            str10 = str14;
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str10);
        return eVar;
    }
}
