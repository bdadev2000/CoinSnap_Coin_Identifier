package N7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d implements Iterator, H7.a {
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public int f2126c = -2;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f2127d;

    public d(e eVar) {
        this.f2127d = eVar;
    }

    public final void a() {
        Object invoke;
        int i9;
        int i10 = this.f2126c;
        e eVar = this.f2127d;
        if (i10 == -2) {
            invoke = ((F7.a) eVar.f2129c).invoke();
        } else {
            F7.l lVar = eVar.b;
            Object obj = this.b;
            G7.j.b(obj);
            invoke = lVar.invoke(obj);
        }
        this.b = invoke;
        if (invoke == null) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        this.f2126c = i9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2126c < 0) {
            a();
        }
        if (this.f2126c == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2126c < 0) {
            a();
        }
        if (this.f2126c != 0) {
            Object obj = this.b;
            G7.j.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f2126c = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
