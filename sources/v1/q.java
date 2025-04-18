package v1;

/* loaded from: classes.dex */
public final class q {
    public final long[] a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f25931b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f25932c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25933d;

    public q(int i10) {
        this.a = new long[i10];
        this.f25931b = new boolean[i10];
        this.f25932c = new int[i10];
    }

    public final int[] a() {
        boolean z10;
        synchronized (this) {
            if (!this.f25933d) {
                return null;
            }
            long[] jArr = this.a;
            int length = jArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                int i13 = 1;
                if (jArr[i10] > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean[] zArr = this.f25931b;
                if (z10 != zArr[i11]) {
                    int[] iArr = this.f25932c;
                    if (!z10) {
                        i13 = 2;
                    }
                    iArr[i11] = i13;
                } else {
                    this.f25932c[i11] = 0;
                }
                zArr[i11] = z10;
                i10++;
                i11 = i12;
            }
            this.f25933d = false;
            return (int[]) this.f25932c.clone();
        }
    }
}
