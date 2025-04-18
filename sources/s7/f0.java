package s7;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes3.dex */
public final class f0 implements o9.y, a9.n, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, d, r2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f24350b;

    public f0(i0 i0Var) {
        this.f24350b = i0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        i0 i0Var = this.f24350b;
        i0Var.getClass();
        Surface surface = new Surface(surfaceTexture);
        i0Var.N(surface);
        i0Var.P = surface;
        i0Var.F(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.f24350b;
        i0Var.N(null);
        i0Var.F(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f24350b.F(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f24350b.F(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.f24350b;
        if (i0Var.S) {
            i0Var.N(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.f24350b;
        if (i0Var.S) {
            i0Var.N(null);
        }
        i0Var.F(0, 0);
    }
}
