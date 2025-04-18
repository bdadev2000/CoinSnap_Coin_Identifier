package m;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e extends f implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public c f21415b;

    /* renamed from: c, reason: collision with root package name */
    public c f21416c;

    public e(c cVar, c cVar2) {
        this.f21415b = cVar2;
        this.f21416c = cVar;
    }

    @Override // m.f
    public final void a(c cVar) {
        c cVar2;
        if (this.f21415b == cVar && cVar == this.f21416c) {
            this.f21416c = null;
            this.f21415b = null;
        }
        c cVar3 = this.f21415b;
        if (cVar3 == cVar) {
            switch (((b) this).f21407d) {
                case 0:
                    cVar2 = cVar3.f21411f;
                    break;
                default:
                    cVar2 = cVar3.f21410d;
                    break;
            }
            this.f21415b = cVar2;
        }
        if (this.f21416c == cVar) {
            this.f21416c = b();
        }
    }

    public final c b() {
        c cVar = this.f21416c;
        c cVar2 = this.f21415b;
        if (cVar != cVar2 && cVar2 != null) {
            switch (((b) this).f21407d) {
                case 0:
                    return cVar.f21410d;
                default:
                    return cVar.f21411f;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21416c != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f21416c;
        this.f21416c = b();
        return cVar;
    }
}
