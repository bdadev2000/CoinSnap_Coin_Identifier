package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.messaging.Constants;

/* loaded from: classes12.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private final DefaultDisplayListener displayListener;
    private float formatFrameRate;
    private long frameIndex;
    private final FixedFrameRateEstimator frameRateEstimator = new FixedFrameRateEstimator();
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;
    private final VSyncSampler vsyncSampler;
    private final WindowManager windowManager;

    public VideoFrameReleaseHelper(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.windowManager = (WindowManager) context.getSystemService("window");
        } else {
            this.windowManager = null;
        }
        if (this.windowManager != null) {
            this.displayListener = Util.SDK_INT >= 17 ? maybeBuildDefaultDisplayListenerV17((Context) Assertions.checkNotNull(context)) : null;
            this.vsyncSampler = VSyncSampler.getInstance();
        } else {
            this.displayListener = null;
            this.vsyncSampler = null;
        }
        this.vsyncDurationNs = C.TIME_UNSET;
        this.vsyncOffsetNs = C.TIME_UNSET;
        this.formatFrameRate = -1.0f;
        this.playbackSpeed = 1.0f;
    }

    public void onEnabled() {
        if (this.windowManager != null) {
            ((VSyncSampler) Assertions.checkNotNull(this.vsyncSampler)).addObserver();
            DefaultDisplayListener defaultDisplayListener = this.displayListener;
            if (defaultDisplayListener != null) {
                defaultDisplayListener.register();
            }
            updateDefaultDisplayRefreshRateParams();
        }
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onSurfaceChanged(Surface surface) {
        if (surface instanceof DummySurface) {
            surface = null;
        }
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onFormatChanged(float f) {
        this.formatFrameRate = f;
        this.frameRateEstimator.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j) {
        long j2 = this.pendingLastAdjustedFrameIndex;
        if (j2 != -1) {
            this.lastAdjustedFrameIndex = j2;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
        }
        this.frameIndex++;
        this.frameRateEstimator.onNextFrame(j * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onStopped() {
        this.started = false;
        clearSurfaceFrameRate();
    }

    public void onDisabled() {
        if (this.windowManager != null) {
            DefaultDisplayListener defaultDisplayListener = this.displayListener;
            if (defaultDisplayListener != null) {
                defaultDisplayListener.unregister();
            }
            ((VSyncSampler) Assertions.checkNotNull(this.vsyncSampler)).removeObserver();
        }
    }

    public long adjustReleaseTime(long j) {
        long j2;
        VSyncSampler vSyncSampler;
        if (this.lastAdjustedFrameIndex != -1 && this.frameRateEstimator.isSynced()) {
            long frameDurationNs = this.lastAdjustedReleaseTimeNs + (((float) (this.frameRateEstimator.getFrameDurationNs() * (this.frameIndex - this.lastAdjustedFrameIndex))) / this.playbackSpeed);
            if (!adjustmentAllowed(j, frameDurationNs)) {
                resetAdjustment();
            } else {
                j2 = frameDurationNs;
                this.pendingLastAdjustedFrameIndex = this.frameIndex;
                this.pendingLastAdjustedReleaseTimeNs = j2;
                vSyncSampler = this.vsyncSampler;
                if (vSyncSampler != null || this.vsyncDurationNs == C.TIME_UNSET) {
                    return j2;
                }
                long j3 = vSyncSampler.sampledVsyncTimeNs;
                return j3 == C.TIME_UNSET ? j2 : closestVsync(j2, j3, this.vsyncDurationNs) - this.vsyncOffsetNs;
            }
        }
        j2 = j;
        this.pendingLastAdjustedFrameIndex = this.frameIndex;
        this.pendingLastAdjustedReleaseTimeNs = j2;
        vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
        }
        return j2;
    }

    private void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
    }

    private static boolean adjustmentAllowed(long j, long j2) {
        return Math.abs(j - j2) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    private void updateSurfaceMediaFrameRate() {
        if (Util.SDK_INT < 30 || this.surface == null) {
            return;
        }
        float frameRate = this.frameRateEstimator.isSynced() ? this.frameRateEstimator.getFrameRate() : this.formatFrameRate;
        float f = this.surfaceMediaFrameRate;
        if (frameRate == f) {
            return;
        }
        if (frameRate != -1.0f && f != -1.0f) {
            if (Math.abs(frameRate - this.surfaceMediaFrameRate) < ((!this.frameRateEstimator.isSynced() || this.frameRateEstimator.getMatchingFrameDurationSumNs() < MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) ? 1.0f : MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE)) {
                return;
            }
        } else if (frameRate == -1.0f && this.frameRateEstimator.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.surfaceMediaFrameRate = frameRate;
        updateSurfacePlaybackFrameRate(false);
    }

    private void updateSurfacePlaybackFrameRate(boolean z) {
        Surface surface;
        float f;
        if (Util.SDK_INT < 30 || (surface = this.surface) == null) {
            return;
        }
        if (this.started) {
            float f2 = this.surfaceMediaFrameRate;
            if (f2 != -1.0f) {
                f = f2 * this.playbackSpeed;
                if (z && this.surfacePlaybackFrameRate == f) {
                    return;
                }
                this.surfacePlaybackFrameRate = f;
                setSurfaceFrameRateV30(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.surfacePlaybackFrameRate = f;
        setSurfaceFrameRateV30(surface, f);
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Util.SDK_INT < 30 || (surface = this.surface) == null || this.surfacePlaybackFrameRate == 0.0f) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        setSurfaceFrameRateV30(surface, 0.0f);
    }

    private static void setSurfaceFrameRateV30(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            Log.e(TAG, "Failed to call Surface.setFrameRate", e);
        }
    }

    private DefaultDisplayListener maybeBuildDefaultDisplayListenerV17(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager == null) {
            return null;
        }
        return new DefaultDisplayListener(displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams() {
        if (((WindowManager) Assertions.checkNotNull(this.windowManager)).getDefaultDisplay() != null) {
            long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
            this.vsyncDurationNs = refreshRate;
            this.vsyncOffsetNs = (refreshRate * VSYNC_OFFSET_PERCENTAGE) / 100;
        } else {
            Log.w(TAG, "Unable to query display refresh rate");
            this.vsyncDurationNs = C.TIME_UNSET;
            this.vsyncOffsetNs = C.TIME_UNSET;
        }
    }

    private static long closestVsync(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public final class DefaultDisplayListener implements DisplayManager.DisplayListener {
        private final DisplayManager displayManager;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        public DefaultDisplayListener(DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
        }

        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams();
            }
        }
    }

    /* loaded from: classes12.dex */
    private static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 0;
        private static final VSyncSampler INSTANCE = new VSyncSampler();
        private static final int MSG_ADD_OBSERVER = 1;
        private static final int MSG_REMOVE_OBSERVER = 2;
        private Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        private final Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs = C.TIME_UNSET;

        public static VSyncSampler getInstance() {
            return INSTANCE;
        }

        private VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.choreographerOwnerThread = handlerThread;
            handlerThread.start();
            Handler createHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.handler = createHandler;
            createHandler.sendEmptyMessage(0);
        }

        public void addObserver() {
            this.handler.sendEmptyMessage(1);
        }

        public void removeObserver() {
            this.handler.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            ((Choreographer) Assertions.checkNotNull(this.choreographer)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                createChoreographerInstanceInternal();
                return true;
            }
            if (i == 1) {
                addObserverInternal();
                return true;
            }
            if (i != 2) {
                return false;
            }
            removeObserverInternal();
            return true;
        }

        private void createChoreographerInstanceInternal() {
            this.choreographer = Choreographer.getInstance();
        }

        private void addObserverInternal() {
            int i = this.observerCount + 1;
            this.observerCount = i;
            if (i == 1) {
                ((Choreographer) Assertions.checkNotNull(this.choreographer)).postFrameCallback(this);
            }
        }

        private void removeObserverInternal() {
            int i = this.observerCount - 1;
            this.observerCount = i;
            if (i == 0) {
                ((Choreographer) Assertions.checkNotNull(this.choreographer)).removeFrameCallback(this);
                this.sampledVsyncTimeNs = C.TIME_UNSET;
            }
        }
    }
}
