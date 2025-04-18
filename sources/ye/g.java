package ye;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.plantcare.ai.identifier.plantid.R;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public final class g extends b implements c, h {

    /* renamed from: j, reason: collision with root package name */
    public boolean f28188j;

    /* renamed from: k, reason: collision with root package name */
    public SurfaceTexture f28189k;

    /* renamed from: l, reason: collision with root package name */
    public te.d f28190l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f28191m;

    /* renamed from: n, reason: collision with root package name */
    public float f28192n;

    /* renamed from: o, reason: collision with root package name */
    public float f28193o;

    /* renamed from: p, reason: collision with root package name */
    public ViewGroup f28194p;

    /* renamed from: q, reason: collision with root package name */
    public qe.a f28195q;

    public g(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
        this.f28191m = new CopyOnWriteArraySet();
        this.f28192n = 1.0f;
        this.f28193o = 1.0f;
    }

    @Override // ye.b
    public final void a() {
        int i10;
        int i11;
        float c10;
        float f10;
        boolean z10;
        if (this.f28180f > 0 && this.f28181g > 0 && (i10 = this.f28178d) > 0 && (i11 = this.f28179e) > 0) {
            ze.a a = ze.a.a(i10, i11);
            ze.a a10 = ze.a.a(this.f28180f, this.f28181g);
            if (a.c() >= a10.c()) {
                f10 = a.c() / a10.c();
                c10 = 1.0f;
            } else {
                c10 = a10.c() / a.c();
                f10 = 1.0f;
            }
            if (c10 <= 1.02f && f10 <= 1.02f) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f28177c = z10;
            this.f28192n = 1.0f / c10;
            this.f28193o = 1.0f / f10;
            ((GLSurfaceView) this.f28176b).requestRender();
        }
    }

    @Override // ye.b
    public final Object d() {
        return this.f28189k;
    }

    @Override // ye.b
    public final Class e() {
        return SurfaceTexture.class;
    }

    @Override // ye.b
    public final View f() {
        return this.f28194p;
    }

    @Override // ye.b
    public final View g(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.cameraview_gl_view, viewGroup, false);
        GLSurfaceView gLSurfaceView = (GLSurfaceView) viewGroup2.findViewById(R.id.gl_surface_view);
        f fVar = new f(this);
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(fVar);
        gLSurfaceView.setRenderMode(0);
        gLSurfaceView.getHolder().addCallback(new d(this, gLSurfaceView, fVar));
        viewGroup.addView(viewGroup2, 0);
        this.f28194p = viewGroup2;
        return gLSurfaceView;
    }

    @Override // ye.b
    public final void h() {
        super.h();
        this.f28191m.clear();
    }

    @Override // ye.b
    public final void i() {
        ((GLSurfaceView) this.f28176b).onPause();
    }

    @Override // ye.b
    public final void j() {
        ((GLSurfaceView) this.f28176b).onResume();
    }
}
