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
    private static final int[] f8821h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    private final Handler f8822a;
    private final int[] b;

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f8823c;

    /* renamed from: d, reason: collision with root package name */
    private EGLContext f8824d;

    /* renamed from: f, reason: collision with root package name */
    private EGLSurface f8825f;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceTexture f8826g;

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
        return (SurfaceTexture) AbstractC0669a1.a(this.f8826g);
    }

    public void d() {
        this.f8822a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f8826g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f8823c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f8823c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f8825f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f8823c, this.f8825f);
            }
            EGLContext eGLContext = this.f8824d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f8823c, eGLContext);
            }
            if (yp.f12451a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f8823c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f8823c);
            }
            this.f8823c = null;
            this.f8824d = null;
            this.f8825f = null;
            this.f8826g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8822a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
        SurfaceTexture surfaceTexture = this.f8826g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public l7(Handler handler, c cVar) {
        this.f8822a = handler;
        this.b = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f8821h, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new b(yp.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i9) {
        int[] iArr;
        if (i9 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i9) {
        int[] iArr;
        EGLSurface eglCreatePbufferSurface;
        if (i9 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i9 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
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

    public void a(int i9) {
        EGLDisplay b8 = b();
        this.f8823c = b8;
        EGLConfig a6 = a(b8);
        EGLContext a9 = a(this.f8823c, a6, i9);
        this.f8824d = a9;
        this.f8825f = a(this.f8823c, a6, a9, i9);
        a(this.b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.b[0]);
        this.f8826g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }
}
