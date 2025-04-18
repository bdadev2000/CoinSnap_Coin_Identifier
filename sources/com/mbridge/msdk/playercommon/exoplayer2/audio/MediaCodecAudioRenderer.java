package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaFormatUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private int channelCount;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private final Context context;
    private long currentPositionUs;
    private int encoderDelay;
    private int encoderPadding;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean passthroughEnabled;
    private MediaFormat passthroughMediaFormat;
    private int pcmEncoding;

    /* loaded from: classes4.dex */
    public final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onAudioSessionId(int i10) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioSessionId(i10);
            MediaCodecAudioRenderer.this.onAudioSessionId(i10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onPositionDiscontinuity() {
            MediaCodecAudioRenderer.this.onAudioTrackPositionDiscontinuity();
            MediaCodecAudioRenderer.this.allowPositionDiscontinuity = true;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onUnderrun(int i10, long j3, long j10) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackUnderrun(i10, j3, j10);
            MediaCodecAudioRenderer.this.onAudioTrackUnderrun(i10, j3, j10);
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, (DrmSessionManager<FrameworkMediaCrypto>) null, false);
    }

    private static boolean areAdaptationCompatible(Format format, Format format2) {
        if (format.sampleMimeType.equals(format2.sampleMimeType) && format.channelCount == format2.channelCount && format.sampleRate == format2.sampleRate && format.encoderDelay == 0 && format.encoderPadding == 0 && format2.encoderDelay == 0 && format2.encoderPadding == 0 && format.initializationDataEquals(format2)) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        if (Util.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER)) {
            String str2 = Util.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    public boolean allowPassthrough(String str) {
        int encoding = MimeTypes.getEncoding(str);
        if (encoding != 0 && this.audioSink.isEncodingSupported(encoding)) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format, getStreamFormats());
        this.codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(mediaCodecInfo.name);
        this.passthroughEnabled = mediaCodecInfo.passthrough;
        String str = mediaCodecInfo.mimeType;
        if (str == null) {
            str = MimeTypes.AUDIO_RAW;
        }
        MediaFormat mediaFormat = getMediaFormat(format, str, this.codecMaxInputSize);
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
        if (this.passthroughEnabled) {
            this.passthroughMediaFormat = mediaFormat;
            mediaFormat.setString("mime", format.sampleMimeType);
        } else {
            this.passthroughMediaFormat = null;
        }
    }

    public int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        return getCodecMaxInputSize(mediaCodecInfo, format);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public MediaCodecInfo getDecoderInfo(MediaCodecSelector mediaCodecSelector, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        MediaCodecInfo passthroughDecoderInfo;
        if (allowPassthrough(format.sampleMimeType) && (passthroughDecoderInfo = mediaCodecSelector.getPassthroughDecoderInfo()) != null) {
            return passthroughDecoderInfo;
        }
        return super.getDecoderInfo(mediaCodecSelector, format, z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public MediaClock getMediaClock() {
        return this;
    }

    public MediaFormat getMediaFormat(Format format, String str, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.channelCount);
        mediaFormat.setInteger("sample-rate", format.sampleRate);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", i10);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i10, Object obj) throws ExoPlaybackException {
        if (i10 != 2) {
            if (i10 != 3) {
                super.handleMessage(i10, obj);
                return;
            } else {
                this.audioSink.setAudioAttributes((AudioAttributes) obj);
                return;
            }
        }
        this.audioSink.setVolume(((Float) obj).floatValue());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isEnded() {
        return super.isEnded() && this.audioSink.isEnded();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        return this.audioSink.hasPendingData() || super.isReady();
    }

    public void onAudioSessionId(int i10) {
    }

    public void onAudioTrackPositionDiscontinuity() {
    }

    public void onAudioTrackUnderrun(int i10, long j3, long j10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, long j3, long j10) {
        this.eventDispatcher.decoderInitialized(str, j3, j10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onDisabled() {
        try {
            this.audioSink.release();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.onDisabled();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onEnabled(boolean z10) throws ExoPlaybackException {
        super.onEnabled(z10);
        this.eventDispatcher.enabled(this.decoderCounters);
        int i10 = getConfiguration().tunnelingAudioSessionId;
        if (i10 != 0) {
            this.audioSink.enableTunnelingV21(i10);
        } else {
            this.audioSink.disableTunneling();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onInputFormatChanged(Format format) throws ExoPlaybackException {
        int i10;
        super.onInputFormatChanged(format);
        this.eventDispatcher.inputFormatChanged(format);
        if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            i10 = format.pcmEncoding;
        } else {
            i10 = 2;
        }
        this.pcmEncoding = i10;
        this.channelCount = format.channelCount;
        this.encoderDelay = format.encoderDelay;
        this.encoderPadding = format.encoderPadding;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i10;
        int[] iArr;
        int i11;
        MediaFormat mediaFormat2 = this.passthroughMediaFormat;
        if (mediaFormat2 != null) {
            i10 = MimeTypes.getEncoding(mediaFormat2.getString("mime"));
            mediaFormat = this.passthroughMediaFormat;
        } else {
            i10 = this.pcmEncoding;
        }
        int i12 = i10;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.codecNeedsDiscardChannelsWorkaround && integer == 6 && (i11 = this.channelCount) < 6) {
            iArr = new int[i11];
            for (int i13 = 0; i13 < this.channelCount; i13++) {
                iArr[i13] = i13;
            }
        } else {
            iArr = null;
        }
        try {
            this.audioSink.configure(i12, integer, integer2, 0, iArr, this.encoderDelay, this.encoderPadding);
        } catch (AudioSink.ConfigurationException e2) {
            throw ExoPlaybackException.createForRenderer(e2, getIndex());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onPositionReset(long j3, boolean z10) throws ExoPlaybackException {
        super.onPositionReset(j3, z10);
        this.audioSink.reset();
        this.currentPositionUs = j3;
        this.allowFirstBufferPositionDiscontinuity = true;
        this.allowPositionDiscontinuity = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (this.allowFirstBufferPositionDiscontinuity && !decoderInputBuffer.isDecodeOnly()) {
            if (Math.abs(decoderInputBuffer.timeUs - this.currentPositionUs) > 500000) {
                this.currentPositionUs = decoderInputBuffer.timeUs;
            }
            this.allowFirstBufferPositionDiscontinuity = false;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.audioSink.play();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStopped() {
        updateCurrentPosition();
        this.audioSink.pause();
        super.onStopped();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j3, long j10, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j11, boolean z10) throws ExoPlaybackException {
        if (this.passthroughEnabled && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.decoderCounters.skippedOutputBufferCount++;
            this.audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.audioSink.handleBuffer(byteBuffer, j11)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.decoderCounters.renderedOutputBufferCount++;
            return true;
        } catch (AudioSink.InitializationException | AudioSink.WriteException e2) {
            throw ExoPlaybackException.createForRenderer(e2, getIndex());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void renderToEndOfStream() throws ExoPlaybackException {
        try {
            this.audioSink.playToEndOfStream();
        } catch (AudioSink.WriteException e2) {
            throw ExoPlaybackException.createForRenderer(e2, getIndex());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters) {
        return this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        boolean z10;
        int i11;
        int i12;
        String str = format.sampleMimeType;
        boolean z11 = false;
        if (!MimeTypes.isAudio(str)) {
            return 0;
        }
        if (Util.SDK_INT >= 21) {
            i10 = 32;
        } else {
            i10 = 0;
        }
        boolean supportsFormatDrm = BaseRenderer.supportsFormatDrm(drmSessionManager, format.drmInitData);
        int i13 = 4;
        if (supportsFormatDrm && allowPassthrough(str) && mediaCodecSelector.getPassthroughDecoderInfo() != null) {
            return i10 | 8 | 4;
        }
        if ((MimeTypes.AUDIO_RAW.equals(str) && !this.audioSink.isEncodingSupported(format.pcmEncoding)) || !this.audioSink.isEncodingSupported(2)) {
            return 1;
        }
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z10 = false;
            for (int i14 = 0; i14 < drmInitData.schemeDataCount; i14++) {
                z10 |= drmInitData.get(i14).requiresSecureDecryption;
            }
        } else {
            z10 = false;
        }
        MediaCodecInfo decoderInfo = mediaCodecSelector.getDecoderInfo(str, z10);
        if (decoderInfo == null) {
            if (!z10 || mediaCodecSelector.getDecoderInfo(str, false) == null) {
                return 1;
            }
            return 2;
        }
        if (!supportsFormatDrm) {
            return 2;
        }
        if (Util.SDK_INT < 21 || (((i11 = format.sampleRate) == -1 || decoderInfo.isAudioSampleRateSupportedV21(i11)) && ((i12 = format.channelCount) == -1 || decoderInfo.isAudioChannelCountSupportedV21(i12)))) {
            z11 = true;
        }
        if (!z11) {
            i13 = 3;
        }
        return i10 | 8 | i13;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z10) {
        this(context, mediaCodecSelector, drmSessionManager, z10, null, null);
    }

    private int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        PackageManager packageManager;
        int i10 = Util.SDK_INT;
        if (i10 < 24 && "OMX.google.raw.decoder".equals(mediaCodecInfo.name)) {
            if ((i10 == 23 && (packageManager = this.context.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) ? false : true) {
                return -1;
            }
        }
        return format.maxInputSize;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, null, false, handler, audioRendererEventListener);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z10, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, drmSessionManager, z10, handler, audioRendererEventListener, null, new AudioProcessor[0]);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z10, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        this(context, mediaCodecSelector, drmSessionManager, z10, handler, audioRendererEventListener, new DefaultAudioSink(audioCapabilities, audioProcessorArr));
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z10, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        super(1, mediaCodecSelector, drmSessionManager, z10);
        this.context = context.getApplicationContext();
        this.audioSink = audioSink;
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        audioSink.setListener(new AudioSinkListener());
    }
}
