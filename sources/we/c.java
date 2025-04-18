package we;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import w3.l;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final fe.c f26975g = new fe.c(c.class.getSimpleName());
    public final b a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceTexture f26976b;

    /* renamed from: c, reason: collision with root package name */
    public Surface f26977c;

    /* renamed from: e, reason: collision with root package name */
    public l f26979e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f26980f = new Object();

    /* renamed from: d, reason: collision with root package name */
    public te.d f26978d = new te.d();

    public c(b bVar, ze.b bVar2) {
        this.a = bVar;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f26978d.a.f2227b);
        this.f26976b = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(bVar2.f28749b, bVar2.f28750c);
        this.f26977c = new Surface(this.f26976b);
        this.f26979e = new l(this.f26978d.a.f2227b, 3);
    }
}
