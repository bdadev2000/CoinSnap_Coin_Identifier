package g2;

/* loaded from: classes.dex */
public abstract class j extends i {
    public g0.k[] a;

    /* renamed from: b, reason: collision with root package name */
    public String f17965b;

    /* renamed from: c, reason: collision with root package name */
    public int f17966c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17967d;

    public j() {
        this.a = null;
        this.f17966c = 0;
    }

    public g0.k[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.f17965b;
    }

    public void setPathData(g0.k[] kVarArr) {
        if (!com.bumptech.glide.e.h(this.a, kVarArr)) {
            this.a = com.bumptech.glide.e.u(kVarArr);
            return;
        }
        g0.k[] kVarArr2 = this.a;
        for (int i10 = 0; i10 < kVarArr.length; i10++) {
            kVarArr2[i10].a = kVarArr[i10].a;
            int i11 = 0;
            while (true) {
                float[] fArr = kVarArr[i10].f17915b;
                if (i11 < fArr.length) {
                    kVarArr2[i10].f17915b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public j(j jVar) {
        this.a = null;
        this.f17966c = 0;
        this.f17965b = jVar.f17965b;
        this.f17967d = jVar.f17967d;
        this.a = com.bumptech.glide.e.u(jVar.a);
    }
}
