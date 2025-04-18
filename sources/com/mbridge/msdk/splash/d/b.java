package com.mbridge.msdk.splash.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b {
    private MBSplashLoadListener a;

    /* renamed from: b, reason: collision with root package name */
    private c f15201b;

    /* renamed from: c, reason: collision with root package name */
    private String f15202c;

    /* renamed from: d, reason: collision with root package name */
    private String f15203d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeIds f15204e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f15201b = cVar;
        this.f15204e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f15202c = mBridgeIds.getUnitId();
        }
    }

    public final void a(MBSplashLoadListener mBSplashLoadListener) {
        this.a = mBSplashLoadListener;
    }

    public final void a(String str) {
        this.f15203d = str;
    }

    public final void a(CampaignEx campaignEx, int i10) {
        c cVar;
        c cVar2 = this.f15201b;
        if (cVar2 == null || !cVar2.a() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f15204e, i10);
            this.a.isSupportZoomOut(this.f15204e, campaignEx.getFlb() == 1);
        }
        this.f15201b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        i.a(com.mbridge.msdk.foundation.controller.c.m().c(), arrayList, this.f15202c, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f15201b) == null) {
            return;
        }
        cVar.a(campaignEx, 0, true);
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar, int i10) {
        c cVar = this.f15201b;
        if (cVar == null || !cVar.a()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String b3 = bVar.b();
            if (!TextUtils.isEmpty(b3)) {
                str = b3;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f15204e, str, i10);
        }
        this.f15201b.a(false);
        i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, this.f15202c, !TextUtils.isEmpty(this.f15203d), bVar != null ? bVar.c() : null);
    }
}
