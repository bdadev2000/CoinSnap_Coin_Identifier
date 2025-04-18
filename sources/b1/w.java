package b1;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.r implements q0.p {

    /* renamed from: b, reason: collision with root package name */
    public static final w f22384b = new w(0);

    /* renamed from: c, reason: collision with root package name */
    public static final w f22385c = new w(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22386a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i2) {
        super(2);
        this.f22386a = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22386a) {
            case 0:
                return ((h0.l) obj).u((h0.j) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }
}
