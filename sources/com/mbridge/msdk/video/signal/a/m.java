package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.video.module.MBridgeContainerView;

/* loaded from: classes4.dex */
public final class m extends e {
    private MBridgeContainerView a;

    public m(MBridgeContainerView mBridgeContainerView) {
        this.a = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void configurationChanged(int i10, int i11, int i12) {
        super.configurationChanged(i10, i11, i12);
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.configurationChanged(i10, i11, i12);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean endCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.endCardShowing();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void hideAlertWebview() {
        super.hideAlertWebview();
        MBridgeContainerView mBridgeContainerView = this.a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.hideAlertWebview();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        MBridgeContainerView mBridgeContainerView = this.a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean miniCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.miniCardShowing();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void readyStatus(int i10) {
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.readyStatus(i10);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        super.readyStatus(i10);
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void resizeMiniCard(int i10, int i11, int i12) {
        super.resizeMiniCard(i10, i11, i12);
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.resizeMiniCard(i10, i11, i12);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean showAlertWebView() {
        super.showAlertWebView();
        MBridgeContainerView mBridgeContainerView = this.a;
        if (mBridgeContainerView != null) {
            return mBridgeContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showEndcard(int i10) {
        super.showEndcard(i10);
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showEndcard(i10);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        super.showMiniCard(i10, i11, i12, i13, i14);
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showMiniCard(i10, i11, i12, i13, i14);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showVideoClickView(int i10) {
        super.showVideoClickView(i10);
        MBridgeContainerView mBridgeContainerView = this.a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.showVideoClickView(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showVideoEndCover() {
        super.showVideoEndCover();
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showVideoEndCover();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.h
    public final void toggleCloseBtn(int i10) {
        super.toggleCloseBtn(i10);
        try {
            MBridgeContainerView mBridgeContainerView = this.a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.toggleCloseBtn(i10);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
