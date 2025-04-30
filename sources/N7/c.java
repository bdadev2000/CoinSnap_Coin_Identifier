package N7;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f2125a;
    public final int b;

    public c(f fVar, int i9) {
        this.f2125a = fVar;
        this.b = i9;
        if (i9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i9 + '.').toString());
    }

    @Override // N7.f
    public final Iterator iterator() {
        return new b(this);
    }
}
