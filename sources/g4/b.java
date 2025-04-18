package g4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b extends WeakReference {
    public final e4.j a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18034b;

    /* renamed from: c, reason: collision with root package name */
    public g0 f18035c;

    public b(e4.j jVar, z zVar, ReferenceQueue referenceQueue, boolean z10) {
        super(zVar, referenceQueue);
        g0 g0Var;
        com.bumptech.glide.c.l(jVar);
        this.a = jVar;
        if (zVar.f18189b && z10) {
            g0Var = zVar.f18191d;
            com.bumptech.glide.c.l(g0Var);
        } else {
            g0Var = null;
        }
        this.f18035c = g0Var;
        this.f18034b = zVar.f18189b;
    }
}
