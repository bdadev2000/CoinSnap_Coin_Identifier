package x;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f24064a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f24065c;

    /* renamed from: d, reason: collision with root package name */
    public int f24066d;

    public d() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f24066d = highestOneBit - 1;
        this.f24064a = new int[highestOneBit];
    }

    public final void a(int i9) {
        int[] iArr = this.f24064a;
        int i10 = this.f24065c;
        iArr[i10] = i9;
        int i11 = this.f24066d & (i10 + 1);
        this.f24065c = i11;
        int i12 = this.b;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 >= 0) {
                int[] iArr2 = new int[i14];
                System.arraycopy(iArr, i12, iArr2, 0, i13);
                System.arraycopy(this.f24064a, 0, iArr2, i13, this.b);
                this.f24064a = iArr2;
                this.b = 0;
                this.f24065c = length;
                this.f24066d = i14 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }
}
