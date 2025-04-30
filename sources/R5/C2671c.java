package r5;

import F7.p;
import android.util.Log;
import t7.AbstractC2712a;
import t7.y;
import y7.AbstractC2960i;

/* renamed from: r5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2671c extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f22853g;

    /* JADX WARN: Type inference failed for: r0v0, types: [r5.c, y7.i, w7.f] */
    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        ?? abstractC2960i = new AbstractC2960i(2, fVar);
        abstractC2960i.f22853g = obj;
        return abstractC2960i;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        C2671c c2671c = (C2671c) c((String) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        c2671c.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f22853g));
        return y.f23029a;
    }
}
