package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes3.dex */
public interface BandwidthMeter {

    /* loaded from: classes3.dex */
    public interface EventListener {
        void onBandwidthSample(int i9, long j7, long j9);
    }

    long getBitrateEstimate();
}
