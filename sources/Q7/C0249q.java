package Q7;

/* renamed from: Q7.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0249q extends G7.k implements F7.p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0249q f2579c = new C0249q(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0249q f2580d = new C0249q(2, 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0249q(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((w7.k) obj).n((w7.i) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((w7.k) obj).n((w7.i) obj2);
        }
    }
}
