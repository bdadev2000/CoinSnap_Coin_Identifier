package f;

/* loaded from: classes.dex */
public final class q extends G7.k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f20229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(x xVar, int i9) {
        super(0);
        this.b = i9;
        this.f20229c = xVar;
    }

    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.f20229c.d();
                return t7.y.f23029a;
            case 1:
                this.f20229c.c();
                return t7.y.f23029a;
            default:
                this.f20229c.d();
                return t7.y.f23029a;
        }
    }
}
