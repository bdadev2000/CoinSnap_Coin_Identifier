package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;

/* loaded from: classes3.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private MBridgeClickMiniCardView f19017a;

    public g(MBridgeClickMiniCardView mBridgeClickMiniCardView, com.mbridge.msdk.video.module.a.a aVar) {
        super(aVar);
        this.f19017a = mBridgeClickMiniCardView;
    }

    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i9, Object obj) {
        boolean z8 = false;
        switch (i9) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f19017a;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f19017a;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z8 = true;
                break;
            case 103:
                i9 = 107;
                break;
        }
        if (!z8) {
            super.a(i9, obj);
        }
    }
}
