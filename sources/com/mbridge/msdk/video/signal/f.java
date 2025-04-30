package com.mbridge.msdk.video.signal;

/* loaded from: classes3.dex */
public interface f {
    void configurationChanged(int i9, int i10, int i11);

    boolean endCardShowing();

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardShowing();

    void readyStatus(int i9);

    void resizeMiniCard(int i9, int i10, int i11);

    boolean showAlertWebView();

    void showEndcard(int i9);

    void showMiniCard(int i9, int i10, int i11, int i12, int i13);

    void showVideoClickView(int i9);

    void showVideoEndCover();
}
