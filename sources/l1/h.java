package l1;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class h implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31039a;

    /* renamed from: b, reason: collision with root package name */
    public int f31040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f31041c;

    public h(f fVar, int i2) {
        this.f31039a = i2;
        if (i2 != 1) {
            this.f31041c = fVar;
            this.f31040b = fVar.d();
        } else {
            this.f31041c = fVar;
            this.f31040b = fVar.d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31039a) {
            case 0:
                return this.f31040b > 0;
            default:
                return this.f31040b > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f31039a;
        f fVar = this.f31041c;
        switch (i2) {
            case 0:
                int d = fVar.d();
                int i3 = this.f31040b;
                this.f31040b = i3 - 1;
                return fVar.f(d - i3);
            default:
                int d2 = fVar.d();
                int i4 = this.f31040b;
                this.f31040b = i4 - 1;
                return fVar.e(d2 - i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31039a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
