package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaFormatUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private int currentHeight;
    private float currentPixelWidthHeightRatio;
    private int currentUnappliedRotationDegrees;
    private int currentWidth;
    private final boolean deviceNeedsAutoFrcWorkaround;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private Surface dummySurface;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private final VideoFrameReleaseTimeHelper frameReleaseTimeHelper;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastInputTimeUs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private final long[] pendingOutputStreamSwitchTimesUs;
    private float pendingPixelWidthHeightRatio;
    private int pendingRotationDegrees;
    private boolean renderedFirstFrame;
    private int reportedHeight;
    private float reportedPixelWidthHeightRatio;
    private int reportedUnappliedRotationDegrees;
    private int reportedWidth;
    private int scalingMode;
    private Surface surface;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;

    /* loaded from: classes3.dex */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i9, int i10, int i11) {
            this.width = i9;
            this.height = i10;
            this.inputSize = i11;
        }
    }

    /* loaded from: classes3.dex */
    public final class OnFrameRenderedListenerV23 implements MediaCodec.OnFrameRenderedListener {
        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j9) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener) {
                return;
            }
            mediaCodecVideoRenderer.maybeNotifyRenderedFirstFrame();
        }

        private OnFrameRenderedListenerV23(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    private static boolean areAdaptationCompatible(boolean z8, Format format, Format format2) {
        if (format.sampleMimeType.equals(format2.sampleMimeType) && format.rotationDegrees == format2.rotationDegrees && ((z8 || (format.width == format2.width && format.height == format2.height)) && Util.areEqual(format.colorInfo, format2.colorInfo))) {
            return true;
        }
        return false;
    }

    private void clearRenderedFirstFrame() {
        MediaCodec codec;
        this.renderedFirstFrame = false;
        if (Util.SDK_INT >= 23 && this.tunneling && (codec = getCodec()) != null) {
            this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
        }
    }

    private void clearReportedVideoSize() {
        this.reportedWidth = -1;
        this.reportedHeight = -1;
        this.reportedPixelWidthHeightRatio = -1.0f;
        this.reportedUnappliedRotationDegrees = -1;
    }

    private static void configureTunnelingV21(MediaFormat mediaFormat, int i9) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i9);
    }

    private static boolean deviceNeedsAutoFrcWorkaround() {
        if (Util.SDK_INT <= 22 && "foster".equals(Util.DEVICE) && "NVIDIA".equals(Util.MANUFACTURER)) {
            return true;
        }
        return false;
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z8;
        int i9;
        int i10;
        int i11;
        int i12 = format.height;
        int i13 = format.width;
        if (i12 > i13) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i9 = i12;
        } else {
            i9 = i13;
        }
        if (z8) {
            i12 = i13;
        }
        float f9 = i12 / i9;
        for (int i14 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i15 = (int) (i14 * f9);
            if (i14 <= i9 || i15 <= i12) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                if (z8) {
                    i11 = i15;
                } else {
                    i11 = i14;
                }
                if (!z8) {
                    i14 = i15;
                }
                Point alignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i11, i14);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(alignVideoSizeV21.x, alignVideoSizeV21.y, format.frameRate)) {
                    return alignVideoSizeV21;
                }
            } else {
                int ceilDivide = Util.ceilDivide(i14, 16) * 16;
                int ceilDivide2 = Util.ceilDivide(i15, 16) * 16;
                if (ceilDivide * ceilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                    if (z8) {
                        i10 = ceilDivide2;
                    } else {
                        i10 = ceilDivide;
                    }
                    if (!z8) {
                        ceilDivide = ceilDivide2;
                    }
                    return new Point(i10, ceilDivide);
                }
            }
        }
        return null;
    }

    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize != -1) {
            int size = format.initializationData.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                i9 += format.initializationData.get(i10).length;
            }
            return format.maxInputSize + i9;
        }
        return getMaxInputSize(mediaCodecInfo, format.sampleMimeType, format.width, format.height);
    }

    private static boolean isBufferLate(long j7) {
        return j7 < -30000;
    }

    private static boolean isBufferVeryLate(long j7) {
        return j7 < -500000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    private void maybeNotifyVideoSizeChanged() {
        int i9 = this.currentWidth;
        if (i9 != -1 || this.currentHeight != -1) {
            if (this.reportedWidth != i9 || this.reportedHeight != this.currentHeight || this.reportedUnappliedRotationDegrees != this.currentUnappliedRotationDegrees || this.reportedPixelWidthHeightRatio != this.currentPixelWidthHeightRatio) {
                this.eventDispatcher.videoSizeChanged(i9, this.currentHeight, this.currentUnappliedRotationDegrees, this.currentPixelWidthHeightRatio);
                this.reportedWidth = this.currentWidth;
                this.reportedHeight = this.currentHeight;
                this.reportedUnappliedRotationDegrees = this.currentUnappliedRotationDegrees;
                this.reportedPixelWidthHeightRatio = this.currentPixelWidthHeightRatio;
            }
        }
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.renderedFirstFrame) {
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    private void maybeRenotifyVideoSizeChanged() {
        int i9 = this.reportedWidth;
        if (i9 != -1 || this.reportedHeight != -1) {
            this.eventDispatcher.videoSizeChanged(i9, this.reportedHeight, this.reportedUnappliedRotationDegrees, this.reportedPixelWidthHeightRatio);
        }
    }

    private void setJoiningDeadlineMs() {
        long j7;
        if (this.allowedJoiningTimeMs > 0) {
            j7 = SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs;
        } else {
            j7 = C.TIME_UNSET;
        }
        this.joiningDeadlineMs = j7;
    }

    private static void setOutputSurfaceV23(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private void setSurface(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            Surface surface2 = this.dummySurface;
            if (surface2 != null) {
                surface = surface2;
            } else {
                MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUseDummySurface(codecInfo)) {
                    surface = DummySurface.newInstanceV17(this.context, codecInfo.secure);
                    this.dummySurface = surface;
                }
            }
        }
        if (this.surface != surface) {
            this.surface = surface;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec codec = getCodec();
                if (Util.SDK_INT >= 23 && codec != null && surface != null && !this.codecNeedsSetOutputSurfaceWorkaround) {
                    setOutputSurfaceV23(codec, surface);
                } else {
                    releaseCodec();
                    maybeInitCodec();
                }
            }
            if (surface != null && surface != this.dummySurface) {
                maybeRenotifyVideoSizeChanged();
                clearRenderedFirstFrame();
                if (state == 2) {
                    setJoiningDeadlineMs();
                    return;
                }
                return;
            }
            clearReportedVideoSize();
            clearRenderedFirstFrame();
            return;
        }
        if (surface != null && surface != this.dummySurface) {
            maybeRenotifyVideoSizeChanged();
            maybeRenotifyRenderedFirstFrame();
        }
    }

    private boolean shouldUseDummySurface(MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT >= 23 && !this.tunneling && !codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name) && (!mediaCodecInfo.secure || DummySurface.isSecureSupported(this.context))) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        if (areAdaptationCompatible(mediaCodecInfo.adaptive, format, format2)) {
            int i9 = format2.width;
            CodecMaxValues codecMaxValues = this.codecMaxValues;
            if (i9 <= codecMaxValues.width && format2.height <= codecMaxValues.height && getMaxInputSize(mediaCodecInfo, format2) <= this.codecMaxValues.inputSize) {
                if (format.initializationDataEquals(format2)) {
                    return 1;
                }
                return 3;
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x05cb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean codecNeedsSetOutputSurfaceWorkaround(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 2212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.video.MediaCodecVideoRenderer.codecNeedsSetOutputSurfaceWorkaround(java.lang.String):boolean");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws MediaCodecUtil.DecoderQueryException {
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, codecMaxValues, this.deviceNeedsAutoFrcWorkaround, this.tunnelingAudioSessionId);
        if (this.surface == null) {
            Assertions.checkState(shouldUseDummySurface(mediaCodecInfo));
            if (this.dummySurface == null) {
                this.dummySurface = DummySurface.newInstanceV17(this.context, mediaCodecInfo.secure);
            }
            this.surface = this.dummySurface;
        }
        mediaCodec.configure(mediaFormat, this.surface, mediaCrypto, 0);
        if (Util.SDK_INT >= 23 && this.tunneling) {
            this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(mediaCodec);
        }
    }

    public void dropOutputBuffer(MediaCodec mediaCodec, int i9, long j7) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i9, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(1);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void flushCodec() throws ExoPlaybackException {
        super.flushCodec();
        this.buffersInCodecCount = 0;
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) throws MediaCodecUtil.DecoderQueryException {
        boolean z8;
        int i9 = format.width;
        int i10 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            return new CodecMaxValues(i9, i10, maxInputSize);
        }
        boolean z9 = false;
        for (Format format2 : formatArr) {
            if (areAdaptationCompatible(mediaCodecInfo.adaptive, format, format2)) {
                int i11 = format2.width;
                if (i11 != -1 && format2.height != -1) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                z9 |= z8;
                i9 = Math.max(i9, i11);
                i10 = Math.max(i10, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z9) {
            Log.w(TAG, "Resolutions unknown. Codec max resolution: " + i9 + "x" + i10);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i9 = Math.max(i9, codecMaxSize.x);
                i10 = Math.max(i10, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format.sampleMimeType, i9, i10));
                Log.w(TAG, "Codec max resolution adjusted to: " + i9 + "x" + i10);
            }
        }
        return new CodecMaxValues(i9, i10, maxInputSize);
    }

    public MediaFormat getMediaFormat(Format format, CodecMaxValues codecMaxValues, boolean z8, int i9) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.sampleMimeType);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z8) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i9 != 0) {
            configureTunnelingV21(mediaFormat, i9);
        }
        return mediaFormat;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i9, Object obj) throws ExoPlaybackException {
        if (i9 == 1) {
            setSurface((Surface) obj);
            return;
        }
        if (i9 == 4) {
            this.scalingMode = ((Integer) obj).intValue();
            MediaCodec codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        super.handleMessage(i9, obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.renderedFirstFrame || (((surface = this.dummySurface) != null && this.surface == surface) || getCodec() == null || this.tunneling))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(MediaCodec mediaCodec, int i9, long j7, long j9) throws ExoPlaybackException {
        int skipSource = skipSource(j9);
        if (skipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(this.buffersInCodecCount + skipSource);
        flushCodec();
        return true;
    }

    public void maybeNotifyRenderedFirstFrame() {
        if (!this.renderedFirstFrame) {
            this.renderedFirstFrame = true;
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, long j7, long j9) {
        this.eventDispatcher.decoderInitialized(str, j7, j9);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastInputTimeUs = C.TIME_UNSET;
        this.pendingOutputStreamOffsetCount = 0;
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.frameReleaseTimeHelper.disable();
        this.tunnelingOnFrameRenderedListener = null;
        this.tunneling = false;
        try {
            super.onDisabled();
        } finally {
            this.decoderCounters.ensureUpdated();
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onEnabled(boolean z8) throws ExoPlaybackException {
        boolean z9;
        super.onEnabled(z8);
        int i9 = getConfiguration().tunnelingAudioSessionId;
        this.tunnelingAudioSessionId = i9;
        if (i9 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.tunneling = z9;
        this.eventDispatcher.enabled(this.decoderCounters);
        this.frameReleaseTimeHelper.enable();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onInputFormatChanged(Format format) throws ExoPlaybackException {
        super.onInputFormatChanged(format);
        this.eventDispatcher.inputFormatChanged(format);
        this.pendingPixelWidthHeightRatio = format.pixelWidthHeightRatio;
        this.pendingRotationDegrees = format.rotationDegrees;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z8;
        int integer;
        int integer2;
        if (mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            integer = (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.currentWidth = integer;
        if (z8) {
            integer2 = (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.currentHeight = integer2;
        float f9 = this.pendingPixelWidthHeightRatio;
        this.currentPixelWidthHeightRatio = f9;
        if (Util.SDK_INT >= 21) {
            int i9 = this.pendingRotationDegrees;
            if (i9 == 90 || i9 == 270) {
                int i10 = this.currentWidth;
                this.currentWidth = integer2;
                this.currentHeight = i10;
                this.currentPixelWidthHeightRatio = 1.0f / f9;
            }
        } else {
            this.currentUnappliedRotationDegrees = this.pendingRotationDegrees;
        }
        mediaCodec.setVideoScalingMode(this.scalingMode);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onPositionReset(long j7, boolean z8) throws ExoPlaybackException {
        super.onPositionReset(j7, z8);
        clearRenderedFirstFrame();
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        this.lastInputTimeUs = C.TIME_UNSET;
        int i9 = this.pendingOutputStreamOffsetCount;
        if (i9 != 0) {
            this.outputStreamOffsetUs = this.pendingOutputStreamOffsetsUs[i9 - 1];
            this.pendingOutputStreamOffsetCount = 0;
        }
        if (z8) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onProcessedOutputBuffer(long j7) {
        this.buffersInCodecCount--;
        while (true) {
            int i9 = this.pendingOutputStreamOffsetCount;
            if (i9 != 0 && j7 >= this.pendingOutputStreamSwitchTimesUs[0]) {
                long[] jArr = this.pendingOutputStreamOffsetsUs;
                this.outputStreamOffsetUs = jArr[0];
                int i10 = i9 - 1;
                this.pendingOutputStreamOffsetCount = i10;
                System.arraycopy(jArr, 1, jArr, 0, i10);
                long[] jArr2 = this.pendingOutputStreamSwitchTimesUs;
                System.arraycopy(jArr2, 1, jArr2, 0, this.pendingOutputStreamOffsetCount);
            } else {
                return;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        this.buffersInCodecCount++;
        this.lastInputTimeUs = Math.max(decoderInputBuffer.timeUs, this.lastInputTimeUs);
        if (Util.SDK_INT < 23 && this.tunneling) {
            maybeNotifyRenderedFirstFrame();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
        super.onStopped();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j7) throws ExoPlaybackException {
        if (this.outputStreamOffsetUs == C.TIME_UNSET) {
            this.outputStreamOffsetUs = j7;
        } else {
            int i9 = this.pendingOutputStreamOffsetCount;
            if (i9 == this.pendingOutputStreamOffsetsUs.length) {
                Log.w(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
            } else {
                this.pendingOutputStreamOffsetCount = i9 + 1;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            int i10 = this.pendingOutputStreamOffsetCount;
            jArr[i10 - 1] = j7;
            this.pendingOutputStreamSwitchTimesUs[i10 - 1] = this.lastInputTimeUs;
        }
        super.onStreamChanged(formatArr, j7);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j7, long j9, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i9, int i10, long j10, boolean z8) throws ExoPlaybackException {
        boolean z9;
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j7;
        }
        long j11 = j10 - this.outputStreamOffsetUs;
        if (z8) {
            skipOutputBuffer(mediaCodec, i9, j11);
            return true;
        }
        long j12 = j10 - j7;
        if (this.surface == this.dummySurface) {
            if (!isBufferLate(j12)) {
                return false;
            }
            skipOutputBuffer(mediaCodec, i9, j11);
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        if (getState() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.renderedFirstFrame && (!z9 || !shouldForceRenderOutputBuffer(j12, elapsedRealtime - this.lastRenderTimeUs))) {
            if (z9 && j7 != this.initialPositionUs) {
                long nanoTime = System.nanoTime();
                long adjustReleaseTime = this.frameReleaseTimeHelper.adjustReleaseTime(j10, ((j12 - (elapsedRealtime - j9)) * 1000) + nanoTime);
                long j13 = (adjustReleaseTime - nanoTime) / 1000;
                if (shouldDropBuffersToKeyframe(j13, j9) && maybeDropBuffersToKeyframe(mediaCodec, i9, j11, j7)) {
                    return false;
                }
                if (shouldDropOutputBuffer(j13, j9)) {
                    dropOutputBuffer(mediaCodec, i9, j11);
                    return true;
                }
                if (Util.SDK_INT >= 21) {
                    if (j13 < 50000) {
                        renderOutputBufferV21(mediaCodec, i9, j11, adjustReleaseTime);
                        return true;
                    }
                } else if (j13 < 30000) {
                    if (j13 > 11000) {
                        try {
                            Thread.sleep((j13 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    renderOutputBuffer(mediaCodec, i9, j11);
                    return true;
                }
            }
            return false;
        }
        if (Util.SDK_INT >= 21) {
            renderOutputBufferV21(mediaCodec, i9, j11, System.nanoTime());
            return true;
        }
        renderOutputBuffer(mediaCodec, i9, j11);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void releaseCodec() {
        try {
            super.releaseCodec();
            this.buffersInCodecCount = 0;
            Surface surface = this.dummySurface;
            if (surface != null) {
                if (this.surface == surface) {
                    this.surface = null;
                }
                surface.release();
                this.dummySurface = null;
            }
        } catch (Throwable th) {
            this.buffersInCodecCount = 0;
            if (this.dummySurface != null) {
                Surface surface2 = this.surface;
                Surface surface3 = this.dummySurface;
                if (surface2 == surface3) {
                    this.surface = null;
                }
                surface3.release();
                this.dummySurface = null;
            }
            throw th;
        }
    }

    public void renderOutputBuffer(MediaCodec mediaCodec, int i9, long j7) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i9, true);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    public void renderOutputBufferV21(MediaCodec mediaCodec, int i9, long j7, long j9) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i9, j9);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    public boolean shouldDropBuffersToKeyframe(long j7, long j9) {
        return isBufferVeryLate(j7);
    }

    public boolean shouldDropOutputBuffer(long j7, long j9) {
        return isBufferLate(j7);
    }

    public boolean shouldForceRenderOutputBuffer(long j7, long j9) {
        if (isBufferLate(j7) && j9 > 100000) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        if (this.surface == null && !shouldUseDummySurface(mediaCodecInfo)) {
            return false;
        }
        return true;
    }

    public void skipOutputBuffer(MediaCodec mediaCodec, int i9, long j7) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i9, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str = format.sampleMimeType;
        int i13 = 0;
        if (!MimeTypes.isVideo(str)) {
            return 0;
        }
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z8 = false;
            for (int i14 = 0; i14 < drmInitData.schemeDataCount; i14++) {
                z8 |= drmInitData.get(i14).requiresSecureDecryption;
            }
        } else {
            z8 = false;
        }
        MediaCodecInfo decoderInfo = mediaCodecSelector.getDecoderInfo(str, z8);
        boolean z9 = true;
        if (decoderInfo == null) {
            if (z8 && mediaCodecSelector.getDecoderInfo(str, false) != null) {
                return 2;
            }
            return 1;
        }
        if (!BaseRenderer.supportsFormatDrm(drmSessionManager, drmInitData)) {
            return 2;
        }
        boolean isCodecSupported = decoderInfo.isCodecSupported(format.codecs);
        if (isCodecSupported && (i11 = format.width) > 0 && (i12 = format.height) > 0) {
            if (Util.SDK_INT >= 21) {
                isCodecSupported = decoderInfo.isVideoSizeAndRateSupportedV21(i11, i12, format.frameRate);
            } else {
                if (i11 * i12 > MediaCodecUtil.maxH264DecodableFrameSize()) {
                    z9 = false;
                }
                if (!z9) {
                    Log.d(TAG, "FalseCheck [legacyFrameSize, " + format.width + "x" + format.height + "] [" + Util.DEVICE_DEBUG_INFO + "]");
                }
                isCodecSupported = z9;
            }
        }
        if (decoderInfo.adaptive) {
            i9 = 16;
        } else {
            i9 = 8;
        }
        if (decoderInfo.tunneling) {
            i13 = 32;
        }
        if (isCodecSupported) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        return i10 | i9 | i13;
    }

    public void updateDroppedBufferCounters(int i9) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedBufferCount += i9;
        this.droppedFrames += i9;
        int i10 = this.consecutiveDroppedFrameCount + i9;
        this.consecutiveDroppedFrameCount = i10;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i10, decoderCounters.maxConsecutiveDroppedBufferCount);
        if (this.droppedFrames >= this.maxDroppedFramesToNotify) {
            maybeNotifyDroppedFrames();
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j7) {
        this(context, mediaCodecSelector, j7, null, null, -1);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j7, Handler handler, VideoRendererEventListener videoRendererEventListener, int i9) {
        this(context, mediaCodecSelector, j7, null, false, handler, videoRendererEventListener, i9);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j7, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z8, Handler handler, VideoRendererEventListener videoRendererEventListener, int i9) {
        super(2, mediaCodecSelector, drmSessionManager, z8);
        this.allowedJoiningTimeMs = j7;
        this.maxDroppedFramesToNotify = i9;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.frameReleaseTimeHelper = new VideoFrameReleaseTimeHelper(applicationContext);
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.deviceNeedsAutoFrcWorkaround = deviceNeedsAutoFrcWorkaround();
        this.pendingOutputStreamOffsetsUs = new long[10];
        this.pendingOutputStreamSwitchTimesUs = new long[10];
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastInputTimeUs = C.TIME_UNSET;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.scalingMode = 1;
        clearReportedVideoSize();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0057. Please report as an issue. */
    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, String str, int i9, int i10) {
        char c9;
        int i11;
        int i12 = 4;
        if (i9 == -1 || i10 == -1) {
            return -1;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(MimeTypes.VIDEO_H263)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1187890754:
                if (str.equals(MimeTypes.VIDEO_MP4V)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1599127256:
                if (str.equals(MimeTypes.VIDEO_VP8)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
            case 2:
            case 4:
                i11 = i9 * i10;
                i12 = 2;
                return (i11 * 3) / (i12 * 2);
            case 1:
            case 5:
                i11 = i9 * i10;
                return (i11 * 3) / (i12 * 2);
            case 3:
                String str2 = Util.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Util.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                i11 = Util.ceilDivide(i10, 16) * Util.ceilDivide(i9, 16) * NotificationCompat.FLAG_LOCAL_ONLY;
                i12 = 2;
                return (i11 * 3) / (i12 * 2);
            default:
                return -1;
        }
    }
}
