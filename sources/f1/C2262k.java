package f1;

/* renamed from: f1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2262k extends AbstractC2260i {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = AbstractC2260i.f20263i;
        }
        if (AbstractC2260i.f20262h.f(this, null, obj)) {
            AbstractC2260i.b(this);
            return true;
        }
        return false;
    }

    public final boolean j(Throwable th) {
        if (AbstractC2260i.f20262h.f(this, null, new C2254c(th))) {
            AbstractC2260i.b(this);
            return true;
        }
        return false;
    }

    public final boolean k(f4.c cVar) {
        C2254c c2254c;
        cVar.getClass();
        Object obj = this.b;
        if (obj == null) {
            if (cVar.isDone()) {
                if (!AbstractC2260i.f20262h.f(this, null, AbstractC2260i.e(cVar))) {
                    return false;
                }
                AbstractC2260i.b(this);
            } else {
                RunnableC2257f runnableC2257f = new RunnableC2257f(this, cVar);
                if (AbstractC2260i.f20262h.f(this, null, runnableC2257f)) {
                    try {
                        cVar.addListener(runnableC2257f, EnumC2261j.b);
                    } catch (Throwable th) {
                        try {
                            c2254c = new C2254c(th);
                        } catch (Throwable unused) {
                            c2254c = C2254c.b;
                        }
                        AbstractC2260i.f20262h.f(this, runnableC2257f, c2254c);
                    }
                } else {
                    obj = this.b;
                }
            }
            return true;
        }
        if (!(obj instanceof C2252a)) {
            return false;
        }
        cVar.cancel(((C2252a) obj).f20248a);
        return false;
    }
}
