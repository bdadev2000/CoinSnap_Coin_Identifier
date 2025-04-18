package ni;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class z extends wh.y0 {

    /* renamed from: b, reason: collision with root package name */
    public final wh.y0 f22900b;

    /* renamed from: c, reason: collision with root package name */
    public final ki.e0 f22901c;

    /* renamed from: d, reason: collision with root package name */
    public IOException f22902d;

    public z(wh.y0 y0Var) {
        this.f22900b = y0Var;
        this.f22901c = a6.k.f(new y(this, y0Var.source()));
    }

    @Override // wh.y0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22900b.close();
    }

    @Override // wh.y0
    public final long contentLength() {
        return this.f22900b.contentLength();
    }

    @Override // wh.y0
    public final wh.g0 contentType() {
        return this.f22900b.contentType();
    }

    @Override // wh.y0
    public final ki.k source() {
        return this.f22901c;
    }
}
