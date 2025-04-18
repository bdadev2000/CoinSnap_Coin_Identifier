package xe;

import android.hardware.Camera;

/* loaded from: classes4.dex */
public final class i extends p {

    /* renamed from: e, reason: collision with root package name */
    public he.g f27645e;

    /* renamed from: f, reason: collision with root package name */
    public Camera f27646f;

    /* renamed from: g, reason: collision with root package name */
    public ze.a f27647g;

    /* renamed from: h, reason: collision with root package name */
    public int f27648h;

    public i(fe.k kVar, he.g gVar, Camera camera, ze.a aVar) {
        super(kVar, gVar);
        this.f27645e = gVar;
        this.f27646f = camera;
        this.f27647g = aVar;
        this.f27648h = camera.getParameters().getPreviewFormat();
    }

    @Override // k.d
    public final void m() {
        this.f27645e = null;
        this.f27646f = null;
        this.f27647g = null;
        this.f27648h = 0;
        super.m();
    }

    @Override // k.d
    public final void q() {
        this.f27646f.setOneShotPreviewCallback(new h(this));
    }
}
