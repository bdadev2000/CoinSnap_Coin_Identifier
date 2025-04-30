package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430e implements Iterator {
    public int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f4555c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0432g f4556d;

    public C0430e(C0432g c0432g) {
        this.f4556d = c0432g;
        this.f4555c = c0432g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.f4555c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.b;
        if (i9 < this.f4555c) {
            this.b = i9 + 1;
            return Byte.valueOf(this.f4556d.e(i9));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
