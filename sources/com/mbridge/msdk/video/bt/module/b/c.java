package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class c extends b {
    private com.mbridge.msdk.video.bt.module.a.b a;

    /* renamed from: d, reason: collision with root package name */
    private String f15691d;

    public c(com.mbridge.msdk.video.bt.module.a.b bVar, String str) {
        this.a = bVar;
        this.f15691d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.a != null) {
            ad.a("H5ShowRewardListener", "onAdShow");
            this.a.a(this.f15691d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void b(String str, String str2) {
        if (this.a != null) {
            ad.a("H5ShowRewardListener", "onEndcardShow");
            this.a.c(this.f15691d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z10, com.mbridge.msdk.videocommon.b.c cVar) {
        if (this.a != null) {
            ad.a("H5ShowRewardListener", "onAdClose");
            this.a.a(this.f15691d, z10, cVar);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        if (this.a != null) {
            ad.a("H5ShowRewardListener", "onShowFail");
            this.a.a(this.f15691d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z10, String str, String str2) {
        if (this.a != null) {
            ad.a("H5ShowRewardListener", "onVideoAdClicked");
            this.a.a(this.f15691d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(String str, String str2) {
        if (this.a != null) {
            ad.a("H5ShowRewardListener", "onVideoComplete");
            this.a.b(this.f15691d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(int i10, String str, String str2) {
        if (this.a != null) {
            ad.a("H5ShowRewardListener", "onAutoLoad");
            this.a.a(this.f15691d, i10, str, str2);
        }
    }
}
