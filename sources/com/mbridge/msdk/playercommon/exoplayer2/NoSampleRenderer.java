package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private int index;
    private int state;
    private SampleStream stream;
    private boolean streamIsFinal;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void disable() {
        boolean z10 = true;
        if (this.state != 1) {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.state = 0;
        this.stream = null;
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

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer, com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return 5;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i10, Object obj) throws ExoPlaybackException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isEnded() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
    }

    public void onDisabled() {
    }

    public void onEnabled(boolean z10) throws ExoPlaybackException {
    }

    public void onPositionReset(long j3, boolean z10) throws ExoPlaybackException {
    }

    public void onRendererOffsetChanged(long j3) throws ExoPlaybackException {
    }

    public void onStarted() throws ExoPlaybackException {
    }

    public void onStopped() throws ExoPlaybackException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j3) throws ExoPlaybackException {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        onRendererOffsetChanged(j3);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void resetPosition(long j3) throws ExoPlaybackException {
        this.streamIsFinal = false;
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
    public int supportsFormat(Format format) throws ExoPlaybackException {
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }
}
