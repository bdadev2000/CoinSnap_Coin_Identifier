package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l0 implements Iterator {
    public final Iterator b;

    public l0(m0 m0Var) {
        this.b = m0Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
