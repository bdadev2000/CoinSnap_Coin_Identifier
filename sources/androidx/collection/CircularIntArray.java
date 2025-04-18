package androidx.collection;

import e0.q;

/* loaded from: classes4.dex */
public final class CircularIntArray {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1401a;

    /* renamed from: b, reason: collision with root package name */
    public int f1402b;

    /* renamed from: c, reason: collision with root package name */
    public int f1403c;
    public int d;

    public CircularIntArray() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = highestOneBit - 1;
        this.f1401a = new int[highestOneBit];
    }

    public final void a(int i2) {
        int[] iArr = this.f1401a;
        int i3 = this.f1403c;
        iArr[i3] = i2;
        int i4 = this.d & (i3 + 1);
        this.f1403c = i4;
        int i5 = this.f1402b;
        if (i4 == i5) {
            int length = iArr.length;
            int i6 = length - i5;
            int i7 = length << 1;
            if (i7 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i7];
            q.O(0, i5, length, iArr, iArr2);
            q.O(i6, 0, this.f1402b, this.f1401a, iArr2);
            this.f1401a = iArr2;
            this.f1402b = 0;
            this.f1403c = length;
            this.d = i7 - 1;
        }
    }
}
