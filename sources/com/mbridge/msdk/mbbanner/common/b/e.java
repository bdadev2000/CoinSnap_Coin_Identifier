package com.mbridge.msdk.mbbanner.common.b;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class e implements H5DownLoadManager.IH5SourceDownloadListener {
    private static final String a = "e";

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.c.b f13800b;

    /* renamed from: c, reason: collision with root package name */
    private String f13801c;

    /* renamed from: d, reason: collision with root package name */
    private CampaignEx f13802d;

    public e(com.mbridge.msdk.mbbanner.common.c.b bVar, String str, CampaignEx campaignEx) {
        this.f13800b = bVar;
        this.f13801c = str;
        this.f13802d = campaignEx;
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
    public void onFailed(String str, String str2) {
        ad.c(a, "DownloadBannerUrlListener HTML FAIL:" + str);
        com.mbridge.msdk.mbbanner.common.c.b bVar = this.f13800b;
        if (bVar != null) {
            bVar.a(this.f13801c, 3, str, false, this.f13802d);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
    public void onSuccess(String str, String str2, boolean z10) {
        ad.c(a, "DownloadBannerUrlListener HTML SUCCESS:" + str);
        com.mbridge.msdk.mbbanner.common.c.b bVar = this.f13800b;
        if (bVar != null) {
            bVar.a(this.f13801c, 3, str, true, this.f13802d);
        }
    }
}
