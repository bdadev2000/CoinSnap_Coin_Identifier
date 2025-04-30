package com.mbridge.msdk.splash.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f17894a;
    private c b;

    /* renamed from: c, reason: collision with root package name */
    private String f17895c;

    /* renamed from: d, reason: collision with root package name */
    private String f17896d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeIds f17897e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.b = cVar;
        this.f17897e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f17895c = mBridgeIds.getUnitId();
        }
    }

    public final void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f17894a = mBSplashLoadListener;
    }

    public final void a(String str) {
        this.f17896d = str;
    }

    public final void a(CampaignEx campaignEx, int i9) {
        c cVar;
        c cVar2 = this.b;
        if (cVar2 == null || !cVar2.a() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f17894a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f17897e, i9);
            this.f17894a.isSupportZoomOut(this.f17897e, campaignEx.getFlb() == 1);
        }
        this.b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        i.a(com.mbridge.msdk.foundation.controller.c.m().c(), arrayList, this.f17895c, campaignEx.isBidCampaign());
        if (i9 != 2 || (cVar = this.b) == null) {
            return;
        }
        cVar.a(campaignEx, 0, true);
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar, int i9) {
        c cVar = this.b;
        if (cVar == null || !cVar.a()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String b = bVar.b();
            if (!TextUtils.isEmpty(b)) {
                str = b;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f17894a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f17897e, str, i9);
        }
        this.b.a(false);
        i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, this.f17895c, !TextUtils.isEmpty(this.f17896d), bVar != null ? bVar.c() : null);
    }
}
