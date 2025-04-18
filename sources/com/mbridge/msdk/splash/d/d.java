package com.mbridge.msdk.splash.d;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes4.dex */
public final class d {
    private MBSplashShowListener a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f15232b;

    /* renamed from: c, reason: collision with root package name */
    private c f15233c;

    public d(c cVar, MBSplashShowListener mBSplashShowListener, CampaignEx campaignEx) {
        this.f15233c = cVar;
        this.a = mBSplashShowListener;
        this.f15232b = campaignEx;
    }

    public final void a(MBridgeIds mBridgeIds) {
        c cVar = this.f15233c;
        if (cVar != null) {
            cVar.a = true;
        }
        StringBuffer stringBuffer = new StringBuffer("load_to=");
        stringBuffer.append(this.f15233c.b());
        stringBuffer.append("&allow_skip=");
        stringBuffer.append(this.f15233c.c() ? 1 : 0);
        stringBuffer.append("&countdown=");
        stringBuffer.append(this.f15233c.d());
        stringBuffer.append("&");
        i.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15232b, mBridgeIds.getUnitId(), stringBuffer.toString());
        MBSplashShowListener mBSplashShowListener = this.a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowSuccessed(mBridgeIds);
        }
    }

    public final void b(MBridgeIds mBridgeIds) {
        MBSplashShowListener mBSplashShowListener = this.a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdClicked(mBridgeIds);
        }
    }

    public final void a(MBridgeIds mBridgeIds, String str) {
        c cVar = this.f15233c;
        if (cVar != null) {
            cVar.a = false;
        }
        i.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15232b, mBridgeIds.getUnitId(), str);
        MBSplashShowListener mBSplashShowListener = this.a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(mBridgeIds, str);
        }
    }

    public final void a(MBridgeIds mBridgeIds, int i10) {
        com.mbridge.msdk.splash.a.c a;
        MBSplashShowListener mBSplashShowListener = this.a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onDismiss(mBridgeIds, i10);
        }
        c cVar = this.f15233c;
        if (cVar != null) {
            cVar.a = false;
        }
        if (i10 == 6 || i10 == 4 || i10 == 5) {
            CampaignEx campaignEx = this.f15232b;
            String unitId = mBridgeIds.getUnitId();
            if (campaignEx != null) {
                try {
                    a = com.mbridge.msdk.splash.a.c.a().b(unitId).d(campaignEx.getRequestId()).g(campaignEx.getRequestIdNotice()).c(campaignEx.getId()).e(campaignEx.getCreativeId() + "").a(campaignEx.isBidCampaign());
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                        return;
                    }
                    return;
                }
            } else {
                a = null;
            }
            com.mbridge.msdk.splash.e.a.a(a, unitId, i10);
        }
    }

    public final void a(MBridgeIds mBridgeIds, long j3) {
        MBSplashShowListener mBSplashShowListener = this.a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdTick(mBridgeIds, j3);
        }
    }

    public final void a(MBridgeIds mBridgeIds, int i10, int i11, int i12) {
        MBSplashShowListener mBSplashShowListener = this.a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayStart(mBridgeIds);
        }
        try {
            i.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15232b, mBridgeIds.getUnitId(), "flb_size=" + i11 + "x" + i10 + "&flb_type=" + i12 + "&");
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
