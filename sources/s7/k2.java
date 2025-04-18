package s7;

/* loaded from: classes3.dex */
public final class k2 extends v8.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(int i10, x2 x2Var) {
        super(x2Var);
        this.f24495d = i10;
    }

    @Override // v8.n, s7.x2
    public final v2 f(int i10, v2 v2Var, boolean z10) {
        switch (this.f24495d) {
            case 0:
                v2 f10 = super.f(i10, v2Var, z10);
                f10.f24790h = true;
                return f10;
            default:
                super.f(i10, v2Var, z10);
                v2Var.f24790h = true;
                return v2Var;
        }
    }

    @Override // v8.n, s7.x2
    public final w2 n(int i10, w2 w2Var, long j3) {
        switch (this.f24495d) {
            case 1:
                super.n(i10, w2Var, j3);
                w2Var.f24850n = true;
                return w2Var;
            default:
                return super.n(i10, w2Var, j3);
        }
    }
}
