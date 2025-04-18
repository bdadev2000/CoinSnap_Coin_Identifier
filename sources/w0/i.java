package w0;

import e0.c0;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class i extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f31415a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31416b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31417c;
    public long d;

    public i(long j2, long j3, long j4) {
        this.f31415a = j4;
        this.f31416b = j3;
        boolean z2 = true;
        if (j4 <= 0 ? j2 < j3 : j2 > j3) {
            z2 = false;
        }
        this.f31417c = z2;
        this.d = z2 ? j2 : j3;
    }

    @Override // e0.c0
    public final long b() {
        long j2 = this.d;
        if (j2 != this.f31416b) {
            this.d = this.f31415a + j2;
        } else {
            if (!this.f31417c) {
                throw new NoSuchElementException();
            }
            this.f31417c = false;
        }
        return j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31417c;
    }
}
