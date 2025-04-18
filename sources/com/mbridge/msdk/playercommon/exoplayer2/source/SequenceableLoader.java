package com.mbridge.msdk.playercommon.exoplayer2.source;

/* loaded from: classes4.dex */
public interface SequenceableLoader {

    /* loaded from: classes4.dex */
    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t5);
    }

    boolean continueLoading(long j3);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    void reevaluateBuffer(long j3);
}
