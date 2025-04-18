package n9;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f22528i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    public final Handler f22529b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f22530c = new int[1];

    /* renamed from: d, reason: collision with root package name */
    public EGLDisplay f22531d;

    /* renamed from: f, reason: collision with root package name */
    public EGLContext f22532f;

    /* renamed from: g, reason: collision with root package name */
    public EGLSurface f22533g;

    /* renamed from: h, reason: collision with root package name */
    public SurfaceTexture f22534h;

    public e(Handler handler) {
        this.f22529b = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f22529b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f22534h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
