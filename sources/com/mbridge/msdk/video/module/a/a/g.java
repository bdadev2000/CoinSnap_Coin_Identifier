package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;

/* loaded from: classes4.dex */
public final class g extends i {
    private MBridgeClickMiniCardView a;

    public g(MBridgeClickMiniCardView mBridgeClickMiniCardView, com.mbridge.msdk.video.module.a.a aVar) {
        super(aVar);
        this.a = mBridgeClickMiniCardView;
    }

    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i10, Object obj) {
        boolean z10 = false;
        switch (i10) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.a;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.a;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z10 = true;
                break;
            case 103:
                i10 = 107;
                break;
        }
        if (!z10) {
            super.a(i10, obj);
        }
    }
}
