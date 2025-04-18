package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(nextByte());
    }

    public abstract byte nextByte();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
