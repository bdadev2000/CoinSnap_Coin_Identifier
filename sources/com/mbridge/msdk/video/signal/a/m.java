package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.video.module.MBridgeContainerView;

/* loaded from: classes3.dex */
public final class m extends e {

    /* renamed from: a, reason: collision with root package name */
    private MBridgeContainerView f19093a;

    public m(MBridgeContainerView mBridgeContainerView) {
        this.f19093a = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void configurationChanged(int i9, int i10, int i11) {
        super.configurationChanged(i9, i10, i11);
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.configurationChanged(i9, i10, i11);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean endCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void hideAlertWebview() {
        super.hideAlertWebview();
        MBridgeContainerView mBridgeContainerView = this.f19093a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.hideAlertWebview();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        MBridgeContainerView mBridgeContainerView = this.f19093a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean miniCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void readyStatus(int i9) {
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.readyStatus(i9);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i9);
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void resizeMiniCard(int i9, int i10, int i11) {
        super.resizeMiniCard(i9, i10, i11);
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.resizeMiniCard(i9, i10, i11);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean showAlertWebView() {
        super.showAlertWebView();
        MBridgeContainerView mBridgeContainerView = this.f19093a;
        if (mBridgeContainerView != null) {
            return mBridgeContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showEndcard(int i9) {
        super.showEndcard(i9);
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showEndcard(i9);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showMiniCard(int i9, int i10, int i11, int i12, int i13) {
        super.showMiniCard(i9, i10, i11, i12, i13);
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showMiniCard(i9, i10, i11, i12, i13);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showVideoClickView(int i9) {
        super.showVideoClickView(i9);
        MBridgeContainerView mBridgeContainerView = this.f19093a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.showVideoClickView(i9);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showVideoEndCover() {
        super.showVideoEndCover();
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showVideoEndCover();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.h
    public final void toggleCloseBtn(int i9) {
        super.toggleCloseBtn(i9);
        try {
            MBridgeContainerView mBridgeContainerView = this.f19093a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.toggleCloseBtn(i9);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
