package M0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x.b f1940a;
    public final /* synthetic */ z b;

    public y(z zVar, x.b bVar) {
        this.b = zVar;
        this.f1940a = bVar;
    }

    @Override // M0.x, M0.u
    public final void c(w wVar) {
        ((ArrayList) this.f1940a.getOrDefault(this.b.f1941c, null)).remove(wVar);
        wVar.A(this);
    }
}
