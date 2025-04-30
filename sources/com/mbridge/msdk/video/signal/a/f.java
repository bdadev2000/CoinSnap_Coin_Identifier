package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* loaded from: classes3.dex */
public class f implements com.mbridge.msdk.video.signal.g {
    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i9) {
        com.mbridge.msdk.foundation.entity.o.s(i9, "onVideoStatusNotify:", "DefaultJSNotifyProxy");
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i9, String str) {
        ad.a("DefaultJSNotifyProxy", "onClick:" + i9 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.b bVar) {
        ad.a("DefaultJSNotifyProxy", "onProgressNotify:" + bVar.toString());
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        ad.a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i9, int i10, int i11, int i12) {
        ad.a("DefaultJSNotifyProxy", "showDataInfo");
    }
}
