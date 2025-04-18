package com.facebook.ads.redexgen.uinode;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0636Hk implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static String[] A07 = {"5TSO5lr", "Uiq36pf0DX0u", "dNHqZ55iPnem4y3dhzVH4NhC", "DOJEdaaUqp1LV7wfBlv79qDRQsxW0GTY", "guLhPKZ6AS5yiDivKc9wkx6W", "v4VlaWQwn4OHm3pLjlth", "v4A3PsxLBQ1NNAoAwErdhJ5LwmF6", "7Ce6kiHf90JXyVCEwcuj9iqZ78CWnN5B"};
    public static final int[] A08;
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{4, 6, Ascii.VT, -30, 7, Ascii.SO, Ascii.SO, Ascii.DC2, 4, -30, Ascii.SO, Ascii.CR, 5, 8, 6, -65, 5, 0, 8, Ascii.VT, 4, 3, -39, -65, Ascii.DC2, Ascii.DC4, 2, 2, 4, Ascii.DC2, Ascii.DC2, -36, -60, 1, -53, -65, Ascii.CR, Ascii.DC4, Ascii.FF, -30, Ascii.SO, Ascii.CR, 5, 8, 6, Ascii.DC2, -6, -49, -4, -36, -60, 3, -53, -65, 2, Ascii.SO, Ascii.CR, 5, 8, 6, Ascii.DC2, -6, -49, -4, -36, -60, Ascii.DC2, 0, 2, 7, -34, Ascii.CR, 0, -4, Ascii.SI, 0, -34, 10, 9, Ascii.SI, 0, 19, Ascii.SI, -69, 1, -4, 4, 7, 0, -1, 50, 52, 57, Ascii.DLE, 63, 50, 46, 65, 50, Ascii.GS, 47, 66, 51, 51, 50, 63, 32, 66, 63, 51, 46, 48, 50, -19, 51, 46, 54, 57, 50, 49, 39, 41, 46, 9, 39, 54, 6, 43, 53, 50, 46, 35, 59, -30, 40, 35, 43, 46, 39, 38, 7, 9, Ascii.SO, -21, Ascii.DLE, Ascii.VT, Ascii.SYN, Ascii.VT, 3, Ascii.SO, Ascii.VT, Ascii.FS, 7, -62, 8, 3, Ascii.VT, Ascii.SO, 7, 6, Ascii.ETB, Ascii.EM, Ascii.RS, -1, 19, Ascii.GS, Ascii.ETB, -11, 39, 36, 36, Ascii.ETB, 32, 38, -46, Ascii.CAN, 19, Ascii.ESC, Ascii.RS, Ascii.ETB, Ascii.SYN, -35, -30, -67, -37, -28, -54, -37, -18, -22, -21, -24, -37, -23, -106, -36, -41, -33, -30, -37, -38, -92, -106, -69, -24, -24, -27, -24, -80, -106};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public RunnableC0636Hk(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, A08, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new C0634Hi(IF.A0P(A04(0, 67, 61), Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        int[] iArr;
        if (i10 != 0) {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        } else {
            iArr = new int[]{12440, 2, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C0634Hi(A04(67, 23, 57));
    }

    public static EGLDisplay A02() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new C0634Hi(A04(120, 20, 96));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new C0634Hi(A04(140, 20, 64));
        }
        return eglGetDisplay;
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        int[] iArr;
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                String[] strArr = A07;
                if (strArr[2].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[5] = "50bPomhroWylyyFBvpVs";
                strArr2[0] = "L3rJnP7";
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eglCreatePbufferSurface == null) {
                throw new C0634Hi(A04(90, 30, 107));
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            throw new C0634Hi(A04(160, 21, 80));
        }
        return eglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
        } else {
            throw new C0634Hi(A04(181, 29, 20) + Integer.toHexString(glGetError));
        }
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) AbstractC0626Ha.A01(this.A00);
    }

    public final void A08() {
        EGLSurface eGLSurface;
        boolean equals;
        EGLSurface eGLSurface2;
        this.A04.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.A00;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
            EGLDisplay eGLDisplay = this.A02;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            eGLSurface2 = this.A03;
        } finally {
            if (eGLSurface != null) {
                if (!equals) {
                    throw new RuntimeException();
                }
            }
        }
        if (eGLSurface2 != null) {
            EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
            String[] strArr = A07;
            if (strArr[2].length() == strArr[4].length()) {
                String[] strArr2 = A07;
                strArr2[6] = "8PllVlNdMAAu4TKgTKAS29fkCg54";
                strArr2[1] = "Tgpvj88vDtzw";
                if (!eGLSurface2.equals(eGLSurface3)) {
                    EGL14.eglDestroySurface(this.A02, this.A03);
                }
            }
            throw new RuntimeException();
        }
        EGLContext eGLContext = this.A01;
        if (eGLContext != null) {
            EGL14.eglDestroyContext(this.A02, eGLContext);
        }
        if (IF.A02 >= 19) {
            EGL14.eglReleaseThread();
        }
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        this.A00 = null;
    }

    public final void A09(int i10) {
        EGLDisplay A02 = A02();
        this.A02 = A02;
        EGLConfig A00 = A00(A02);
        EGLContext A01 = A01(this.A02, A00, i10);
        this.A01 = A01;
        this.A03 = A03(this.A02, A00, A01, i10);
        A06(this.A05);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.A05[0]);
        this.A00 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            SurfaceTexture surfaceTexture = this.A00;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
