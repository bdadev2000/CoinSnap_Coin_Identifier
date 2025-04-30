package com.mbridge.msdk.splash.d;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private MBSplashShowListener f17928a;
    private CampaignEx b;

    /* renamed from: c, reason: collision with root package name */
    private c f17929c;

    public d(c cVar, MBSplashShowListener mBSplashShowListener, CampaignEx campaignEx) {
        this.f17929c = cVar;
        this.f17928a = mBSplashShowListener;
        this.b = campaignEx;
    }

    public final void a(MBridgeIds mBridgeIds) {
        c cVar = this.f17929c;
        if (cVar != null) {
            cVar.f17902a = true;
        }
        StringBuffer stringBuffer = new StringBuffer("load_to=");
        stringBuffer.append(this.f17929c.b());
        stringBuffer.append("&allow_skip=");
        stringBuffer.append(this.f17929c.c() ? 1 : 0);
        stringBuffer.append("&countdown=");
        stringBuffer.append(this.f17929c.d());
        stringBuffer.append("&");
        i.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, mBridgeIds.getUnitId(), stringBuffer.toString());
        MBSplashShowListener mBSplashShowListener = this.f17928a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowSuccessed(mBridgeIds);
        }
    }

    public final void b(MBridgeIds mBridgeIds) {
        MBSplashShowListener mBSplashShowListener = this.f17928a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdClicked(mBridgeIds);
        }
    }

    public final void a(MBridgeIds mBridgeIds, String str) {
        c cVar = this.f17929c;
        if (cVar != null) {
            cVar.f17902a = false;
        }
        i.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, mBridgeIds.getUnitId(), str);
        MBSplashShowListener mBSplashShowListener = this.f17928a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(mBridgeIds, str);
        }
    }

    public final void a(MBridgeIds mBridgeIds, int i9) {
        com.mbridge.msdk.splash.a.c a6;
        MBSplashShowListener mBSplashShowListener = this.f17928a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onDismiss(mBridgeIds, i9);
        }
        c cVar = this.f17929c;
        if (cVar != null) {
            cVar.f17902a = false;
        }
        if (i9 == 6 || i9 == 4 || i9 == 5) {
            CampaignEx campaignEx = this.b;
            String unitId = mBridgeIds.getUnitId();
            if (campaignEx != null) {
                try {
                    a6 = com.mbridge.msdk.splash.a.c.a().b(unitId).d(campaignEx.getRequestId()).g(campaignEx.getRequestIdNotice()).c(campaignEx.getId()).e(campaignEx.getCreativeId() + "").a(campaignEx.isBidCampaign());
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        e4.printStackTrace();
                        return;
                    }
                    return;
                }
            } else {
                a6 = null;
            }
            com.mbridge.msdk.splash.e.a.a(a6, unitId, i9);
        }
    }

    public final void a(MBridgeIds mBridgeIds, long j7) {
        MBSplashShowListener mBSplashShowListener = this.f17928a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdTick(mBridgeIds, j7);
        }
    }

    public final void a(MBridgeIds mBridgeIds, int i9, int i10, int i11) {
        MBSplashShowListener mBSplashShowListener = this.f17928a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayStart(mBridgeIds);
        }
        try {
            i.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, mBridgeIds.getUnitId(), "flb_size=" + i10 + "x" + i9 + "&flb_type=" + i11 + "&");
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}
