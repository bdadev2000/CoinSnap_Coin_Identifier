package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class GroupIterator implements Iterator<CompositionGroup>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f13803a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13804b;

    /* renamed from: c, reason: collision with root package name */
    public int f13805c;
    public final int d;

    public GroupIterator(int i2, int i3, SlotTable slotTable) {
        this.f13803a = slotTable;
        this.f13804b = i3;
        this.f13805c = i2;
        this.d = slotTable.f13994h;
        if (slotTable.f13993g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13805c < this.f13804b;
    }

    @Override // java.util.Iterator
    public final CompositionGroup next() {
        SlotTable slotTable = this.f13803a;
        int i2 = slotTable.f13994h;
        int i3 = this.d;
        if (i2 != i3) {
            throw new ConcurrentModificationException();
        }
        int i4 = this.f13805c;
        this.f13805c = SlotTableKt.c(i4, slotTable.f13989a) + i4;
        return new SlotTableGroup(i4, i3, slotTable);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
