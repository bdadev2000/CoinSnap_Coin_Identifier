package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class v1 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f1475b;

    public v1(w1 w1Var) {
        this.f1475b = w1Var.f1477b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1475b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f1475b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
