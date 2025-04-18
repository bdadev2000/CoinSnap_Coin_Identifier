package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ExoPlaybackException extends Exception {
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final int rendererIndex;
    public final int type;

    /* loaded from: classes4.dex */
    public @interface Type {
    }

    private ExoPlaybackException(int i10, String str, Throwable th2, int i11) {
        super(str, th2);
        this.type = i10;
        this.rendererIndex = i11;
    }

    public static ExoPlaybackException createForRenderer(Exception exc, int i10) {
        return new ExoPlaybackException(1, null, exc, i10);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, null, iOException, -1);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, null, runtimeException, -1);
    }

    public final Exception getRendererException() {
        boolean z10 = true;
        if (this.type != 1) {
            z10 = false;
        }
        Assertions.checkState(z10);
        return (Exception) getCause();
    }

    public final IOException getSourceException() {
        boolean z10;
        if (this.type == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        return (IOException) getCause();
    }

    public final RuntimeException getUnexpectedException() {
        boolean z10;
        if (this.type == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        return (RuntimeException) getCause();
    }
}
