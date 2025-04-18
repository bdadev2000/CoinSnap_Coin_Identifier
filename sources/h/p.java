package h;

import java.io.Closeable;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* loaded from: classes4.dex */
public final class p extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f30687a;

    /* renamed from: b, reason: collision with root package name */
    public final FileSystem f30688b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30689c;
    public final Closeable d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30690f;

    /* renamed from: g, reason: collision with root package name */
    public BufferedSource f30691g;

    public p(Path path, FileSystem fileSystem, String str, Closeable closeable) {
        this.f30687a = path;
        this.f30688b = fileSystem;
        this.f30689c = str;
        this.d = closeable;
    }

    @Override // h.d0
    public final synchronized Path a() {
        if (!(!this.f30690f)) {
            throw new IllegalStateException("closed".toString());
        }
        return this.f30687a;
    }

    @Override // h.d0
    public final Path c() {
        return a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f30690f = true;
            BufferedSource bufferedSource = this.f30691g;
            if (bufferedSource != null) {
                v.g.a(bufferedSource);
            }
            Closeable closeable = this.d;
            if (closeable != null) {
                v.g.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // h.d0
    public final p0.a e() {
        return null;
    }

    @Override // h.d0
    public final synchronized BufferedSource h() {
        if (!(!this.f30690f)) {
            throw new IllegalStateException("closed".toString());
        }
        BufferedSource bufferedSource = this.f30691g;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        BufferedSource buffer = Okio.buffer(this.f30688b.source(this.f30687a));
        this.f30691g = buffer;
        return buffer;
    }
}
