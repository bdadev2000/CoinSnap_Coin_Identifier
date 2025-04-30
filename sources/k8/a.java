package k8;

import G7.j;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import w8.A;
import w8.s;
import w8.y;

/* loaded from: classes3.dex */
public final class a implements y {
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w8.h f21496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O5.c f21497d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w8.g f21498f;

    public a(w8.h hVar, O5.c cVar, s sVar) {
        this.f21496c = hVar;
        this.f21497d = cVar;
        this.f21498f = sVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.b && !j8.b.g(this, TimeUnit.MILLISECONDS)) {
            this.b = true;
            this.f21497d.a();
        }
        this.f21496c.close();
    }

    @Override // w8.y
    public final long read(w8.f fVar, long j7) {
        j.e(fVar, "sink");
        try {
            long read = this.f21496c.read(fVar, j7);
            w8.g gVar = this.f21498f;
            if (read == -1) {
                if (!this.b) {
                    this.b = true;
                    gVar.close();
                }
                return -1L;
            }
            fVar.b(gVar.y(), fVar.f24014c - read, read);
            gVar.emitCompleteSegments();
            return read;
        } catch (IOException e4) {
            if (!this.b) {
                this.b = true;
                this.f21497d.a();
            }
            throw e4;
        }
    }

    @Override // w8.y
    public final A timeout() {
        return this.f21496c.timeout();
    }
}
