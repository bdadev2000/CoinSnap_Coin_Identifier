package o8;

import G7.j;
import java.io.IOException;
import m8.k;
import w8.A;
import w8.h;
import w8.l;
import w8.y;

/* loaded from: classes3.dex */
public abstract class a implements y {
    public final l b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P4.a f22010d;

    public a(P4.a aVar) {
        j.e(aVar, "this$0");
        this.f22010d = aVar;
        this.b = new l(((h) aVar.f2417d).timeout());
    }

    public final void a() {
        P4.a aVar = this.f22010d;
        int i9 = aVar.f2415a;
        if (i9 == 6) {
            return;
        }
        if (i9 == 5) {
            l lVar = this.b;
            A a6 = lVar.f24018e;
            lVar.f24018e = A.f23999d;
            a6.a();
            a6.b();
            aVar.f2415a = 6;
            return;
        }
        throw new IllegalStateException(j.j(Integer.valueOf(aVar.f2415a), "state: "));
    }

    @Override // w8.y
    public long read(w8.f fVar, long j7) {
        P4.a aVar = this.f22010d;
        j.e(fVar, "sink");
        try {
            return ((h) aVar.f2417d).read(fVar, j7);
        } catch (IOException e4) {
            ((k) aVar.f2416c).k();
            a();
            throw e4;
        }
    }

    @Override // w8.y
    public final A timeout() {
        return this.b;
    }
}
