package com.mbridge.msdk.out;

/* loaded from: classes3.dex */
public interface IDownloadListener {
    void onEnd(int i9, int i10, String str);

    void onProgressUpdate(int i9);

    void onStart();

    void onStatus(int i9);
}
