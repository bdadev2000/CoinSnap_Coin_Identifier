package ye;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;

/* loaded from: classes4.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f28186b;

    public e(f fVar) {
        this.f28186b = fVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((GLSurfaceView) this.f28186b.f28187b.f28176b).requestRender();
    }
}
