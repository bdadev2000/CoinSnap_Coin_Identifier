package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class NavGraph$iterator$1 implements Iterator<NavDestination>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f20460a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavGraph f20462c;

    public NavGraph$iterator$1(NavGraph navGraph) {
        this.f20462c = navGraph;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20460a + 1 < this.f20462c.f20455l.g();
    }

    @Override // java.util.Iterator
    public final NavDestination next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20461b = true;
        SparseArrayCompat sparseArrayCompat = this.f20462c.f20455l;
        int i2 = this.f20460a + 1;
        this.f20460a = i2;
        return (NavDestination) sparseArrayCompat.h(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20461b) {
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
        SparseArrayCompat sparseArrayCompat = this.f20462c.f20455l;
        ((NavDestination) sparseArrayCompat.h(this.f20460a)).f20432b = null;
        int i2 = this.f20460a;
        Object[] objArr = sparseArrayCompat.f1611c;
        Object obj = objArr[i2];
        Object obj2 = SparseArrayCompatKt.f1612a;
        if (obj != obj2) {
            objArr[i2] = obj2;
            sparseArrayCompat.f1609a = true;
        }
        this.f20460a = i2 - 1;
        this.f20461b = false;
    }
}
