package n1;

/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Object obj, int i2) {
        super(1);
        this.f31134a = i2;
        this.f31135b = obj;
    }

    public final void b(l1.a aVar) {
        int i2 = this.f31134a;
        Object obj = this.f31135b;
        switch (i2) {
            case 0:
                p0.a.s(aVar, "$this$buildSerialDescriptor");
                e0.w wVar = ((w) obj).d;
                p0.a.s(wVar, "<set-?>");
                aVar.f31012b = wVar;
                return;
            default:
                p0.a.s(aVar, "$this$buildClassSerialDescriptor");
                h1 h1Var = (h1) obj;
                l1.a.a(aVar, "first", h1Var.f31083a.b());
                l1.a.a(aVar, "second", h1Var.f31084b.b());
                l1.a.a(aVar, "third", h1Var.f31085c.b());
                return;
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        d0.b0 b0Var = d0.b0.f30125a;
        switch (this.f31134a) {
            case 0:
                b((l1.a) obj);
                return b0Var;
            case 1:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                x0 x0Var = (x0) this.f31135b;
                sb.append(x0Var.e[intValue]);
                sb.append(": ");
                sb.append(x0Var.f(intValue).g());
                return sb.toString();
            default:
                b((l1.a) obj);
                return b0Var;
        }
    }
}
