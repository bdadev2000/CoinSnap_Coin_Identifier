package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import r0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14220a = TrieNode.e.d;

    /* renamed from: b, reason: collision with root package name */
    public int f14221b;

    /* renamed from: c, reason: collision with root package name */
    public int f14222c;

    public final void b(int i2, int i3, Object[] objArr) {
        this.f14220a = objArr;
        this.f14221b = i2;
        this.f14222c = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14222c < this.f14221b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
