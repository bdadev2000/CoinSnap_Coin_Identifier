package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile;

/* loaded from: classes3.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener<Object> {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private long bitrateEstimate;
    private final Clock clock;
    private final Handler eventHandler;
    private final BandwidthMeter.EventListener eventListener;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Handler eventHandler;
        private BandwidthMeter.EventListener eventListener;
        private long initialBitrateEstimate = 1000000;
        private int slidingWindowMaxWeight = 2000;
        private Clock clock = Clock.DEFAULT;

        public final DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.eventHandler, this.eventListener, this.initialBitrateEstimate, this.slidingWindowMaxWeight, this.clock);
        }

        public final Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public final Builder setEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
            boolean z8;
            if (handler != null && eventListener != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8);
            this.eventHandler = handler;
            this.eventListener = eventListener;
            return this;
        }

        public final Builder setInitialBitrateEstimate(long j7) {
            this.initialBitrateEstimate = j7;
            return this;
        }

        public final Builder setSlidingWindowMaxWeight(int i9) {
            this.slidingWindowMaxWeight = i9;
            return this;
        }
    }

    private void notifyBandwidthSample(final int i9, final long j7, final long j9) {
        Handler handler = this.eventHandler;
        if (handler != null && this.eventListener != null) {
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultBandwidthMeter.1
                @Override // java.lang.Runnable
                public void run() {
                    DefaultBandwidthMeter.this.eventListener.onBandwidthSample(i9, j7, j9);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter
    public final synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public final synchronized void onBytesTransferred(Object obj, int i9) {
        this.sampleBytesTransferred += i9;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public final synchronized void onTransferEnd(Object obj) {
        boolean z8;
        try {
            if (this.streamCount > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkState(z8);
            long elapsedRealtime = this.clock.elapsedRealtime();
            int i9 = (int) (elapsedRealtime - this.sampleStartTimeMs);
            long j7 = i9;
            this.totalElapsedTimeMs += j7;
            long j9 = this.totalBytesTransferred;
            long j10 = this.sampleBytesTransferred;
            this.totalBytesTransferred = j9 + j10;
            if (i9 > 0) {
                this.slidingPercentile.addSample((int) Math.sqrt(j10), (float) ((8000 * j10) / j7));
                if (this.totalElapsedTimeMs < AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                    if (this.totalBytesTransferred >= 524288) {
                    }
                }
                this.bitrateEstimate = this.slidingPercentile.getPercentile(0.5f);
            }
            notifyBandwidthSample(i9, this.sampleBytesTransferred, this.bitrateEstimate);
            int i10 = this.streamCount - 1;
            this.streamCount = i10;
            if (i10 > 0) {
                this.sampleStartTimeMs = elapsedRealtime;
            }
            this.sampleBytesTransferred = 0L;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener
    public final synchronized void onTransferStart(Object obj, DataSpec dataSpec) {
        try {
            if (this.streamCount == 0) {
                this.sampleStartTimeMs = this.clock.elapsedRealtime();
            }
            this.streamCount++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public DefaultBandwidthMeter() {
        this(null, null, 1000000L, 2000, Clock.DEFAULT);
    }

    public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener) {
        this(handler, eventListener, 1000000L, 2000, Clock.DEFAULT);
    }

    public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener, int i9) {
        this(handler, eventListener, 1000000L, i9, Clock.DEFAULT);
    }

    private DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener, long j7, int i9, Clock clock) {
        this.eventHandler = handler;
        this.eventListener = eventListener;
        this.slidingPercentile = new SlidingPercentile(i9);
        this.clock = clock;
        this.bitrateEstimate = j7;
    }
}
