package g4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final List f18156b;

    public u(ArrayList arrayList) {
        this.f18156b = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f18156b.iterator();
    }
}
