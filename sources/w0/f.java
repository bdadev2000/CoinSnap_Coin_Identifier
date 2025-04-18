package w0;

import e0.b0;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f31409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31410b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31411c;
    public int d;

    public f(int i2, int i3, int i4) {
        this.f31409a = i4;
        this.f31410b = i3;
        boolean z2 = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z2 = false;
        }
        this.f31411c = z2;
        this.d = z2 ? i2 : i3;
    }

    @Override // e0.b0
    public final int b() {
        int i2 = this.d;
        if (i2 != this.f31410b) {
            this.d = this.f31409a + i2;
        } else {
            if (!this.f31411c) {
                throw new NoSuchElementException();
            }
            this.f31411c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31411c;
    }
}
