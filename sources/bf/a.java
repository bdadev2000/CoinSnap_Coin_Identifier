package bf;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import df.d;
import df.e;

/* loaded from: classes4.dex */
public final class a extends b {
    public a(EGLContext eGLContext) {
        super(new df.b(eGLContext));
    }

    public final void a() {
        df.c cVar = this.a;
        df.c cVar2 = d.f17003b;
        if (cVar != cVar2) {
            e eVar = d.f17004c;
            df.b bVar = d.a;
            EGLDisplay eGLDisplay = cVar.a;
            EGLSurface eGLSurface = eVar.a;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.a);
            EGL14.eglDestroyContext(this.a.a, this.f2429b.a);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.a.a);
        }
        this.a = cVar2;
        this.f2429b = d.a;
        this.f2430c = null;
    }

    public final void finalize() {
        a();
    }
}
