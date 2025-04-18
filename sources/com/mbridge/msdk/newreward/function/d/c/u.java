package com.mbridge.msdk.newreward.function.d.c;

import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class u extends r {
    public u(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar2) {
        super(bVar, aVar, bVar2);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.newreward.function.d.c.p
    public final /* bridge */ /* synthetic */ void a(int i10, x xVar) {
        super.a(i10, xVar);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    public final String b() {
        CampaignEx g10;
        CampaignEx.c rewardTemplateMode;
        if (super.c() == null || super.c().g() == null || (g10 = super.c().g()) == null || (rewardTemplateMode = g10.getRewardTemplateMode()) == null) {
            return "";
        }
        return "template_" + rewardTemplateMode.f();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    public final /* bridge */ /* synthetic */ com.mbridge.msdk.newreward.function.d.a.a c() {
        return super.c();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    public final /* bridge */ /* synthetic */ com.mbridge.msdk.newreward.function.d.a.b d() {
        return super.d();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    public final /* bridge */ /* synthetic */ a e() {
        return super.e();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        super.onCancelDownload(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        super.onDownloadComplete(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        super.onDownloadError(downloadMessage, downloadError);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        super.onDownloadStart(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final /* bridge */ /* synthetic */ void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
        super.onProgress(downloadMessage, downloadProgress);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.newreward.a.c.a.InterfaceC0185a
    public final /* bridge */ /* synthetic */ void a(String str, long j3) {
        super.a(str, j3);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    public final boolean a() {
        com.mbridge.msdk.newreward.function.d.a.a c10 = super.c();
        if (c10 == null) {
            return true;
        }
        return c10.j();
    }
}
