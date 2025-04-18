package p9;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import com.facebook.r0;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlinx.serialization.json.internal.JsonLexerKt;
import n9.o;

/* loaded from: classes3.dex */
public final class j implements GLSurfaceView.Renderer, c {

    /* renamed from: b, reason: collision with root package name */
    public final i f23532b;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f23535f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f23536g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f23537h;

    /* renamed from: i, reason: collision with root package name */
    public float f23538i;

    /* renamed from: j, reason: collision with root package name */
    public float f23539j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f23542m;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f23533c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f23534d = new float[16];

    /* renamed from: k, reason: collision with root package name */
    public final float[] f23540k = new float[16];

    /* renamed from: l, reason: collision with root package name */
    public final float[] f23541l = new float[16];

    public j(k kVar, i iVar) {
        this.f23542m = kVar;
        float[] fArr = new float[16];
        this.f23535f = fArr;
        float[] fArr2 = new float[16];
        this.f23536g = fArr2;
        float[] fArr3 = new float[16];
        this.f23537h = fArr3;
        this.f23532b = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f23539j = 3.1415927f;
    }

    @Override // p9.c
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f23535f;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.f23539j = f11;
        Matrix.setRotateM(this.f23536g, 0, -this.f23538i, (float) Math.cos(f11), (float) Math.sin(this.f23539j), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object f10;
        Object f11;
        Object f12;
        float[] fArr2;
        synchronized (this) {
            Matrix.multiplyMM(this.f23541l, 0, this.f23535f, 0, this.f23537h, 0);
            Matrix.multiplyMM(this.f23540k, 0, this.f23536g, 0, this.f23541l, 0);
        }
        Matrix.multiplyMM(this.f23534d, 0, this.f23533c, 0, this.f23540k, 0);
        i iVar = this.f23532b;
        float[] fArr3 = this.f23534d;
        iVar.getClass();
        GLES20.glClear(JsonLexerKt.BATCH_SIZE);
        try {
            com.bumptech.glide.c.j();
        } catch (n9.i e2) {
            o.d("SceneRenderer", "Failed to draw a frame", e2);
        }
        if (iVar.f23519b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.f23528l;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                com.bumptech.glide.c.j();
            } catch (n9.i e10) {
                o.d("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (iVar.f23520c.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.f23525i, 0);
            }
            long timestamp = iVar.f23528l.getTimestamp();
            androidx.activity.result.i iVar2 = iVar.f23523g;
            synchronized (iVar2) {
                f10 = iVar2.f(timestamp, false);
            }
            Long l10 = (Long) f10;
            if (l10 != null) {
                h3.a aVar = iVar.f23522f;
                float[] fArr4 = iVar.f23525i;
                long longValue = l10.longValue();
                androidx.activity.result.i iVar3 = (androidx.activity.result.i) aVar.f18725g;
                synchronized (iVar3) {
                    f12 = iVar3.f(longValue, true);
                }
                float[] fArr5 = (float[]) f12;
                if (fArr5 != null) {
                    float[] fArr6 = (float[]) aVar.f18724f;
                    float f13 = fArr5[0];
                    float f14 = -fArr5[1];
                    float f15 = -fArr5[2];
                    float length = Matrix.length(f13, f14, f15);
                    if (length != 0.0f) {
                        fArr2 = fArr4;
                        Matrix.setRotateM(fArr6, 0, (float) Math.toDegrees(length), f13 / length, f14 / length, f15 / length);
                    } else {
                        fArr2 = fArr4;
                        Matrix.setIdentityM(fArr6, 0);
                    }
                    boolean z10 = aVar.f18722c;
                    Object obj = aVar.f18723d;
                    if (!z10) {
                        h3.a.d((float[]) obj, (float[]) aVar.f18724f);
                        aVar.f18722c = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) obj, 0, (float[]) aVar.f18724f, 0);
                }
            }
            androidx.activity.result.i iVar4 = iVar.f23524h;
            synchronized (iVar4) {
                f11 = iVar4.f(timestamp, true);
            }
            f fVar = (f) f11;
            if (fVar != null) {
                g gVar = iVar.f23521d;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.a = fVar.f23506c;
                    gVar.f23511b = new androidx.activity.result.i(fVar.a.a[0]);
                    if (!fVar.f23507d) {
                        new androidx.activity.result.i(fVar.f23505b.a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.f23526j, 0, fArr3, 0, iVar.f23525i, 0);
        g gVar2 = iVar.f23521d;
        int i10 = iVar.f23527k;
        float[] fArr7 = iVar.f23526j;
        androidx.activity.result.i iVar5 = gVar2.f23511b;
        if (iVar5 != null) {
            int i11 = gVar2.a;
            if (i11 == 1) {
                fArr = g.f23509j;
            } else if (i11 == 2) {
                fArr = g.f23510k;
            } else {
                fArr = g.f23508i;
            }
            GLES20.glUniformMatrix3fv(gVar2.f23514e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(gVar2.f23513d, 1, false, fArr7, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(gVar2.f23517h, 0);
            try {
                com.bumptech.glide.c.j();
            } catch (n9.i e11) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
            }
            GLES20.glVertexAttribPointer(gVar2.f23515f, 3, 5126, false, 12, (Buffer) iVar5.f610d);
            try {
                com.bumptech.glide.c.j();
            } catch (n9.i e12) {
                Log.e("ProjectionRenderer", "Failed to load position data", e12);
            }
            GLES20.glVertexAttribPointer(gVar2.f23516g, 2, 5126, false, 8, (Buffer) iVar5.f611f);
            try {
                com.bumptech.glide.c.j();
            } catch (n9.i e13) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e13);
            }
            GLES20.glDrawArrays(iVar5.f609c, 0, iVar5.f608b);
            try {
                com.bumptech.glide.c.j();
            } catch (n9.i e14) {
                Log.e("ProjectionRenderer", "Failed to render", e14);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f10;
        boolean z10 = false;
        GLES20.glViewport(0, 0, i10, i11);
        float f11 = i10 / i11;
        if (f11 > 1.0f) {
            z10 = true;
        }
        if (z10) {
            f10 = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f11)) * 2.0d);
        } else {
            f10 = 90.0f;
        }
        Matrix.perspectiveM(this.f23533c, 0, f10, f11, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.f23542m;
        kVar.f23548g.post(new r0(24, kVar, this.f23532b.d()));
    }
}
