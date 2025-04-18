package androidx.compose.runtime.snapshots;

import java.util.ListIterator;
import kotlin.jvm.internal.d0;

/* loaded from: classes2.dex */
public final class SubList$listIterator$1 implements ListIterator<Object>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f14639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubList f14640b;

    public SubList$listIterator$1(d0 d0Var, SubList subList) {
        this.f14639a = d0Var;
        this.f14640b = subList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        Object obj2 = SnapshotStateListKt.f14592a;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14639a.f30925a < this.f14640b.d - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14639a.f30925a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        d0 d0Var = this.f14639a;
        int i2 = d0Var.f30925a + 1;
        SubList subList = this.f14640b;
        SnapshotStateListKt.a(i2, subList.d);
        d0Var.f30925a = i2;
        return subList.get(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14639a.f30925a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        d0 d0Var = this.f14639a;
        int i2 = d0Var.f30925a;
        SubList subList = this.f14640b;
        SnapshotStateListKt.a(i2, subList.d);
        d0Var.f30925a = i2 - 1;
        return subList.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14639a.f30925a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        Object obj = SnapshotStateListKt.f14592a;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        Object obj2 = SnapshotStateListKt.f14592a;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }
}
