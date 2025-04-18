package com.mbridge.msdk.out;

/* loaded from: classes4.dex */
public interface IDownloadListener {
    void onEnd(int i10, int i11, String str);

    void onProgressUpdate(int i10);

    void onStart();

    void onStatus(int i10);
}
