package p8;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f22382a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.f22382a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(D d2) {
        G7.j.e(d2, "other");
        int i9 = 0;
        while (i9 < 10) {
            int i10 = i9 + 1;
            boolean z8 = true;
            if (((1 << i9) & d2.f22382a) == 0) {
                z8 = false;
            }
            if (z8) {
                c(i9, d2.b[i9]);
            }
            i9 = i10;
        }
    }

    public final void c(int i9, int i10) {
        if (i9 >= 0) {
            int[] iArr = this.b;
            if (i9 < iArr.length) {
                this.f22382a = (1 << i9) | this.f22382a;
                iArr[i9] = i10;
            }
        }
    }
}
