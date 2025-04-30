package Q1;

/* loaded from: classes.dex */
public final class e extends B1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i9) {
        super(1);
        this.f2473d = i9;
    }

    public final i n() {
        switch (this.f2473d) {
            case 0:
                return new d(this);
            default:
                return new k(this);
        }
    }
}
