package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes4.dex */
public interface BandwidthMeter {

    /* loaded from: classes4.dex */
    public interface EventListener {
        void onBandwidthSample(int i10, long j3, long j10);
    }

    long getBitrateEstimate();
}
