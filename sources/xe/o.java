package xe;

import android.opengl.GLSurfaceView;

/* loaded from: classes4.dex */
public class o extends p {

    /* renamed from: e, reason: collision with root package name */
    public final ye.h f27663e;

    /* renamed from: f, reason: collision with root package name */
    public ze.a f27664f;

    /* renamed from: g, reason: collision with root package name */
    public final we.b f27665g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27666h;

    /* renamed from: i, reason: collision with root package name */
    public we.c f27667i;

    /* renamed from: j, reason: collision with root package name */
    public te.d f27668j;

    public o(fe.k kVar, f fVar, ye.h hVar, ze.a aVar, we.b bVar) {
        super(kVar, fVar);
        boolean z10;
        this.f27663e = hVar;
        this.f27664f = aVar;
        this.f27665g = bVar;
        if (bVar != null) {
            if (((we.e) bVar).b(we.a.PICTURE_SNAPSHOT)) {
                z10 = true;
                this.f27666h = z10;
            }
        }
        z10 = false;
        this.f27666h = z10;
    }

    @Override // k.d
    public void m() {
        this.f27664f = null;
        super.m();
    }

    @Override // k.d
    public void q() {
        m mVar = new m(this);
        ye.g gVar = (ye.g) this.f27663e;
        ((GLSurfaceView) gVar.f28176b).queueEvent(new he.c(10, gVar, mVar));
    }
}
