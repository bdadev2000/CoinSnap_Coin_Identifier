package com.mbridge.msdk.mbnative.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a extends b<String, List<Campaign>> {

    /* renamed from: a, reason: collision with root package name */
    private e f16404a = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
    private int b;

    public a(int i9) {
        this.b = i9;
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ List<Campaign> b(String str, int i9) {
        String str2 = str;
        List<CampaignEx> a6 = this.f16404a.a(str2, i9, 1, this.b);
        if (a6 == null) {
            return null;
        }
        if (a(a6, 1)) {
            for (int i10 = 0; i10 < a6.size(); i10++) {
                CampaignEx campaignEx = a6.get(i10);
                campaignEx.setCacheLevel(2);
                this.f16404a.a(campaignEx, str2, 1);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a6);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ List<Campaign> a(String str, int i9) {
        String str2 = str;
        List<CampaignEx> a6 = this.f16404a.a(str2, i9, 2, this.b);
        if (a6 == null) {
            return null;
        }
        if (a(a6, 2)) {
            this.f16404a.a(str2, 2, this.b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a6);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ void a(String str, List<Campaign> list) {
        String str2 = str;
        List<Campaign> list2 = list;
        if (TextUtils.isEmpty(str2) || list2 == null || list2.size() <= 0) {
            return;
        }
        this.f16404a.a(str2, 1, this.b, false);
        this.f16404a.a(str2, 2, this.b, false);
        for (int i9 = 0; i9 < list2.size(); i9++) {
            CampaignEx campaignEx = (CampaignEx) list2.get(i9);
            campaignEx.setCacheLevel(1);
            this.f16404a.a(campaignEx, str2, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final /* synthetic */ void a(String str, List<Campaign> list, String str2) {
        final String str3 = str;
        final List<Campaign> list2 = list;
        boolean z8 = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str3) || list2 == null || list2.size() <= 0) {
            return;
        }
        this.f16404a.a(str3, 1, this.b, z8);
        this.f16404a.a(str3, 2, this.b, z8);
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbnative.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                for (int i9 = 0; i9 < list2.size(); i9++) {
                    CampaignEx campaignEx = (CampaignEx) list2.get(i9);
                    campaignEx.setCacheLevel(1);
                    a.this.f16404a.a(campaignEx, str3, 1);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L55
            int r1 = r10.size()
            if (r1 <= 0) goto L55
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r10 = r10.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10
            long r3 = r10.getTimestamp()
            r5 = 1000(0x3e8, double:4.94E-321)
            r10 = 1
            if (r11 == r10) goto L39
            r7 = 2
            if (r11 == r7) goto L22
            r5 = 0
            goto L4f
        L22:
            com.mbridge.msdk.c.h r11 = com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r11 = com.applovin.impl.L.f(r11)
            if (r11 != 0) goto L33
            com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r11 = com.mbridge.msdk.c.i.a()
        L33:
            long r7 = r11.aa()
        L37:
            long r5 = r5 * r7
            goto L4f
        L39:
            com.mbridge.msdk.c.h r11 = com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r11 = com.applovin.impl.L.f(r11)
            if (r11 != 0) goto L4a
            com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r11 = com.mbridge.msdk.c.i.a()
        L4a:
            long r7 = r11.Z()
            goto L37
        L4f:
            long r1 = r1 - r3
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 <= 0) goto L55
            return r10
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.a.a.a(java.util.List, int):boolean");
    }

    @Override // com.mbridge.msdk.mbnative.a.b
    public final void a(String str, Campaign campaign, String str2) {
        boolean z8 = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.f16404a.a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z8)) {
                this.f16404a.a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.b, z8);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
