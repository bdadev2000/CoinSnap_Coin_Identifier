package wh;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements Closeable, Flushable {

    /* renamed from: b, reason: collision with root package name */
    public final zh.j f27063b;

    public h(File directory, long j3) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        fi.a fileSystem = fi.b.a;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f27063b = new zh.j(directory, j3, ai.f.f500i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27063b.close();
    }

    public final void d(o0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        zh.j jVar = this.f27063b;
        String key = qc.s0.m(request.a);
        synchronized (jVar) {
            Intrinsics.checkNotNullParameter(key, "key");
            jVar.p();
            jVar.d();
            zh.j.T(key);
            zh.g gVar = (zh.g) jVar.f28815m.get(key);
            if (gVar != null) {
                jVar.w(gVar);
                if (jVar.f28813k <= jVar.f28809g) {
                    jVar.f28821s = false;
                }
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f27063b.flush();
    }
}
