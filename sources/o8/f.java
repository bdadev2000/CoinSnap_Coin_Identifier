package o8;

import G7.j;

/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: f, reason: collision with root package name */
    public boolean f22022f;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22009c) {
            return;
        }
        if (!this.f22022f) {
            a();
        }
        this.f22009c = true;
    }

    @Override // o8.a, w8.y
    public final long read(w8.f fVar, long j7) {
        j.e(fVar, "sink");
        if (j7 >= 0) {
            if (!this.f22009c) {
                if (this.f22022f) {
                    return -1L;
                }
                long read = super.read(fVar, j7);
                if (read == -1) {
                    this.f22022f = true;
                    a();
                    return -1L;
                }
                return read;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
    }
}
