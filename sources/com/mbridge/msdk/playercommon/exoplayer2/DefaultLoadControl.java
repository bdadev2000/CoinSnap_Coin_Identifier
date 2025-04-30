package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultAllocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_MS = 15000;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = true;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    private final DefaultAllocator allocator;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private boolean isBuffering;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final PriorityTaskManager priorityTaskManager;
    private final int targetBufferBytesOverwrite;
    private int targetBufferSize;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private DefaultAllocator allocator = null;
        private int minBufferMs = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
        private int maxBufferMs = DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
        private int bufferForPlaybackMs = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        private int bufferForPlaybackAfterRebufferMs = 5000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = true;
        private PriorityTaskManager priorityTaskManager = null;

        public final DefaultLoadControl createDefaultLoadControl() {
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.priorityTaskManager);
        }

        public final Builder setAllocator(DefaultAllocator defaultAllocator) {
            this.allocator = defaultAllocator;
            return this;
        }

        public final Builder setBufferDurationsMs(int i9, int i10, int i11, int i12) {
            this.minBufferMs = i9;
            this.maxBufferMs = i10;
            this.bufferForPlaybackMs = i11;
            this.bufferForPlaybackAfterRebufferMs = i12;
            return this;
        }

        public final Builder setPrioritizeTimeOverSizeThresholds(boolean z8) {
            this.prioritizeTimeOverSizeThresholds = z8;
            return this;
        }

        public final Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public final Builder setTargetBufferBytes(int i9) {
            this.targetBufferBytes = i9;
            return this;
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536));
    }

    private static void assertGreaterOrEqual(int i9, int i10, String str, String str2) {
        boolean z8;
        if (i9 >= i10) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8, str + " cannot be less than " + str2);
    }

    private void reset(boolean z8) {
        this.targetBufferSize = 0;
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null && this.isBuffering) {
            priorityTaskManager.remove(0);
        }
        this.isBuffering = false;
        if (z8) {
            this.allocator.reset();
        }
    }

    public int calculateTargetBufferSize(Renderer[] rendererArr, TrackSelectionArray trackSelectionArray) {
        int i9 = 0;
        for (int i10 = 0; i10 < rendererArr.length; i10++) {
            if (trackSelectionArray.get(i10) != null) {
                i9 = Util.getDefaultBufferSize(rendererArr[i10].getTrackType()) + i9;
            }
        }
        return i9;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public void onPrepared() {
        reset(false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public void onReleased() {
        reset(true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public void onStopped() {
        reset(true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        int i9 = this.targetBufferBytesOverwrite;
        if (i9 == -1) {
            i9 = calculateTargetBufferSize(rendererArr, trackSelectionArray);
        }
        this.targetBufferSize = i9;
        this.allocator.setTargetBufferSize(i9);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long j7, float f9) {
        boolean z8;
        boolean z9;
        boolean z10 = true;
        if (this.allocator.getTotalBytesAllocated() >= this.targetBufferSize) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z11 = this.isBuffering;
        long j9 = this.minBufferUs;
        if (f9 > 1.0f) {
            j9 = Math.min(Util.getMediaDurationForPlayoutDuration(j9, f9), this.maxBufferUs);
        }
        if (j7 < j9) {
            if (!this.prioritizeTimeOverSizeThresholds && z8) {
                z10 = false;
            }
            this.isBuffering = z10;
        } else if (j7 > this.maxBufferUs || z8) {
            this.isBuffering = false;
        }
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null && (z9 = this.isBuffering) != z11) {
            if (z9) {
                priorityTaskManager.add(0);
            } else {
                priorityTaskManager.remove(0);
            }
        }
        return this.isBuffering;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long j7, float f9, boolean z8) {
        long j9;
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(j7, f9);
        if (z8) {
            j9 = this.bufferForPlaybackAfterRebufferUs;
        } else {
            j9 = this.bufferForPlaybackUs;
        }
        if (j9 > 0 && playoutDurationForMediaDuration < j9 && (this.prioritizeTimeOverSizeThresholds || this.allocator.getTotalBytesAllocated() < this.targetBufferSize)) {
            return false;
        }
        return true;
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator) {
        this(defaultAllocator, DEFAULT_MIN_BUFFER_MS, DEFAULT_MAX_BUFFER_MS, DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, true);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i9, int i10, int i11, int i12, int i13, boolean z8) {
        this(defaultAllocator, i9, i10, i11, i12, i13, z8, null);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i9, int i10, int i11, int i12, int i13, boolean z8, PriorityTaskManager priorityTaskManager) {
        assertGreaterOrEqual(i11, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i9, i11, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i9, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i10, i9, "maxBufferMs", "minBufferMs");
        this.allocator = defaultAllocator;
        this.minBufferUs = i9 * 1000;
        this.maxBufferUs = i10 * 1000;
        this.bufferForPlaybackUs = i11 * 1000;
        this.bufferForPlaybackAfterRebufferUs = i12 * 1000;
        this.targetBufferBytesOverwrite = i13;
        this.prioritizeTimeOverSizeThresholds = z8;
        this.priorityTaskManager = priorityTaskManager;
    }
}
