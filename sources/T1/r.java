package T1;

import h5.C2326g;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class r extends C2326g {
    @Override // h5.C2326g
    public final void c(Object obj, Object obj2) {
        s sVar = (s) obj;
        sVar.getClass();
        ArrayDeque arrayDeque = s.f2990d;
        synchronized (arrayDeque) {
            arrayDeque.offer(sVar);
        }
    }
}
