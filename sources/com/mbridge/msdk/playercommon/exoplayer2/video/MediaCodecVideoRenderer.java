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

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i10, int i11, int i12) {
            this.width = i10;
            this.height = i11;
            this.inputSize = i12;
        }
    }

    /* loaded from: classes4.dex */
    public final class OnFrameRenderedListenerV23 implements MediaCodec.OnFrameRenderedListener {
        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
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

    private static boolean areAdaptationCompatible(boolean z10, Format format, Format format2) {
        if (format.sampleMimeType.equals(format2.sampleMimeType) && format.rotationDegrees == format2.rotationDegrees && ((z10 || (format.width == format2.width && format.height == format2.height)) && Util.areEqual(format.colorInfo, format2.colorInfo))) {
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

    private static void configureTunnelingV21(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean deviceNeedsAutoFrcWorkaround() {
        return Util.SDK_INT <= 22 && "foster".equals(Util.DEVICE) && "NVIDIA".equals(Util.MANUFACTURER);
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13 = format.height;
        int i14 = format.width;
        if (i13 > i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = i13;
        } else {
            i10 = i14;
        }
        if (z10) {
            i13 = i14;
        }
        float f10 = i13 / i10;
        for (int i15 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i16 = (int) (i15 * f10);
            if (i15 <= i10 || i16 <= i13) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                if (z10) {
                    i12 = i16;
                } else {
                    i12 = i15;
                }
                if (!z10) {
                    i15 = i16;
                }
                Point alignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i12, i15);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(alignVideoSizeV21.x, alignVideoSizeV21.y, format.frameRate)) {
                    return alignVideoSizeV21;
                }
            } else {
                int ceilDivide = Util.ceilDivide(i15, 16) * 16;
                int ceilDivide2 = Util.ceilDivide(i16, 16) * 16;
                if (ceilDivide * ceilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                    if (z10) {
                        i11 = ceilDivide2;
                    } else {
                        i11 = ceilDivide;
                    }
                    if (!z10) {
                        ceilDivide = ceilDivide2;
                    }
                    return new Point(i11, ceilDivide);
                }
            }
        }
        return null;
    }

    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize != -1) {
            int size = format.initializationData.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += format.initializationData.get(i11).length;
            }
            return format.maxInputSize + i10;
        }
        return getMaxInputSize(mediaCodecInfo, format.sampleMimeType, format.width, format.height);
    }

    private static boolean isBufferLate(long j3) {
        return j3 < -30000;
    }

    private static boolean isBufferVeryLate(long j3) {
        return j3 < -500000;
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
        int i10 = this.currentWidth;
        if (i10 != -1 || this.currentHeight != -1) {
            if (this.reportedWidth != i10 || this.reportedHeight != this.currentHeight || this.reportedUnappliedRotationDegrees != this.currentUnappliedRotationDegrees || this.reportedPixelWidthHeightRatio != this.currentPixelWidthHeightRatio) {
                this.eventDispatcher.videoSizeChanged(i10, this.currentHeight, this.currentUnappliedRotationDegrees, this.currentPixelWidthHeightRatio);
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
        int i10 = this.reportedWidth;
        if (i10 != -1 || this.reportedHeight != -1) {
            this.eventDispatcher.videoSizeChanged(i10, this.reportedHeight, this.reportedUnappliedRotationDegrees, this.reportedPixelWidthHeightRatio);
        }
    }

    private void setJoiningDeadlineMs() {
        long j3;
        if (this.allowedJoiningTimeMs > 0) {
            j3 = SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs;
        } else {
            j3 = C.TIME_UNSET;
        }
        this.joiningDeadlineMs = j3;
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
            int i10 = format2.width;
            CodecMaxValues codecMaxValues = this.codecMaxValues;
            if (i10 <= codecMaxValues.width && format2.height <= codecMaxValues.height && getMaxInputSize(mediaCodecInfo, format2) <= this.codecMaxValues.inputSize) {
                if (format.initializationDataEquals(format2)) {
                    return 1;
                }
                return 3;
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x05c8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean codecNeedsSetOutputSurfaceWorkaround(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 2210
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

    public void dropOutputBuffer(MediaCodec mediaCodec, int i10, long j3) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(1);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void flushCodec() throws ExoPlaybackException {
        super.flushCodec();
        this.buffersInCodecCount = 0;
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10 = format.width;
        int i11 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            return new CodecMaxValues(i10, i11, maxInputSize);
        }
        boolean z11 = false;
        for (Format format2 : formatArr) {
            if (areAdaptationCompatible(mediaCodecInfo.adaptive, format, format2)) {
                int i12 = format2.width;
                if (i12 != -1 && format2.height != -1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z11 |= z10;
                i10 = Math.max(i10, i12);
                i11 = Math.max(i11, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z11) {
            Log.w(TAG, "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i10 = Math.max(i10, codecMaxSize.x);
                i11 = Math.max(i11, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format.sampleMimeType, i10, i11));
                Log.w(TAG, "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new CodecMaxValues(i10, i11, maxInputSize);
    }

    public MediaFormat getMediaFormat(Format format, CodecMaxValues codecMaxValues, boolean z10, int i10) {
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
        if (z10) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            configureTunnelingV21(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            setSurface((Surface) obj);
            return;
        }
        if (i10 == 4) {
            this.scalingMode = ((Integer) obj).intValue();
            MediaCodec codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        super.handleMessage(i10, obj);
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

    public boolean maybeDropBuffersToKeyframe(MediaCodec mediaCodec, int i10, long j3, long j10) throws ExoPlaybackException {
        int skipSource = skipSource(j10);
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
    public void onCodecInitialized(String str, long j3, long j10) {
        this.eventDispatcher.decoderInitialized(str, j3, j10);
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
    public void onEnabled(boolean z10) throws ExoPlaybackException {
        boolean z11;
        super.onEnabled(z10);
        int i10 = getConfiguration().tunnelingAudioSessionId;
        this.tunnelingAudioSessionId = i10;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.tunneling = z11;
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
        boolean z10;
        int integer;
        int integer2;
        if (mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            integer = (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.currentWidth = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.currentHeight = integer2;
        float f10 = this.pendingPixelWidthHeightRatio;
        this.currentPixelWidthHeightRatio = f10;
        if (Util.SDK_INT >= 21) {
            int i10 = this.pendingRotationDegrees;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.currentWidth;
                this.currentWidth = integer2;
                this.currentHeight = i11;
                this.currentPixelWidthHeightRatio = 1.0f / f10;
            }
        } else {
            this.currentUnappliedRotationDegrees = this.pendingRotationDegrees;
        }
        mediaCodec.setVideoScalingMode(this.scalingMode);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onPositionReset(long j3, boolean z10) throws ExoPlaybackException {
        super.onPositionReset(j3, z10);
        clearRenderedFirstFrame();
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        this.lastInputTimeUs = C.TIME_UNSET;
        int i10 = this.pendingOutputStreamOffsetCount;
        if (i10 != 0) {
            this.outputStreamOffsetUs = this.pendingOutputStreamOffsetsUs[i10 - 1];
            this.pendingOutputStreamOffsetCount = 0;
        }
        if (z10) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onProcessedOutputBuffer(long j3) {
        this.buffersInCodecCount--;
        while (true) {
            int i10 = this.pendingOutputStreamOffsetCount;
            if (i10 != 0 && j3 >= this.pendingOutputStreamSwitchTimesUs[0]) {
                long[] jArr = this.pendingOutputStreamOffsetsUs;
                this.outputStreamOffsetUs = jArr[0];
                int i11 = i10 - 1;
                this.pendingOutputStreamOffsetCount = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
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
    public void onStreamChanged(Format[] formatArr, long j3) throws ExoPlaybackException {
        if (this.outputStreamOffsetUs == C.TIME_UNSET) {
            this.outputStreamOffsetUs = j3;
        } else {
            int i10 = this.pendingOutputStreamOffsetCount;
            if (i10 == this.pendingOutputStreamOffsetsUs.length) {
                Log.w(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
            } else {
                this.pendingOutputStreamOffsetCount = i10 + 1;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            int i11 = this.pendingOutputStreamOffsetCount;
            jArr[i11 - 1] = j3;
            this.pendingOutputStreamSwitchTimesUs[i11 - 1] = this.lastInputTimeUs;
        }
        super.onStreamChanged(formatArr, j3);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j3, long j10, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j11, boolean z10) throws ExoPlaybackException {
        boolean z11;
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j3;
        }
        long j12 = j11 - this.outputStreamOffsetUs;
        if (z10) {
            skipOutputBuffer(mediaCodec, i10, j12);
            return true;
        }
        long j13 = j11 - j3;
        if (this.surface == this.dummySurface) {
            if (!isBufferLate(j13)) {
                return false;
            }
            skipOutputBuffer(mediaCodec, i10, j12);
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        if (getState() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.renderedFirstFrame && (!z11 || !shouldForceRenderOutputBuffer(j13, elapsedRealtime - this.lastRenderTimeUs))) {
            if (z11 && j3 != this.initialPositionUs) {
                long nanoTime = System.nanoTime();
                long adjustReleaseTime = this.frameReleaseTimeHelper.adjustReleaseTime(j11, ((j13 - (elapsedRealtime - j10)) * 1000) + nanoTime);
                long j14 = (adjustReleaseTime - nanoTime) / 1000;
                if (shouldDropBuffersToKeyframe(j14, j10) && maybeDropBuffersToKeyframe(mediaCodec, i10, j12, j3)) {
                    return false;
                }
                if (shouldDropOutputBuffer(j14, j10)) {
                    dropOutputBuffer(mediaCodec, i10, j12);
                    return true;
                }
                if (Util.SDK_INT >= 21) {
                    if (j14 < 50000) {
                        renderOutputBufferV21(mediaCodec, i10, j12, adjustReleaseTime);
                        return true;
                    }
                } else if (j14 < 30000) {
                    if (j14 > 11000) {
                        try {
                            Thread.sleep((j14 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    renderOutputBuffer(mediaCodec, i10, j12);
                    return true;
                }
            }
            return false;
        }
        if (Util.SDK_INT >= 21) {
            renderOutputBufferV21(mediaCodec, i10, j12, System.nanoTime());
            return true;
        }
        renderOutputBuffer(mediaCodec, i10, j12);
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
        } catch (Throwable th2) {
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
            throw th2;
        }
    }

    public void renderOutputBuffer(MediaCodec mediaCodec, int i10, long j3) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    public void renderOutputBufferV21(MediaCodec mediaCodec, int i10, long j3, long j10) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j10);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    public boolean shouldDropBuffersToKeyframe(long j3, long j10) {
        return isBufferVeryLate(j3);
    }

    public boolean shouldDropOutputBuffer(long j3, long j10) {
        return isBufferLate(j3);
    }

    public boolean shouldForceRenderOutputBuffer(long j3, long j10) {
        return isBufferLate(j3) && j10 > 100000;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return this.surface != null || shouldUseDummySurface(mediaCodecInfo);
    }

    public void skipOutputBuffer(MediaCodec mediaCodec, int i10, long j3) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = format.sampleMimeType;
        int i14 = 0;
        if (!MimeTypes.isVideo(str)) {
            return 0;
        }
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z10 = false;
            for (int i15 = 0; i15 < drmInitData.schemeDataCount; i15++) {
                z10 |= drmInitData.get(i15).requiresSecureDecryption;
            }
        } else {
            z10 = false;
        }
        MediaCodecInfo decoderInfo = mediaCodecSelector.getDecoderInfo(str, z10);
        boolean z11 = true;
        if (decoderInfo == null) {
            if (z10 && mediaCodecSelector.getDecoderInfo(str, false) != null) {
                return 2;
            }
            return 1;
        }
        if (!BaseRenderer.supportsFormatDrm(drmSessionManager, drmInitData)) {
            return 2;
        }
        boolean isCodecSupported = decoderInfo.isCodecSupported(format.codecs);
        if (isCodecSupported && (i12 = format.width) > 0 && (i13 = format.height) > 0) {
            if (Util.SDK_INT >= 21) {
                isCodecSupported = decoderInfo.isVideoSizeAndRateSupportedV21(i12, i13, format.frameRate);
            } else {
                if (i12 * i13 > MediaCodecUtil.maxH264DecodableFrameSize()) {
                    z11 = false;
                }
                if (!z11) {
                    Log.d(TAG, "FalseCheck [legacyFrameSize, " + format.width + "x" + format.height + "] [" + Util.DEVICE_DEBUG_INFO + "]");
                }
                isCodecSupported = z11;
            }
        }
        if (decoderInfo.adaptive) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        if (decoderInfo.tunneling) {
            i14 = 32;
        }
        if (isCodecSupported) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        return i11 | i10 | i14;
    }

    public void updateDroppedBufferCounters(int i10) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedBufferCount += i10;
        this.droppedFrames += i10;
        int i11 = this.consecutiveDroppedFrameCount + i10;
        this.consecutiveDroppedFrameCount = i11;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i11, decoderCounters.maxConsecutiveDroppedBufferCount);
        if (this.droppedFrames >= this.maxDroppedFramesToNotify) {
            maybeNotifyDroppedFrames();
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j3) {
        this(context, mediaCodecSelector, j3, null, null, -1);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j3, Handler handler, VideoRendererEventListener videoRendererEventListener, int i10) {
        this(context, mediaCodecSelector, j3, null, false, handler, videoRendererEventListener, i10);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j3, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z10, Handler handler, VideoRendererEventListener videoRendererEventListener, int i10) {
        super(2, mediaCodecSelector, drmSessionManager, z10);
        this.allowedJoiningTimeMs = j3;
        this.maxDroppedFramesToNotify = i10;
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
    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, String str, int i10, int i11) {
        char c10;
        int i12;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.getClass();
        int i13 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(MimeTypes.VIDEO_H263)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1187890754:
                if (str.equals(MimeTypes.VIDEO_MP4V)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals(MimeTypes.VIDEO_VP8)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 2:
            case 4:
                i12 = i10 * i11;
                i13 = 2;
                return (i12 * 3) / (i13 * 2);
            case 1:
            case 5:
                i12 = i10 * i11;
                return (i12 * 3) / (i13 * 2);
            case 3:
                String str2 = Util.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Util.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                i12 = Util.ceilDivide(i11, 16) * Util.ceilDivide(i10, 16) * 16 * 16;
                i13 = 2;
                return (i12 * 3) / (i13 * 2);
            default:
                return -1;
        }
    }
}
