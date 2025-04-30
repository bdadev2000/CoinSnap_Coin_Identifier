package E;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f850a;
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public int f851c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f852d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f853e;

    /* renamed from: f, reason: collision with root package name */
    public int f854f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f855g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f856h;

    /* renamed from: i, reason: collision with root package name */
    public int f857i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f858j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f859k;
    public int l;

    public final void a(int i9, float f9) {
        int i10 = this.f854f;
        int[] iArr = this.f852d;
        if (i10 >= iArr.length) {
            this.f852d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f853e;
            this.f853e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f852d;
        int i11 = this.f854f;
        iArr2[i11] = i9;
        float[] fArr2 = this.f853e;
        this.f854f = i11 + 1;
        fArr2[i11] = f9;
    }

    public final void b(int i9, int i10) {
        int i11 = this.f851c;
        int[] iArr = this.f850a;
        if (i11 >= iArr.length) {
            this.f850a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f850a;
        int i12 = this.f851c;
        iArr3[i12] = i9;
        int[] iArr4 = this.b;
        this.f851c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i9, String str) {
        int i10 = this.f857i;
        int[] iArr = this.f855g;
        if (i10 >= iArr.length) {
            this.f855g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f856h;
            this.f856h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f855g;
        int i11 = this.f857i;
        iArr2[i11] = i9;
        String[] strArr2 = this.f856h;
        this.f857i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i9, boolean z8) {
        int i10 = this.l;
        int[] iArr = this.f858j;
        if (i10 >= iArr.length) {
            this.f858j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f859k;
            this.f859k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f858j;
        int i11 = this.l;
        iArr2[i11] = i9;
        boolean[] zArr2 = this.f859k;
        this.l = i11 + 1;
        zArr2[i11] = z8;
    }
}
