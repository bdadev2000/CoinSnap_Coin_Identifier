package n0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class h0 implements Iterator, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f22279b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22280c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Iterator f22281d;

    public h0(Iterator it, l1 l1Var) {
        this.f22279b = l1Var;
        this.f22281d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22281d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f22281d.next();
        Iterator it = (Iterator) this.f22279b.invoke(next);
        ArrayList arrayList = this.f22280c;
        if (it != null && it.hasNext()) {
            arrayList.add(this.f22281d);
            this.f22281d = it;
        } else {
            while (!this.f22281d.hasNext() && (!arrayList.isEmpty())) {
                this.f22281d = (Iterator) CollectionsKt.last((List) arrayList);
                CollectionsKt.removeLast(arrayList);
            }
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
