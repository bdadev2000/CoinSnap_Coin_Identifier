package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ExoPlaybackException extends Exception {
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final int rendererIndex;
    public final int type;

    /* loaded from: classes3.dex */
    public @interface Type {
    }

    private ExoPlaybackException(int i9, String str, Throwable th, int i10) {
        super(str, th);
        this.type = i9;
        this.rendererIndex = i10;
    }

    public static ExoPlaybackException createForRenderer(Exception exc, int i9) {
        return new ExoPlaybackException(1, null, exc, i9);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, null, iOException, -1);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, null, runtimeException, -1);
    }

    public final Exception getRendererException() {
        boolean z8 = true;
        if (this.type != 1) {
            z8 = false;
        }
        Assertions.checkState(z8);
        return (Exception) getCause();
    }

    public final IOException getSourceException() {
        boolean z8;
        if (this.type == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        return (IOException) getCause();
    }

    public final RuntimeException getUnexpectedException() {
        boolean z8;
        if (this.type == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        return (RuntimeException) getCause();
    }
}
