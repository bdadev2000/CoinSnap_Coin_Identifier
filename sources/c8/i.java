package c8;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i implements Iterator, H7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public int f5449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f5450d;

    public i(g gVar, int i9) {
        this.b = i9;
        switch (i9) {
            case 1:
                this.f5450d = gVar;
                this.f5449c = gVar.f();
                return;
            default:
                this.f5450d = gVar;
                this.f5449c = gVar.f();
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                if (this.f5449c > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f5449c > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.b) {
            case 0:
                g gVar = this.f5450d;
                int f9 = gVar.f();
                int i9 = this.f5449c;
                this.f5449c = i9 - 1;
                return gVar.j(f9 - i9);
            default:
                g gVar2 = this.f5450d;
                int f10 = gVar2.f();
                int i10 = this.f5449c;
                this.f5449c = i10 - 1;
                return gVar2.g(f10 - i10);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
