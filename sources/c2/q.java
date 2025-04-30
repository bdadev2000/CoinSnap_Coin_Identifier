package c2;

import g2.InterfaceC2289c;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q implements InterfaceC0598i {
    public final Set b = Collections.newSetFromMap(new WeakHashMap());

    @Override // c2.InterfaceC0598i
    public final void onDestroy() {
        Iterator it = j2.n.e(this.b).iterator();
        while (it.hasNext()) {
            ((InterfaceC2289c) it.next()).onDestroy();
        }
    }

    @Override // c2.InterfaceC0598i
    public final void onStart() {
        Iterator it = j2.n.e(this.b).iterator();
        while (it.hasNext()) {
            ((InterfaceC2289c) it.next()).onStart();
        }
    }

    @Override // c2.InterfaceC0598i
    public final void onStop() {
        Iterator it = j2.n.e(this.b).iterator();
        while (it.hasNext()) {
            ((InterfaceC2289c) it.next()).onStop();
        }
    }
}
