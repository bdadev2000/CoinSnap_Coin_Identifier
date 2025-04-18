package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends com.bykv.vk.openvk.preload.a.d.c {

    /* renamed from: f, reason: collision with root package name */
    private static final Writer f9773f = new Writer() { // from class: com.bykv.vk.openvk.preload.a.b.a.f.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final p f9774g = new p("closed");
    public final List<com.bykv.vk.openvk.preload.a.k> a;

    /* renamed from: b, reason: collision with root package name */
    public com.bykv.vk.openvk.preload.a.k f9775b;

    /* renamed from: h, reason: collision with root package name */
    private String f9776h;

    public f() {
        super(f9773f);
        this.a = new ArrayList();
        this.f9775b = com.bykv.vk.openvk.preload.a.m.a;
    }

    private void a(com.bykv.vk.openvk.preload.a.k kVar) {
        if (this.f9776h != null) {
            if (!(kVar instanceof com.bykv.vk.openvk.preload.a.m) || this.f9924e) {
                ((com.bykv.vk.openvk.preload.a.n) f()).a(this.f9776h, kVar);
            }
            this.f9776h = null;
            return;
        }
        if (this.a.isEmpty()) {
            this.f9775b = kVar;
            return;
        }
        com.bykv.vk.openvk.preload.a.k f10 = f();
        if (f10 instanceof com.bykv.vk.openvk.preload.a.i) {
            ((com.bykv.vk.openvk.preload.a.i) f10).a(kVar);
            return;
        }
        throw new IllegalStateException();
    }

    private com.bykv.vk.openvk.preload.a.k f() {
        return this.a.get(r0.size() - 1);
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c b() throws IOException {
        if (!this.a.isEmpty() && this.f9776h == null) {
            if (f() instanceof com.bykv.vk.openvk.preload.a.i) {
                this.a.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c c() throws IOException {
        com.bykv.vk.openvk.preload.a.n nVar = new com.bykv.vk.openvk.preload.a.n();
        a(nVar);
        this.a.add(nVar);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.a.isEmpty()) {
            this.a.add(f9774g);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c d() throws IOException {
        if (!this.a.isEmpty() && this.f9776h == null) {
            if (f() instanceof com.bykv.vk.openvk.preload.a.n) {
                this.a.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c e() throws IOException {
        a(com.bykv.vk.openvk.preload.a.m.a);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c b(String str) throws IOException {
        if (str == null) {
            return e();
        }
        a(new p(str));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a() throws IOException {
        com.bykv.vk.openvk.preload.a.i iVar = new com.bykv.vk.openvk.preload.a.i();
        a(iVar);
        this.a.add(iVar);
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(String str) throws IOException {
        if (str != null) {
            if (!this.a.isEmpty() && this.f9776h == null) {
                if (f() instanceof com.bykv.vk.openvk.preload.a.n) {
                    this.f9776h = str;
                    return this;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(boolean z10) throws IOException {
        a(new p(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(Boolean bool) throws IOException {
        if (bool == null) {
            return e();
        }
        a(new p(bool));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(long j3) throws IOException {
        a(new p(Long.valueOf(j3)));
        return this;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.c
    public final com.bykv.vk.openvk.preload.a.d.c a(Number number) throws IOException {
        if (number == null) {
            return e();
        }
        if (!this.f9922c) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        a(new p(number));
        return this;
    }
}
