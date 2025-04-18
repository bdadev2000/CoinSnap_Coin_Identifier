package android.support.v4.media.session;

import e0.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import q.o;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f131b;

    public i(String str) {
        this.f131b = str;
    }

    public final void a(Object obj) {
        ((ArrayList) this.f131b).add(obj);
    }

    public final void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                Object obj2 = this.f131b;
                ((ArrayList) obj2).ensureCapacity(((ArrayList) obj2).size() + objArr.length);
                Collections.addAll((ArrayList) this.f131b, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            ((ArrayList) this.f131b).addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                ((ArrayList) this.f131b).add(it.next());
            }
            return;
        }
        if (!(obj instanceof Iterator)) {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
        Iterator it2 = (Iterator) obj;
        while (it2.hasNext()) {
            ((ArrayList) this.f131b).add(it2.next());
        }
    }

    public final String toString() {
        switch (this.f130a) {
            case 3:
                return android.support.v4.media.d.q(new StringBuilder("<"), (String) this.f131b, '>');
            default:
                return super.toString();
        }
    }

    public i(int i2) {
        this.f131b = new ArrayList(i2);
    }

    public i(o oVar) {
        this.f131b = e0.z(oVar.f31328a);
    }
}
