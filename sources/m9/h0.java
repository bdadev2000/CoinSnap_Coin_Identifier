package m9;

/* loaded from: classes3.dex */
public final class h0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21668c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21669d;

    public /* synthetic */ h0(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.f21667b = i11;
        this.f21668c = i12;
        this.f21669d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.a - this.f21667b <= 1) {
                return false;
            }
        } else if (this.f21668c - this.f21669d <= 1) {
            return false;
        }
        return true;
    }

    public h0(h0 h0Var) {
        this.a = h0Var.a;
        this.f21667b = h0Var.f21667b;
        this.f21668c = h0Var.f21668c;
        this.f21669d = h0Var.f21669d;
    }
}
