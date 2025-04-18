package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* loaded from: classes4.dex */
public final class c extends d {

    /* renamed from: k, reason: collision with root package name */
    private IJSFactory f16029k;

    public c(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f16029k = iJSFactory;
        if (iJSFactory == null) {
            this.a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.d, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i10, Object obj) {
        if (this.a) {
            if (i10 != 8) {
                if (i10 != 105) {
                    if (i10 != 107) {
                        if (i10 != 112) {
                            if (i10 == 115) {
                                com.mbridge.msdk.video.signal.j jSVideoModule = this.f16029k.getJSVideoModule();
                                this.f16029k.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                            }
                        } else {
                            this.f16029k.getJSVideoModule().setCover(true);
                            this.f16029k.getJSVideoModule().setMiniEndCardState(true);
                            this.f16029k.getJSVideoModule().videoOperate(2);
                        }
                    } else {
                        this.f16029k.getJSContainerModule().showVideoClickView(-1);
                        this.f16029k.getJSVideoModule().setCover(false);
                        this.f16029k.getJSVideoModule().setMiniEndCardState(false);
                        this.f16029k.getJSVideoModule().videoOperate(1);
                    }
                } else {
                    this.f16029k.getJSNotifyProxy().a(3, obj.toString());
                    i10 = -1;
                }
            } else if (!this.f16029k.getJSContainerModule().showAlertWebView()) {
                this.f16029k.getJSVideoModule().showAlertView();
            } else {
                this.f16029k.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.a(i10, obj);
    }
}
