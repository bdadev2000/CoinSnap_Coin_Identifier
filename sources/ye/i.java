package ye;

import android.view.SurfaceHolder;
import he.a0;

/* loaded from: classes4.dex */
public final class i implements SurfaceHolder.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f28196b;

    public i(j jVar) {
        this.f28196b = jVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        fe.c cVar = j.f28197l;
        j jVar = this.f28196b;
        cVar.a(1, "callback:", "surfaceChanged", "w:", Integer.valueOf(i11), "h:", Integer.valueOf(i12), "dispatched:", Boolean.valueOf(jVar.f28198j));
        if (!jVar.f28198j) {
            jVar.b(i11, i12);
            jVar.f28198j = true;
        } else {
            jVar.c(i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j.f28197l.a(1, "callback: surfaceCreated.");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j.f28197l.a(1, "callback: surfaceDestroyed");
        j jVar = this.f28196b;
        jVar.f28178d = 0;
        jVar.f28179e = 0;
        a aVar = jVar.a;
        if (aVar != null) {
            a0 a0Var = (a0) aVar;
            a0.f19026e.a(1, "onSurfaceDestroyed");
            a0Var.H(false);
            a0Var.G(false);
        }
        jVar.f28198j = false;
    }
}
