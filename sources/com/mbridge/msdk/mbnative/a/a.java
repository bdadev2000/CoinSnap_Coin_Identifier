package com.mbridge.msdk.mbnative.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class a extends b<String, List<Campaign>> {
    private e a = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));

    /* renamed from: b, reason: collision with root package name */
    private int f13925b;

    public a(int i10) {
        this.f13925b = i10;
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ List<Campaign> b(String str, int i10) {
        String str2 = str;
        List<CampaignEx> a = this.a.a(str2, i10, 1, this.f13925b);
        if (a == null) {
            return null;
        }
        if (a(a, 1)) {
            for (int i11 = 0; i11 < a.size(); i11++) {
                CampaignEx campaignEx = a.get(i11);
                campaignEx.setCacheLevel(2);
                this.a.a(campaignEx, str2, 1);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ List<Campaign> a(String str, int i10) {
        String str2 = str;
        List<CampaignEx> a = this.a.a(str2, i10, 2, this.f13925b);
        if (a == null) {
            return null;
        }
        if (a(a, 2)) {
            this.a.a(str2, 2, this.f13925b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ void a(String str, List<Campaign> list) {
        String str2 = str;
        List<Campaign> list2 = list;
        if (TextUtils.isEmpty(str2) || list2 == null || list2.size() <= 0) {
            return;
        }
        this.a.a(str2, 1, this.f13925b, false);
        this.a.a(str2, 2, this.f13925b, false);
        for (int i10 = 0; i10 < list2.size(); i10++) {
            CampaignEx campaignEx = (CampaignEx) list2.get(i10);
            campaignEx.setCacheLevel(1);
            this.a.a(campaignEx, str2, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ void a(String str, List<Campaign> list, String str2) {
        final String str3 = str;
        final List<Campaign> list2 = list;
        boolean z10 = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str3) || list2 == null || list2.size() <= 0) {
            return;
        }
        this.a.a(str3, 1, this.f13925b, z10);
        this.a.a(str3, 2, this.f13925b, z10);
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbnative.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    CampaignEx campaignEx = (CampaignEx) list2.get(i10);
                    campaignEx.setCacheLevel(1);
                    a.this.a.a(campaignEx, str3, 1);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L54
            int r1 = r10.size()
            if (r1 <= 0) goto L54
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r10 = r10.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10
            long r3 = r10.getTimestamp()
            r5 = 1000(0x3e8, double:4.94E-321)
            r10 = 1
            if (r11 == r10) goto L38
            r7 = 2
            if (r11 == r7) goto L22
            r5 = 0
            goto L4e
        L22:
            com.mbridge.msdk.c.h r11 = com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r11 = com.applovin.impl.mediation.ads.e.d(r11)
            if (r11 != 0) goto L33
            com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r11 = com.mbridge.msdk.c.i.a()
        L33:
            long r7 = r11.aa()
            goto L4d
        L38:
            com.mbridge.msdk.c.h r11 = com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r11 = com.applovin.impl.mediation.ads.e.d(r11)
            if (r11 != 0) goto L49
            com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r11 = com.mbridge.msdk.c.i.a()
        L49:
            long r7 = r11.Z()
        L4d:
            long r5 = r5 * r7
        L4e:
            long r1 = r1 - r3
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 <= 0) goto L54
            return r10
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.a.a.a(java.util.List, int):boolean");
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final void a(String str, Campaign campaign, String str2) {
        boolean z10 = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.a.a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z10)) {
                this.a.a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.f13925b, z10);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
