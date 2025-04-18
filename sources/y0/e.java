package y0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class e implements Iterator, r0.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f31428b;
    public Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f31430f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31427a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f31429c = -1;

    public e(f fVar) {
        this.f31430f = fVar;
        this.f31428b = fVar.f31431a.iterator();
    }

    public final void b() {
        Object next;
        j jVar;
        do {
            Iterator it = this.f31428b;
            if (!it.hasNext()) {
                this.f31429c = 0;
                return;
            } else {
                next = it.next();
                jVar = this.f31430f;
            }
        } while (((Boolean) ((f) jVar).f31433c.invoke(next)).booleanValue() != ((f) jVar).f31432b);
        this.d = next;
        this.f31429c = 1;
    }

    public final void c() {
        Iterator it = this.f31428b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((r) this.f31430f).f31453c.invoke(next)).booleanValue()) {
                this.f31429c = 1;
                this.d = next;
                return;
            }
        }
        this.f31429c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31427a) {
            case 0:
                if (this.f31429c == -1) {
                    b();
                }
                return this.f31429c == 1;
            default:
                if (this.f31429c == -1) {
                    c();
                }
                return this.f31429c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f31427a) {
            case 0:
                if (this.f31429c == -1) {
                    b();
                }
                if (this.f31429c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.d;
                this.d = null;
                this.f31429c = -1;
                return obj;
            default:
                if (this.f31429c == -1) {
                    c();
                }
                if (this.f31429c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.d;
                this.d = null;
                this.f31429c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31427a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(r rVar) {
        this.f31430f = rVar;
        this.f31428b = ((j) rVar.f31452b).iterator();
    }
}
