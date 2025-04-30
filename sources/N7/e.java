package N7;

import G7.w;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2128a;
    public final F7.l b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2129c;

    public e(O7.c cVar, w wVar) {
        this.f2128a = 1;
        this.f2129c = cVar;
        this.b = wVar;
    }

    @Override // N7.f
    public final Iterator iterator() {
        switch (this.f2128a) {
            case 0:
                return new d(this);
            default:
                return new l(this);
        }
    }

    public e(w wVar) {
        this.f2128a = 0;
        this.f2129c = h.g.b;
        this.b = wVar;
    }
}
