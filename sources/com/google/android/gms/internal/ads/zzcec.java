package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes2.dex */
public final class zzcec extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcea {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzceb zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    public zzcec(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.zzc = new float[9];
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzg = new float[9];
        this.zzh = new float[9];
        this.zzi = new float[9];
        this.zzj = Float.NaN;
        zzceb zzcebVar = new zzceb(context);
        this.zzb = zzcebVar;
        zzcebVar.zzb(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    private static final void zzh(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f9 = fArr2[0] * fArr3[0];
        float f10 = fArr2[1];
        float f11 = fArr3[3];
        float f12 = fArr2[2];
        float f13 = fArr3[6];
        fArr[0] = f9 + (f10 * f11) + (f12 * f13);
        float f14 = fArr2[0];
        float f15 = fArr3[1] * f14;
        float f16 = fArr3[4];
        float f17 = fArr3[7];
        fArr[1] = f15 + (f10 * f16) + (f12 * f17);
        float f18 = f14 * fArr3[2];
        float f19 = fArr2[1];
        float f20 = fArr3[5];
        float f21 = fArr3[8];
        fArr[2] = f18 + (f19 * f20) + (f12 * f21);
        float f22 = fArr2[3];
        float f23 = fArr3[0];
        float f24 = fArr2[4];
        float f25 = fArr2[5];
        fArr[3] = (f22 * f23) + (f11 * f24) + (f25 * f13);
        float f26 = fArr2[3];
        float f27 = fArr3[1];
        fArr[4] = (f26 * f27) + (f24 * f16) + (f25 * f17);
        float f28 = fArr3[2];
        fArr[5] = (f26 * f28) + (fArr2[4] * f20) + (f25 * f21);
        float f29 = fArr2[6] * f23;
        float f30 = fArr2[7];
        float f31 = fArr3[3] * f30;
        float f32 = fArr2[8];
        fArr[6] = f29 + f31 + (f13 * f32);
        float f33 = fArr2[6];
        float f34 = f17 * f32;
        fArr[7] = f34 + (f30 * fArr3[4]) + (f27 * f33);
        fArr[8] = (f33 * f28) + (fArr2[7] * fArr3[5]) + (f32 * f21);
    }

    private static final void zzj(float[] fArr, float f9) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = f9;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    private static final void zzk(float[] fArr, float f9) {
        double d2 = f9;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i9, String str) {
        int glCreateShader = GLES20.glCreateShader(i9);
        zzh("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzh("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i9 + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzs++;
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a6  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcec.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zza() {
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    @Nullable
    public final SurfaceTexture zzb() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzc(int i9, int i10) {
        synchronized (this.zzv) {
            this.zzn = i9;
            this.zzm = i10;
            this.zzA = true;
            this.zzv.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int i9, int i10) {
        this.zzn = i9;
        this.zzm = i10;
        this.zzp = surfaceTexture;
    }

    public final void zze() {
        synchronized (this.zzv) {
            this.zzB = true;
            this.zzp = null;
            this.zzv.notifyAll();
        }
    }

    public final void zzf(float f9, float f10) {
        int i9 = this.zzn;
        int i10 = this.zzm;
        if (i9 <= i10) {
            i9 = i10;
        }
        float f11 = i9;
        this.zzk -= (f9 * 1.7453293f) / f11;
        float f12 = this.zzl - ((f10 * 1.7453293f) / f11);
        this.zzl = f12;
        if (f12 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f12 = -1.5707964f;
        }
        if (f12 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    public final boolean zzg() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.zzz;
        boolean z8 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z8 = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            z8 |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay != null) {
            boolean eglTerminate = this.zzw.eglTerminate(eGLDisplay) | z8;
            this.zzx = null;
            return eglTerminate;
        }
        return z8;
    }
}
