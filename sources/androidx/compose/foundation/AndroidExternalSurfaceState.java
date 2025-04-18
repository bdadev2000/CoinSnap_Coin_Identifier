package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;

/* loaded from: classes4.dex */
final class AndroidExternalSurfaceState extends BaseAndroidExternalSurfaceState implements SurfaceHolder.Callback {

    /* renamed from: b, reason: collision with root package name */
    public int f2461b;

    /* renamed from: c, reason: collision with root package name */
    public int f2462c;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        if (this.f2461b == i3 && this.f2462c == i4) {
            return;
        }
        this.f2461b = i3;
        this.f2462c = i4;
        surfaceHolder.getSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.f2461b = surfaceFrame.width();
        this.f2462c = surfaceFrame.height();
        surfaceHolder.getSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getSurface();
    }
}
