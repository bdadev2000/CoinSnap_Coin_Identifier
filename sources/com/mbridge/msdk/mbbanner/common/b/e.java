package com.mbridge.msdk.mbbanner.common.b;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public class e implements H5DownLoadManager.IH5SourceDownloadListener {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16254a = "e";
    private com.mbridge.msdk.mbbanner.common.c.b b;

    /* renamed from: c, reason: collision with root package name */
    private String f16255c;

    /* renamed from: d, reason: collision with root package name */
    private CampaignEx f16256d;

    public e(com.mbridge.msdk.mbbanner.common.c.b bVar, String str, CampaignEx campaignEx) {
        this.b = bVar;
        this.f16255c = str;
        this.f16256d = campaignEx;
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
    public void onFailed(String str, String str2) {
        ad.c(f16254a, "DownloadBannerUrlListener HTML FAIL:" + str);
        com.mbridge.msdk.mbbanner.common.c.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.f16255c, 3, str, false, this.f16256d);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
    public void onSuccess(String str, String str2, boolean z8) {
        ad.c(f16254a, "DownloadBannerUrlListener HTML SUCCESS:" + str);
        com.mbridge.msdk.mbbanner.common.c.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.f16255c, 3, str, true, this.f16256d);
        }
    }
}
