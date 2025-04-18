package r;

/* loaded from: classes.dex */
public final class d {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f23929b;

    /* renamed from: c, reason: collision with root package name */
    public int f23930c;

    /* renamed from: d, reason: collision with root package name */
    public int f23931d;

    public d() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f23931d = highestOneBit - 1;
        this.a = new int[highestOneBit];
    }

    public final void a(int i10) {
        int[] iArr = this.a;
        int i11 = this.f23930c;
        iArr[i11] = i10;
        int i12 = this.f23931d & (i11 + 1);
        this.f23930c = i12;
        int i13 = this.f23929b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 >= 0) {
                int[] iArr2 = new int[i15];
                System.arraycopy(iArr, i13, iArr2, 0, i14);
                System.arraycopy(this.a, 0, iArr2, i14, this.f23929b);
                this.a = iArr2;
                this.f23929b = 0;
                this.f23930c = length;
                this.f23931d = i15 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }
}
