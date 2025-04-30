package f8;

/* loaded from: classes3.dex */
public final class k extends G7.k implements F7.a {

    /* renamed from: c, reason: collision with root package name */
    public static final k f20395c = new k(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final k f20396d = new k(0, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final k f20397f = new k(0, 2);

    /* renamed from: g, reason: collision with root package name */
    public static final k f20398g = new k(0, 3);

    /* renamed from: h, reason: collision with root package name */
    public static final k f20399h = new k(0, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final k f20400i = new k(0, 5);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return z.b;
            case 1:
                return u.b;
            case 2:
                return r.b;
            case 3:
                return x.b;
            case 4:
                return e.b;
            default:
                return u.f20407a;
        }
    }
}
