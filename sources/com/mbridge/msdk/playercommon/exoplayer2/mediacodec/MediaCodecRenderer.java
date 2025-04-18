package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = Util.getBytesFromHexString("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final int KEEP_CODEC_RESULT_NO = 0;
    protected static final int KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION = 1;
    protected static final int KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION = 3;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "MediaCodecRenderer";
    private final DecoderInputBuffer buffer;
    private MediaCodec codec;
    private int codecAdaptationWorkaroundMode;
    private long codecHotswapDeadlineMs;
    private MediaCodecInfo codecInfo;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagationWorkaround;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private int codecReinitializationState;
    private final List<Long> decodeOnlyPresentationTimestamps;
    protected DecoderCounters decoderCounters;
    private DrmSession<FrameworkMediaCrypto> drmSession;
    private final DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private Format format;
    private final FormatHolder formatHolder;
    private ByteBuffer[] inputBuffers;
    private int inputIndex;
    private boolean inputStreamEnded;
    private final MediaCodecSelector mediaCodecSelector;
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private ByteBuffer[] outputBuffers;
    private int outputIndex;
    private boolean outputStreamEnded;
    private DrmSession<FrameworkMediaCrypto> pendingDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private boolean shouldSkipOutputBuffer;
    private boolean waitingForFirstSyncFrame;
    private boolean waitingForKeys;

    /* loaded from: classes4.dex */
    public @interface AdaptationWorkaroundMode {
    }

    /* loaded from: classes4.dex */
    public @interface KeepCodecResult {
    }

    /* loaded from: classes4.dex */
    public @interface ReconfigurationState {
    }

    /* loaded from: classes4.dex */
    public @interface ReinitializationState {
    }

    public MediaCodecRenderer(int i10, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z10) {
        super(i10);
        boolean z11;
        if (Util.SDK_INT >= 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.drmSessionManager = drmSessionManager;
        this.playClearSamplesWithoutKeys = z10;
        this.buffer = new DecoderInputBuffer(0);
        this.flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
        this.formatHolder = new FormatHolder();
        this.decodeOnlyPresentationTimestamps = new ArrayList();
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.codecReconfigurationState = 0;
        this.codecReinitializationState = 0;
    }

    private int codecAdaptationWorkaroundMode(String str) {
        int i10 = Util.SDK_INT;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Util.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = Util.DEVICE;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String str, Format format) {
        if (Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        int i10 = Util.SDK_INT;
        if ((i10 <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (i10 <= 19 && "hb2000".equals(Util.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)))) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if ((Util.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) || ("Amazon".equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && mediaCodecInfo.secure)) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        int i10 = Util.SDK_INT;
        if (i10 >= 18 && ((i10 != 18 || (!"OMX.SEC.avc.dec".equals(str) && !"OMX.SEC.avc.dec.secure".equals(str))) && (i10 != 19 || !Util.MODEL.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(str) && !"OMX.Exynos.avc.dec.secure".equals(str))))) {
            return false;
        }
        return true;
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(String str, Format format) {
        if (Util.SDK_INT <= 18 && format.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return true;
        }
        return false;
    }

    private boolean deviceNeedsDrmKeysToConfigureCodecWorkaround() {
        if ("Amazon".equals(Util.MANUFACTURER)) {
            String str = Util.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean drainOutputBuffer(long j3, long j10) throws ExoPlaybackException {
        boolean processOutputBuffer;
        boolean z10;
        int dequeueOutputBuffer;
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    dequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.outputBufferInfo, getDequeueOutputBufferTimeoutUs());
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.outputBufferInfo, getDequeueOutputBufferTimeoutUs());
            }
            if (dequeueOutputBuffer >= 0) {
                if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                    this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                    this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                }
                MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                    processEndOfStream();
                    return false;
                }
                this.outputIndex = dequeueOutputBuffer;
                ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                this.outputBuffer = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(this.outputBufferInfo.offset);
                    ByteBuffer byteBuffer = this.outputBuffer;
                    MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                this.shouldSkipOutputBuffer = shouldSkipOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            } else {
                if (dequeueOutputBuffer == -2) {
                    processOutputFormat();
                    return true;
                }
                if (dequeueOutputBuffer == -3) {
                    processOutputBuffersChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagationWorkaround && (this.inputStreamEnded || this.codecReinitializationState == 2)) {
                    processEndOfStream();
                }
                return false;
            }
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                MediaCodec mediaCodec = this.codec;
                ByteBuffer byteBuffer2 = this.outputBuffer;
                int i10 = this.outputIndex;
                MediaCodec.BufferInfo bufferInfo3 = this.outputBufferInfo;
                processOutputBuffer = processOutputBuffer(j3, j10, mediaCodec, byteBuffer2, i10, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.shouldSkipOutputBuffer);
            } catch (IllegalStateException unused2) {
                processEndOfStream();
                if (this.outputStreamEnded) {
                    releaseCodec();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.codec;
            ByteBuffer byteBuffer3 = this.outputBuffer;
            int i11 = this.outputIndex;
            MediaCodec.BufferInfo bufferInfo4 = this.outputBufferInfo;
            processOutputBuffer = processOutputBuffer(j3, j10, mediaCodec2, byteBuffer3, i11, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.shouldSkipOutputBuffer);
        }
        if (processOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            if ((this.outputBufferInfo.flags & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            resetOutputBuffer();
            if (!z10) {
                return true;
            }
            processEndOfStream();
        }
        return false;
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        int position;
        int readSource;
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec == null || this.codecReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputIndex < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.inputIndex = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.buffer.data = getInputBuffer(dequeueInputBuffer);
            this.buffer.clear();
        }
        if (this.codecReinitializationState == 1) {
            if (!this.codecNeedsEosPropagationWorkaround) {
                this.codecReceivedEos = true;
                this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecReinitializationState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = this.buffer.data;
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            this.codec.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.waitingForKeys) {
            readSource = -4;
            position = 0;
        } else {
            if (this.codecReconfigurationState == 1) {
                for (int i10 = 0; i10 < this.format.initializationData.size(); i10++) {
                    this.buffer.data.put(this.format.initializationData.get(i10));
                }
                this.codecReconfigurationState = 2;
            }
            position = this.buffer.data.position();
            readSource = readSource(this.formatHolder, this.buffer, false);
        }
        if (readSource == -3) {
            return false;
        }
        if (readSource == -5) {
            if (this.codecReconfigurationState == 2) {
                this.buffer.clear();
                this.codecReconfigurationState = 1;
            }
            onInputFormatChanged(this.formatHolder.format);
            return true;
        }
        if (this.buffer.isEndOfStream()) {
            if (this.codecReconfigurationState == 2) {
                this.buffer.clear();
                this.codecReconfigurationState = 1;
            }
            this.inputStreamEnded = true;
            if (!this.codecReceivedBuffers) {
                processEndOfStream();
                return false;
            }
            try {
                if (!this.codecNeedsEosPropagationWorkaround) {
                    this.codecReceivedEos = true;
                    this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                    resetInputBuffer();
                }
                return false;
            } catch (MediaCodec.CryptoException e2) {
                throw ExoPlaybackException.createForRenderer(e2, getIndex());
            }
        }
        if (this.waitingForFirstSyncFrame && !this.buffer.isKeyFrame()) {
            this.buffer.clear();
            if (this.codecReconfigurationState == 2) {
                this.codecReconfigurationState = 1;
            }
            return true;
        }
        this.waitingForFirstSyncFrame = false;
        boolean isEncrypted = this.buffer.isEncrypted();
        boolean shouldWaitForKeys = shouldWaitForKeys(isEncrypted);
        this.waitingForKeys = shouldWaitForKeys;
        if (shouldWaitForKeys) {
            return false;
        }
        if (this.codecNeedsDiscardToSpsWorkaround && !isEncrypted) {
            NalUnitUtil.discardToSps(this.buffer.data);
            if (this.buffer.data.position() == 0) {
                return true;
            }
            this.codecNeedsDiscardToSpsWorkaround = false;
        }
        try {
            DecoderInputBuffer decoderInputBuffer = this.buffer;
            long j3 = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isDecodeOnly()) {
                this.decodeOnlyPresentationTimestamps.add(Long.valueOf(j3));
            }
            this.buffer.flip();
            onQueueInputBuffer(this.buffer);
            if (isEncrypted) {
                this.codec.queueSecureInputBuffer(this.inputIndex, 0, getFrameworkCryptoInfo(this.buffer, position), j3, 0);
            } else {
                this.codec.queueInputBuffer(this.inputIndex, 0, this.buffer.data.limit(), j3, 0);
            }
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            this.codecReconfigurationState = 0;
            this.decoderCounters.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e10) {
            throw ExoPlaybackException.createForRenderer(e10, getIndex());
        }
    }

    private void getCodecBuffers() {
        if (Util.SDK_INT < 21) {
            this.inputBuffers = this.codec.getInputBuffers();
            this.outputBuffers = this.codec.getOutputBuffers();
        }
    }

    private static MediaCodec.CryptoInfo getFrameworkCryptoInfo(DecoderInputBuffer decoderInputBuffer, int i10) {
        MediaCodec.CryptoInfo frameworkCryptoInfoV16 = decoderInputBuffer.cryptoInfo.getFrameworkCryptoInfoV16();
        if (i10 == 0) {
            return frameworkCryptoInfoV16;
        }
        if (frameworkCryptoInfoV16.numBytesOfClearData == null) {
            frameworkCryptoInfoV16.numBytesOfClearData = new int[1];
        }
        int[] iArr = frameworkCryptoInfoV16.numBytesOfClearData;
        iArr[0] = iArr[0] + i10;
        return frameworkCryptoInfoV16;
    }

    private ByteBuffer getInputBuffer(int i10) {
        if (Util.SDK_INT >= 21) {
            return this.codec.getInputBuffer(i10);
        }
        return this.inputBuffers[i10];
    }

    private ByteBuffer getOutputBuffer(int i10) {
        if (Util.SDK_INT >= 21) {
            return this.codec.getOutputBuffer(i10);
        }
        return this.outputBuffers[i10];
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private void processEndOfStream() throws ExoPlaybackException {
        if (this.codecReinitializationState == 2) {
            releaseCodec();
            maybeInitCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    private void processOutputBuffersChanged() {
        if (Util.SDK_INT < 21) {
            this.outputBuffers = this.codec.getOutputBuffers();
        }
    }

    private void processOutputFormat() throws ExoPlaybackException {
        MediaFormat outputFormat = this.codec.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat.setInteger("channel-count", 1);
        }
        onOutputFormatChanged(this.codec, outputFormat);
    }

    private void resetCodecBuffers() {
        if (Util.SDK_INT < 21) {
            this.inputBuffers = null;
            this.outputBuffers = null;
        }
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private boolean shouldSkipOutputBuffer(long j3) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.decodeOnlyPresentationTimestamps.get(i10).longValue() == j3) {
                this.decodeOnlyPresentationTimestamps.remove(i10);
                return true;
            }
        }
        return false;
    }

    private boolean shouldWaitForKeys(boolean z10) throws ExoPlaybackException {
        DrmSession<FrameworkMediaCrypto> drmSession = this.drmSession;
        if (drmSession == null || (!z10 && this.playClearSamplesWithoutKeys)) {
            return false;
        }
        int state = drmSession.getState();
        if (state != 1) {
            if (state == 4) {
                return false;
            }
            return true;
        }
        throw ExoPlaybackException.createForRenderer(this.drmSession.getError(), getIndex());
    }

    private void throwDecoderInitError(DecoderInitializationException decoderInitializationException) throws ExoPlaybackException {
        throw ExoPlaybackException.createForRenderer(decoderInitializationException, getIndex());
    }

    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return 0;
    }

    public abstract void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws MediaCodecUtil.DecoderQueryException;

    public void flushCodec() throws ExoPlaybackException {
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        resetInputBuffer();
        resetOutputBuffer();
        this.waitingForFirstSyncFrame = true;
        this.waitingForKeys = false;
        this.shouldSkipOutputBuffer = false;
        this.decodeOnlyPresentationTimestamps.clear();
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        if (!this.codecNeedsFlushWorkaround && (!this.codecNeedsEosFlushWorkaround || !this.codecReceivedEos)) {
            if (this.codecReinitializationState != 0) {
                releaseCodec();
                maybeInitCodec();
            } else {
                this.codec.flush();
                this.codecReceivedBuffers = false;
            }
        } else {
            releaseCodec();
            maybeInitCodec();
        }
        if (this.codecReconfigured && this.format != null) {
            this.codecReconfigurationState = 1;
        }
    }

    public final MediaCodec getCodec() {
        return this.codec;
    }

    public final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    public MediaCodecInfo getDecoderInfo(MediaCodecSelector mediaCodecSelector, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return mediaCodecSelector.getDecoderInfo(format.sampleMimeType, z10);
    }

    public long getDequeueOutputBufferTimeoutUs() {
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        if (this.format != null && !this.waitingForKeys && (isSourceReady() || hasOutputBuffer() || (this.codecHotswapDeadlineMs != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.codecHotswapDeadlineMs))) {
            return true;
        }
        return false;
    }

    public final void maybeInitCodec() throws ExoPlaybackException {
        Format format;
        boolean z10;
        MediaCrypto mediaCrypto;
        long j3;
        if (this.codec == null && (format = this.format) != null) {
            DrmSession<FrameworkMediaCrypto> drmSession = this.pendingDrmSession;
            this.drmSession = drmSession;
            String str = format.sampleMimeType;
            if (drmSession != null) {
                FrameworkMediaCrypto mediaCrypto2 = drmSession.getMediaCrypto();
                if (mediaCrypto2 == null) {
                    if (this.drmSession.getError() != null) {
                        z10 = false;
                        mediaCrypto = null;
                    } else {
                        return;
                    }
                } else {
                    mediaCrypto = mediaCrypto2.getWrappedMediaCrypto();
                    z10 = mediaCrypto2.requiresSecureDecoderComponent(str);
                }
                if (deviceNeedsDrmKeysToConfigureCodecWorkaround()) {
                    int state = this.drmSession.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        throw ExoPlaybackException.createForRenderer(this.drmSession.getError(), getIndex());
                    }
                }
            } else {
                z10 = false;
                mediaCrypto = null;
            }
            if (this.codecInfo == null) {
                try {
                    MediaCodecInfo decoderInfo = getDecoderInfo(this.mediaCodecSelector, this.format, z10);
                    this.codecInfo = decoderInfo;
                    if (decoderInfo == null && z10) {
                        MediaCodecInfo decoderInfo2 = getDecoderInfo(this.mediaCodecSelector, this.format, false);
                        this.codecInfo = decoderInfo2;
                        if (decoderInfo2 != null) {
                            Log.w(TAG, "Drm session requires secure decoder for " + str + ", but no secure decoder available. Trying to proceed with " + this.codecInfo.name + ".");
                        }
                    }
                } catch (MediaCodecUtil.DecoderQueryException e2) {
                    throwDecoderInitError(new DecoderInitializationException(this.format, e2, z10, -49998));
                }
                if (this.codecInfo == null) {
                    throwDecoderInitError(new DecoderInitializationException(this.format, (Throwable) null, z10, -49999));
                }
            }
            if (!shouldInitCodec(this.codecInfo)) {
                return;
            }
            String str2 = this.codecInfo.name;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str2);
            this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str2, this.format);
            this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str2);
            this.codecNeedsEosPropagationWorkaround = codecNeedsEosPropagationWorkaround(this.codecInfo);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str2);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str2);
            this.codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(str2, this.format);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                TraceUtil.beginSection("createCodec:" + str2);
                this.codec = MediaCodec.createByCodecName(str2);
                TraceUtil.endSection();
                TraceUtil.beginSection("configureCodec");
                configureCodec(this.codecInfo, this.codec, this.format, mediaCrypto);
                TraceUtil.endSection();
                TraceUtil.beginSection("startCodec");
                this.codec.start();
                TraceUtil.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                onCodecInitialized(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                getCodecBuffers();
            } catch (Exception e10) {
                throwDecoderInitError(new DecoderInitializationException(this.format, e10, z10, str2));
            }
            if (getState() == 2) {
                j3 = SystemClock.elapsedRealtime() + 1000;
            } else {
                j3 = C.TIME_UNSET;
            }
            this.codecHotswapDeadlineMs = j3;
            resetInputBuffer();
            resetOutputBuffer();
            this.waitingForFirstSyncFrame = true;
            this.decoderCounters.decoderInitCount++;
        }
    }

    public void onCodecInitialized(String str, long j3, long j10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.format = null;
        try {
            releaseCodec();
            try {
                DrmSession<FrameworkMediaCrypto> drmSession = this.drmSession;
                if (drmSession != null) {
                    this.drmSessionManager.releaseSession(drmSession);
                }
                try {
                    DrmSession<FrameworkMediaCrypto> drmSession2 = this.pendingDrmSession;
                    if (drmSession2 != null && drmSession2 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession2);
                    }
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    DrmSession<FrameworkMediaCrypto> drmSession3 = this.pendingDrmSession;
                    if (drmSession3 != null && drmSession3 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession3);
                    }
                    throw th2;
                } finally {
                }
            }
        } catch (Throwable th3) {
            try {
                if (this.drmSession != null) {
                    this.drmSessionManager.releaseSession(this.drmSession);
                }
                try {
                    DrmSession<FrameworkMediaCrypto> drmSession4 = this.pendingDrmSession;
                    if (drmSession4 != null && drmSession4 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession4);
                    }
                    throw th3;
                } finally {
                }
            } catch (Throwable th4) {
                try {
                    DrmSession<FrameworkMediaCrypto> drmSession5 = this.pendingDrmSession;
                    if (drmSession5 != null && drmSession5 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession5);
                    }
                    throw th4;
                } finally {
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onEnabled(boolean z10) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r6.height == r0.height) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInputFormatChanged(com.mbridge.msdk.playercommon.exoplayer2.Format r6) throws com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException {
        /*
            r5 = this;
            com.mbridge.msdk.playercommon.exoplayer2.Format r0 = r5.format
            r5.format = r6
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData r6 = r6.drmInitData
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData r2 = r0.drmInitData
        Ld:
            boolean r6 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.areEqual(r6, r2)
            r2 = 1
            r6 = r6 ^ r2
            if (r6 == 0) goto L49
            com.mbridge.msdk.playercommon.exoplayer2.Format r6 = r5.format
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData r6 = r6.drmInitData
            if (r6 == 0) goto L47
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r6 = r5.drmSessionManager
            if (r6 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.mbridge.msdk.playercommon.exoplayer2.Format r3 = r5.format
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData r3 = r3.drmInitData
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession r6 = r6.acquireSession(r1, r3)
            r5.pendingDrmSession = r6
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r1 = r5.drmSession
            if (r6 != r1) goto L49
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r1 = r5.drmSessionManager
            r1.releaseSession(r6)
            goto L49
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.getIndex()
            com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException r6 = com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException.createForRenderer(r6, r0)
            throw r6
        L47:
            r5.pendingDrmSession = r1
        L49:
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r6 = r5.pendingDrmSession
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r1 = r5.drmSession
            r3 = 0
            if (r6 != r1) goto L87
            android.media.MediaCodec r6 = r5.codec
            if (r6 == 0) goto L87
            com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo r1 = r5.codecInfo
            com.mbridge.msdk.playercommon.exoplayer2.Format r4 = r5.format
            int r6 = r5.canKeepCodec(r6, r1, r0, r4)
            if (r6 == 0) goto L87
            if (r6 == r2) goto L86
            r1 = 3
            if (r6 != r1) goto L80
            r5.codecReconfigured = r2
            r5.codecReconfigurationState = r2
            int r6 = r5.codecAdaptationWorkaroundMode
            r1 = 2
            if (r6 == r1) goto L7c
            if (r6 != r2) goto L7d
            com.mbridge.msdk.playercommon.exoplayer2.Format r6 = r5.format
            int r1 = r6.width
            int r4 = r0.width
            if (r1 != r4) goto L7d
            int r6 = r6.height
            int r0 = r0.height
            if (r6 != r0) goto L7d
        L7c:
            r3 = r2
        L7d:
            r5.codecNeedsAdaptationWorkaroundBuffer = r3
            goto L86
        L80:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L86:
            r3 = r2
        L87:
            if (r3 != 0) goto L96
            boolean r6 = r5.codecReceivedBuffers
            if (r6 == 0) goto L90
            r5.codecReinitializationState = r2
            goto L96
        L90:
            r5.releaseCodec()
            r5.maybeInitCodec()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer.onInputFormatChanged(com.mbridge.msdk.playercommon.exoplayer2.Format):void");
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onPositionReset(long j3, boolean z10) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.codec != null) {
            flushCodec();
        }
    }

    public void onProcessedOutputBuffer(long j3) {
    }

    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStarted() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStopped() {
    }

    public abstract boolean processOutputBuffer(long j3, long j10, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j11, boolean z10) throws ExoPlaybackException;

    public void releaseCodec() {
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        resetInputBuffer();
        resetOutputBuffer();
        this.waitingForKeys = false;
        this.shouldSkipOutputBuffer = false;
        this.decodeOnlyPresentationTimestamps.clear();
        resetCodecBuffers();
        this.codecInfo = null;
        this.codecReconfigured = false;
        this.codecReceivedBuffers = false;
        this.codecNeedsDiscardToSpsWorkaround = false;
        this.codecNeedsFlushWorkaround = false;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsEosPropagationWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsMonoChannelCountWorkaround = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.codecReceivedEos = false;
        this.codecReconfigurationState = 0;
        this.codecReinitializationState = 0;
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec != null) {
            this.decoderCounters.decoderReleaseCount++;
            try {
                mediaCodec.stop();
                try {
                    this.codec.release();
                    this.codec = null;
                    DrmSession<FrameworkMediaCrypto> drmSession = this.drmSession;
                    if (drmSession != null && this.pendingDrmSession != drmSession) {
                        try {
                            this.drmSessionManager.releaseSession(drmSession);
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    this.codec = null;
                    DrmSession<FrameworkMediaCrypto> drmSession2 = this.drmSession;
                    if (drmSession2 != null && this.pendingDrmSession != drmSession2) {
                        try {
                            this.drmSessionManager.releaseSession(drmSession2);
                        } finally {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    this.codec.release();
                    this.codec = null;
                    DrmSession<FrameworkMediaCrypto> drmSession3 = this.drmSession;
                    if (drmSession3 != null && this.pendingDrmSession != drmSession3) {
                        try {
                            this.drmSessionManager.releaseSession(drmSession3);
                        } finally {
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    this.codec = null;
                    DrmSession<FrameworkMediaCrypto> drmSession4 = this.drmSession;
                    if (drmSession4 != null && this.pendingDrmSession != drmSession4) {
                        try {
                            this.drmSessionManager.releaseSession(drmSession4);
                        } finally {
                        }
                    }
                    throw th4;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public void render(long j3, long j10) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            renderToEndOfStream();
            return;
        }
        if (this.format == null) {
            this.flagsOnlyBuffer.clear();
            int readSource = readSource(this.formatHolder, this.flagsOnlyBuffer, true);
            if (readSource == -5) {
                onInputFormatChanged(this.formatHolder.format);
            } else {
                if (readSource == -4) {
                    Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    processEndOfStream();
                    return;
                }
                return;
            }
        }
        maybeInitCodec();
        if (this.codec != null) {
            TraceUtil.beginSection("drainAndFeed");
            do {
            } while (drainOutputBuffer(j3, j10));
            do {
            } while (feedInputBuffer());
            TraceUtil.endSection();
        } else {
            DecoderCounters decoderCounters = this.decoderCounters;
            decoderCounters.skippedInputBufferCount = skipSource(j3) + decoderCounters.skippedInputBufferCount;
            this.flagsOnlyBuffer.clear();
            int readSource2 = readSource(this.formatHolder, this.flagsOnlyBuffer, false);
            if (readSource2 == -5) {
                onInputFormatChanged(this.formatHolder.format);
            } else if (readSource2 == -4) {
                Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                this.inputStreamEnded = true;
                processEndOfStream();
            }
        }
        this.decoderCounters.ensureUpdated();
    }

    public void renderToEndOfStream() throws ExoPlaybackException {
    }

    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, this.drmSessionManager, format);
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            throw ExoPlaybackException.createForRenderer(e2, getIndex());
        }
    }

    public abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    /* loaded from: classes4.dex */
    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final String decoderName;
        public final String diagnosticInfo;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th2, boolean z10, int i10) {
            super("Decoder init failed: [" + i10 + "], " + format, th2);
            this.mimeType = format.sampleMimeType;
            this.secureDecoderRequired = z10;
            this.decoderName = null;
            this.diagnosticInfo = buildCustomDiagnosticInfo(i10);
        }

        private static String buildCustomDiagnosticInfo(int i10) {
            String str;
            if (i10 < 0) {
                str = "neg_";
            } else {
                str = "";
            }
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i10);
        }

        private static String getDiagnosticInfoV21(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(Format format, Throwable th2, boolean z10, String str) {
            super("Decoder init failed: " + str + ", " + format, th2);
            this.mimeType = format.sampleMimeType;
            this.secureDecoderRequired = z10;
            this.decoderName = str;
            this.diagnosticInfo = Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th2) : null;
        }
    }
}
