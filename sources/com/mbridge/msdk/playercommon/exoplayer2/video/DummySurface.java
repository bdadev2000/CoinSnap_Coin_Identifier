package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.EGLSurfaceTexture;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class DummySurface extends Surface {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String TAG = "DummySurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final DummySurfaceThread thread;
    private boolean threadReleased;

    /* loaded from: classes4.dex */
    public static class DummySurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private DummySurface surface;

        public DummySurfaceThread() {
            super("dummySurface");
        }

        private void initInternal(int i10) {
            boolean z10;
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.init(i10);
            SurfaceTexture surfaceTexture = this.eglSurfaceTexture.getSurfaceTexture();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.surface = new DummySurface(this, surfaceTexture, z10);
        }

        private void releaseInternal() {
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        releaseInternal();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    initInternal(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.e(DummySurface.TAG, "Failed to initialize dummy surface", e2);
                    this.initError = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    Log.e(DummySurface.TAG, "Failed to initialize dummy surface", e10);
                    this.initException = e10;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }

        public DummySurface init(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.handler = handler;
            this.eglSurfaceTexture = new EGLSurfaceTexture(handler);
            synchronized (this) {
                z10 = false;
                this.handler.obtainMessage(1, i10, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.initException;
            if (runtimeException == null) {
                Error error = this.initError;
                if (error == null) {
                    return (DummySurface) Assertions.checkNotNull(this.surface);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void release() {
            Assertions.checkNotNull(this.handler);
            this.handler.sendEmptyMessage(2);
        }
    }

    private static void assertApiLevel17OrHigher() {
        if (Util.SDK_INT >= 17) {
        } else {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    private static int getSecureModeV24(Context context) {
        String eglQueryString;
        int i10 = Util.SDK_INT;
        if (i10 < 26 && (Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return 0;
        }
        if ((i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(EXTENSION_PROTECTED_CONTENT)) {
            return 0;
        }
        if (eglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT)) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        boolean z10;
        int secureModeV24;
        synchronized (DummySurface.class) {
            z10 = true;
            if (!secureModeInitialized) {
                if (Util.SDK_INT < 24) {
                    secureModeV24 = 0;
                } else {
                    secureModeV24 = getSecureModeV24(context);
                }
                secureMode = secureModeV24;
                secureModeInitialized = true;
            }
            if (secureMode == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public static DummySurface newInstanceV17(Context context, boolean z10) {
        boolean z11;
        assertApiLevel17OrHigher();
        int i10 = 0;
        if (z10 && !isSecureSupported(context)) {
            z11 = false;
        } else {
            z11 = true;
        }
        Assertions.checkState(z11);
        DummySurfaceThread dummySurfaceThread = new DummySurfaceThread();
        if (z10) {
            i10 = secureMode;
        }
        return dummySurfaceThread.init(i10);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                this.thread.release();
                this.threadReleased = true;
            }
        }
    }

    private DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.thread = dummySurfaceThread;
        this.secure = z10;
    }
}
