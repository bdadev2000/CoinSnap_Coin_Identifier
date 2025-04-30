package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes3.dex */
public interface TransferListener<S> {
    void onBytesTransferred(S s5, int i9);

    void onTransferEnd(S s5);

    void onTransferStart(S s5, DataSpec dataSpec);
}
