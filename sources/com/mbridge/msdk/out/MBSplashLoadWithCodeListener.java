package com.mbridge.msdk.out;

import com.mbridge.msdk.e.a;

/* loaded from: classes3.dex */
public abstract class MBSplashLoadWithCodeListener implements MBSplashLoadListener {
    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str, int i9) {
        onLoadFailedWithCode(mBridgeIds, a.a(5000, str), str, i9);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i9, String str, int i10);
}
