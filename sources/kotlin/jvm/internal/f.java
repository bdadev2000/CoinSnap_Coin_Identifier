package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class f extends e0.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f30928a;

    /* renamed from: b, reason: collision with root package name */
    public int f30929b;

    public f(long[] jArr) {
        this.f30928a = jArr;
    }

    @Override // e0.c0
    public final long b() {
        try {
            long[] jArr = this.f30928a;
            int i2 = this.f30929b;
            this.f30929b = i2 + 1;
            return jArr[i2];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f30929b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30929b < this.f30928a.length;
    }
}
