package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public interface R9 {
    void A8Q();

    boolean A8b();

    boolean A8c();

    boolean A9B();

    void ADu(boolean z8, int i9);

    void AGN(int i9);

    void AGS(QM qm, int i9);

    void AGZ(int i9);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    QM getStartReason();

    RB getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i9);

    void setBackgroundPlaybackEnabled(boolean z8);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z8);

    void setRequestedVolume(float f9);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(RC rc);

    void setup(Uri uri);
}
