package o0;

import e0.h0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class f implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public h0 f31192a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31193b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f31194c;
    public final /* synthetic */ h d;

    public f(h hVar) {
        this.d = hVar;
        this.f31192a = h0.f30205b;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f31194c = arrayDeque;
        if (hVar.f31196a.isDirectory()) {
            arrayDeque.push(b(hVar.f31196a));
        } else {
            if (!hVar.f31196a.isFile()) {
                this.f31192a = h0.f30206c;
                return;
            }
            File file = hVar.f31196a;
            p0.a.s(file, "rootFile");
            arrayDeque.push(new g(file));
        }
    }

    public final b b(File file) {
        int ordinal = this.d.f31197b.ordinal();
        if (ordinal == 0) {
            return new e(this, file);
        }
        if (ordinal == 1) {
            return new c(this, file);
        }
        throw new RuntimeException();
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        File file;
        File a2;
        h0 h0Var = this.f31192a;
        h0 h0Var2 = h0.d;
        if (h0Var == h0Var2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.f31192a = h0Var2;
            while (true) {
                ArrayDeque arrayDeque = this.f31194c;
                g gVar = (g) arrayDeque.peek();
                if (gVar == null) {
                    file = null;
                    break;
                }
                a2 = gVar.a();
                if (a2 == null) {
                    arrayDeque.pop();
                } else {
                    if (p0.a.g(a2, gVar.f31195a) || !a2.isDirectory() || arrayDeque.size() >= this.d.f31198c) {
                        break;
                    }
                    arrayDeque.push(b(a2));
                }
            }
            file = a2;
            if (file != null) {
                this.f31193b = file;
                this.f31192a = h0.f30204a;
            } else {
                this.f31192a = h0.f30206c;
            }
            if (this.f31192a == h0.f30204a) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f31192a = h0.f30205b;
        return this.f31193b;
    }

    public final void f() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        f();
        throw null;
    }
}
