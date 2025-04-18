package x7;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class h implements t {

    /* renamed from: b, reason: collision with root package name */
    public final q f27452b;

    /* renamed from: c, reason: collision with root package name */
    public n f27453c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27454d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f27455f;

    public h(i iVar, q qVar) {
        this.f27455f = iVar;
        this.f27452b = qVar;
    }

    @Override // x7.t
    public final void release() {
        Handler handler = this.f27455f.u;
        handler.getClass();
        n9.h0.L(handler, new androidx.activity.d(this, 28));
    }
}
