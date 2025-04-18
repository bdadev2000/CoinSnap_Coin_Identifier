package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: k, reason: collision with root package name */
    private MBridgeVideoView f16027k;

    /* renamed from: l, reason: collision with root package name */
    private MBridgeContainerView f16028l;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f16027k = mBridgeVideoView;
        this.f16028l = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.d, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i10, Object obj) {
        if (this.a) {
            if (i10 != 8) {
                if (i10 != 107) {
                    if (i10 != 112) {
                        if (i10 == 115) {
                            this.f16028l.resizeMiniCard(this.f16027k.getBorderViewWidth(), this.f16027k.getBorderViewHeight(), this.f16027k.getBorderViewRadius());
                        }
                    } else {
                        this.f16027k.setCover(true);
                        this.f16027k.setMiniEndCardState(true);
                        this.f16027k.videoOperate(2);
                    }
                } else {
                    this.f16028l.showVideoClickView(-1);
                    this.f16027k.setCover(false);
                    this.f16027k.setMiniEndCardState(false);
                    this.f16027k.videoOperate(1);
                }
            } else {
                MBridgeContainerView mBridgeContainerView = this.f16028l;
                if (mBridgeContainerView != null) {
                    if (!mBridgeContainerView.showAlertWebView()) {
                        MBridgeVideoView mBridgeVideoView = this.f16027k;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.showAlertView();
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView2 = this.f16027k;
                        if (mBridgeVideoView2 != null) {
                            mBridgeVideoView2.alertWebViewShowed();
                        }
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f16027k;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            }
        }
        super.a(i10, obj);
    }
}
