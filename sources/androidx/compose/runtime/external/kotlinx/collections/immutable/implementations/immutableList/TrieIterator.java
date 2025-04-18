package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TrieIterator<E> extends AbstractListIterator<E> {

    /* renamed from: c, reason: collision with root package name */
    public int f14189c;
    public Object[] d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14190f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(Object[] objArr, int i2, int i3, int i4) {
        super(i2, i3);
        this.f14189c = i4;
        Object[] objArr2 = new Object[i4];
        this.d = objArr2;
        ?? r5 = i2 == i3 ? 1 : 0;
        this.f14190f = r5;
        objArr2[0] = objArr;
        c(i2 - r5, 1);
    }

    public final Object b() {
        int i2 = this.f14166a & 31;
        Object obj = this.d[this.f14189c - 1];
        a.q(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i2];
    }

    public final void c(int i2, int i3) {
        int i4 = (this.f14189c - i3) * 5;
        while (i3 < this.f14189c) {
            Object[] objArr = this.d;
            Object obj = objArr[i3 - 1];
            a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i3] = ((Object[]) obj)[UtilsKt.a(i2, i4)];
            i4 -= 5;
            i3++;
        }
    }

    public final void d(int i2) {
        int i3 = 0;
        while (UtilsKt.a(this.f14166a, i3) == i2) {
            i3 += 5;
        }
        if (i3 > 0) {
            c(this.f14166a, ((this.f14189c - 1) - (i3 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = b();
        int i2 = this.f14166a + 1;
        this.f14166a = i2;
        if (i2 == this.f14167b) {
            this.f14190f = true;
            return b2;
        }
        d(0);
        return b2;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f14166a--;
        if (this.f14190f) {
            this.f14190f = false;
            return b();
        }
        d(31);
        return b();
    }
}
