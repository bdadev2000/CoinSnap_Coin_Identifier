package y8;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class l implements x8.m {

    /* renamed from: b, reason: collision with root package name */
    public final long f28084b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28085c;

    /* renamed from: d, reason: collision with root package name */
    public long f28086d;

    /* renamed from: f, reason: collision with root package name */
    public final k f28087f;

    public l(k kVar, long j3, long j10) {
        this.f28084b = j3;
        this.f28085c = j10;
        this.f28086d = j3 - 1;
        this.f28087f = kVar;
    }

    @Override // x8.m
    public final long b() {
        long j3 = this.f28086d;
        if (j3 >= this.f28084b && j3 <= this.f28085c) {
            return this.f28087f.d(j3);
        }
        throw new NoSuchElementException();
    }

    @Override // x8.m
    public final long d() {
        long j3 = this.f28086d;
        if (j3 >= this.f28084b && j3 <= this.f28085c) {
            return this.f28087f.c(j3);
        }
        throw new NoSuchElementException();
    }

    @Override // x8.m
    public final boolean next() {
        boolean z10;
        long j3 = this.f28086d + 1;
        this.f28086d = j3;
        if (j3 > this.f28085c) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
