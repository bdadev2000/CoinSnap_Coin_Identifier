package q5;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class f implements SurfaceHolder.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f23689b;

    public f(SurfaceHolder.Callback callback) {
        this.f23689b = new WeakReference(callback);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f23689b.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i10, i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f23689b.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f23689b.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
