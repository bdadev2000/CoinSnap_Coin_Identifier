package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T> {
    public final PersistentHashMapBuilder d;

    /* renamed from: f, reason: collision with root package name */
    public Object f14205f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14206g;

    /* renamed from: h, reason: collision with root package name */
    public int f14207h;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder persistentHashMapBuilder, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.f14202c, trieNodeBaseIteratorArr);
        this.d = persistentHashMapBuilder;
        this.f14207h = persistentHashMapBuilder.f14203f;
    }

    public final void d(int i2, TrieNode trieNode, Object obj, int i3) {
        int i4 = i3 * 5;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.f14197a;
        if (i4 <= 30) {
            int d = 1 << TrieNodeKt.d(i2, i4);
            if (trieNode.h(d)) {
                trieNodeBaseIteratorArr[i3].b(Integer.bitCount(trieNode.f14215a) * 2, trieNode.f(d), trieNode.d);
                this.f14198b = i3;
                return;
            }
            int t2 = trieNode.t(d);
            TrieNode s2 = trieNode.s(t2);
            trieNodeBaseIteratorArr[i3].b(Integer.bitCount(trieNode.f14215a) * 2, t2, trieNode.d);
            d(i2, s2, obj, i3 + 1);
            return;
        }
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i3];
        Object[] objArr = trieNode.d;
        trieNodeBaseIterator.b(objArr.length, 0, objArr);
        while (true) {
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i3];
            if (a.g(trieNodeBaseIterator2.f14220a[trieNodeBaseIterator2.f14222c], obj)) {
                this.f14198b = i3;
                return;
            } else {
                trieNodeBaseIteratorArr[i3].f14222c += 2;
            }
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final Object next() {
        if (this.d.f14203f != this.f14207h) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        TrieNodeBaseIterator trieNodeBaseIterator = this.f14197a[this.f14198b];
        this.f14205f = trieNodeBaseIterator.f14220a[trieNodeBaseIterator.f14222c];
        this.f14206g = true;
        return super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final void remove() {
        if (!this.f14206g) {
            throw new IllegalStateException();
        }
        boolean hasNext = hasNext();
        PersistentHashMapBuilder persistentHashMapBuilder = this.d;
        if (!hasNext) {
            Object obj = this.f14205f;
            e.e(persistentHashMapBuilder);
            persistentHashMapBuilder.remove(obj);
        } else {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TrieNodeBaseIterator trieNodeBaseIterator = this.f14197a[this.f14198b];
            Object obj2 = trieNodeBaseIterator.f14220a[trieNodeBaseIterator.f14222c];
            Object obj3 = this.f14205f;
            e.e(persistentHashMapBuilder);
            persistentHashMapBuilder.remove(obj3);
            d(obj2 != null ? obj2.hashCode() : 0, persistentHashMapBuilder.f14202c, obj2, 0);
        }
        this.f14205f = null;
        this.f14206g = false;
        this.f14207h = persistentHashMapBuilder.f14203f;
    }
}
