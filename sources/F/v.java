package f;

import u7.C2814e;

/* loaded from: classes.dex */
public final class v implements c {
    public final o b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f20238c;

    public v(x xVar, o oVar) {
        G7.j.e(oVar, "onBackPressedCallback");
        this.f20238c = xVar;
        this.b = oVar;
    }

    @Override // f.c
    public final void cancel() {
        x xVar = this.f20238c;
        C2814e c2814e = xVar.b;
        o oVar = this.b;
        c2814e.remove(oVar);
        if (G7.j.a(xVar.f20241c, oVar)) {
            oVar.a();
            xVar.f20241c = null;
        }
        oVar.getClass();
        oVar.b.remove(this);
        F7.a aVar = oVar.f20227c;
        if (aVar != null) {
            aVar.invoke();
        }
        oVar.f20227c = null;
    }
}
