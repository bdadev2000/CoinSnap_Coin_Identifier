package ye;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import j2.r;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import xe.m;
import xe.n;
import xe.o;

/* loaded from: classes4.dex */
public final class f implements GLSurfaceView.Renderer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f28187b;

    public f(g gVar) {
        this.f28187b = gVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        g gVar = this.f28187b;
        SurfaceTexture surfaceTexture = gVar.f28189k;
        if (surfaceTexture != null && gVar.f28180f > 0 && gVar.f28181g > 0) {
            float[] fArr = gVar.f28190l.f25381b;
            surfaceTexture.updateTexImage();
            gVar.f28189k.getTransformMatrix(fArr);
            if (gVar.f28182h != 0) {
                Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                Matrix.rotateM(fArr, 0, gVar.f28182h, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
            }
            if (gVar.f28177c) {
                Matrix.translateM(fArr, 0, (1.0f - gVar.f28192n) / 2.0f, (1.0f - gVar.f28193o) / 2.0f, 0.0f);
                Matrix.scaleM(fArr, 0, gVar.f28192n, gVar.f28193o, 1.0f);
            }
            te.d dVar = gVar.f28190l;
            long timestamp = gVar.f28189k.getTimestamp() / 1000;
            dVar.a();
            Iterator it = gVar.f28191m.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                SurfaceTexture surfaceTexture2 = gVar.f28189k;
                int i10 = gVar.f28182h;
                float f10 = gVar.f28192n;
                float f11 = gVar.f28193o;
                o oVar = mVar.a;
                ((g) oVar.f27663e).f28191m.remove(mVar);
                te.i.a("FallbackCameraThread").f25394c.post(new n(oVar, surfaceTexture2, i10, f10, f11, EGL14.eglGetCurrentContext()));
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        gl10.glViewport(0, 0, i10, i11);
        g gVar = this.f28187b;
        qe.b bVar = (qe.b) gVar.f28195q;
        bVar.getClass();
        bVar.f23899c = new ze.b(i10, i11);
        if (!gVar.f28188j) {
            gVar.b(i10, i11);
            gVar.f28188j = true;
        } else if (i10 != gVar.f28178d || i11 != gVar.f28179e) {
            gVar.c(i10, i11);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        g gVar = this.f28187b;
        if (gVar.f28195q == null) {
            gVar.f28195q = new qe.b();
        }
        gVar.f28190l = new te.d();
        te.d dVar = gVar.f28190l;
        dVar.f25383d = gVar.f28195q;
        int i10 = dVar.a.f2227b;
        gVar.f28189k = new SurfaceTexture(i10);
        ((GLSurfaceView) gVar.f28176b).queueEvent(new r(i10, 6, this));
        gVar.f28189k.setOnFrameAvailableListener(new e(this));
    }
}
