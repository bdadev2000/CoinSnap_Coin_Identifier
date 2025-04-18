package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;

/* loaded from: classes4.dex */
public final class c extends d {
    public c(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.b.c cVar, String str, String str2, boolean z10, k kVar) {
        super(mBBannerView, cVar, str, str2, z10, kVar);
    }

    @Override // com.mbridge.msdk.mbbanner.common.c.d
    public final void a(CampaignEx campaignEx, boolean z10, String str) {
        if (!this.f13842d) {
            return;
        }
        if (this.f13844f == null) {
            this.f13844f = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f13843e);
        }
        this.f13844f.a(new NativeListener.TrackingExListener() { // from class: com.mbridge.msdk.mbbanner.common.c.c.1
            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onDismissLoading(Campaign campaign) {
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onDownloadFinish(Campaign campaign) {
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onDownloadProgress(int i10) {
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onDownloadStart(Campaign campaign) {
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str2) {
                ah.a(campaign, c.this.f13841c);
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final boolean onInterceptDefaultLoadingDialog() {
                return false;
            }

            @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
            public final void onLeaveApp() {
                com.mbridge.msdk.mbbanner.common.b.c cVar = c.this.a;
                if (cVar != null) {
                    cVar.b();
                }
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str2) {
                ah.a(campaign, c.this.f13841c);
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onShowLoading(Campaign campaign) {
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str2) {
                ah.b(campaign, c.this.f13841c);
            }
        });
        campaignEx.setCampaignUnitId(this.f13843e);
        this.f13844f.a(campaignEx);
        if (!this.f13840b.isReportClick()) {
            this.f13840b.setReportClick(true);
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().l() != null) {
                com.mbridge.msdk.click.a.a(c10, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
            }
        }
        com.mbridge.msdk.mbbanner.common.b.c cVar = this.a;
        if (cVar != null) {
            cVar.a();
        }
    }
}
