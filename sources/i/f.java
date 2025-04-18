package i;

import java.io.Closeable;

/* loaded from: classes3.dex */
public final class f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final e f30778a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f30780c;

    public f(j jVar, e eVar) {
        this.f30780c = jVar;
        this.f30778a = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f30779b) {
            return;
        }
        this.f30779b = true;
        j jVar = this.f30780c;
        synchronized (jVar) {
            e eVar = this.f30778a;
            int i2 = eVar.f30776h - 1;
            eVar.f30776h = i2;
            if (i2 == 0 && eVar.f30774f) {
                z0.h hVar = j.f30784r;
                jVar.v(eVar);
            }
        }
    }
}
