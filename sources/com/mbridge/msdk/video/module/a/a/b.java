package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* loaded from: classes3.dex */
public final class b extends d {

    /* renamed from: k, reason: collision with root package name */
    private MBridgeVideoView f19012k;
    private MBridgeContainerView l;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i9, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i9, z8);
        this.f19012k = mBridgeVideoView;
        this.l = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f19019a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.d, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i9, Object obj) {
        if (this.f19019a) {
            if (i9 != 8) {
                if (i9 != 107) {
                    if (i9 != 112) {
                        if (i9 == 115) {
                            this.l.resizeMiniCard(this.f19012k.getBorderViewWidth(), this.f19012k.getBorderViewHeight(), this.f19012k.getBorderViewRadius());
                        }
                    } else {
                        this.f19012k.setCover(true);
                        this.f19012k.setMiniEndCardState(true);
                        this.f19012k.videoOperate(2);
                    }
                } else {
                    this.l.showVideoClickView(-1);
                    this.f19012k.setCover(false);
                    this.f19012k.setMiniEndCardState(false);
                    this.f19012k.videoOperate(1);
                }
            } else {
                MBridgeContainerView mBridgeContainerView = this.l;
                if (mBridgeContainerView != null) {
                    if (!mBridgeContainerView.showAlertWebView()) {
                        MBridgeVideoView mBridgeVideoView = this.f19012k;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.showAlertView();
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView2 = this.f19012k;
                        if (mBridgeVideoView2 != null) {
                            mBridgeVideoView2.alertWebViewShowed();
                        }
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f19012k;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            }
        }
        super.a(i9, obj);
    }
}
