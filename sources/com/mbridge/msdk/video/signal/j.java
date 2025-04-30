package com.mbridge.msdk.video.signal;

/* loaded from: classes3.dex */
public interface j {
    void alertWebViewShowed();

    void closeVideoOperate(int i9, int i10);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int i9);

    boolean isH5Canvas();

    void notifyCloseBtn(int i9);

    void progressBarOperate(int i9);

    void progressOperate(int i9, int i10);

    void setCover(boolean z8);

    void setMiniEndCardState(boolean z8);

    void setScaleFitXY(int i9);

    void setVisible(int i9);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    void soundOperate(int i9, int i10);

    void soundOperate(int i9, int i10, String str);

    void videoOperate(int i9);
}
