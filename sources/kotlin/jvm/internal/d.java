package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d extends e0.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f30923a;

    /* renamed from: b, reason: collision with root package name */
    public int f30924b;

    public d(int[] iArr) {
        this.f30923a = iArr;
    }

    @Override // e0.b0
    public final int b() {
        try {
            int[] iArr = this.f30923a;
            int i2 = this.f30924b;
            this.f30924b = i2 + 1;
            return iArr[i2];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f30924b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30924b < this.f30923a.length;
    }
}
