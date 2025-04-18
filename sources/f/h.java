package f;

import android.content.Context;
import b1.f0;
import d0.p;
import e0.w;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30387a;

    /* renamed from: b, reason: collision with root package name */
    public final q.c f30388b = v.f.f31377a;

    /* renamed from: c, reason: collision with root package name */
    public c f30389c = null;
    public final v.k d = new v.k();

    public h(Context context) {
        this.f30387a = context.getApplicationContext();
    }

    public final o a() {
        Context context = this.f30387a;
        q.c cVar = this.f30388b;
        p t2 = f0.t(new f(this, 0));
        p t3 = f0.t(new f(this, 1));
        p t4 = f0.t(g.f30386a);
        c cVar2 = this.f30389c;
        if (cVar2 == null) {
            w wVar = w.f30218a;
            cVar2 = new c(wVar, wVar, wVar, wVar, wVar);
        }
        return new o(context, cVar, t2, t3, t4, cVar2, this.d);
    }
}
