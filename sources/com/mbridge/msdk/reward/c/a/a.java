package com.mbridge.msdk.reward.c.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.b;
import com.mbridge.msdk.videocommon.d.c;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f17688a;

    private a() {
    }

    public static a a() {
        if (f17688a == null) {
            synchronized (a.class) {
                try {
                    if (f17688a == null) {
                        f17688a = new a();
                    }
                } finally {
                }
            }
        }
        return f17688a;
    }

    public final void a(String str, b bVar) {
        b bVar2;
        List<CampaignEx> h6;
        try {
            if (bVar == null) {
                try {
                    bVar2 = new b();
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        e4.printStackTrace();
                    }
                }
            } else {
                bVar2 = bVar;
            }
            com.mbridge.msdk.videocommon.d.a b = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b != null) {
                bVar2.h(b.b());
                bVar2.f(b.c());
            }
            if (bVar != null) {
                try {
                    int j7 = bVar.j();
                    String i9 = bVar.i();
                    if (TextUtils.isEmpty(i9) && (h6 = bVar.h()) != null && h6.size() > 0 && h6.get(0) != null) {
                        i9 = h6.get(0).getCampaignUnitId();
                        j7 = h6.get(0).getAdType();
                        bVar.b(j7);
                        bVar.d(i9);
                    }
                    c a6 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), i9, j7 == 287);
                    if (a6 != null) {
                        bVar.g(a6.l());
                        bVar.n(a6.k());
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        e9.printStackTrace();
                    }
                }
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
