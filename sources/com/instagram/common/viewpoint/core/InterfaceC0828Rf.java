package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0828Rf {
    void A8o();

    boolean A90();

    boolean A91();

    boolean A9a();

    void AEN(boolean z2, int i2);

    void AGo(int i2);

    void AGt(EnumC0815Qs enumC0815Qs, int i2);

    void AH1(int i2);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC0815Qs getStartReason();

    EnumC0830Rh getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i2);

    void setBackgroundPlaybackEnabled(boolean z2);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z2);

    void setRequestedVolume(float f2);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC0831Ri interfaceC0831Ri);

    void setup(Uri uri);
}
