package w8;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l extends A {

    /* renamed from: e, reason: collision with root package name */
    public A f24018e;

    public l(A a6) {
        G7.j.e(a6, "delegate");
        this.f24018e = a6;
    }

    @Override // w8.A
    public final A a() {
        return this.f24018e.a();
    }

    @Override // w8.A
    public final A b() {
        return this.f24018e.b();
    }

    @Override // w8.A
    public final long c() {
        return this.f24018e.c();
    }

    @Override // w8.A
    public final A d(long j7) {
        return this.f24018e.d(j7);
    }

    @Override // w8.A
    public final boolean e() {
        return this.f24018e.e();
    }

    @Override // w8.A
    public final void f() {
        this.f24018e.f();
    }

    @Override // w8.A
    public final A g(long j7, TimeUnit timeUnit) {
        G7.j.e(timeUnit, "unit");
        return this.f24018e.g(j7, timeUnit);
    }
}
