package o;

import android.graphics.Bitmap;
import b1.f0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final m f31179a;

    /* renamed from: b, reason: collision with root package name */
    public final h f31180b;

    public i(int i2, m mVar) {
        this.f31179a = mVar;
        this.f31180b = new h(i2, this);
    }

    @Override // o.l
    public final void a(int i2) {
        h hVar = this.f31180b;
        if (i2 >= 40) {
            hVar.evictAll();
        } else {
            if (10 > i2 || i2 >= 20) {
                return;
            }
            hVar.trimToSize(hVar.size() / 2);
        }
    }

    @Override // o.l
    public final d b(c cVar) {
        g gVar = (g) this.f31180b.get(cVar);
        if (gVar != null) {
            return new d(gVar.f31175a, gVar.f31176b);
        }
        return null;
    }

    @Override // o.l
    public final void c(c cVar, Bitmap bitmap, Map map) {
        int n2 = f0.n(bitmap);
        h hVar = this.f31180b;
        if (n2 <= hVar.maxSize()) {
            hVar.put(cVar, new g(bitmap, map, n2));
        } else {
            hVar.remove(cVar);
            this.f31179a.c(cVar, bitmap, map, n2);
        }
    }
}
