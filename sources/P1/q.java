package P1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements Iterable {
    public final List b;

    public q(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }
}
