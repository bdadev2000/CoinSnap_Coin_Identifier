package xe;

import android.hardware.Camera;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: e, reason: collision with root package name */
    public final Camera f27632e;

    /* renamed from: f, reason: collision with root package name */
    public final he.g f27633f;

    public c(fe.k kVar, he.g gVar, Camera camera) {
        super(kVar, gVar);
        this.f27633f = gVar;
        this.f27632e = camera;
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRotation(((fe.k) this.a).f17852b);
        camera.setParameters(parameters);
    }

    @Override // k.d
    public final void m() {
        e.f27639d.a(1, "dispatching result. Thread:", Thread.currentThread());
        super.m();
    }

    @Override // k.d
    public final void q() {
        fe.c cVar = e.f27639d;
        cVar.a(1, "take() called.");
        Camera camera = this.f27632e;
        camera.setPreviewCallbackWithBuffer(null);
        this.f27633f.K().c();
        try {
            camera.takePicture(new a(this), null, null, new b(this));
            cVar.a(1, "take() returned.");
        } catch (Exception e2) {
            this.f20055c = e2;
            m();
        }
    }
}
