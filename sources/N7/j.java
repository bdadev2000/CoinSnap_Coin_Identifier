package N7;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2133a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i9) {
        this.f2133a = i9;
        this.b = obj;
    }

    @Override // N7.f
    public final Iterator iterator() {
        switch (this.f2133a) {
            case 0:
                return (Iterator) this.b;
            default:
                return ((Iterable) this.b).iterator();
        }
    }
}
