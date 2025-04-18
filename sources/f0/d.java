package f0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class d extends f implements Iterator, r0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, int i2) {
        super(gVar);
        this.f30423f = i2;
        if (i2 == 1) {
            p0.a.s(gVar, "map");
            super(gVar);
        } else if (i2 != 2) {
            p0.a.s(gVar, "map");
        } else {
            p0.a.s(gVar, "map");
            super(gVar);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f30423f;
        g gVar = this.f30426a;
        switch (i2) {
            case 0:
                b();
                int i3 = this.f30427b;
                if (i3 >= gVar.f30434g) {
                    throw new NoSuchElementException();
                }
                this.f30427b = i3 + 1;
                this.f30428c = i3;
                e eVar = new e(gVar, i3);
                c();
                return eVar;
            case 1:
                b();
                int i4 = this.f30427b;
                if (i4 >= gVar.f30434g) {
                    throw new NoSuchElementException();
                }
                this.f30427b = i4 + 1;
                this.f30428c = i4;
                Object obj = gVar.f30430a[i4];
                c();
                return obj;
            default:
                b();
                int i5 = this.f30427b;
                if (i5 >= gVar.f30434g) {
                    throw new NoSuchElementException();
                }
                this.f30427b = i5 + 1;
                this.f30428c = i5;
                Object[] objArr = gVar.f30431b;
                p0.a.p(objArr);
                Object obj2 = objArr[this.f30428c];
                c();
                return obj2;
        }
    }
}
