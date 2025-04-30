package k8;

import F7.l;
import java.io.IOException;
import w8.C2911a;
import w8.j;

/* loaded from: classes3.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    public final l f21538c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21539d;

    public i(C2911a c2911a, l lVar) {
        super(c2911a);
        this.f21538c = lVar;
    }

    @Override // w8.j, w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21539d) {
            return;
        }
        try {
            super.close();
        } catch (IOException e4) {
            this.f21539d = true;
            this.f21538c.invoke(e4);
        }
    }

    @Override // w8.j, w8.x
    public final void d(w8.f fVar, long j7) {
        G7.j.e(fVar, "source");
        if (this.f21539d) {
            fVar.skip(j7);
            return;
        }
        try {
            super.d(fVar, j7);
        } catch (IOException e4) {
            this.f21539d = true;
            this.f21538c.invoke(e4);
        }
    }

    @Override // w8.j, w8.x, java.io.Flushable
    public final void flush() {
        if (this.f21539d) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e4) {
            this.f21539d = true;
            this.f21538c.invoke(e4);
        }
    }
}
