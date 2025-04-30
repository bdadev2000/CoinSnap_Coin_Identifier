package com.mbridge.msdk.video.bt.module.b;

import com.applovin.impl.L;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public class b implements h {
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18548c = false;

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        ad.a("ShowRewardListener", "onAdShow");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void b(String str, String str2) {
        L.C("onEndcardShow: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
        ad.a("ShowRewardListener", "onAdClose:isCompleteView:" + z8 + ",reward:" + cVar);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        L.C("onShowFail:", str, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(boolean z8, String str, String str2) {
        L.C("onVideoAdClicked:", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(String str, String str2) {
        L.C("onVideoComplete: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(boolean z8, int i9) {
        ad.a("ShowRewardListener", "onAdCloseWithIVReward: " + z8 + "  " + i9);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(int i9, String str, String str2) {
        L.C("onAutoLoad: ", str2, "ShowRewardListener");
    }
}
