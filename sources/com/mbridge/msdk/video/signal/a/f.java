package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* loaded from: classes4.dex */
public class f implements com.mbridge.msdk.video.signal.g {
    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i10) {
        com.applovin.impl.mediation.ads.e.y("onVideoStatusNotify:", i10, "DefaultJSNotifyProxy");
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i10, String str) {
        ad.a("DefaultJSNotifyProxy", "onClick:" + i10 + ",pt:" + str);
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
    public void a(int i10, int i11, int i12, int i13) {
        ad.a("DefaultJSNotifyProxy", "showDataInfo");
    }
}
