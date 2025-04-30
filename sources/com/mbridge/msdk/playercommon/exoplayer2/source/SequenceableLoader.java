package com.mbridge.msdk.playercommon.exoplayer2.source;

/* loaded from: classes3.dex */
public interface SequenceableLoader {

    /* loaded from: classes3.dex */
    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t9);
    }

    boolean continueLoading(long j7);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    void reevaluateBuffer(long j7);
}
