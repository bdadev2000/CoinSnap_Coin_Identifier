package h;

import java.io.File;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* loaded from: classes2.dex */
public final class g0 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0.a f30672a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30673b;

    /* renamed from: c, reason: collision with root package name */
    public BufferedSource f30674c;
    public q0.a d;

    /* renamed from: f, reason: collision with root package name */
    public Path f30675f;

    public g0(BufferedSource bufferedSource, e0 e0Var, p0.a aVar) {
        this.f30672a = aVar;
        this.f30674c = bufferedSource;
        this.d = e0Var;
    }

    @Override // h.d0
    public final synchronized Path a() {
        Throwable th;
        Long l2;
        try {
            i();
            Path path = this.f30675f;
            if (path != null) {
                return path;
            }
            q0.a aVar = this.d;
            p0.a.p(aVar);
            File file = (File) aVar.invoke();
            if (!file.isDirectory()) {
                throw new IllegalStateException("cacheDirectory must be a directory.".toString());
            }
            Path path2 = Path.Companion.get$default(Path.Companion, File.createTempFile("tmp", null, file), false, 1, (Object) null);
            BufferedSink buffer = Okio.buffer(FileSystem.SYSTEM.sink(path2, false));
            try {
                BufferedSource bufferedSource = this.f30674c;
                p0.a.p(bufferedSource);
                l2 = Long.valueOf(buffer.writeAll(bufferedSource));
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (Throwable th3) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th4) {
                        kotlin.jvm.internal.q.a(th3, th4);
                    }
                }
                th = th3;
                l2 = null;
            }
            if (th != null) {
                throw th;
            }
            p0.a.p(l2);
            this.f30674c = null;
            this.f30675f = path2;
            this.d = null;
            return path2;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // h.d0
    public final synchronized Path c() {
        i();
        return this.f30675f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f30673b = true;
            BufferedSource bufferedSource = this.f30674c;
            if (bufferedSource != null) {
                v.g.a(bufferedSource);
            }
            Path path = this.f30675f;
            if (path != null) {
                FileSystem.SYSTEM.delete(path);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // h.d0
    public final p0.a e() {
        return this.f30672a;
    }

    @Override // h.d0
    public final synchronized BufferedSource h() {
        i();
        BufferedSource bufferedSource = this.f30674c;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        FileSystem fileSystem = FileSystem.SYSTEM;
        Path path = this.f30675f;
        p0.a.p(path);
        BufferedSource buffer = Okio.buffer(fileSystem.source(path));
        this.f30674c = buffer;
        return buffer;
    }

    public final void i() {
        if (!(!this.f30673b)) {
            throw new IllegalStateException("closed".toString());
        }
    }
}
