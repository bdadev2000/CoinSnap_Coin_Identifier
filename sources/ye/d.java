package ye;

import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import he.a0;

/* loaded from: classes4.dex */
public final class d implements SurfaceHolder.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GLSurfaceView f28183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f28184c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f28185d;

    public d(g gVar, GLSurfaceView gLSurfaceView, f fVar) {
        this.f28185d = gVar;
        this.f28183b = gLSurfaceView;
        this.f28184c = fVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        g gVar = this.f28185d;
        gVar.f28178d = 0;
        gVar.f28179e = 0;
        a aVar = gVar.a;
        int i10 = 1;
        if (aVar != null) {
            a0 a0Var = (a0) aVar;
            a0.f19026e.a(1, "onSurfaceDestroyed");
            a0Var.H(false);
            a0Var.G(false);
        }
        this.f28183b.queueEvent(new pe.a(this, i10));
        gVar.f28188j = false;
    }
}
