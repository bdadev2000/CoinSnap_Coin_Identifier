package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes4.dex */
public interface TransferListener<S> {
    void onBytesTransferred(S s5, int i10);

    void onTransferEnd(S s5);

    void onTransferStart(S s5, DataSpec dataSpec);
}
