package com.mbridge.msdk.reward.c.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.b;
import com.mbridge.msdk.videocommon.d.c;
import java.util.List;

/* loaded from: classes4.dex */
public class a {
    private static volatile a a;

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public final void a(String str, b bVar) {
        b bVar2;
        List<CampaignEx> h10;
        try {
            if (bVar == null) {
                try {
                    bVar2 = new b();
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            } else {
                bVar2 = bVar;
            }
            com.mbridge.msdk.videocommon.d.a b3 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b3 != null) {
                bVar2.h(b3.b());
                bVar2.f(b3.c());
            }
            if (bVar != null) {
                try {
                    int j3 = bVar.j();
                    String i10 = bVar.i();
                    if (TextUtils.isEmpty(i10) && (h10 = bVar.h()) != null && h10.size() > 0 && h10.get(0) != null) {
                        i10 = h10.get(0).getCampaignUnitId();
                        j3 = h10.get(0).getAdType();
                        bVar.b(j3);
                        bVar.d(i10);
                    }
                    c a10 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), i10, j3 == 287);
                    if (a10 != null) {
                        bVar.g(a10.l());
                        bVar.n(a10.k());
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
    }
}
