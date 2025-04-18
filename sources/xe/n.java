package xe;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import java.io.ByteArrayOutputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f27657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f27659d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f27660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EGLContext f27661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f27662h;

    public n(o oVar, SurfaceTexture surfaceTexture, int i10, float f10, float f11, EGLContext eGLContext) {
        this.f27662h = oVar;
        this.f27657b = surfaceTexture;
        this.f27658c = i10;
        this.f27659d = f10;
        this.f27660f = f11;
        this.f27661g = eGLContext;
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [te.d, android.graphics.SurfaceTexture, android.view.Surface] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r32;
        Canvas lockCanvas;
        o oVar = this.f27662h;
        SurfaceTexture surfaceTexture = this.f27657b;
        int i10 = this.f27658c;
        float f10 = this.f27659d;
        float f11 = this.f27660f;
        EGLContext eGLContext = this.f27661g;
        oVar.getClass();
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(9999);
        ze.b bVar = ((fe.k) oVar.a).f17853c;
        surfaceTexture2.setDefaultBufferSize(bVar.f28749b, bVar.f28750c);
        bf.a aVar = new bf.a(eGLContext);
        ff.c cVar = new ff.c(aVar, surfaceTexture2);
        df.e eglSurface = cVar.f17857b;
        bf.a aVar2 = cVar.a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        if (aVar2.a == df.d.f17003b) {
            Log.v("EglCore", "NOTE: makeSurfaceCurrent w/o display");
        }
        df.c cVar2 = aVar2.a;
        df.b bVar2 = aVar2.f2429b;
        EGLDisplay eGLDisplay = cVar2.a;
        EGLSurface eGLSurface = eglSurface.a;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar2.a)) {
            float[] fArr = oVar.f27668j.f25381b;
            surfaceTexture.getTransformMatrix(fArr);
            Matrix.translateM(fArr, 0, (1.0f - f10) / 2.0f, (1.0f - f11) / 2.0f, 0.0f);
            Matrix.scaleM(fArr, 0, f10, f11, 1.0f);
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr, 0, i10 + ((fe.k) oVar.a).f17852b, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
            if (oVar.f27666h) {
                we.c cVar3 = oVar.f27667i;
                we.a aVar3 = we.a.PICTURE_SNAPSHOT;
                cVar3.getClass();
                try {
                    if (((we.e) cVar3.a).getHardwareCanvasEnabled()) {
                        lockCanvas = cVar3.f26977c.lockHardwareCanvas();
                    } else {
                        lockCanvas = cVar3.f26977c.lockCanvas(null);
                    }
                    lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    ((we.e) cVar3.a).a(aVar3, lockCanvas);
                    cVar3.f26977c.unlockCanvasAndPost(lockCanvas);
                } catch (Surface.OutOfResourcesException e2) {
                    we.c.f26975g.a(2, "Got Surface.OutOfResourcesException while drawing video overlays", e2);
                }
                synchronized (cVar3.f26980f) {
                    GLES20.glBindTexture(36197, cVar3.f26979e.f26711c);
                    cVar3.f26976b.updateTexImage();
                }
                cVar3.f26976b.getTransformMatrix(cVar3.f26978d.f25381b);
                Matrix.translateM(oVar.f27667i.f26978d.f25381b, 0, 0.5f, 0.5f, 0.0f);
                Matrix.rotateM(oVar.f27667i.f26978d.f25381b, 0, ((fe.k) oVar.a).f17852b, 0.0f, 0.0f, 1.0f);
                Matrix.scaleM(oVar.f27667i.f26978d.f25381b, 0, 1.0f, -1.0f, 1.0f);
                Matrix.translateM(oVar.f27667i.f26978d.f25381b, 0, -0.5f, -0.5f, 0.0f);
            }
            ((fe.k) oVar.a).f17852b = 0;
            p.f27669d.a(1, "takeFrame:", "timestampUs:", Long.valueOf(surfaceTexture.getTimestamp() / 1000));
            oVar.f27668j.a();
            if (oVar.f27666h) {
                we.c cVar4 = oVar.f27667i;
                cVar4.getClass();
                GLES20.glDisable(2884);
                GLES20.glDisable(2929);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                synchronized (cVar4.f26980f) {
                    cVar4.f26978d.a();
                }
            }
            fe.k kVar = (fe.k) oVar.a;
            Bitmap.CompressFormat format = Bitmap.CompressFormat.JPEG;
            Intrinsics.checkNotNullParameter(format, "format");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                cVar.a(byteArrayOutputStream, format);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                kVar.f17854d = byteArray;
                df.e eglSurface2 = cVar.f17857b;
                bf.a aVar4 = cVar.a;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(eglSurface2, "eglSurface");
                EGL14.eglDestroySurface(aVar4.a.a, eglSurface2.a);
                cVar.f17857b = df.d.f17004c;
                cVar.f17859d = -1;
                cVar.f17858c = -1;
                oVar.f27668j.b();
                surfaceTexture2.release();
                if (oVar.f27666h) {
                    we.c cVar5 = oVar.f27667i;
                    if (cVar5.f26979e != null) {
                        GLES20.glBindTexture(36197, 0);
                        r32 = 0;
                        cVar5.f26979e = null;
                    } else {
                        r32 = 0;
                    }
                    SurfaceTexture surfaceTexture3 = cVar5.f26976b;
                    if (surfaceTexture3 != null) {
                        surfaceTexture3.release();
                        cVar5.f26976b = r32;
                    }
                    Surface surface = cVar5.f26977c;
                    if (surface != null) {
                        surface.release();
                        cVar5.f26977c = r32;
                    }
                    te.d dVar = cVar5.f26978d;
                    if (dVar != null) {
                        dVar.b();
                        cVar5.f26978d = r32;
                    }
                }
                aVar.a();
                oVar.m();
            } finally {
            }
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }
}
