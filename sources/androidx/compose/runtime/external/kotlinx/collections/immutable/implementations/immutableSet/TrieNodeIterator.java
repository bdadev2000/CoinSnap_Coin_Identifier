package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class TrieNodeIterator<E> {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14238a = TrieNode.d.f14236b;

    /* renamed from: b, reason: collision with root package name */
    public int f14239b;

    public final boolean a() {
        int i2 = this.f14239b;
        Object[] objArr = this.f14238a;
        return i2 < objArr.length && !(objArr[i2] instanceof TrieNode);
    }
}
