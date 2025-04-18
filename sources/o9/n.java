package o9;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes3.dex */
public final class n extends GLSurfaceView implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23244c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final m f23245b;

    public n(Context context) {
        super(context, null);
        m mVar = new m(this);
        this.f23245b = mVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(mVar);
        setRenderMode(0);
    }

    @Deprecated
    public o getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(w7.l lVar) {
        m mVar = this.f23245b;
        a4.j.t(mVar.f23242h.getAndSet(lVar));
        mVar.f23237b.requestRender();
    }
}
