package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* loaded from: classes.dex */
public final class l7 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f5854h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final Handler a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f5855b;

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f5856c;

    /* renamed from: d, reason: collision with root package name */
    private EGLContext f5857d;

    /* renamed from: f, reason: collision with root package name */
    private EGLSurface f5858f;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceTexture f5859g;

    /* loaded from: classes.dex */
    public static final class b extends RuntimeException {
        private b(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public l7(Handler handler) {
        this(handler, null);
    }

    private void a() {
    }

    private static EGLDisplay b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new b("eglInitialize failed");
        }
        throw new b("eglGetDisplay failed");
    }

    public SurfaceTexture c() {
        return (SurfaceTexture) a1.a(this.f5859g);
    }

    public void d() {
        this.a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f5859g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f5855b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f5856c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f5856c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f5858f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f5856c, this.f5858f);
            }
            EGLContext eGLContext = this.f5857d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f5856c, eGLContext);
            }
            if (yp.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f5856c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f5856c);
            }
            this.f5856c = null;
            this.f5857d = null;
            this.f5858f = null;
            this.f5859g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
        SurfaceTexture surfaceTexture = this.f5859g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public l7(Handler handler, c cVar) {
        this.a = handler;
        this.f5855b = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f5854h, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new b(yp.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        z9.a();
    }

    public void a(int i10) {
        EGLDisplay b3 = b();
        this.f5856c = b3;
        EGLConfig a10 = a(b3);
        EGLContext a11 = a(this.f5856c, a10, i10);
        this.f5857d = a11;
        this.f5858f = a(this.f5856c, a10, a11, i10);
        a(this.f5855b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f5855b[0]);
        this.f5859g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }
}
