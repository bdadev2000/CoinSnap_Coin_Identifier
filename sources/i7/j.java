package i7;

import android.content.Context;
import java.io.Closeable;
import mb.y1;
import v8.u0;

/* loaded from: classes3.dex */
public final class j implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public rh.a f19180b = k7.a.a(w5.d.f26763b);

    /* renamed from: c, reason: collision with root package name */
    public k7.c f19181c;

    /* renamed from: d, reason: collision with root package name */
    public rh.a f19182d;

    /* renamed from: f, reason: collision with root package name */
    public j7.f f19183f;

    /* renamed from: g, reason: collision with root package name */
    public rh.a f19184g;

    /* renamed from: h, reason: collision with root package name */
    public rh.a f19185h;

    public j(Context context) {
        if (context != null) {
            k7.c cVar = new k7.c(context);
            this.f19181c = cVar;
            m mVar = u0.f26308n;
            m mVar2 = va.b.f26382h;
            this.f19182d = k7.a.a(new j7.h(cVar, new j7.f(cVar, mVar, mVar2, 0)));
            k7.c cVar2 = this.f19181c;
            this.f19183f = new j7.f(cVar2, d6.g.f16891h, jb.g.f19888f, 1);
            rh.a a = k7.a.a(new s(mVar, mVar2, y1.f22137d, this.f19183f, k7.a.a(new m7.c(cVar2, 1)), 2));
            this.f19184g = a;
            m7.c cVar3 = new m7.c(mVar, 0);
            k7.c cVar4 = this.f19181c;
            m7.d dVar = new m7.d(cVar4, a, cVar3, mVar2, 0);
            rh.a aVar = this.f19180b;
            rh.a aVar2 = this.f19182d;
            this.f19185h = k7.a.a(new s(mVar, mVar2, new s(aVar, aVar2, dVar, a, a, 1), new n7.j(cVar4, aVar2, a, dVar, aVar, a, a), new m7.d(aVar, a, dVar, a, 1), 0));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void close() {
        ((o7.d) this.f19184g.get()).close();
    }
}
