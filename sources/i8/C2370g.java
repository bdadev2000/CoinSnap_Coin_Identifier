package i8;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* renamed from: i8.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2370g implements Closeable, Flushable {
    public final k8.h b;

    public C2370g(File file, long j7) {
        G7.j.e(file, "directory");
        this.b = new k8.h(file, j7, l8.c.f21647h);
    }

    public final void a(C c9) {
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        k8.h hVar = this.b;
        String j7 = com.facebook.appevents.i.j(c9.f20754a);
        synchronized (hVar) {
            G7.j.e(j7, "key");
            hVar.i();
            hVar.a();
            k8.h.r(j7);
            k8.e eVar = (k8.e) hVar.f21529k.get(j7);
            if (eVar != null) {
                hVar.p(eVar);
                if (hVar.f21527i <= hVar.f21523d) {
                    hVar.f21533q = false;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.b.flush();
    }
}
