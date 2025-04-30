package c2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements InterfaceC0590a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f5399a;

    public n(p pVar) {
        this.f5399a = pVar;
    }

    @Override // c2.InterfaceC0590a
    public final void a(boolean z8) {
        ArrayList arrayList;
        j2.n.a();
        synchronized (this.f5399a) {
            arrayList = new ArrayList((HashSet) this.f5399a.f5402c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0590a) it.next()).a(z8);
        }
    }
}
