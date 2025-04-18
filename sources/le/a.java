package le;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class a extends ie.e {

    /* renamed from: h, reason: collision with root package name */
    public static final fe.c f21359h = new fe.c(a.class.getSimpleName());

    /* renamed from: e, reason: collision with root package name */
    public final List f21360e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21361f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21362g;

    public a(List list, boolean z10) {
        this.f21360e = list;
        this.f21362g = z10;
    }

    @Override // ie.e
    public final void i(ie.b bVar) {
        boolean z10;
        this.f19605c = bVar;
        if (this.f21362g && n(bVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean m10 = m(bVar);
        fe.c cVar = f21359h;
        if (m10 && !z10) {
            cVar.a(1, "onStart:", "supported and not skipped. Dispatching onStarted.");
            o(bVar, this.f21360e);
        } else {
            cVar.a(1, "onStart:", "not supported or skipped. Dispatching COMPLETED state.");
            this.f21361f = true;
            k(Integer.MAX_VALUE);
        }
    }

    public abstract boolean m(ie.b bVar);

    public abstract boolean n(ie.b bVar);

    public abstract void o(ie.b bVar, List list);
}
