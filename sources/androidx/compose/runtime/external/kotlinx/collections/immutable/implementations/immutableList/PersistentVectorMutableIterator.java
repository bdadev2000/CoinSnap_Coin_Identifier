package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T> {

    /* renamed from: c, reason: collision with root package name */
    public final PersistentVectorBuilder f14183c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public TrieIterator f14184f;

    /* renamed from: g, reason: collision with root package name */
    public int f14185g;

    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder, int i2) {
        super(i2, persistentVectorBuilder.b());
        this.f14183c = persistentVectorBuilder;
        this.d = persistentVectorBuilder.f();
        this.f14185g = -1;
        c();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void add(Object obj) {
        b();
        int i2 = this.f14166a;
        PersistentVectorBuilder persistentVectorBuilder = this.f14183c;
        persistentVectorBuilder.add(i2, obj);
        this.f14166a++;
        this.f14167b = persistentVectorBuilder.b();
        this.d = persistentVectorBuilder.f();
        this.f14185g = -1;
        c();
    }

    public final void b() {
        if (this.d != this.f14183c.f()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        PersistentVectorBuilder persistentVectorBuilder = this.f14183c;
        Object[] objArr = persistentVectorBuilder.f14178g;
        if (objArr == null) {
            this.f14184f = null;
            return;
        }
        int i2 = (persistentVectorBuilder.f14180i - 1) & (-32);
        int i3 = this.f14166a;
        if (i3 > i2) {
            i3 = i2;
        }
        int i4 = (persistentVectorBuilder.d / 5) + 1;
        TrieIterator trieIterator = this.f14184f;
        if (trieIterator == null) {
            this.f14184f = new TrieIterator(objArr, i3, i2, i4);
            return;
        }
        trieIterator.f14166a = i3;
        trieIterator.f14167b = i2;
        trieIterator.f14189c = i4;
        if (trieIterator.d.length < i4) {
            trieIterator.d = new Object[i4];
        }
        trieIterator.d[0] = objArr;
        ?? r6 = i3 == i2 ? 1 : 0;
        trieIterator.f14190f = r6;
        trieIterator.c(i3 - r6, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f14166a;
        this.f14185g = i2;
        TrieIterator trieIterator = this.f14184f;
        PersistentVectorBuilder persistentVectorBuilder = this.f14183c;
        if (trieIterator == null) {
            Object[] objArr = persistentVectorBuilder.f14179h;
            this.f14166a = i2 + 1;
            return objArr[i2];
        }
        if (trieIterator.hasNext()) {
            this.f14166a++;
            return trieIterator.next();
        }
        Object[] objArr2 = persistentVectorBuilder.f14179h;
        int i3 = this.f14166a;
        this.f14166a = i3 + 1;
        return objArr2[i3 - trieIterator.f14167b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f14166a;
        this.f14185g = i2 - 1;
        TrieIterator trieIterator = this.f14184f;
        PersistentVectorBuilder persistentVectorBuilder = this.f14183c;
        if (trieIterator == null) {
            Object[] objArr = persistentVectorBuilder.f14179h;
            int i3 = i2 - 1;
            this.f14166a = i3;
            return objArr[i3];
        }
        int i4 = trieIterator.f14167b;
        if (i2 <= i4) {
            this.f14166a = i2 - 1;
            return trieIterator.previous();
        }
        Object[] objArr2 = persistentVectorBuilder.f14179h;
        int i5 = i2 - 1;
        this.f14166a = i5;
        return objArr2[i5 - i4];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i2 = this.f14185g;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder persistentVectorBuilder = this.f14183c;
        persistentVectorBuilder.c(i2);
        int i3 = this.f14185g;
        if (i3 < this.f14166a) {
            this.f14166a = i3;
        }
        this.f14167b = persistentVectorBuilder.b();
        this.d = persistentVectorBuilder.f();
        this.f14185g = -1;
        c();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i2 = this.f14185g;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder persistentVectorBuilder = this.f14183c;
        persistentVectorBuilder.set(i2, obj);
        this.d = persistentVectorBuilder.f();
        c();
    }
}
