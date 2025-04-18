package w0;

import e0.r;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f31401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31402b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31403c;
    public int d;

    public b(char c2, char c3, int i2) {
        this.f31401a = i2;
        this.f31402b = c3;
        boolean z2 = true;
        if (i2 <= 0 ? p0.a.E(c2, c3) < 0 : p0.a.E(c2, c3) > 0) {
            z2 = false;
        }
        this.f31403c = z2;
        this.d = z2 ? c2 : c3;
    }

    @Override // e0.r
    public final char b() {
        int i2 = this.d;
        if (i2 != this.f31402b) {
            this.d = this.f31401a + i2;
        } else {
            if (!this.f31403c) {
                throw new NoSuchElementException();
            }
            this.f31403c = false;
        }
        return (char) i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31403c;
    }
}
