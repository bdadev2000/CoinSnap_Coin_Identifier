package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes4.dex */
final class StateListIterator<T> implements ListIterator<T>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateList f14623a;

    /* renamed from: b, reason: collision with root package name */
    public int f14624b;

    /* renamed from: c, reason: collision with root package name */
    public int f14625c = -1;
    public int d;

    public StateListIterator(SnapshotStateList snapshotStateList, int i2) {
        this.f14623a = snapshotStateList;
        this.f14624b = i2 - 1;
        this.d = snapshotStateList.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        b();
        int i2 = this.f14624b + 1;
        SnapshotStateList snapshotStateList = this.f14623a;
        snapshotStateList.add(i2, obj);
        this.f14625c = -1;
        this.f14624b++;
        this.d = snapshotStateList.c();
    }

    public final void b() {
        if (this.f14623a.c() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14624b < this.f14623a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14624b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        int i2 = this.f14624b + 1;
        this.f14625c = i2;
        SnapshotStateList snapshotStateList = this.f14623a;
        SnapshotStateListKt.a(i2, snapshotStateList.size());
        Object obj = snapshotStateList.get(i2);
        this.f14624b = i2;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14624b + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        int i2 = this.f14624b;
        SnapshotStateList snapshotStateList = this.f14623a;
        SnapshotStateListKt.a(i2, snapshotStateList.size());
        int i3 = this.f14624b;
        this.f14625c = i3;
        this.f14624b--;
        return snapshotStateList.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14624b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i2 = this.f14624b;
        SnapshotStateList snapshotStateList = this.f14623a;
        snapshotStateList.remove(i2);
        this.f14624b--;
        this.f14625c = -1;
        this.d = snapshotStateList.c();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i2 = this.f14625c;
        if (i2 < 0) {
            Object obj2 = SnapshotStateListKt.f14592a;
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
        }
        SnapshotStateList snapshotStateList = this.f14623a;
        snapshotStateList.set(i2, obj);
        this.d = snapshotStateList.c();
    }
}
