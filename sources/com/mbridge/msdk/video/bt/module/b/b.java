package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class b implements h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f15689b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15690c = false;

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(int i10, String str, String str2) {
        com.applovin.impl.mediation.ads.e.A("onAutoLoad: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void b(String str, String str2) {
        com.applovin.impl.mediation.ads.e.A("onEndcardShow: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        com.applovin.impl.mediation.ads.e.A("onShowFail:", str, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(String str, String str2) {
        com.applovin.impl.mediation.ads.e.A("onVideoComplete: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(boolean z10, String str, String str2) {
        com.applovin.impl.mediation.ads.e.A("onVideoAdClicked:", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        ad.a("ShowRewardListener", "onAdShow");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z10, com.mbridge.msdk.videocommon.b.c cVar) {
        ad.a("ShowRewardListener", "onAdClose:isCompleteView:" + z10 + ",reward:" + cVar);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(boolean z10, int i10) {
        ad.a("ShowRewardListener", "onAdCloseWithIVReward: " + z10 + "  " + i10);
    }
}
