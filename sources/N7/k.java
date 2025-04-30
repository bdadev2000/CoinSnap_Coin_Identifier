package N7;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k implements Iterable, H7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2134c;

    public /* synthetic */ k(Object obj, int i9) {
        this.b = i9;
        this.f2134c = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                return ((f) this.f2134c).iterator();
            case 1:
                return new c8.i((c8.g) this.f2134c, 1);
            default:
                return new b((Iterator) ((F7.a) this.f2134c).invoke());
        }
    }
}
