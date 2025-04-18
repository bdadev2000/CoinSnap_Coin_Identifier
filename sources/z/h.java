package z;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {
    public int[] a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int[] f28358b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    public int f28359c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f28360d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    public float[] f28361e = new float[10];

    /* renamed from: f, reason: collision with root package name */
    public int f28362f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int[] f28363g = new int[5];

    /* renamed from: h, reason: collision with root package name */
    public String[] f28364h = new String[5];

    /* renamed from: i, reason: collision with root package name */
    public int f28365i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int[] f28366j = new int[4];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f28367k = new boolean[4];

    /* renamed from: l, reason: collision with root package name */
    public int f28368l = 0;

    public final void a(float f10, int i10) {
        int i11 = this.f28362f;
        int[] iArr = this.f28360d;
        if (i11 >= iArr.length) {
            this.f28360d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f28361e;
            this.f28361e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f28360d;
        int i12 = this.f28362f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f28361e;
        this.f28362f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f28359c;
        int[] iArr = this.a;
        if (i12 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f28358b;
            this.f28358b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i13 = this.f28359c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f28358b;
        this.f28359c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f28365i;
        int[] iArr = this.f28363g;
        if (i11 >= iArr.length) {
            this.f28363g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f28364h;
            this.f28364h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f28363g;
        int i12 = this.f28365i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f28364h;
        this.f28365i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f28368l;
        int[] iArr = this.f28366j;
        if (i11 >= iArr.length) {
            this.f28366j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f28367k;
            this.f28367k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f28366j;
        int i12 = this.f28368l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f28367k;
        this.f28368l = i12 + 1;
        zArr2[i12] = z10;
    }
}
