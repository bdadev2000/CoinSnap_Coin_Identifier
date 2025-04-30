package com.mbridge.msdk.playercommon;

/* loaded from: classes3.dex */
public interface VideoPlayerStatusListener {
    void onBufferingEnd();

    void onBufferingStart(String str);

    void onPlayCompleted();

    void onPlayError(String str);

    void onPlayProgress(int i9, int i10);

    void onPlayProgressMS(int i9, int i10);

    void onPlaySetDataSourceError(String str);

    void onPlayStarted(int i9);
}
