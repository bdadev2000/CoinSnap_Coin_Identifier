package o9;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import n9.h0;

/* loaded from: classes3.dex */
public final class k extends HandlerThread implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public n9.e f23225b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f23226c;

    /* renamed from: d, reason: collision with root package name */
    public Error f23227d;

    /* renamed from: f, reason: collision with root package name */
    public RuntimeException f23228f;

    /* renamed from: g, reason: collision with root package name */
    public l f23229g;

    public k() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final void a(int i10) {
        boolean z10;
        boolean z11;
        int[] iArr;
        boolean z12;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z13;
        this.f23225b.getClass();
        n9.e eVar = this.f23225b;
        eVar.getClass();
        boolean z14 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.bumptech.glide.c.k("eglGetDisplay failed", z10);
        int[] iArr3 = new int[2];
        com.bumptech.glide.c.k("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
        eVar.f22531d = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr4 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, n9.e.f22528i, 0, eGLConfigArr, 0, 1, iArr4, 0);
        if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        com.bumptech.glide.c.k(h0.k("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = eVar.f22531d;
        if (i10 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        com.bumptech.glide.c.k("eglCreateContext failed", z12);
        eVar.f22532f = eglCreateContext;
        EGLDisplay eGLDisplay2 = eVar.f22531d;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            com.bumptech.glide.c.k("eglCreatePbufferSurface failed", z13);
        }
        com.bumptech.glide.c.k("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        eVar.f22533g = eglCreatePbufferSurface;
        int[] iArr5 = eVar.f22530c;
        GLES20.glGenTextures(1, iArr5, 0);
        com.bumptech.glide.c.j();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
        eVar.f22534h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(eVar);
        SurfaceTexture surfaceTexture2 = this.f23225b.f22534h;
        surfaceTexture2.getClass();
        if (i10 != 0) {
            z14 = true;
        }
        this.f23229g = new l(this, surfaceTexture2, z14);
    }

    public final void b() {
        this.f23225b.getClass();
        n9.e eVar = this.f23225b;
        eVar.f22529b.removeCallbacks(eVar);
        try {
            SurfaceTexture surfaceTexture = eVar.f22534h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, eVar.f22530c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = eVar.f22531d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = eVar.f22531d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = eVar.f22533g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eVar.f22531d, eVar.f22533g);
            }
            EGLContext eGLContext = eVar.f22532f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eVar.f22531d, eGLContext);
            }
            if (h0.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = eVar.f22531d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(eVar.f22531d);
            }
            eVar.f22531d = null;
            eVar.f22532f = null;
            eVar.f22533g = null;
            eVar.f22534h = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                n9.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.f23227d = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e10) {
                n9.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f23228f = e10;
                synchronized (this) {
                    notify();
                }
            } catch (n9.i e11) {
                n9.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f23228f = new IllegalStateException(e11);
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
}
