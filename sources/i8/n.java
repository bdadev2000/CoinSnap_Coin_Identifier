package i8;

/* loaded from: classes3.dex */
public final class n {
    public final y7.a0 a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19351b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19352c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19353d;

    /* renamed from: e, reason: collision with root package name */
    public int f19354e;

    /* renamed from: f, reason: collision with root package name */
    public int f19355f;

    /* renamed from: g, reason: collision with root package name */
    public long f19356g;

    /* renamed from: h, reason: collision with root package name */
    public long f19357h;

    public n(y7.a0 a0Var) {
        this.a = a0Var;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        boolean z10;
        if (this.f19352c) {
            int i12 = this.f19355f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f19353d = z10;
                this.f19352c = false;
                return;
            }
            this.f19355f = (i11 - i10) + i12;
        }
    }
}
