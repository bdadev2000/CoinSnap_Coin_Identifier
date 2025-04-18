package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.ui.unit.IntSize;
import b1.d0;
import p0.a;

/* loaded from: classes4.dex */
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {

    /* renamed from: b, reason: collision with root package name */
    public long f2459b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f2460c;
    public Surface d;

    public AndroidEmbeddedExternalSurfaceState(d0 d0Var) {
        super(d0Var);
        this.f2459b = 0L;
        this.f2460c = new Matrix();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (!IntSize.b(this.f2459b, 0L)) {
            long j2 = this.f2459b;
            surfaceTexture.setDefaultBufferSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        this.d = new Surface(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a.p(this.d);
        this.d = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (!IntSize.b(this.f2459b, 0L)) {
            long j2 = this.f2459b;
            surfaceTexture.setDefaultBufferSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        a.p(this.d);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
