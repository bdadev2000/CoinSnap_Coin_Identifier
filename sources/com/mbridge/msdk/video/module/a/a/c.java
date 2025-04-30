package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: k, reason: collision with root package name */
    private IJSFactory f19013k;

    public c(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i9, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i9, z8);
        this.f19013k = iJSFactory;
        if (iJSFactory == null) {
            this.f19019a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.d, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i9, Object obj) {
        if (this.f19019a) {
            if (i9 != 8) {
                if (i9 != 105) {
                    if (i9 != 107) {
                        if (i9 != 112) {
                            if (i9 == 115) {
                                com.mbridge.msdk.video.signal.j jSVideoModule = this.f19013k.getJSVideoModule();
                                this.f19013k.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                            }
                        } else {
                            this.f19013k.getJSVideoModule().setCover(true);
                            this.f19013k.getJSVideoModule().setMiniEndCardState(true);
                            this.f19013k.getJSVideoModule().videoOperate(2);
                        }
                    } else {
                        this.f19013k.getJSContainerModule().showVideoClickView(-1);
                        this.f19013k.getJSVideoModule().setCover(false);
                        this.f19013k.getJSVideoModule().setMiniEndCardState(false);
                        this.f19013k.getJSVideoModule().videoOperate(1);
                    }
                } else {
                    this.f19013k.getJSNotifyProxy().a(3, obj.toString());
                    i9 = -1;
                }
            } else if (!this.f19013k.getJSContainerModule().showAlertWebView()) {
                this.f19013k.getJSVideoModule().showAlertView();
            } else {
                this.f19013k.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.a(i9, obj);
    }
}
