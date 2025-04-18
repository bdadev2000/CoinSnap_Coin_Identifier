package b1;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.r implements q0.l {

    /* renamed from: b, reason: collision with root package name */
    public static final x f22389b = new x(0);

    /* renamed from: c, reason: collision with root package name */
    public static final x f22390c = new x(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2) {
        super(1);
        this.f22391a = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        switch (this.f22391a) {
            case 0:
                h0.j jVar = (h0.j) obj;
                if (jVar instanceof z) {
                    return (z) jVar;
                }
                return null;
            default:
                h0.j jVar2 = (h0.j) obj;
                if (jVar2 instanceof z0) {
                    return (z0) jVar2;
                }
                return null;
        }
    }
}
