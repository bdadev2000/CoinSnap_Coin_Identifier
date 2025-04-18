package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f14182c;
    public final TrieIterator d;

    public PersistentVectorIterator(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        super(i2, i3);
        this.f14182c = objArr2;
        int i5 = (i3 - 1) & (-32);
        this.d = new TrieIterator(objArr, i2 > i5 ? i5 : i2, i5, i4);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        TrieIterator trieIterator = this.d;
        if (trieIterator.hasNext()) {
            this.f14166a++;
            return trieIterator.next();
        }
        int i2 = this.f14166a;
        this.f14166a = i2 + 1;
        return this.f14182c[i2 - trieIterator.f14167b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f14166a;
        TrieIterator trieIterator = this.d;
        int i3 = trieIterator.f14167b;
        if (i2 <= i3) {
            this.f14166a = i2 - 1;
            return trieIterator.previous();
        }
        int i4 = i2 - 1;
        this.f14166a = i4;
        return this.f14182c[i4 - i3];
    }
}
