package ye;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import he.a0;

/* loaded from: classes4.dex */
public final class k implements TextureView.SurfaceTextureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f28200b;

    public k(l lVar) {
        this.f28200b = lVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f28200b.b(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l lVar = this.f28200b;
        lVar.f28178d = 0;
        lVar.f28179e = 0;
        a aVar = lVar.a;
        if (aVar != null) {
            a0 a0Var = (a0) aVar;
            a0.f19026e.a(1, "onSurfaceDestroyed");
            a0Var.H(false);
            a0Var.G(false);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f28200b.c(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
