package bf;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import df.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {
    public df.c a;

    /* renamed from: b, reason: collision with root package name */
    public df.b f2429b;

    /* renamed from: c, reason: collision with root package name */
    public df.a f2430c;

    public b(df.b sharedContext) {
        boolean z10;
        Intrinsics.checkNotNullParameter(sharedContext, "sharedContext");
        df.c cVar = d.f17003b;
        this.a = cVar;
        df.b bVar = d.a;
        this.f2429b = bVar;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        df.c cVar2 = new df.c(eglGetDisplay);
        this.a = cVar2;
        if (cVar2 != cVar) {
            if (EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0)) {
                if (this.f2429b == bVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    df.a g10 = mi.a.g(this.a, 2, true);
                    if (g10 != null) {
                        df.b bVar2 = new df.b(EGL14.eglCreateContext(this.a.a, g10.a, sharedContext.a, new int[]{d.f17010i, 2, d.f17006e}, 0));
                        c.a("eglCreateContext (2)");
                        this.f2430c = g10;
                        this.f2429b = bVar2;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                return;
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }
}
