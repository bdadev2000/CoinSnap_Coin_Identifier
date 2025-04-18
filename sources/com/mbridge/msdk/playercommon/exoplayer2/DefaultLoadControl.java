package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultAllocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
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
                this.allocator = new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.priorityTaskManager);
        }

        public final Builder setAllocator(DefaultAllocator defaultAllocator) {
            this.allocator = defaultAllocator;
            return this;
        }

        public final Builder setBufferDurationsMs(int i10, int i11, int i12, int i13) {
            this.minBufferMs = i10;
            this.maxBufferMs = i11;
            this.bufferForPlaybackMs = i12;
            this.bufferForPlaybackAfterRebufferMs = i13;
            return this;
        }

        public final Builder setPrioritizeTimeOverSizeThresholds(boolean z10) {
            this.prioritizeTimeOverSizeThresholds = z10;
            return this;
        }

        public final Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public final Builder setTargetBufferBytes(int i10) {
            this.targetBufferBytes = i10;
            return this;
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE));
    }

    private static void assertGreaterOrEqual(int i10, int i11, String str, String str2) {
        Assertions.checkArgument(i10 >= i11, str + " cannot be less than " + str2);
    }

    private void reset(boolean z10) {
        this.targetBufferSize = 0;
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null && this.isBuffering) {
            priorityTaskManager.remove(0);
        }
        this.isBuffering = false;
        if (z10) {
            this.allocator.reset();
        }
    }

    public int calculateTargetBufferSize(Renderer[] rendererArr, TrackSelectionArray trackSelectionArray) {
        int i10 = 0;
        for (int i11 = 0; i11 < rendererArr.length; i11++) {
            if (trackSelectionArray.get(i11) != null) {
                i10 = Util.getDefaultBufferSize(rendererArr[i11].getTrackType()) + i10;
            }
        }
        return i10;
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
        int i10 = this.targetBufferBytesOverwrite;
        if (i10 == -1) {
            i10 = calculateTargetBufferSize(rendererArr, trackSelectionArray);
        }
        this.targetBufferSize = i10;
        this.allocator.setTargetBufferSize(i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long j3, float f10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (this.allocator.getTotalBytesAllocated() >= this.targetBufferSize) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.isBuffering;
        long j10 = this.minBufferUs;
        if (f10 > 1.0f) {
            j10 = Math.min(Util.getMediaDurationForPlayoutDuration(j10, f10), this.maxBufferUs);
        }
        if (j3 < j10) {
            if (!this.prioritizeTimeOverSizeThresholds && z10) {
                z12 = false;
            }
            this.isBuffering = z12;
        } else if (j3 > this.maxBufferUs || z10) {
            this.isBuffering = false;
        }
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null && (z11 = this.isBuffering) != z13) {
            if (z11) {
                priorityTaskManager.add(0);
            } else {
                priorityTaskManager.remove(0);
            }
        }
        return this.isBuffering;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long j3, float f10, boolean z10) {
        long j10;
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(j3, f10);
        if (z10) {
            j10 = this.bufferForPlaybackAfterRebufferUs;
        } else {
            j10 = this.bufferForPlaybackUs;
        }
        if (j10 > 0 && playoutDurationForMediaDuration < j10 && (this.prioritizeTimeOverSizeThresholds || this.allocator.getTotalBytesAllocated() < this.targetBufferSize)) {
            return false;
        }
        return true;
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator) {
        this(defaultAllocator, DEFAULT_MIN_BUFFER_MS, DEFAULT_MAX_BUFFER_MS, DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, true);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this(defaultAllocator, i10, i11, i12, i13, i14, z10, null);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i10, int i11, int i12, int i13, int i14, boolean z10, PriorityTaskManager priorityTaskManager) {
        assertGreaterOrEqual(i12, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i11, i10, "maxBufferMs", "minBufferMs");
        this.allocator = defaultAllocator;
        this.minBufferUs = i10 * 1000;
        this.maxBufferUs = i11 * 1000;
        this.bufferForPlaybackUs = i12 * 1000;
        this.bufferForPlaybackAfterRebufferUs = i13 * 1000;
        this.targetBufferBytesOverwrite = i14;
        this.prioritizeTimeOverSizeThresholds = z10;
        this.priorityTaskManager = priorityTaskManager;
    }
}
