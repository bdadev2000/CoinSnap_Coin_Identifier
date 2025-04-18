package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private int index;
    private boolean readEndOfStream = true;
    private int state;
    private SampleStream stream;
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private final int trackType;

    public BaseRenderer(int i10) {
        this.trackType = i10;
    }

    public static boolean supportsFormatDrm(DrmSessionManager<?> drmSessionManager, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (drmSessionManager == null) {
            return false;
        }
        return drmSessionManager.canAcquireSession(drmInitData);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void disable() {
        boolean z10 = true;
        if (this.state != 1) {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j3, boolean z10, long j10) throws ExoPlaybackException {
        boolean z11;
        if (this.state == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z10);
        replaceStream(formatArr, sampleStream, j10);
        onPositionReset(j3, z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    public final RendererConfiguration getConfiguration() {
        return this.configuration;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final SampleStream getStream() {
        return this.stream;
    }

    public final Format[] getStreamFormats() {
        return this.streamFormats;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer, com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i10, Object obj) throws ExoPlaybackException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readEndOfStream;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    public final boolean isSourceReady() {
        return this.readEndOfStream ? this.streamIsFinal : this.stream.isReady();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
        this.stream.maybeThrowError();
    }

    public void onDisabled() {
    }

    public void onEnabled(boolean z10) throws ExoPlaybackException {
    }

    public void onPositionReset(long j3, boolean z10) throws ExoPlaybackException {
    }

    public void onStarted() throws ExoPlaybackException {
    }

    public void onStopped() throws ExoPlaybackException {
    }

    public void onStreamChanged(Format[] formatArr, long j3) throws ExoPlaybackException {
    }

    public final int readSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10) {
        int readData = this.stream.readData(formatHolder, decoderInputBuffer, z10);
        if (readData == -4) {
            if (decoderInputBuffer.isEndOfStream()) {
                this.readEndOfStream = true;
                if (this.streamIsFinal) {
                    return -4;
                }
                return -3;
            }
            decoderInputBuffer.timeUs += this.streamOffsetUs;
        } else if (readData == -5) {
            Format format = formatHolder.format;
            long j3 = format.subsampleOffsetUs;
            if (j3 != Long.MAX_VALUE) {
                formatHolder.format = format.copyWithSubsampleOffsetUs(j3 + this.streamOffsetUs);
            }
        }
        return readData;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j3) throws ExoPlaybackException {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        this.readEndOfStream = false;
        this.streamFormats = formatArr;
        this.streamOffsetUs = j3;
        onStreamChanged(formatArr, j3);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void resetPosition(long j3) throws ExoPlaybackException {
        this.streamIsFinal = false;
        this.readEndOfStream = false;
        onPositionReset(j3, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void setIndex(int i10) {
        this.index = i10;
    }

    public int skipSource(long j3) {
        return this.stream.skipData(j3 - this.streamOffsetUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        boolean z10 = true;
        if (this.state != 1) {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.state = 2;
        onStarted();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void stop() throws ExoPlaybackException {
        boolean z10;
        if (this.state == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.state = 1;
        onStopped();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }
}
