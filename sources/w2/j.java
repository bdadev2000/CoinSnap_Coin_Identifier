package w2;

/* loaded from: classes.dex */
public final class j extends h {
    public final boolean h(Object obj) {
        if (obj == null) {
            obj = h.f26687i;
        }
        if (h.f26686h.h(this, null, obj)) {
            h.b(this);
            return true;
        }
        return false;
    }

    public final boolean i(Throwable th2) {
        th2.getClass();
        if (h.f26686h.h(this, null, new b(th2))) {
            h.b(this);
            return true;
        }
        return false;
    }

    public final boolean j(ua.b bVar) {
        b bVar2;
        bVar.getClass();
        Object obj = this.f26688b;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!h.f26686h.h(this, null, h.e(bVar))) {
                    return false;
                }
                h.b(this);
            } else {
                e eVar = new e(this, bVar);
                if (h.f26686h.h(this, null, eVar)) {
                    try {
                        bVar.addListener(eVar, i.f26691b);
                    } catch (Throwable th2) {
                        try {
                            bVar2 = new b(th2);
                        } catch (Throwable unused) {
                            bVar2 = b.f26671b;
                        }
                        h.f26686h.h(this, eVar, bVar2);
                    }
                } else {
                    obj = this.f26688b;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        bVar.cancel(((a) obj).a);
        return false;
    }
}
