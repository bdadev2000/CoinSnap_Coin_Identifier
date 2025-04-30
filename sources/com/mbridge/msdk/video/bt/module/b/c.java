package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f18549a;

    /* renamed from: d, reason: collision with root package name */
    private String f18550d;

    public c(com.mbridge.msdk.video.bt.module.a.b bVar, String str) {
        this.f18549a = bVar;
        this.f18550d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f18549a != null) {
            ad.a("H5ShowRewardListener", "onAdShow");
            this.f18549a.a(this.f18550d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void b(String str, String str2) {
        if (this.f18549a != null) {
            ad.a("H5ShowRewardListener", "onEndcardShow");
            this.f18549a.c(this.f18550d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
        if (this.f18549a != null) {
            ad.a("H5ShowRewardListener", "onAdClose");
            this.f18549a.a(this.f18550d, z8, cVar);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        if (this.f18549a != null) {
            ad.a("H5ShowRewardListener", "onShowFail");
            this.f18549a.a(this.f18550d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z8, String str, String str2) {
        if (this.f18549a != null) {
            ad.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f18549a.a(this.f18550d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(String str, String str2) {
        if (this.f18549a != null) {
            ad.a("H5ShowRewardListener", "onVideoComplete");
            this.f18549a.b(this.f18550d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(int i9, String str, String str2) {
        if (this.f18549a != null) {
            ad.a("H5ShowRewardListener", "onAutoLoad");
            this.f18549a.a(this.f18550d, i9, str, str2);
        }
    }
}
