package t;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f25127b;

    /* renamed from: g, reason: collision with root package name */
    public float f25131g;

    /* renamed from: n, reason: collision with root package name */
    public int f25138n;

    /* renamed from: c, reason: collision with root package name */
    public int f25128c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f25129d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f25130f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25132h = false;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f25133i = new float[9];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f25134j = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public c[] f25135k = new c[16];

    /* renamed from: l, reason: collision with root package name */
    public int f25136l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f25137m = 0;

    public i(int i10) {
        this.f25138n = i10;
    }

    public final void a(c cVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f25136l;
            if (i10 < i11) {
                if (this.f25135k[i10] == cVar) {
                    return;
                } else {
                    i10++;
                }
            } else {
                c[] cVarArr = this.f25135k;
                if (i11 >= cVarArr.length) {
                    this.f25135k = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f25135k;
                int i12 = this.f25136l;
                cVarArr2[i12] = cVar;
                this.f25136l = i12 + 1;
                return;
            }
        }
    }

    public final void b(c cVar) {
        int i10 = this.f25136l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f25135k[i11] == cVar) {
                while (i11 < i10 - 1) {
                    c[] cVarArr = this.f25135k;
                    int i12 = i11 + 1;
                    cVarArr[i11] = cVarArr[i12];
                    i11 = i12;
                }
                this.f25136l--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.f25138n = 5;
        this.f25130f = 0;
        this.f25128c = -1;
        this.f25129d = -1;
        this.f25131g = 0.0f;
        this.f25132h = false;
        int i10 = this.f25136l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25135k[i11] = null;
        }
        this.f25136l = 0;
        this.f25137m = 0;
        this.f25127b = false;
        Arrays.fill(this.f25134j, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f25128c - ((i) obj).f25128c;
    }

    public final void d(d dVar, float f10) {
        this.f25131g = f10;
        this.f25132h = true;
        int i10 = this.f25136l;
        this.f25129d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25135k[i11].h(dVar, this, false);
        }
        this.f25136l = 0;
    }

    public final void e(d dVar, c cVar) {
        int i10 = this.f25136l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25135k[i11].i(dVar, cVar, false);
        }
        this.f25136l = 0;
    }

    public final String toString() {
        return "" + this.f25128c;
    }
}
