package m;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends f implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public c f21412b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21413c = true;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f21414d;

    public d(g gVar) {
        this.f21414d = gVar;
    }

    @Override // m.f
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f21412b;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f21411f;
            this.f21412b = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21413c = z10;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21413c) {
            if (this.f21414d.f21417b != null) {
                return true;
            }
            return false;
        }
        c cVar = this.f21412b;
        if (cVar != null && cVar.f21410d != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f21413c) {
            this.f21413c = false;
            this.f21412b = this.f21414d.f21417b;
        } else {
            c cVar2 = this.f21412b;
            if (cVar2 != null) {
                cVar = cVar2.f21410d;
            } else {
                cVar = null;
            }
            this.f21412b = cVar;
        }
        return this.f21412b;
    }
}
