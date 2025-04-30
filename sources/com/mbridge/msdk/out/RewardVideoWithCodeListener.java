package com.mbridge.msdk.out;

import com.mbridge.msdk.e.a;

/* loaded from: classes3.dex */
public abstract class RewardVideoWithCodeListener implements RewardVideoListener {
    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, 3900, str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i9, String str);

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        onVideoLoadFailWithCode(mBridgeIds, a.a(3000, str), str);
    }

    public abstract void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i9, String str);
}
